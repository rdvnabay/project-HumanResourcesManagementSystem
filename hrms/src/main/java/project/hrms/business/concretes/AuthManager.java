package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.AuthService;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.business.abstracts.UserService;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.dtos.EmployerForRegisterDto;
import project.hrms.entities.dtos.JobSeekerForRegisterDto;
import project.hrms.entities.dtos.UserForLoginDto;

@Service
public class AuthManager implements AuthService {

    @Autowired
    private EmployerService employerService;
    private JobSeekerService jobSeekerService;
    private UserService userService;

    public AuthManager(EmployerService employerService, JobSeekerService jobSeekerService, UserService userService) {
        this.employerService = employerService;
        this.jobSeekerService = jobSeekerService;
        this.userService = userService;
    }

    // Methods
    @Override
    public Result register(EmployerForRegisterDto employerForRegisterDto) {
        if (employerForRegisterDto.getCompanyName() == null && employerForRegisterDto.getEmail() == null
                && employerForRegisterDto.getPhoneNumber() == null
                && employerForRegisterDto.getWebSiteAddress() == null) {
            return new ErrorResult("Tüm alanları eksiksiz doldurunuz");
        }
        Employer employer = new Employer();
        employer.setCompanyName(employerForRegisterDto.getCompanyName());
        employer.setEmail(employerForRegisterDto.getEmail());
        employer.setPhoneNumber(employerForRegisterDto.getPhoneNumber());
        employer.setWebSiteAddress(employerForRegisterDto.getWebSiteAddress());

        this.employerService.add(employer);
        return new SuccessResult("Kayıt başarılı");
    }

    @Override
    public Result register(JobSeekerForRegisterDto jobSeekerForRegisterDto) {
        if (jobSeekerForRegisterDto.getEmail() == null && jobSeekerForRegisterDto.getFirstName() == null
                && jobSeekerForRegisterDto.getLastName() == null
                && jobSeekerForRegisterDto.getNationalIdentity() == null) {
            return new ErrorResult("Tüm alanları eksiksiz doldurunuz");
        }
        JobSeeker jobSeeker = new JobSeeker();
        jobSeeker.setEmail(jobSeekerForRegisterDto.getEmail());
        jobSeeker.setFirstName(jobSeekerForRegisterDto.getFirstName());
        jobSeeker.setLastName(jobSeekerForRegisterDto.getLastName());
        jobSeeker.setNationalIdentity(jobSeekerForRegisterDto.getNationalIdentity());
        this.jobSeekerService.add(jobSeeker);
        return new SuccessResult("Kayıt başarılı");
    }

    @Override
    public Result login(UserForLoginDto userForLoginDto) {
        if (userForLoginDto.getEmail() == null && userForLoginDto.getPassword() == null) {
            return new ErrorResult("Tüm alanları eksiksiz doldurunuz");
        }
        return new SuccessResult("Giriş başarılı");
    }

    @Override
    public Result userExists(String email) {
        if (this.userService.getByEmail(email) != null) {
            return new ErrorResult("Böyle bir kullanıcı zaten mevcut");
        }
        return new SuccessResult();
    }

    @Override
    public Result userExists(String email, String nationalIdentity) {
        if (this.userService.getByEmail(email) != null &&
            this.jobSeekerService.getByNationalIdentity(nationalIdentity) != null) {
            return new ErrorResult("Böyle bir kullanıcı zaten mevcut");
        }
        return new SuccessResult();
    }
}

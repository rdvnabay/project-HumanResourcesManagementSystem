package project.hrms.business.concretes;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.AuthService;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.business.abstracts.UserService;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.entities.concretes.User;
import project.hrms.entities.dtos.employer.EmployerAddDto;
import project.hrms.entities.dtos.jobseeker.JobSeekerAddDto;

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
    public Result register(EmployerAddDto employerAddDto) {
        if (employerAddDto.getCompanyName() == null 
         && employerAddDto.getEmail() == null
         && employerAddDto.getPhoneNumber() == null
         && employerAddDto.getWebSiteAddress() == null) {
            return new ErrorResult("Tüm alanları eksiksiz doldurunuz");
        }
        this.employerService.add(employerAddDto);
        return new SuccessResult("Kayıt başarılı");
    }

    @Override
    public Result register(JobSeekerAddDto jobSeekerAddDto) throws IOException {
        if (jobSeekerAddDto.getEmail() == null && jobSeekerAddDto.getFirstName() == null
                && jobSeekerAddDto.getLastName() == null
                && jobSeekerAddDto.getNationalIdentity() == null) {
            return new ErrorResult("Tüm alanları eksiksiz doldurunuz");
        }
        this.jobSeekerService.add(jobSeekerAddDto);
        return new SuccessResult("Kayıt başarılı");
    }

    @Override
    public Result login(User user) {
        if (user.getEmail() == null && user.getPassword() == null) {
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

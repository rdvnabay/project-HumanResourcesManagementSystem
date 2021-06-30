package project.hrms.business.concretes;

import java.io.IOException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.AuthService;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.business.abstracts.UserService;
import project.hrms.business.constants.Messages;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.User;
import project.hrms.entities.dtos.employer.EmployerForRegisterDto;
import project.hrms.entities.dtos.jobseeker.JobSeekerForRegisterDto;

@Service
public class AuthManager implements AuthService {

    @Autowired
    private EmployerService employerService;
    private JobSeekerService jobSeekerService;
    private UserService userService;
    private ModelMapper modelMapper;

    public AuthManager(EmployerService employerService, JobSeekerService jobSeekerService, UserService userService,ModelMapper modelMapper) {
        this.employerService = employerService;
        this.jobSeekerService = jobSeekerService;
        this.userService = userService;
        this.modelMapper=modelMapper;
    }

    // Methods
    @Override
    public Result register(EmployerForRegisterDto employerForRegisterDto) {
        if (employerForRegisterDto.getCompanyName() == null 
         && employerForRegisterDto.getEmail() == null
         && employerForRegisterDto.getPhoneNumber() == null
         && employerForRegisterDto.getWebSiteAddress() == null) {
            return new ErrorResult("Tüm alanları eksiksiz doldurunuz");
        }
        var employer= modelMapper.map(employerForRegisterDto, Employer.class);
        this.employerService.add(employer);
        return new SuccessResult("Kayıt başarılı");
    }

    @Override
    public Result register(JobSeekerForRegisterDto jobSeekerForRegisterDto) throws IOException {
        if (jobSeekerForRegisterDto.getEmail() == null && jobSeekerForRegisterDto.getFirstName() == null
                && jobSeekerForRegisterDto.getLastName() == null ) {
            return new ErrorResult("Tüm alanları eksiksiz doldurunuz");
        }
        this.jobSeekerService.add(jobSeekerForRegisterDto);
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
            return new ErrorResult(Messages.AlreadyExists);
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

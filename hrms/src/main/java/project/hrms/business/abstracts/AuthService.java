package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.dtos.EmployerForRegisterDto;
import project.hrms.entities.dtos.JobSeekerForRegisterDto;
import project.hrms.entities.dtos.UserForLoginDto;

public interface AuthService {
    Result login(UserForLoginDto userForLoginDto);
    Result register(EmployerForRegisterDto employerForRegisterDto);
    Result register(JobSeekerForRegisterDto jobSeekerForRegisterDto);
    Result userExists(String email);
    Result userExists(String email,String nationalIdentity);
}

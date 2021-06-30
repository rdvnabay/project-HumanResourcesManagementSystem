package project.hrms.business.abstracts;

import java.io.IOException;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.User;
import project.hrms.entities.dtos.employer.EmployerForRegisterDto;
import project.hrms.entities.dtos.jobseeker.JobSeekerForRegisterDto;

public interface AuthService {
    Result login(User user);
    Result register(EmployerForRegisterDto employerForRegisterDto);
    Result register(JobSeekerForRegisterDto jobSeekerAddDto) throws IOException;
    Result userExists(String email);
    Result userExists(String email,String nationalIdentity);
}

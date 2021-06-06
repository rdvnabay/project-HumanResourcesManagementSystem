package project.hrms.business.abstracts;

import java.io.IOException;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.User;
import project.hrms.entities.dtos.EmployerAddDto;
import project.hrms.entities.dtos.JobSeekerAddDto;

public interface AuthService {
    Result login(User user);
    Result register(EmployerAddDto employerAddDto);
    Result register(JobSeekerAddDto jobSeekerAddDto) throws IOException;
    Result userExists(String email);
    Result userExists(String email,String nationalIdentity);
}

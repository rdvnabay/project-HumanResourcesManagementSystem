package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.concretes.User;

public interface AuthService {
    Result login(User user);
    Result register(Employer employer);
    Result register(JobSeeker jobSeeker);
    Result userExists(String email);
    Result userExists(String email,String nationalIdentity);
}

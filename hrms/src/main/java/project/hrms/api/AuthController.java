package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.AuthService;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

@PostMapping("/login")
public Result login(@RequestBody User user){
    var userExists=this.authService.login(user);
    if(!userExists.isSuccess()){
        return null;
    }
    return authService.login(user);
}

    @PostMapping("/register/employer")
    public Result register(@RequestBody Employer employer) {
        var userExists = this.authService.userExists(employer.getEmail());
        if (!userExists.isSuccess()) {
            return null;
        }
        return this.authService.register(employer);
    }

    @PostMapping("/register/jobseeker")
    public Result register(@RequestBody JobSeeker jobSeeker) {
        var userExists = this.authService.userExists(jobSeeker.getEmail(),jobSeeker.getNationalIdentity());
        if (!userExists.isSuccess()) {
            return null;
        }
        return this.authService.register(jobSeeker);
    }
}

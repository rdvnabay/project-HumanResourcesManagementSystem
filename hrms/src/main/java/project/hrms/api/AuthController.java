package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.AuthService;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.dtos.EmployerForRegisterDto;
import project.hrms.entities.dtos.JobSeekerForRegisterDto;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register/employer")
    public Result register(EmployerForRegisterDto employerForRegisterDto) {
        var userExists = this.authService.userExists(employerForRegisterDto.getEmail());
        if (!userExists.isSuccess()) {
            return null;
        }
        return this.authService.register(employerForRegisterDto);
    }

    @PostMapping("/register/jobseeker")
    public Result register(JobSeekerForRegisterDto seekerForRegisterDto) {
        var userExists = this.authService.userExists(seekerForRegisterDto.getEmail(),seekerForRegisterDto.getNationalIdentity());
        if (!userExists.isSuccess()) {
            return null;
        }
        return this.authService.register(seekerForRegisterDto);
    }
}

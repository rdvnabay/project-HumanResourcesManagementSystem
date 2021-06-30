package project.hrms.api;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.AuthService;
import project.hrms.entities.concretes.User;
import project.hrms.entities.dtos.employer.EmployerForRegisterDto;
import project.hrms.entities.dtos.jobseeker.JobSeekerForRegisterDto;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        var userExists = this.authService.login(user);
        if (!userExists.isSuccess()) {
            return null;
        }
        return ResponseEntity.ok(authService.login(user));
    }

    @PostMapping("/register/employer")
    public ResponseEntity<?> register(@RequestBody EmployerForRegisterDto employerForRegisterDto) {
       // var userExists = this.authService.userExists(employerForRegisterDto.getEmail());
        // if (!userExists.isSuccess()) {
        //     return ResponseEntity.status(HttpStatus.CONFLICT)
        //     .body(userExists.getMessage());
        // }
        return ResponseEntity.ok(this.authService.register(employerForRegisterDto));
    }

    @PostMapping("/register/jobseeker")
    public ResponseEntity<?> register(@RequestBody JobSeekerForRegisterDto jobSeekerForRegisterDto) throws IOException {
        var userExists = this.authService.userExists(jobSeekerForRegisterDto.getEmail(), jobSeekerForRegisterDto.getNationalIdentity());
        if (!userExists.isSuccess()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(userExists.getMessage());
        }
        return ResponseEntity.ok(this.authService.register(jobSeekerForRegisterDto));
    }
}

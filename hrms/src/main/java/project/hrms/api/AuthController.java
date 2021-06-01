package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.AuthService;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.concretes.User;
import project.hrms.entities.dtos.EmployerAddDto;

@RestController
@RequestMapping("/api/auth")
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
    public ResponseEntity<?> register(@RequestBody EmployerAddDto employerAddDto) {
        var userExists = this.authService.userExists(employerAddDto.getEmail());
        if (!userExists.isSuccess()) {
            return null;
        }
        return ResponseEntity.ok(this.authService.register(employerAddDto));
    }

    @PostMapping("/register/jobseeker")
    public ResponseEntity<?> register(@RequestBody JobSeeker jobSeeker) {
        var userExists = this.authService.userExists(jobSeeker.getEmail(), jobSeeker.getNationalIdentity());
        if (!userExists.isSuccess()) {
            return null;
        }
        return ResponseEntity.ok(this.authService.register(jobSeeker));
    }
}

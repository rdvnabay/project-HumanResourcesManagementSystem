package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.entities.dtos.employer.EmployerUpdateDto;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin
public class EmployersController {

    @Autowired
    private EmployerService employerService;
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }

    // @PostMapping("/add")
    // public ResponseEntity<?> add(@RequestBody EmployerForRegisterDto employerAddDto) {
    //     return ResponseEntity.ok(this.employerService.add(employerAddDto));
    // }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(int employerId) {
        return ResponseEntity.ok(this.employerService.delete(employerId));
    }

    @PutMapping("/update")
    public ResponseEntity<?>update(@RequestBody EmployerUpdateDto employerUpdateDto){
        return ResponseEntity.ok(this.employerService.update(employerUpdateDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.employerService.getAll());
    }

    @GetMapping("/getbyid")
    public ResponseEntity<?> getById(int employerId) {
        return ResponseEntity.ok(this.employerService.getById(employerId));
    }

    @PostMapping("/changeJobBoardStatus")
    public ResponseEntity<?> changeJobBoardStatus(@RequestParam int employerId, @RequestParam boolean status) {
        return ResponseEntity.ok(this.employerService.changeJobBoardStatus(employerId, status));
    }
}

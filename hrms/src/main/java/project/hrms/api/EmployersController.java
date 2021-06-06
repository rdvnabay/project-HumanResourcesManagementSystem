package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.entities.dtos.EmployerAddDto;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

    @Autowired
    private EmployerService employerService;

    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody EmployerAddDto employerAddDto) {
        return ResponseEntity.ok(this.employerService.add(employerAddDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.employerService.getAll());
    }

    @PostMapping("/changeJobBoardStatus")
    public ResponseEntity<?> changeJobBoardStatus(@RequestParam int employerId, @RequestParam boolean status) {
        return ResponseEntity.ok(this.employerService.changeJobBoardStatus(employerId, status));
    }
}

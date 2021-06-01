package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.entities.dtos.JobSeekerAddDto;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {

    @Autowired
    private JobSeekerService jobSeekerService;
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody JobSeekerAddDto jobSeekerAddDto) {
        return ResponseEntity.ok(this.jobSeekerService.add(jobSeekerAddDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.jobSeekerService.getAll());
    }
}

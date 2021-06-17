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
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.JobPositionService;
import project.hrms.entities.dtos.jobPosition.JobPositionAddDto;
import project.hrms.entities.dtos.jobPosition.JobPositionUpdateDto;

@RestController
@RequestMapping("/api/jobpositions")
@CrossOrigin
public class JobPositionsController {

    @Autowired
    private JobPositionService jobPositionService;
    public JobPositionsController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody JobPositionAddDto jobPositionAddDto) {
        var jobPositionExists = this.jobPositionService.jobPositionExists(jobPositionAddDto.getName());
        if (!jobPositionExists.isSuccess()) {
            return ResponseEntity.ok(this.jobPositionService.jobPositionExists(jobPositionAddDto.getName()));
        }
        return ResponseEntity.ok(this.jobPositionService.add(jobPositionAddDto));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(int jobPositionId) {
        return ResponseEntity.ok(this.jobPositionService.delete(jobPositionId));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody JobPositionUpdateDto jobPositionUpdateDto) {
        return ResponseEntity.ok(this.jobPositionService.update(jobPositionUpdateDto));
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.jobPositionService.getAll());
    }

    @GetMapping("/getbyid")
    public ResponseEntity<?> getById(int jobPositionId) {
        return ResponseEntity.ok(this.jobPositionService.getById(jobPositionId));
    }
}

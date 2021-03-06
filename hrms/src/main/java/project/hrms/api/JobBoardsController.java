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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.JobBoardService;
import project.hrms.entities.dtos.jobboard.JobBoardAddDto;
import project.hrms.entities.dtos.jobboard.JobBoardUpdateDto;

@RestController
@RequestMapping("/api/jobboards")
@CrossOrigin
public class JobBoardsController {

    @Autowired
    private JobBoardService jobBoardService;

    public JobBoardsController(JobBoardService jobBoardService) {
        this.jobBoardService = jobBoardService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody JobBoardAddDto jobBoardAddDto) {
        return ResponseEntity.ok(this.jobBoardService.add(jobBoardAddDto));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> add(int employerId) {
        return ResponseEntity.ok(this.jobBoardService.delete(employerId));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody JobBoardUpdateDto jobBoardUpdateDto) {
        return ResponseEntity.ok(this.jobBoardService.update(jobBoardUpdateDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.jobBoardService.getAll());
    }

    @GetMapping("/getAllactiveJobBoards")
    @ResponseBody
    public ResponseEntity<?> getAllactiveJobBoards() {
        return ResponseEntity.ok(this.jobBoardService.getAllactiveJobBoardsDto());
    }

    @GetMapping("/getAllActiveJobBoardSortedDate")
    public ResponseEntity<?> getAllActiveJobBoardSortedDate() {
        return ResponseEntity.ok(this.jobBoardService.getAllActiveJobBoardSortedDate());
    }

    @GetMapping("/getAllActiveJobByEmployer")
    public ResponseEntity<?> getAllActiveJobByEmployerId(int employerId) {
        return ResponseEntity.ok(this.jobBoardService.getAllActiveJobByEmployerId(employerId));
    }
}

package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.JobSeekerLanguageService;
import project.hrms.entities.dtos.jobseeker.JobSeekerLanguageAddDto;
import project.hrms.entities.dtos.jobseeker.JobSeekerLanguageUpdateDto;

@RestController
@RequestMapping("/api/jobseekerlanguages")
public class JobSeekerLanguagesController {
    
    @Autowired
    private JobSeekerLanguageService jobSeekerLanguageService;
    public JobSeekerLanguagesController(JobSeekerLanguageService jobSeekerLanguageService) {
        this.jobSeekerLanguageService=jobSeekerLanguageService;
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.jobSeekerLanguageService.getAll());
    }
    @GetMapping("/getbyid")
    public ResponseEntity<?> getById(int jobSeekerLanguageId){
        return ResponseEntity.ok(this.jobSeekerLanguageService.getById(jobSeekerLanguageId));
    }
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody JobSeekerLanguageAddDto jobSeekerLanguageAddDto){
        return ResponseEntity.ok(this.jobSeekerLanguageService.add(jobSeekerLanguageAddDto));
    }
    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody JobSeekerLanguageUpdateDto jobSeekerLanguageUpdateDto){
        return ResponseEntity.ok(this.jobSeekerLanguageService.update(jobSeekerLanguageUpdateDto));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(int jobSeekerLanguageId){
        return ResponseEntity.ok(this.jobSeekerLanguageService.delete(jobSeekerLanguageId));
    }
}

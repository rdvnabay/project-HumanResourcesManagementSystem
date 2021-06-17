package project.hrms.api;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import project.hrms.business.abstracts.JobExperienceService;
import project.hrms.core.utilities.results.ErrorDataResult;
import project.hrms.entities.dtos.jobExperience.JobExperienceAddDto;
import project.hrms.entities.dtos.jobExperience.JobExperienceUpdateDto;

@RestController
@RequestMapping("/api/experiences")
@CrossOrigin
public class JobExperiencesController {

    @Autowired
    private JobExperienceService jobExperienceService;
    public JobExperiencesController(JobExperienceService jobExperienceService) {
        this.jobExperienceService = jobExperienceService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody JobExperienceAddDto jobExperienceAddDto) {
        return ResponseEntity.ok(this.jobExperienceService.add(jobExperienceAddDto));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(int jobExperienceId) {
        return ResponseEntity.ok(this.jobExperienceService.delete(jobExperienceId));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@Valid @RequestBody JobExperienceUpdateDto jobExperienceUpdateDto) {
        return ResponseEntity.ok(this.jobExperienceService.update(jobExperienceUpdateDto));
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.jobExperienceService.getAll());
    }

    @GetMapping("/getbyid")
    public ResponseEntity<?> GetById(int jobExperienceId){
        return ResponseEntity.ok(this.jobExperienceService.GetById(jobExperienceId));
    }

    @GetMapping("/getallsortedbydateofdismissal")
    public ResponseEntity<?> getAllSortedByDateOfDismissal(){
        return ResponseEntity.ok(this.jobExperienceService.getAllSortedByDateOfDismissal());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions) {
        Map<String, String> validationErrors = new HashMap<String, String>();
        for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Doğrulama hataları");
        return errors;
    }
}
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
import project.hrms.business.abstracts.CoverLetterService;
import project.hrms.entities.dtos.coverLetter.CoverLetterAddDto;
import project.hrms.entities.dtos.coverLetter.CoverLetterUpdateDto;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLettersController {

    @Autowired
    private CoverLetterService coverLetterService;
    public CoverLettersController(CoverLetterService coverLetterService) {
       this.coverLetterService=coverLetterService;
    }

    //command
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody CoverLetterAddDto coverLetterAddDto){
        return ResponseEntity.ok(this.coverLetterService.add(coverLetterAddDto));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> update(int coverLetterId){
        return ResponseEntity.ok(this.coverLetterService.delete(coverLetterId));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody CoverLetterUpdateDto coverLetterUpdateDto){
        return ResponseEntity.ok(this.coverLetterService.update(coverLetterUpdateDto));
    }

    //query
    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.coverLetterService.getAll());
    }

    @GetMapping("/getbyid")
    public ResponseEntity<?> getById(int coverLetterId){
        return ResponseEntity.ok(this.coverLetterService.getById(coverLetterId));
    }
}

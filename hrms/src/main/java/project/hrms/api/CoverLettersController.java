package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.CoverLetterService;
import project.hrms.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLettersController {
    @Autowired
    private CoverLetterService coverLetterService;
    public CoverLettersController(CoverLetterService coverLetterService) {
       this.coverLetterService=coverLetterService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody CoverLetter coverLetter){
        return ResponseEntity.ok(this.coverLetterService.add(coverLetter));
    }
}

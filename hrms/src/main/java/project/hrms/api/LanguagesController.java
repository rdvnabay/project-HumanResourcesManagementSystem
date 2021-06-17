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
import project.hrms.business.abstracts.LanguageService;
import project.hrms.entities.dtos.language.LanguageAddDto;
import project.hrms.entities.dtos.language.LanguageUpdateDto;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    
    @Autowired
    private LanguageService languageService;
    public LanguagesController(LanguageService languageService) {
        this.languageService=languageService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody LanguageAddDto languageAddDto){
        return ResponseEntity.ok(this.languageService.add(languageAddDto));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(int languageId){
        return ResponseEntity.ok(this.languageService.delete(languageId));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody LanguageUpdateDto languageUpdateDto){
        return ResponseEntity.ok(this.languageService.update(languageUpdateDto));
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.languageService.getAll());
    }

    @GetMapping("/getbyid")
    public ResponseEntity<?> getById(int languageId){
        return ResponseEntity.ok(this.languageService.getById(languageId));
    }
}

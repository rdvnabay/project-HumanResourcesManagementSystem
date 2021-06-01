package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.LanguageService;
import project.hrms.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    
    @Autowired
    private LanguageService languageService;
    public LanguagesController(LanguageService languageService) {
        this.languageService=languageService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Language language){
        return ResponseEntity.ok(this.languageService.add(language));
    }
}

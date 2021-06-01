package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.SkillService;
import project.hrms.entities.concretes.Skill;
import project.hrms.entities.dtos.SkillAddDto;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
    @Autowired
    private SkillService skillService;
    public SkillsController(SkillService skillService) {
       this.skillService=skillService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody SkillAddDto skillAddDto){
        return ResponseEntity.ok(this.skillService.add(skillAddDto));
    }
}

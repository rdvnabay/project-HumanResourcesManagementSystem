package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.dtos.SkillAddDto;

public interface SkillService {
    Result add(SkillAddDto skillAddDto);
}

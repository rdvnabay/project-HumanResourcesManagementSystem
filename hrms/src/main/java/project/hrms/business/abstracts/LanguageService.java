package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.dtos.LanguageAddDto;

public interface LanguageService {
    Result add(LanguageAddDto languageAddDto);
}

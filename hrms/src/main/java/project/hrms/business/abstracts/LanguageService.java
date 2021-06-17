package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.dtos.language.LanguageAddDto;
import project.hrms.entities.dtos.language.LanguageDto;
import project.hrms.entities.dtos.language.LanguageUpdateDto;

public interface LanguageService {
    Result add(LanguageAddDto languageAddDto);
    Result delete(int languageId);
    Result update(LanguageUpdateDto languageUpdateDto);
    DataResult<List<LanguageDto>> getAll();
    DataResult<LanguageDto> getById(int languageId);
}

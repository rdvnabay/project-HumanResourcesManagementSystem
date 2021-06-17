package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.dtos.coverLetter.CoverLetterAddDto;
import project.hrms.entities.dtos.coverLetter.CoverLetterDto;
import project.hrms.entities.dtos.coverLetter.CoverLetterUpdateDto;

public interface CoverLetterService  {
    Result add(CoverLetterAddDto coverLetterAddDto);
    Result delete(int coverLetterId);
    Result update(CoverLetterUpdateDto coverLetterUpdateDto);
    DataResult<List<CoverLetterDto>> getAll();
    DataResult<CoverLetterDto> getById(int coverLetterId);    
}

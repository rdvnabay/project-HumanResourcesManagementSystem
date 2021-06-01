package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.dtos.CoverLetterAddDto;

public interface CoverLetterService  {
    Result add(CoverLetterAddDto coverLetterAddDto);
}

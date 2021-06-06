package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.dtos.CoverLetterAddDto;

public interface CoverLetterService  {
    Result add(CoverLetterAddDto coverLetterAddDto);

    DataResult<List<CoverLetterAddDto>> getAll();
}

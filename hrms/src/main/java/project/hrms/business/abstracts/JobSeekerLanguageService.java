package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.dtos.jobseeker.JobSeekerLanguageAddDto;
import project.hrms.entities.dtos.jobseeker.JobSeekerLanguageDto;
import project.hrms.entities.dtos.jobseeker.JobSeekerLanguageUpdateDto;

public interface JobSeekerLanguageService {
    Result add(JobSeekerLanguageAddDto jobSeekerLanguageAddDto);
    Result update(JobSeekerLanguageUpdateDto jobSeekerLanguageUpdateDto);
    Result delete(int jobSeekerLanguageId);
    DataResult<List<JobSeekerLanguageDto>> getAll();
    DataResult<JobSeekerLanguageDto> getById(int jobSeekerLanguageId);

  
}

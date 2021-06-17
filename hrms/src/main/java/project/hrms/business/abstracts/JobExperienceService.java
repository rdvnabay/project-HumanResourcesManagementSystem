package project.hrms.business.abstracts;

import java.util.List;
import javax.validation.Valid;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobExperience;
import project.hrms.entities.dtos.jobExperience.JobExperienceAddDto;
import project.hrms.entities.dtos.jobExperience.JobExperienceDto;
import project.hrms.entities.dtos.jobExperience.JobExperienceUpdateDto;

public interface JobExperienceService {
    Result add(JobExperienceAddDto jobExperienceAddDto);
    Result delete(int jobExperienceId);
    Result update(@Valid JobExperienceUpdateDto jobExperienceAddDto);

    DataResult<List<JobExperience>> getAllSortedByDateOfDismissal();
    DataResult<List<JobExperienceDto>> getAll();
    DataResult<JobExperienceDto> GetById(int jobExperienceId);
}

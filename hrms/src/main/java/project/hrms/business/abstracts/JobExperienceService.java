package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobExperience;
import project.hrms.entities.dtos.JobExperienceAddDto;

public interface JobExperienceService {
    Result add(JobExperienceAddDto jobExperienceAddDto);
    DataResult<List<JobExperience>> getAllSortedByDateOfDismissal();
}

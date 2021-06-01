package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
    Result add(JobExperience jobExperience);
}

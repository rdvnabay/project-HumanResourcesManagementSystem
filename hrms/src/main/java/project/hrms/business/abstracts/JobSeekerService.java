package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.dtos.JobSeekerAddDto;

public interface JobSeekerService {
    Result add(JobSeekerAddDto jobSeekerAddDto);
    DataResult<List<JobSeeker>> getAll();
    DataResult<JobSeeker> getByNationalIdentity(String nationalIdentity);
}

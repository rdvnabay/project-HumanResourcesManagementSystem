package project.hrms.business.abstracts;

import java.io.IOException;
import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.dtos.jobseeker.JobSeekerAddDto;

public interface JobSeekerService {
    Result add(JobSeekerAddDto jobSeekerAddDto) throws IOException;
    DataResult<List<JobSeeker>> getAll();
    DataResult<JobSeeker> getByNationalIdentity(String nationalIdentity);
}

package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {

    Result add(JobSeeker jobSeeker);
    DataResult<List<JobSeeker>> getAll();
}
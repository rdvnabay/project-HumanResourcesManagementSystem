package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
    Result add(JobPosition jobPosition);
    DataResult<List<JobPosition>> getAll();
    Result jobPositionExists(String name);
}

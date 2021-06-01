package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobPosition;
import project.hrms.entities.dtos.JobPositionAddDto;

public interface JobPositionService {
    Result add(JobPositionAddDto jobPositionAddDto);
    DataResult<List<JobPosition>> getAll();
    Result jobPositionExists(String name);
}

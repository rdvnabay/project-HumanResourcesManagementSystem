package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.dtos.jobPosition.JobPositionAddDto;
import project.hrms.entities.dtos.jobPosition.JobPositionDto;
import project.hrms.entities.dtos.jobPosition.JobPositionUpdateDto;

public interface JobPositionService {
    Result add(JobPositionAddDto jobPositionAddDto);
    Result delete(int jobPositionId);
    Result update(JobPositionUpdateDto jobPositionUpdateDto);
    
    DataResult<List<JobPositionDto>> getAll();
    DataResult<JobPositionDto> getById(int jobPositionId);

    Result jobPositionExists(String name);
    
}

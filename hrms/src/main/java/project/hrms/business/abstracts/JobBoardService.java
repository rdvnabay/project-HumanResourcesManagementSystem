package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobBoard;
import project.hrms.entities.dtos.jobboard.ActiveJobBoardsDto;
import project.hrms.entities.dtos.jobboard.JobBoardAddDto;
import project.hrms.entities.dtos.jobboard.JobBoardDto;
import project.hrms.entities.dtos.jobboard.JobBoardUpdateDto;

public interface JobBoardService {
    Result add(JobBoardAddDto jobBoardAddDto);
    Result delete(int employerId);
    Result update(JobBoardUpdateDto jobBoardUpdateDto);  
    DataResult<List<JobBoardDto>> getAll();
    DataResult<List<ActiveJobBoardsDto>> getAllactiveJobBoardsDto();
    DataResult<List<ActiveJobBoardsDto>> getAllActiveJobBoardSortedDate();
    DataResult<JobBoard> getActiveJobByEmployerId(int employerId);
    DataResult<List<JobBoard>> getAllActiveJobByEmployerId(int employerId);
}

package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobBoard;
import project.hrms.entities.dtos.ActiveJobBoardsDto;

public interface JobBoardService {

    Result add(JobBoard jobBoard);

    DataResult<List<JobBoard>> getAll();

    DataResult<List<ActiveJobBoardsDto>> getAllactiveJobBoardsDto();
    DataResult<List<ActiveJobBoardsDto>> getAllActiveJobBoardSortedDate();
    DataResult<List<JobBoard>> getAllActiveJobByEmployerId(int employerId);

}

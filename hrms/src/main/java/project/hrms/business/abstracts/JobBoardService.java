package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobBoard;

public interface JobBoardService {

    Result add(JobBoard jobBoard);

    DataResult<List<JobBoard>> getAll();
}

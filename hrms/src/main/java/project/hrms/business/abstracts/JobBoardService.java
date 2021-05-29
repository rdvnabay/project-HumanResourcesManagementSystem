package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobBoard;

public interface JobBoardService {

    Result add(JobBoard jobBoard);  
}

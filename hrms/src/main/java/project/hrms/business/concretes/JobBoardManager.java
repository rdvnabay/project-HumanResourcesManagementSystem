package project.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.JobBoardService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobBoardDao;
import project.hrms.entities.concretes.JobBoard;

@Service
public class JobBoardManager implements JobBoardService {

    private JobBoardDao jobBoardDao;
    public JobBoardManager(JobBoardDao jobBoardDao) {
        this.jobBoardDao=jobBoardDao;
    }
    @Override
    public Result add(JobBoard jobBoard) {
        this.jobBoardDao.save(jobBoard);
        return new SuccessResult();
    }
    @Override
    public DataResult<List<JobBoard>> getAll() {
      var jobBoards=this.jobBoardDao.findAll();
        return new SuccessDataResult<List<JobBoard>>(jobBoards);
    }
    
}

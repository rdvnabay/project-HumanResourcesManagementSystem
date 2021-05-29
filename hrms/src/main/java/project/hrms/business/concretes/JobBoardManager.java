package project.hrms.business.concretes;

import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.JobBoardService;
import project.hrms.core.utilities.results.Result;
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
    
}

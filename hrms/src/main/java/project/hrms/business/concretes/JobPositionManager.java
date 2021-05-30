package project.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobPositionService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobPositionDao;
import project.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

    @Autowired
    private JobPositionDao jobPositionDao;
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }

    //Methods
    @Override
    public Result add(JobPosition jobPosition) {
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
       var data=this.jobPositionDao.findAll();
        return new SuccessDataResult<List<JobPosition>>(data);
    }

    @Override
    public Result jobPositionExists(String name) {
        if( this.jobPositionDao.findByName(name)!=null){
            return new ErrorResult("Böyle bir iş pozisyonu zaten mevcut");
        }
        return new SuccessResult();
    }
}

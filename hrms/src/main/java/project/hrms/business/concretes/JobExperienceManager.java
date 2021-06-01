package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.JobExperienceService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobExperienceDao;
import project.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService {

    @Autowired
    private JobExperienceDao jobExperienceDao;
    public JobExperienceManager(JobExperienceDao jobExperienceDao) {
       this.jobExperienceDao=jobExperienceDao;
    }
    @Override
    public Result add(JobExperience jobExperience) {
       if(jobExperience.isWorkingStatus()){
          jobExperience.setDismissalDate(null);
       }
       this.jobExperienceDao.save(jobExperience);
       return new SuccessResult();
    }
   @Override
   public DataResult<List<JobExperience>> getAllSortedByDateOfDismissal() {
      Sort sort=Sort.by(Direction.DESC,"dismissalDate");
      return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(sort));
   }
}

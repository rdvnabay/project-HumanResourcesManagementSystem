package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobSeekerDao;
import project.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager  implements JobSeekerService{

    @Autowired
    private JobSeekerDao jobSeekerDao;
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao=jobSeekerDao;
    }

    //Methods
    @Override
    public Result add(JobSeeker jobSeeker) {
       this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("İş arayan eklendi");
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        var data=this.jobSeekerDao.findAll();
        return new SuccessDataResult<List<JobSeeker>>(data,"İş arayanlar listelendi");
    }
}

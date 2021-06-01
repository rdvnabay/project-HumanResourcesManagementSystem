package project.hrms.business.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.business.abstracts.UserService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobSeekerDao;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.concretes.User;
import project.hrms.entities.dtos.JobSeekerAddDto;

@Service
public class JobSeekerManager implements JobSeekerService {

    @Autowired
    private ModelMapper modelMapper;
    private JobSeekerDao jobSeekerDao;
    private UserService userService;

    public JobSeekerManager(JobSeekerDao jobSeekerDao, UserService userService) {
        this.jobSeekerDao = jobSeekerDao;
        this.userService=userService;
    }

    // Methods
    @Override
    public Result add(JobSeekerAddDto jobSeekerAddDto) {
        var jobSeeker = modelMapper.map(jobSeekerAddDto, JobSeeker.class);
        var user = modelMapper.map(jobSeekerAddDto, User.class);
        this.jobSeekerDao.save(jobSeeker);
        this.userService.add(user);
        return new SuccessResult("İş arayan eklendi");
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        var data = this.jobSeekerDao.findAll();
        return new SuccessDataResult<List<JobSeeker>>(data, "İş arayanlar listelendi");
    }

    @Override
    public DataResult<JobSeeker> getByNationalIdentity(String nationalIdentity) {
        var data = this.jobSeekerDao.findByNationalIdentity(nationalIdentity);
        return new SuccessDataResult<JobSeeker>(data);
    }
}

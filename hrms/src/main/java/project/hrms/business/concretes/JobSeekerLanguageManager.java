package project.hrms.business.concretes;

import java.util.List;

import com.google.common.reflect.TypeToken;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobSeekerLanguageService;
import project.hrms.business.constants.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobSeekerLanguageDao;
import project.hrms.entities.concretes.JobSeekerLanguage;
import project.hrms.entities.dtos.jobseeker.JobSeekerLanguageAddDto;
import project.hrms.entities.dtos.jobseeker.JobSeekerLanguageDto;
import project.hrms.entities.dtos.jobseeker.JobSeekerLanguageUpdateDto;

@Service
public class JobSeekerLanguageManager implements JobSeekerLanguageService {

    @Autowired
    private JobSeekerLanguageDao jobSeekerLanguageDao;
    private ModelMapper modelMapper;

    public JobSeekerLanguageManager(JobSeekerLanguageDao jobSeekerLanguageDao, ModelMapper modelMapper) {
        this.jobSeekerLanguageDao = jobSeekerLanguageDao;
        this.modelMapper = modelMapper;
    }

    // command
    @Override
    public Result add(JobSeekerLanguageAddDto jobSeekerLanguageAddDto) {
        var jobSeekerLanguage = modelMapper.map(jobSeekerLanguageAddDto, JobSeekerLanguage.class);
        this.jobSeekerLanguageDao.save(jobSeekerLanguage);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public Result update(JobSeekerLanguageUpdateDto jobSeekerLanguageUpdateDto) {
        var jobSeekerLanguage = modelMapper.map(jobSeekerLanguageUpdateDto, JobSeekerLanguage.class);
        this.jobSeekerLanguageDao.save(jobSeekerLanguage);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public Result delete(int jobSeekerLanguageId) {
        var jobSeekerLanguage = this.jobSeekerLanguageDao.getById(jobSeekerLanguageId);
        this.jobSeekerLanguageDao.delete(jobSeekerLanguage);
        return new SuccessResult(Messages.Deleted);
    }

    // query
    @Override
    public DataResult<List<JobSeekerLanguageDto>> getAll() {
        var jobSeekerLanguages=this.jobSeekerLanguageDao.findAll();
        List<JobSeekerLanguageDto> jobSeekerLanguageDtos=modelMapper.map(
            jobSeekerLanguages, new TypeToken<List<JobSeekerLanguageDto>>(){}.getType());
        return new SuccessDataResult<List<JobSeekerLanguageDto>>(jobSeekerLanguageDtos);
    }

    @Override
    public DataResult<JobSeekerLanguageDto> getById(int jobSeekerLanguageId) {
       var jobSeekerLanguage=this.jobSeekerLanguageDao.getById(jobSeekerLanguageId);
       var jobSeekerLanguageDto=modelMapper.map(jobSeekerLanguage, JobSeekerLanguageDto.class);
        return new SuccessDataResult<JobSeekerLanguageDto>(jobSeekerLanguageDto);
    }

}

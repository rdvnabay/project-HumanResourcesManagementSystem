package project.hrms.business.concretes;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobExperienceService;
import project.hrms.business.constants.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobExperienceDao;
import project.hrms.entities.concretes.JobExperience;
import project.hrms.entities.dtos.jobExperience.JobExperienceAddDto;
import project.hrms.entities.dtos.jobExperience.JobExperienceDto;
import project.hrms.entities.dtos.jobExperience.JobExperienceUpdateDto;

@Service
public class JobExperienceManager implements JobExperienceService {

   @Autowired
   private ModelMapper modelMapper;
   private JobExperienceDao jobExperienceDao;

   public JobExperienceManager(JobExperienceDao jobExperienceDao, ModelMapper modelMapper) {
      this.jobExperienceDao = jobExperienceDao;
      this.modelMapper = modelMapper;
   }

   // command
   @Override
   public Result add(JobExperienceAddDto jobExperienceAddDto) {
      if (jobExperienceAddDto.isWorkingStatus()) {
         jobExperienceAddDto.setDismissalDate(null);
      }
      modelMapper.getConfiguration().setAmbiguityIgnored(true);
      var jobExperience = modelMapper.map(jobExperienceAddDto, JobExperience.class);
      this.jobExperienceDao.save(jobExperience);
      return new SuccessResult();
   }

   @Override
   public Result delete(int jobExperienceId) {
      var jobExperience = this.jobExperienceDao.getById(jobExperienceId);
      this.jobExperienceDao.delete(jobExperience);
      return new SuccessResult(Messages.Deleted);
   }

   @Override
   public Result update(JobExperienceUpdateDto jobExperienceUpdateDto) {
      var jobExperience = modelMapper.map(jobExperienceUpdateDto, JobExperience.class);
      this.jobExperienceDao.save(jobExperience);
      return new SuccessResult(Messages.Updated);
   }

   // query
   @Override
   public DataResult<List<JobExperienceDto>> getAll() {
      var jobExperiences = this.jobExperienceDao.findAll();
      List<JobExperienceDto> jobExperiencesDto=modelMapper.map(jobExperiences,new TypeToken<List<JobExperienceDto>>(){}.getType());
      return new SuccessDataResult<List<JobExperienceDto>>(jobExperiencesDto);
   }

   @Override
   public DataResult<JobExperienceDto> GetById(int jobExperienceId) {
      var jobExperience = this.jobExperienceDao.getById(jobExperienceId);
      var jobExperienceDto = modelMapper.map(jobExperience, JobExperienceDto.class);
      return new SuccessDataResult<JobExperienceDto>(jobExperienceDto);
   }

   @Override
   public DataResult<List<JobExperience>> getAllSortedByDateOfDismissal() {
      Sort sort = Sort.by(Direction.DESC, "dismissalDate");
      return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(sort));
   }

}

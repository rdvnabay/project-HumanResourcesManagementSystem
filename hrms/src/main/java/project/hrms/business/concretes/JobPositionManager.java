package project.hrms.business.concretes;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobPositionService;
import project.hrms.business.constants.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobPositionDao;
import project.hrms.entities.concretes.JobPosition;
import project.hrms.entities.dtos.jobPosition.JobPositionAddDto;
import project.hrms.entities.dtos.jobPosition.JobPositionDto;
import project.hrms.entities.dtos.jobPosition.JobPositionUpdateDto;

@Service
public class JobPositionManager implements JobPositionService {

    @Autowired
    private ModelMapper modelMapper;
    private JobPositionDao jobPositionDao;

    public JobPositionManager(JobPositionDao jobPositionDao,ModelMapper modelMapper) {
        this.jobPositionDao = jobPositionDao;
        this.modelMapper=modelMapper;
    }

    // command
    @Override
    public Result add(JobPositionAddDto jobPositionAddDto) {
        var jobPosition = modelMapper.map(jobPositionAddDto, JobPosition.class);
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult();
    }

    @Override
    public Result delete(int jobPositionId) {
        var jobPosition = this.jobPositionDao.getById(jobPositionId);
        this.jobPositionDao.delete(jobPosition);
        return new SuccessResult();
    }

    @Override
    public Result update(JobPositionUpdateDto jobPositionUpdateDto) {
        var jobPosition = modelMapper.map(jobPositionUpdateDto, JobPosition.class);
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult(Messages.Updated);
    }

    // query
    @Override
    public DataResult<List<JobPositionDto>> getAll() {
        var jobPositions = this.jobPositionDao.findAll();
        List<JobPositionDto> jobPositionsDto = modelMapper.map(jobPositions,
        new TypeToken<List<JobPositionDto>>() {}.getType());
        return new SuccessDataResult<List<JobPositionDto>>(jobPositionsDto);
    }

    @Override
    public DataResult<JobPositionDto> getById(int jobPositionId) {
        var jobPosition = this.jobPositionDao.getById(jobPositionId);
        var jobPositionDto=modelMapper.map(jobPosition, JobPositionDto.class);
        return new SuccessDataResult<JobPositionDto>(jobPositionDto);
    }

    @Override
    public Result jobPositionExists(String name) {
        if (this.jobPositionDao.findByName(name) != null) {
            return new ErrorResult("Böyle bir iş pozisyonu zaten mevcut");
        }
        return new SuccessResult();
    }
}

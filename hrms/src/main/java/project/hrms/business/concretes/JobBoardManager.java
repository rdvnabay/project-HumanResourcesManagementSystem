package project.hrms.business.concretes;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobBoardService;
import project.hrms.business.constants.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobBoardDao;
import project.hrms.entities.concretes.JobBoard;
import project.hrms.entities.dtos.jobboard.ActiveJobBoardsDto;
import project.hrms.entities.dtos.jobboard.JobBoardAddDto;
import project.hrms.entities.dtos.jobboard.JobBoardDto;
import project.hrms.entities.dtos.jobboard.JobBoardUpdateDto;

@Service
public class JobBoardManager implements JobBoardService {

    @Autowired
    private JobBoardDao jobBoardDao;
    private ModelMapper modelMapper;

    public JobBoardManager(JobBoardDao jobBoardDao,ModelMapper modelMapper) {
        this.jobBoardDao = jobBoardDao;
        this.modelMapper=modelMapper;
    }

    // command
    @Override
    public Result add(JobBoardAddDto jobBoardAddDto) {
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        var jobBoard = modelMapper.map(jobBoardAddDto, JobBoard.class);
        this.jobBoardDao.save(jobBoard);
        return new SuccessResult();
    }

    @Override
    public Result delete(int employerId) {
        var jobBoard = this.jobBoardDao.getByEmployer_Id(employerId);
        this.jobBoardDao.delete(jobBoard);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public Result update(JobBoardUpdateDto jobBoardUpdateDto) {
        // modelMapper.getConfiguration().setAmbiguityIgnored(true);
        // var jobBoard=modelMapper.map(jobBoardAddDto, JobBoard.class);
        // this.jobBoardDao.save(jobBoard);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<JobBoardDto>> getAll() {
        var jobBoards = this.jobBoardDao.findAll();
        List<JobBoardDto> jobBoardsDto = modelMapper.map(jobBoards, new TypeToken<List<JobBoardDto>>() {
        }.getType());
        return new SuccessDataResult<List<JobBoardDto>>(jobBoardsDto);
    }

    @Override
    public DataResult<List<ActiveJobBoardsDto>> getAllactiveJobBoardsDto() {
        var jobBoards = this.jobBoardDao.findAll();
        ActiveJobBoardsDto activeJobBoardsDto = modelMapper.map(jobBoards, ActiveJobBoardsDto.class);
        return new SuccessDataResult<List<ActiveJobBoardsDto>>(activeJobBoardsDto.toString());
    }

    @Override
    public DataResult<List<ActiveJobBoardsDto>> getAllActiveJobBoardSortedDate() {
        Sort sort = Sort.by(Direction.DESC, "applicationDeadLine");
        return new SuccessDataResult<List<ActiveJobBoardsDto>>(this.jobBoardDao.findAll(sort).toString());
    }

    @Override
    public DataResult<List<JobBoard>> getAllActiveJobByEmployerId(int employerId) {
        var jobBoards = this.jobBoardDao.getByEmployer_Id(employerId);
        return new SuccessDataResult<List<JobBoard>>(jobBoards.toString());
    }

    @Override
    public DataResult<JobBoard> getActiveJobByEmployerId(int employerId) {
        var jobBoard = this.jobBoardDao.getByEmployer_Id(employerId);
        return new SuccessDataResult<JobBoard>(jobBoard);
    }
}

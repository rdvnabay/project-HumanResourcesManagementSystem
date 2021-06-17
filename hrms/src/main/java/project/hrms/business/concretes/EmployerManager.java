package project.hrms.business.concretes;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.business.abstracts.JobBoardService;
import project.hrms.business.abstracts.UserService;
import project.hrms.business.constants.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.EmployerDao;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.dtos.employer.EmployerAddDto;
import project.hrms.entities.dtos.employer.EmployerDto;
import project.hrms.entities.dtos.employer.EmployerUpdateDto;

@Service
public class EmployerManager implements EmployerService {

    @Autowired
    private ModelMapper modelMapper;
    private EmployerDao employerDao;
    private JobBoardService jobBoardService;
    private UserService userService;

    public EmployerManager(EmployerDao employerDao, JobBoardService jobBoardService, UserService userService) {
        this.employerDao = employerDao;
        this.jobBoardService = jobBoardService;
        this.userService = userService;
    }

    //command
    @Override
    public Result add(EmployerAddDto employerAddDto) {
        var employer = modelMapper.map(employerAddDto, Employer.class);
        this.employerDao.save(employer);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public Result delete(int employerId) {
        var employer=this.employerDao.getById(employerId);
        this.employerDao.delete(employer);
        return new SuccessResult();
    }

    @Override
    public Result update(EmployerUpdateDto employerUpdateDto) {
        var employer = modelMapper.map(employerUpdateDto, Employer.class);
        this.employerDao.save(employer);
        return new SuccessResult(Messages.Updated);
    }  

    //query
    @Override
    public DataResult<List<Employer>> getAll() {
        var data = this.employerDao.findAll();
        return new SuccessDataResult<List<Employer>>(data, "İş verenler listelendi");
    }

    @Override
    public DataResult<EmployerDto> getById(int employerId) {
        var employer=this.employerDao.getById(employerId);
        var employerDto=modelMapper.map(employer, EmployerDto.class);
        return new SuccessDataResult<EmployerDto>(employerDto);
    }

    @Override
    public Result changeJobBoardStatus(int employerId, boolean status) {
        var jobBoard = this.jobBoardService.getActiveJobByEmployerId(employerId).getData();
        jobBoard.setStatus(status);
        // this.employerDao.save(jobBoard);
        return new SuccessResult();
    } 
}

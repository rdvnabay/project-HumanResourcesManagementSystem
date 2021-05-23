package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.EmployerService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.EmployerDao;
import project.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

    @Autowired
    private EmployerDao employerDao;

    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    //Methods
    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("İş veren eklendi");
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        var data=this.employerDao.findAll();
        return new SuccessDataResult<List<Employer>>(data,"İş verenler listelendi");
    }

}

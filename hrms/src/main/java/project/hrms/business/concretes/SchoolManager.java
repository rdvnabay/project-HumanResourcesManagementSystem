package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.SchoolService;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.SchoolDao;
import project.hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService {

    @Autowired
    private SchoolDao schoolDao;
    public SchoolManager(SchoolDao schoolDao) {
      this.schoolDao=schoolDao;
    }
    @Override
    public Result add(School school) {
        this.schoolDao.save(school);
       return new SuccessResult();
    }
    
}

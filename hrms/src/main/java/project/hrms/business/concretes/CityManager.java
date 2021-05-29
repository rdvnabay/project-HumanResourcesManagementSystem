package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.CityService;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CityDao;
import project.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {

    @Autowired
    private CityDao cityDao;

    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public Result add(City city) {
    if (city.getName() == null && city.getName().isEmpty()) {
            return new ErrorResult("Eksik alanları doldurunuz");
        }
        this.cityDao.save(city);
        return new SuccessResult();
    }
}

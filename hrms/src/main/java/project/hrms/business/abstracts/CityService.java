package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.City;

public interface CityService {

    Result add(City city);
    DataResult<List<City>> getAll();
    DataResult<City> getByName(String name);
    Result cityExists(String city);
}

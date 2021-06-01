package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.City;
import project.hrms.entities.dtos.CityAddDto;

public interface CityService {
    Result add(CityAddDto cityAddDto);
    DataResult<List<City>> getAll();
    DataResult<City> getByName(String name);
    Result cityExists(String city);
}

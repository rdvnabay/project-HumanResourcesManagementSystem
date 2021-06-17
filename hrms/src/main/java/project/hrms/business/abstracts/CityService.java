package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.City;
import project.hrms.entities.dtos.city.CityAddDto;
import project.hrms.entities.dtos.city.CityDto;
import project.hrms.entities.dtos.city.CityUpdateDto;

public interface CityService {
    Result add(CityAddDto cityAddDto);
    Result delete(int cityId);
    Result update(CityUpdateDto cityUpdateDto);

    DataResult<List<CityDto>> getAll();
    DataResult<CityDto> getById(int cityId);
    DataResult<City> getByName(String name);

    Result cityExists(String city);
    Result isThereRecord(int cityId);
}

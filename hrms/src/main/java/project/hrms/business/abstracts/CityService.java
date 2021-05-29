package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.City;

public interface CityService {

    Result add(City city);
    
}

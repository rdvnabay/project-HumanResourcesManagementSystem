package project.hrms.business.concretes;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.CityService;
import project.hrms.business.constants.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CityDao;
import project.hrms.entities.concretes.City;
import project.hrms.entities.dtos.city.CityAddDto;
import project.hrms.entities.dtos.city.CityDto;
import project.hrms.entities.dtos.city.CityUpdateDto;

@Service
public class CityManager implements CityService {

    @Autowired
    private ModelMapper modelMapper;
    private CityDao cityDao;

    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    // command
    @Override
    public Result add(CityAddDto cityAddDto) {
        var city = modelMapper.map(cityAddDto, City.class);
        this.cityDao.save(city);
        return new SuccessResult();
    }

    @Override
    public Result delete(int cityId) {
        var city = this.cityDao.getById(cityId);
        this.cityDao.delete(city);
        return new SuccessResult();
    }

    @Override
    public Result update(CityUpdateDto cityUpdateDto) {
        var city = modelMapper.map(cityUpdateDto, City.class);
        cityDao.save(city);
        return new SuccessResult();
    }

    // query
    @Override
    public DataResult<List<CityDto>> getAll() {
        var cities = this.cityDao.findAll();

        List<CityDto> citiesDto = modelMapper.map(cities, new TypeToken<List<CityDto>>() {
        }.getType());
        return new SuccessDataResult<List<CityDto>>(citiesDto);
    }

    @Override
    public DataResult<CityDto> getById(int cityId) {
        var city=this.cityDao.findById(cityId).orElse(null);
        var cityDto=modelMapper.map(city, CityDto.class);
        return new SuccessDataResult<CityDto>(cityDto);
    }

    @Override
    public DataResult<City> getByName(String name) {
        return new SuccessDataResult<City>(this.cityDao.findByName(name));
    }

    @Override
    public Result cityExists(String city) {
        if (this.cityDao.findByName(city) != null) {
            return new ErrorResult(Messages.AlreadyExists);
        }
        return new SuccessResult();
    }

    @Override
    public Result isThereRecord(int cityId) {
        var city = this.cityDao.findById(cityId);
        if (city == null) {
            return new ErrorResult(Messages.RecordNotFound);
        }
        return new SuccessResult();
    }
}

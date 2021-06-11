package project.hrms.business.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.CityService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CityDao;
import project.hrms.entities.concretes.City;
import project.hrms.entities.dtos.city.CityAddDto;
import project.hrms.entities.dtos.city.CityUpdateDto;

@Service
public class CityManager implements CityService {

    @Autowired
    private ModelMapper modelMapper;
    private CityDao cityDao;

    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public Result add(CityAddDto cityAddDto) {
        if (cityAddDto.getName() == null || cityAddDto.getName().isEmpty()) {
            return new ErrorResult("Eksik alanları doldurunuz");
        }
        var city=modelMapper.map(cityAddDto, City.class);
        this.cityDao.save(city);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<City>> getAll() {
        var cities=this.cityDao.findAll();
        return new SuccessDataResult<List<City>>(cities);
    }

    @Override
    public DataResult<City> getByName(String name) {
        return new SuccessDataResult<City>
        (this.cityDao.findByName(name));	
    }

    @Override
    public Result cityExists(String city){
        if(this.cityDao.findByName(city)!=null){
            return new ErrorResult("Böyle bir şehir zaten mevcut");
        }
        return new SuccessResult();
    }

    @Override
    public Result delete(int cityId) {
        var city=this.cityDao.getById(cityId);
        if(city==null){
            return new ErrorResult("Silinecek kayıt bulunamadı");
        }
        this.cityDao.delete(city);
        return new SuccessResult();
    }

    @Override
    public Result update(CityUpdateDto cityUpdateDto) {
        var city=modelMapper.map(cityUpdateDto, City.class);
        return null;
    }
}

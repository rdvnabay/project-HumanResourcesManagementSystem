package project.hrms.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.CityService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.City;
import project.hrms.entities.dtos.CityAddDto;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {

    @Autowired
    private CityService cityService;
    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CityAddDto cityAddDto) {
        var cityExists = this.cityService.cityExists(cityAddDto.getName());
        if (!cityExists.isSuccess()) {
            return this.cityService.cityExists(cityAddDto.getName());
        }
        return this.cityService.add(cityAddDto);
    }

    @GetMapping("/getAll")
    public DataResult<List<City>> getAll() {
        return this.cityService.getAll();
    }
}

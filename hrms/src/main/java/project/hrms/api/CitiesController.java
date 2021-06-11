package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.CityService;
import project.hrms.entities.dtos.city.CityAddDto;
import project.hrms.entities.dtos.city.CityUpdateDto;

@RestController
@RequestMapping("/api/cities")
@CrossOrigin
public class CitiesController {

    @Autowired
    private CityService cityService;
    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody CityAddDto cityAddDto) {
        var cityExists = this.cityService.cityExists(cityAddDto.getName());
        if (!cityExists.isSuccess()) {
            //return ResponseEntity.ok(this.cityService.cityExists(cityAddDto.getName()));
        }
        return ResponseEntity.ok(this.cityService.add(cityAddDto));
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody CityUpdateDto cityUpdateDto){
        return ResponseEntity.ok(this.cityService.update(cityUpdateDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.cityService.getAll());
    }
}

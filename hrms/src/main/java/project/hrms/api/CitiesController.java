package project.hrms.api;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.CityService;
import project.hrms.core.utilities.results.ErrorDataResult;
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

    // command operation
    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody CityAddDto cityAddDto) {
        var cityExists = this.cityService.cityExists(cityAddDto.getName());
        if (!cityExists.isSuccess()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                                 .body(cityExists.getMessage());
        }
        return ResponseEntity.ok(this.cityService.add(cityAddDto));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(int cityId){
        var record=this.cityService.isThereRecord(cityId);
        if(!record.isSuccess()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(record.getMessage());
        }
        return ResponseEntity.ok(this.cityService.delete(cityId));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody CityUpdateDto cityUpdateDto) {
        return ResponseEntity.ok(this.cityService.update(cityUpdateDto));
    }

    // query operation
    @GetMapping("/getall")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.cityService.getAll());
    }

    @GetMapping("/getbyid")
    public ResponseEntity<?> getById(int cityId) {
        return ResponseEntity.ok(this.cityService.getById(cityId));
    }

    //exception handler
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions) {
        Map<String, String> validationErrors = new HashMap<String, String>();
        for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Doğrulama hataları");
        return errors;
    }
}

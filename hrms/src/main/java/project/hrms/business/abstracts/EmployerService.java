package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.dtos.employer.EmployerDto;
import project.hrms.entities.dtos.employer.EmployerUpdateDto;

public interface EmployerService {

    Result add(Employer employer);
    Result delete(int employerId);
    Result update(EmployerUpdateDto employerUpdateDto);

    DataResult<List<Employer>> getAll();
    Result changeJobBoardStatus(int employerId, boolean status);
    DataResult<EmployerDto> getById(int employerId); 
}

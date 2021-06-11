package project.hrms.business.abstracts;
import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.dtos.employer.EmployerAddDto;

public interface EmployerService {
    Result add(EmployerAddDto employerAddDto);
    DataResult<List<Employer>> getAll();
    Result changeJobBoardStatus(int employerId, boolean status);
}

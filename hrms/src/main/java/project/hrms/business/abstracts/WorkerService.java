package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Worker;

public interface WorkerService {

    Result add(Worker worker);
    DataResult<List<Worker>> getAll();
}

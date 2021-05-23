package project.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.WorkerService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.WorkerDao;
import project.hrms.entities.concretes.Worker;

@Service
public class WorkerManager implements WorkerService {

    @Autowired
    private WorkerDao workerDao;

    public WorkerManager(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }

    //Methods
    @Override
    public Result add(Worker worker) {
        this.workerDao.save(worker);
        return new SuccessResult("Çalışan eklendi");
    }

    @Override
    public DataResult<List<Worker>> getAll() {
        var data=this.workerDao.findAll();
        return new SuccessDataResult<List<Worker>>(data,"Çalışanlar listelendi");
    }
}

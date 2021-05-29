package project.hrms.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.JobPositionService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
    
    @Autowired
    private JobPositionService jobPositionService;
    public JobPositionsController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    //
    @PostMapping("/add")
    public Result add(JobPosition jobPosition){
        var jobPositionExists=this.jobPositionService.jobPositionExists(jobPosition.getName());
        if(!jobPositionExists.isSuccess()){
            return this.jobPositionService.jobPositionExists(jobPosition.getName());
        }
        return this.jobPositionService.add(jobPosition);
    }

    @GetMapping("/getAll")
    public DataResult<List<JobPosition>>getAll(){
        return this.jobPositionService.getAll();
    }
}

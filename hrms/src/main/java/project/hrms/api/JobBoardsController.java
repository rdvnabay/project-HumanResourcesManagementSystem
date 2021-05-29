package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.JobBoardService;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobBoard;

@RestController
@RequestMapping("/api/jobboards")
public class JobBoardsController {
    
    @Autowired
    private JobBoardService jobBoardService;
    public JobBoardsController(JobBoardService jobBoardService) {
        this.jobBoardService=jobBoardService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobBoard jobBoard){
        return this.jobBoardService.add(jobBoard);
    }
}

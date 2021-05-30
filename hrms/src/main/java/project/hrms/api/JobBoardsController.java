package project.hrms.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.JobBoardService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobBoard;
import project.hrms.entities.dtos.ActiveJobBoardsDto;

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

    @GetMapping("/getAll")
    public DataResult<List<JobBoard>> getAll(){
        return this.jobBoardService.getAll();
    }

    @GetMapping("/getAllactiveJobBoards")
    @ResponseBody
    public DataResult<List<ActiveJobBoardsDto>> getAllactiveJobBoards(){
        return this.jobBoardService.getAllactiveJobBoardsDto();
    }

    @GetMapping("/getAllActiveJobBoardSortedDate")
    public DataResult<List<ActiveJobBoardsDto>> getAllActiveJobBoardSortedDate(){
        return this.jobBoardService.getAllActiveJobBoardSortedDate();
    }

    @GetMapping("/getAllActiveJobByEmployer")
    public DataResult<List<JobBoard>> getAllActiveJobByEmployerId(int employerId){
        return this.jobBoardService.getAllActiveJobByEmployerId(employerId);
    }

}

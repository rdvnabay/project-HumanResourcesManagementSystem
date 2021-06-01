package project.hrms.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.dtos.JobSeekerAddDto;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {

    @Autowired
    private JobSeekerService jobSeekerService;
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobSeekerAddDto jobSeekerAddDto) {
        return this.jobSeekerService.add(jobSeekerAddDto);
    }

    @GetMapping("/getAll")
    public DataResult<List<JobSeeker>> getAll() {
        return this.jobSeekerService.getAll();
    }
}

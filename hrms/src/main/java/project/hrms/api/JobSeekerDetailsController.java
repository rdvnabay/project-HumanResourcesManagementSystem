// package project.hrms.api;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import project.hrms.business.abstracts.JobSeekerDetailService;
// import project.hrms.entities.concretes.JobSeekerDetail;

// @RestController
// @RequestMapping("/api/jobseekerdetails")
// public class JobSeekerDetailsController {
    
//     @Autowired
//     private JobSeekerDetailService jobSeekerDetailService;
//     public JobSeekerDetailsController(JobSeekerDetailService jobSeekerDetailService) {
//         this.jobSeekerDetailService=jobSeekerDetailService;
//     }

//     @PostMapping("/add")
//     public ResponseEntity<?> add(@RequestBody JobSeekerDetail jobSeekerDetail){
//         return ResponseEntity.ok(this.jobSeekerDetailService.add(jobSeekerDetail));
//     }
// }

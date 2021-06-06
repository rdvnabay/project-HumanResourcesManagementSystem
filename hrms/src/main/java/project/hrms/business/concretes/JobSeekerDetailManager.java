// package project.hrms.business.concretes;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import project.hrms.business.abstracts.JobSeekerDetailService;
// import project.hrms.core.utilities.results.Result;
// import project.hrms.core.utilities.results.SuccessResult;
// import project.hrms.dataAccess.abstracts.JobSeekerDetailDao;
// import project.hrms.entities.concretes.JobSeekerDetail;

// @Service
// public class JobSeekerDetailManager implements JobSeekerDetailService{

//     @Autowired
//     private JobSeekerDetailDao jobSeekerDetailDao;
//     public JobSeekerDetailManager(JobSeekerDetailDao jobSeekerDetailDao) {
//         this.jobSeekerDetailDao=jobSeekerDetailDao;
//     }
//     @Override
//     public Result add(JobSeekerDetail jobSeekerDetail) {
//       this.jobSeekerDetailDao.save(jobSeekerDetail);
//       return new SuccessResult();
//     }
    
// }

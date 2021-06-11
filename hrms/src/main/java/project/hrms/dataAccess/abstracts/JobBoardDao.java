package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.JobBoard;

public interface JobBoardDao extends JpaRepository<JobBoard, Integer> {

    JobBoard getByEmployer_Id(int employerId);
    
    // @Query("From JobBoard where employer.employerId=:employerId")
    // List<JobBoard> getAllByEmployer_Id(int employerId);
    
    // @Query("Select new project.hrms.entities.dtos.jobboard.JobBoardDto "
    // +" (jb.id,jb.applicationDeadLine,jb.description,jb.minSalary,jb.maxSalary,jb.openPositionQuantity"
    // +"  jp.name)"
    // +" From JobBoard jb Inner Join jb.jobPosition jp" )
    // // +"                  Inner Join jb.city c"
    // // +"                  Inner Join jb.employer e")
    // List<JobBoardDto> BoardsWithEmployerNameCityNameAndPositionName();
    
}

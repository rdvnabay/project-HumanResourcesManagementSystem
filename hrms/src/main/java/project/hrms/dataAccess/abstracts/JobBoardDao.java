package project.hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.hrms.entities.concretes.JobBoard;

public interface JobBoardDao extends JpaRepository<JobBoard, Integer> {

    JobBoard getByEmployer_Id(int employerId);

    @Query("From JobBoard where employer.employerId=:employerId")
    List<JobBoard> getAllByEmployer_Id(int employerId);
}

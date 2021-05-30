package project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.JobBoard;

public interface JobBoardDao extends JpaRepository<JobBoard,Integer>{

    List<JobBoard> getByEmployer_Id(int employerId);
    
}

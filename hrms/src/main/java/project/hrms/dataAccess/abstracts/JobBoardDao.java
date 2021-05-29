package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.JobBoard;

public interface JobBoardDao extends JpaRepository<JobBoard,Integer>{
    
}

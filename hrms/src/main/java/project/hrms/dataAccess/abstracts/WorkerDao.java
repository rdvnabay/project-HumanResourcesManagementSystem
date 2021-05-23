package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.Worker;

public interface WorkerDao extends JpaRepository<Worker,Integer> {
    
}

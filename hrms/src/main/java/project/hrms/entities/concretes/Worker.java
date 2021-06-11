package project.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="workers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Worker extends User {
    
    @Column(name="user_name")
    private String userName;

    //Relationship
    @OneToMany(mappedBy ="worker")
    private List<WorkerJobBoardConfirm> workerJobBoardConfirm;
}

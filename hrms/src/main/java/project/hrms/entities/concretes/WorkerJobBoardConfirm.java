package project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="worker_job_board_confirm")
public class WorkerJobBoardConfirm {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @ManyToOne()
    @JoinColumn(name="worker_id")
    private Worker worker;

    @ManyToOne()
    @JoinColumn(name="job_board_id")
    private JobBoard jobBoard;

   @Column(name="confirm")
    private boolean confirm;
    // @ManyToOne(fetch = FetchType.LAZY)
    // @MapsId("workerId")
    // @Id
    // private Worker worker;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @MapsId("jobBoardId")
    // @Id
    // private JobBoard jobBoard;

    // @Column(name="confirm")
    // private boolean confirm;
}

package project.hrms.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_experiences")
public class JobExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id" )
    private int id;

    @Column(name = "job_position_id")
    private int jobPositionId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "date_of_start")
    private Date dateOfStart;

    @Column(name = "dismissal_date")
    private Date dismissalDate; 

    @Column(name = "working_status")
    private boolean workingStatus; 

    @Column(name = "job_seeker_id")
    private int jobSeeker_id;
    // @ManyToOne()
    // @JoinColumn(name = "user_id")
    // private JobSeeker jobSeeker;
}

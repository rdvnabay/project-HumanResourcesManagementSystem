package project.hrms.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name = "user_id")
public class JobSeeker extends User{
    
    @Column(name="national_identity")
    private String nationalIdentity;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="year_of_birth")
    private Date yearOfBirth;

    @Column(name="link_github")
    private String linkGithub;

    @Column(name = "link_linkedin")
    private String linkLinkedin;

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "job_seeker_id",referencedColumnName = "User_id")
    // private JobSeekerDetail jobSeekerDetail;

    // @OneToMany(mappedBy = "job_seekers")
    // private List<JobExperience> jobExperiences;

    // @OneToMany(mappedBy = "job_seekers")
    // private List<School> schools;
}

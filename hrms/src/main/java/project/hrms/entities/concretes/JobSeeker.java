package project.hrms.entities.concretes;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name = "job_seeker_id")
public class JobSeeker extends User {

    @Column(name = "national_identity")
    private String nationalIdentity;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "year_of_birth")
    private Date yearOfBirth;

    @Column(name = "link_github")
    private String linkGithub;

    @Column(name = "link_linkedin")
    private String linkLinkedin;

    @Column(name = "profile_image")
    private String profileImage;

    //RelationShip
    @OneToMany(mappedBy ="jobSeeker")
    private List<JobSeekerExperience> jobSeekerExperiences;

    @OneToMany(mappedBy ="jobSeeker")
    private List<JobSeekerLanguage> jobSeekerLanguages;

    @OneToMany(mappedBy ="jobSeeker")
    private List<JobSeekerSchool> jobSeekerSchools;

    @OneToMany(mappedBy ="jobSeeker")
    private List<JobSeekerSkill> jobSeekerSkills;

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "job_seeker_id",referencedColumnName = "User_id")
    // private JobSeekerDetail jobSeekerDetail;

}

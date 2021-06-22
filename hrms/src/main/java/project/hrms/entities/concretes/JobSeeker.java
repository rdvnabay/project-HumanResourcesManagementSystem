package project.hrms.entities.concretes;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

    @Column(name = "profile_image")
    private String profileImage;

    // RelationShip
    @OneToOne(mappedBy = "jobSeeker", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private SocialMediaAccount socialMediaAccount;

    @OneToMany(mappedBy = "jobSeeker")
    private List<JobSeekerExperience> jobSeekerExperiences;

    @OneToMany(mappedBy = "jobSeeker")
    private List<JobSeekerLanguage> jobSeekerLanguages;

    @OneToMany(mappedBy = "jobSeeker")
    private List<JobSeekerSchool> jobSeekerSchools;

    @OneToMany(mappedBy = "jobSeeker")
    private List<JobSeekerSkill> jobSeekerSkills;

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "job_seeker_id",referencedColumnName = "User_id")
    // private JobSeekerDetail jobSeekerDetail;

}

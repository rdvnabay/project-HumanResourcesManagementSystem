package project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "social_media_account")
@PrimaryKeyJoinColumn(name = "job_seeker_id")
public class SocialMediaAccount {

    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "github")
    private String github;

    @Column(name = "linkedin")
    private String linkedin;

    //Relationship
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;

}

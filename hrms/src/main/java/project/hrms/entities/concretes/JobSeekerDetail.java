// package project.hrms.entities.concretes;

// import javax.persistence.Column;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.OneToOne;
// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// //@Entity
// //@Table(name = "job_seeker_detail")
// public class JobSeekerDetail{

//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "id")
//     private int id;

//     @Column(name="link_github")
//     private String linkGithub;

//     @Column(name = "link_linkedin")
//     private String linkLinkedin;

//     @OneToOne(mappedBy ="job_seeker_detail" )
//     private JobSeeker jobSeeker;
// }

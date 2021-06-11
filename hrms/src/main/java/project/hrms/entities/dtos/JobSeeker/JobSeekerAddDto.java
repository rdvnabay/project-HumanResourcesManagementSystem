package project.hrms.entities.dtos.jobseeker;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerAddDto {
    private String email;
    private String password;
    private String nationalIdentity;
    private String firstName;
    private String lastName;
    private Date yearOfBirth;
    private String linkGithub;
    private String linkLinkedin;
    private String profileImage;
}

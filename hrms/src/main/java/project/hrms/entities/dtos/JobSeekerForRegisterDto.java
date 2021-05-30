package project.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerForRegisterDto {
    private String email;
    private String firstName;
    private String lastName;
    private String nationalIdentity;
    private String password;
    private Date yearOfBirth;
}

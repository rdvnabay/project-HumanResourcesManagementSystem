package project.hrms.entities.dtos.employer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerUpdateDto {
    private int employerId;
    private String email;
    private String password;
    private String companyName;
    private String webSiteAddress;
    private String phoneNumber;
}

package project.hrms.entities.dtos.employer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerForRegisterDto {
    private String companyName;
    private String email;
    private String password;
    private String phoneNumber;
    private String webSiteAddress;
}

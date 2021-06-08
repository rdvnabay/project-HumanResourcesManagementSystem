package project.hrms.entities.dtos.Employer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerAddDto {
    private String email;
    private String password;
    private String companyName;
    private String webSiteAddress;
    private String phoneNumber;

}

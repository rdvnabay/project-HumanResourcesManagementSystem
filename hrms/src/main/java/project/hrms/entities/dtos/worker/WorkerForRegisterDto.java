package project.hrms.entities.dtos.worker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerForRegisterDto {
    private String userName;
    private String email;
    private String password;
}

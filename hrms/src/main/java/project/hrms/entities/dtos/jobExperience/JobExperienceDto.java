package project.hrms.entities.dtos.jobExperience;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobExperienceDto {
    private int id;
    private int jobPositionId;
    private int jobSeekerId;
    private String companyName;
    private Date dateOfStart;
    private Date dismissalDate; 
    private boolean workingStatus; 
}

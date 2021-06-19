package project.hrms.entities.dtos.jobseeker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerLanguageDto {
 
    private int id;
    private int jobSeekerId;
    private int languageId;
    private int level;
}

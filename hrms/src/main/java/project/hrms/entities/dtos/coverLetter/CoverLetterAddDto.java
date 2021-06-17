package project.hrms.entities.dtos.coverLetter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoverLetterAddDto {
    private int jobSeekerId;
    private String name;
    private String description;
}

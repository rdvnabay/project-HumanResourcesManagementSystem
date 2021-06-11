package project.hrms.entities.dtos.jobboard;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobBoardDto {
    private int id;
    // private String cityName;
    // private String employerName; 
    private Date applicationDeadLine;
    private String description;
    private double maxSalary;
    private double minSalary;
    private int openPositionQuantity;
    private String jobPositionName;
}

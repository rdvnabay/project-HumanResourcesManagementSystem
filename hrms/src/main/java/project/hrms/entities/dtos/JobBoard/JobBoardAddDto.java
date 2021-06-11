package project.hrms.entities.dtos.jobboard;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobBoardAddDto {
    private int cityId;
    private int employerId;
    private int jobPositionId;
    private int mannerOfWorkId;
    private int workEnvironmentId;
    private Date applicationDeadLine;
    private String description;
    private double maxSalary;
    private double minSalary;
    private int openPositionQuantity;
}

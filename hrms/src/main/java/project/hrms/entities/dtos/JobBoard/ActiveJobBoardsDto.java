package project.hrms.entities.dtos.JobBoard;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveJobBoardsDto {
    private String companyName;
    private String jobPositionName;
    private int openPositionQuantity;
    private Date releaseDate;
    private Date applicationDeadLine;
    private boolean status;
}

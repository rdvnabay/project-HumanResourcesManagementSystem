package project.hrms.entities.dtos;

import java.sql.Date;
import java.text.SimpleDateFormat;

import lombok.Data;

@Data
public class ActiveJobBoardsDto {
    private String companyName;
    private String jobPositionName;
    private int openPositionQuantity;
    private Date releaseDate;
    private Date applicationDeadLine;
}

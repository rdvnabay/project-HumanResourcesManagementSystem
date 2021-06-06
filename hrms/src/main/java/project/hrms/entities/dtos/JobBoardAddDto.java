package project.hrms.entities.dtos;

import java.util.Date;
import org.springframework.data.annotation.CreatedDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobBoardAddDto {
    private int employerId;
    private int cityId;
    private int jobPositionId;
    private String description;
    private int openPositionQuantity;
    private Date applicationDeadLine;
    private double minPrice;
    private double maxPrice;
    private boolean status=true;

    @CreatedDate
    private Date createdDate;
}

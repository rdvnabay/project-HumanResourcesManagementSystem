package project.hrms.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_boards")
public class JobBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "city_id")
    private int cityId;

    @Column(name = "job_position_id")
    private int jobPositionId;

    @Column(name = "description")
    private String description;

    @Column(name = "open_position_quantity")
    private int openPositionQuantity;

    @Column(name = "application_dead_line")
    private Date applicationDeadLine;

    @Column(name = "min_salary")
    private double minPrice;

    @Column(name = "max_salary")
    private double maxPrice;
}

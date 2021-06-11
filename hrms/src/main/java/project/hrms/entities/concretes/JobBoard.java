package project.hrms.entities.concretes;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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

  @Column(name = "application_dead_line")
  private Date applicationDeadLine;

  @Column(name = "created_date")
  private Date createdDate;

  @Column(name = "description")
  private String description;

  @Column(name = "max_salary")
  private double maxSalary;

  @Column(name = "min_salary")
  private double minSalary;

  @Column(name = "open_position_quantity")
  private int openPositionQuantity;

  @Column(name = "status")
  private boolean status;

  // Relationship
  @ManyToOne()
  @JoinColumn(name = "employer_id")
  private Employer employer;

  @ManyToOne()
  @JoinColumn(name = "job_position_id")
  private JobPosition jobPosition;

  @ManyToOne()
  @JoinColumn(name = "manner_of_work_id")
  private MannerOfWork mannerOfWork;

  @ManyToOne()
  @JoinColumn(name = "work_environment_id")
  private WorkEnvironment workEnvironment;

  @ManyToMany
  @JoinTable(name = "job_board_city", joinColumns = @JoinColumn(name = "job_board_id"), inverseJoinColumns = @JoinColumn(name = "city_id"))
  private List<City> cities;
}

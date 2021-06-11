package project.hrms.entities.concretes;

import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank
    @NotNull
    @Column(name = "name")
    private String name;

    @NotBlank
    @NotNull
    @Column(name = "department")
    private String department;

    @Column(name = "starting_date")
    private Date startingDate;

    @Column(name = "date_of_graduation",nullable = true)
    private Date dateOfGraduation;

    @Column(name ="status_of_graduation " )
    private String statusOfGraduation;

    //RelationShip
    @OneToMany(mappedBy ="school")
    private List<JobSeekerSchool> jobSeekerSchools;
}

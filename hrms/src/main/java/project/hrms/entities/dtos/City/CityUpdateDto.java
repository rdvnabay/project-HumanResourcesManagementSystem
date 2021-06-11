package project.hrms.entities.dtos.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityUpdateDto {
    private int id;
    private String name;
}

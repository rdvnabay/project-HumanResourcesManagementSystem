package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.School;

public interface SchoolService {
    DataResult<List<School>> getAllSortedByGraduationYear();
    Result add(School school);
}

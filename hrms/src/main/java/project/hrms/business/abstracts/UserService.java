package project.hrms.business.abstracts;

import java.util.List;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.User;

public interface UserService {
    Result add(User user);
    DataResult<List<User>> getAll();
    DataResult<User> getByEmail(String email);
}

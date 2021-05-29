package project.hrms.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.UserService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    
    @Autowired
    private UserService userService;
    public UsersController(UserService userService) {
       this.userService=userService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user){
      return this.userService.add(user);
    }

    @GetMapping("/getAll")
    public DataResult<List<User>> getAll(){
        return this.userService.getAll();
    }
}
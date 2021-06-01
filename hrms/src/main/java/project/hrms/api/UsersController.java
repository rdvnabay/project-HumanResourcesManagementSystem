package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.UserService;
import project.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

  @Autowired
  private UserService userService;
  public UsersController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/add")
  public ResponseEntity<?> add(@RequestBody User user) {
    return ResponseEntity.ok(this.userService.add(user));
  }

  @GetMapping("/getAll")
  public ResponseEntity<?> getAll() {
    return ResponseEntity.ok(this.userService.getAll());
  }
}

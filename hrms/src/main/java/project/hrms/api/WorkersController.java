package project.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.WorkerService;
import project.hrms.entities.concretes.Worker;

@RestController
@RequestMapping("/api/workers")
public class WorkersController {

    @Autowired
    private WorkerService workerService;

    public WorkersController(WorkerService workerService) {
        this.workerService = workerService;
    }

    // Methods
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Worker worker) {
        return ResponseEntity.ok(this.workerService.add(worker));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.workerService.getAll());
    }
}

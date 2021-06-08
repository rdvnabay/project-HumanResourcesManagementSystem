import axios from "axios";
class WorkerService {
  getWorkers() {
    return axios.get("http://localhost:8080/api/workers/getAll");
  }
}

export default WorkerService;

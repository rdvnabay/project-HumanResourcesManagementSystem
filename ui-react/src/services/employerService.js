import axios from "axios";
class EmployerService {
  getEmployers() {
    return axios.get("http://localhost:8080/api/employers/getAll");
  }
}

export default EmployerService;

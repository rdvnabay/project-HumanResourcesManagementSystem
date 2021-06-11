import axios from "axios";

class JobBoardService {
  getJobBoards() {
    return axios.get("http://localhost:8080/api/jobboards/getAll");
  }
}

export default JobBoardService;
import axios from "axios";
export default class AuthService {
  register(jobSeeker) {
    return axios.post("http://localhost:8080/api/auth/register/jobseeker",jobSeeker);
  }
}

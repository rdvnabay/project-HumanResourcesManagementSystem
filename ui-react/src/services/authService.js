import axios from "axios";
export default class AuthService {
  registerJobSeeker(jobSeeker) {
    return axios.post("http://localhost:8080/api/auth/register/jobseeker",jobSeeker);
  }

  registerEmployer(employer) {
    return axios.post("http://localhost:8080/api/auth/register/employer",employer);
  }
}

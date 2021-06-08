 import axios from 'axios'
 class JobExperienceService{
    getJobExperiences(){
return axios.get("http://localhost:8080/api/experiences/getall")
    }
}

export default JobExperienceService
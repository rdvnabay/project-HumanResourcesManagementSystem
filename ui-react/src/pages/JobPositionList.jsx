import React,{useState,useEffect} from 'react'
import JobPositionService from '../services/jobPositionService'

function JobPositionList() {
    const [jobPostions,setJobPositions]=useState([])
    useEffect(()=>{
        let jobPositionService=new JobPositionService();
        jobPositionService.getJobPositions().then((result)=>setJobPositions(result.data.data))
    })
    return (
        <div>
             <table className="table table-bordered">
        <thead>
          <tr>
            <th>#</th>
            <th>İş Pozisyonları</th>
          </tr>
        </thead>
        <tbody>
          {jobPostions.map((jobPosition) => (
            <tr key={jobPosition.id}>
              <th>{jobPosition.id}</th>
              <th>{jobPosition.name}</th>
            </tr>
          ))}
        </tbody>
      </table>
        </div>
    )
}

export default JobPositionList;
import React,{useState,useEffect} from 'react'
import JobBoardService from '../../services/jobBoardService'

export default function JobBoardList() {
    const [jobBoards,setJobBoards]=useState([])
    useEffect(()=>{
        let jobBoardService=new JobBoardService();
        jobBoardService.getJobBoards().then((result)=>setJobBoards(result.data.data))
    })
    return (
        <div>
              <table className="table table-bordered">
        <thead>
          <tr>
            <th>#</th>
            <th>Şirket Adı</th>
            <th>İş Pozisyonu</th>
            <th>Şehir</th>
            <th>Açıklama</th>
            <th>Alınacak Kişi Sayısı</th>
            <th>Min Max Maaş </th>
            <th>Başvuru Son Tarihi</th>
          </tr>
        </thead>
        <tbody>
          {jobBoards.map((jobBoard) => (
            <tr key={jobBoard.id}>
              <th>{jobBoard.id}</th>
              <th>{jobBoard.employerId}</th>
              <th>{jobBoard.jobPositionId}</th>
              <th>{jobBoard.cityId}</th>
              <th>{jobBoard.description}</th>
              <th>{jobBoard.openPositionQuantity}</th>
              <th>{jobBoard.minSalary} - {jobBoard.maxSalary}</th>
              <th>{jobBoard.applicationDeadLine}</th>
            </tr>
          ))}
        </tbody>
      </table>
        </div>
    )
}

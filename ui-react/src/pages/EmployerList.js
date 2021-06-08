import React,{useState,useEffect} from 'react'
import EmployerService from "../services/employerService";

export default function EmployerList() {
    const [employers,setEmployers]=useState([]);
    useEffect(()=>{
        let employerService=new EmployerService();
        employerService.getEmployers().then((result)=>setEmployers(result.data.data))
    })
    return (
        <div>
             <table className="table table-bordered">
        <thead>
          <tr>
            <th>#</th>
            <th>Şirket Adı</th>
            <th>Telefon Numarası</th>
            <th>Web Sitesi</th>
            <th>E-posta Adresi</th>
          </tr>
        </thead>
        <tbody>
          {employers.map((employer) => (
            <tr key={employer.id}>
              <th>{employer.id}</th>
              <th>{employer.companyName}</th>
              <th>{employer.phoneNumber}</th>
              <th>{employer.webSiteAddress}</th>
              <th>{employer.email}</th>
            </tr>
          ))}
        </tbody>
      </table>
        </div>
    )
}

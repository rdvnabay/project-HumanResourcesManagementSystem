import React,{useState,useEffect} from "react";
import WorkerService from '../services/workerService.js'

function WorkerList() {
    const [workers, setWorkers] = useState([]);
  useEffect(() => {
    let workerService = new WorkerService();
    workerService.getWorkers().then((result) => setWorkers(result.data.data));
  });
    return (
        <div>
             <table className="table table-bordered">
        <thead>
          <tr>
            <th>#</th>
            <th>Kullanıcı Adı</th>
            <th>Email</th>
          </tr>
        </thead>
        <tbody>
        {workers.map((worker) => (
            <tr key={worker.id}>
              <th>{worker.id}</th>
              <th>{worker.userName}</th>
              <th>{worker.email}</th>
            </tr>
          ))}
        </tbody>
      </table>
        </div>
    )
}

export default WorkerList;


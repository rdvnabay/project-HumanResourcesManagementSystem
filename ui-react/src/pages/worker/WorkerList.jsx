import React, { useState, useEffect } from "react";
import WorkerService from "../../services/workerService.js";

function WorkerList() {
  const [workers, setWorkers] = useState([]);
  useEffect(() => {
    let workerService = new WorkerService();
    workerService.getWorkers().then((result) => setWorkers(result.data.data));
  });
  return (
    <div className="flex flex-col">
      <div className="-my-2 overflow-x-auto sm:-mx-6 lg:-mx-8">
        <div className="py-2 align-middle inline-block min-w-full sm:px-6 lg:px-8">
          <div className="shadow overflow-hidden border-b border-gray-200 sm:rounded-lg">
            <table className="min-w-full divide-y divide-gray-200">
              <thead className="bg-gray-50">
                <tr>
                  <th className="hrms-th-item">#</th>
                  <th className="hrms-th-item">Kullanıcı Adı</th>
                  <th className="hrms-th-item">Email</th>
                </tr>
              </thead>
              <tbody className="bg-white divide-y divide-gray-200">
                {workers.map((worker) => (
                  <tr key={worker.id}>
                    <td className="hrms-td-item">{worker.id}</td>
                    <td className="hrms-td-item">{worker.userName}</td>
                    <td className="hrms-td-item">{worker.email}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  );
}

export default WorkerList;

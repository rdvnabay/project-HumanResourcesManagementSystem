import React, { useState, useEffect } from "react";
import JobPositionService from "../../services/jobPositionService";

function JobPositionList() {
  const [jobPostions, setJobPositions] = useState([]);
  useEffect(() => {
    let jobPositionService = new JobPositionService();
    jobPositionService
      .getJobPositions()
      .then((result) => setJobPositions(result.data.data));
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
                  <th className="hrms-th-item">İş Pozisyonları</th>
                </tr>
              </thead>
              <tbody className="bg-white divide-y divide-gray-200">
                {jobPostions.map((jobPosition) => (
                  <tr key={jobPosition.id}>
                    <td className="hrms-td-item">{jobPosition.id}</td>
                    <td className="hrms-td-item">{jobPosition.name}</td>
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

export default JobPositionList;

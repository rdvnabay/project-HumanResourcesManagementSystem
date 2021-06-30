import React, { useState, useEffect } from "react";
import JobExperienceService from "../../services/jobExperienceService";

export default function JobExperienceList() {
  const [jobExperiences, setJobExperiences] = useState([]);
  useEffect(() => {
    let jobExperienceService = new JobExperienceService();
    jobExperienceService
      .getJobExperiences()
      .then((result) => setJobExperiences(result.data.data));
  });
  return (
    <div className="flex flex-col">
      <div className="-my-2 overflow-x-auto sm:-mx-6 lg:-mx-8">
        <div className="py-2 align-middle inline-block min-w-full sm:px-6 lg:px-8">
          <div className="shadow overflow-hidden border-b border-gray-200 sm:rounded-lg">
            <table className="min-w-full divide-y divide-gray-200">
              <thead className="bg-gray-50">
                <tr>
                  <th  scope="col"
                    className="hrms-th-item">#</th>
                  <th  scope="col"
                    className="hrms-th-item">Şirket Adı</th>
                  <th  scope="col"
                    className="hrms-th-item">İşe Başlama Tarihi</th>
                  <th  scope="col"
                    className="hrms-th-item">İşten Çıkış Tarihi</th>
                  <th  scope="col"
                    className="hrms-th-item">Meslek</th>
                  <th  scope="col"
                    className="hrms-th-item">Kişi bilgisi</th>
                  <th  scope="col"
                    className="hrms-th-item">Çalışma Durumu</th>
                </tr>
              </thead>
              <tbody className="bg-white divide-y divide-gray-200">
                {jobExperiences.map((jobExperience) => (
                  <tr key={jobExperience.id}>
                    <td className="hrms-td-item">{jobExperience.id}</td>
                    <td className="hrms-td-item">{jobExperience.companyName}</td>
                    <td className="hrms-td-item">{jobExperience.dateOfStart}</td>
                    <td className="hrms-td-item">{jobExperience.dismissalDate}</td>
                    <td className="hrms-td-item">{jobExperience.jobPositionId}</td>
                    <td className="hrms-td-item">{jobExperience.jobSeekerId}</td>
                    <td className="hrms-td-item">{jobExperience.workingStatus}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>{" "}
        </div>{" "}
      </div>{" "}
    </div>
  );
}

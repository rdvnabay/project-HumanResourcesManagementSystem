import React, { useState, useEffect } from "react";
import JobExperienceService from "../services/jobExperienceService";

export default function JobExperienceList() {
  const [jobExperiences, setJobExperiences] = useState([]);
  useEffect(() => {
    let jobExperienceService = new JobExperienceService();
    jobExperienceService
      .getJobExperiences()
      .then((result) => setJobExperiences(result.data.data));
  });
  return (
    <div>
      <table className="table table-bordered">
        <thead>
          <tr>
            <th>#</th>
            <th>Şirket Adı</th>
            <th>İşe Başlama Tarihi</th>
            <th>İşten Çıkış Tarihi</th>
            <th>Meslek</th>
            <th>Kişi bilgisi</th>
            <th>Çalışma Durumu</th>
          </tr>
        </thead>
        <tbody>
          {jobExperiences.map((jobExperience) => (
            <tr key={jobExperience.id}>
              <th>{jobExperience.id}</th>
              <th>{jobExperience.companyName}</th>
              <th>{jobExperience.dateOfStart}</th>
              <th>{jobExperience.dismissalDate}</th>
              <th>{jobExperience.jobPositionId}</th>
              <th>{jobExperience.jobSeekerId}</th>
              <th>{jobExperience.workingStatus}</th>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

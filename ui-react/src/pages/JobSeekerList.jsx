import React, { useState, useEffect } from "react";
import JobSeekerService from "../services/jobSeekerService";

export default function JobSeekerList() {
  const [jobSeekers, setJobSeekers] = useState([]);
  useEffect(() => {
    let jobSeekerService = new JobSeekerService();
    jobSeekerService
      .getJobSeekers()
      .then((result) => setJobSeekers(result.data.data));
  });
  return (
    <div>
      <table className="table table-bordered">
        <thead>
          <tr>
            <th>#</th>
            <th>Profil Resmi</th>
            <th>Adı</th>
            <th>Soyadı</th>
            <th>Doğum Tarihi</th>
            <th>Github link</th>
            <th>Linkedin link</th>
          </tr>
        </thead>
        <tbody>
          {jobSeekers.map((jobSeeker) => (
            <tr key={jobSeeker.id}>
              <th>{jobSeeker.id}</th>
              <th>{jobSeeker.profileImage}</th>
              <th>{jobSeeker.firstName}</th>
              <th>{jobSeeker.lastName}</th>
              <th>{jobSeeker.yearOfBirth}</th>
              <th>{jobSeeker.linkGithub}</th>
              <th>{jobSeeker.linkLinkedin}</th>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

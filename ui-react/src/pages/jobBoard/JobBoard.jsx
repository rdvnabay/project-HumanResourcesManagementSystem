import React, { useState, useEffect } from "react";
import CityService from "../../services/cityService";
import JobPositionService from "../../services/jobPositionService";
import JobBoardAdd from "./jobBoardAdd";
import CkEditor from "../../components/CkEditor";

export default function JobBoard() {
  const [cities, setCities] = useState([]);
  const [jobPositions, setJobPositions] = useState([]);
  useEffect(() => {
    let cityService = new CityService();
    let jobPositionService = new JobPositionService();

    cityService.getCities().then((result) => setCities(result.data.data));
    jobPositionService
      .getJobPositions()
      .then((result) => setJobPositions(result.data.data));
  });
  return (
    <div className="grid grid-cols-2">
      <div className="col-span-1 mx-24 mt-6">
        <JobBoardAdd cities={cities} jobPositions={jobPositions} />
      </div>
      <div className="col-span-1">
        <CkEditor />y
      </div>
    </div>
  );
}

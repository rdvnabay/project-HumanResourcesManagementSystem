import React from "react";
import CompanyDetail from "./CompanyDetail";
import Feature from "./Feature";
import JobBoardDescription from "./JobBoardDescription";
import JobBoardSidebar from "./JobBoardSidebar";

export default function Home() {
  return (
    <div className="grid grid-cols-6  py-10 mr-20">
        <div className="col-span-2">
        <JobBoardSidebar/>
      </div>
      <div className="col-span-3">
      <JobBoardDescription/>
      </div>
      <div className="col-span-1">
      <CompanyDetail/>
      </div>
    </div>
  );
}

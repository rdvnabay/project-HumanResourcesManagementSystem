import React from "react";
import { NavLink } from "react-router-dom";
import CompanyDetail from "./home/CompanyDetail";
import Feature from "./home/Feature";
import JobBoardDescription from "./home/JobBoardDescription";
import JobBoardSidebar from "./home/JobBoardSidebar";

export default function Demo2() {
  return (
    <div className="bg-white">
      <div className="flex">
        <div className="flex w-4/5 h-auto">
        <JobBoardSidebar/>
          <div className="w-full relative ml-10  pt-32">
          <Feature/>
            <div className="flex overflow-auto" style={{ height: "350px" }}>
            <JobBoardDescription/>
              <CompanyDetail/>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

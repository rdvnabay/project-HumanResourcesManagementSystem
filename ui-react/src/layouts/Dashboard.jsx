import React from "react";
import Navi from "./Navi";
import CityList from "../pages/CityList";
import JobBoardList from "../pages/JobBoardList";

export default function Dashboard() {
  return (
    <div>
      <Navi />
      <JobBoardList />
    </div>
  );
}

import React from "react";
import { Route } from "react-router";
import Navi from "./Navi";
import CityList from "../pages/CityList";
import JobSeekerForLogin from "../pages/auth/JobSeekerForLogin";
import BreadCrumb from "../layouts/BreadCrumb";
import EmployerForRegister from "../pages/auth/EmployerForRegister";
import JobSeekerForRegister from "../pages/auth/JobSeekerForRegister";
import JobBoard from "../pages/jobBoard/JobBoard";
import EmployerForLogin from "../pages/auth/EmployerForLogin";

export default function Dashboard() {
  return (
    <div className="grid grid-cols-1">
      <div>
        <Navi />
        <BreadCrumb />
      </div>
      <Route exact path="/" component={JobBoard} />
      <Route exact path="/cities" component={CityList} />
      <Route exact path="/aday/kayit-ol" component={JobSeekerForRegister} />
      <Route path="/aday/giris" component={JobSeekerForLogin} />
      <Route exact path="/isveren/kayit-ol" component={EmployerForRegister} />
      <Route path="/isveren/giris" component={EmployerForLogin} />
    </div>
  );
}

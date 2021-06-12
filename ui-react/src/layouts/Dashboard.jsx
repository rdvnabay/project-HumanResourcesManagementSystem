import React from "react";
import { Route } from "react-router";
import Navi from "./Navi";
import JobBoard from "../pages/JobBoard";
import CityList from "../pages/CityList";
import BreadCrumb from "../layouts/BreadCrumb";
import JobSeekerForRegister from "../pages/auth/JobSeekerForRegister";
import JobSeekerForLogin from "../pages/auth/JobSeekerForLogin";
import EmployerForLogin from "../pages/auth/EmployerForLogin";
import EmployerForRegister from "../pages/auth/EmployerForRegister";
import Main from "../layouts/Main";

export default function Dashboard() {
  return (
    <div>
      <Navi />
      <div className="grid grid-cols-12">
        {/* <div className="col-span-5">
          <Login />
        </div> */}
        <BreadCrumb/>
        <Main/>
        <div className="col-span-12">
          {/* <Route exact path="/" component={JobBoard} /> */}
          <Route exact path="/cities" component={CityList} />
          <Route exact path="/aday/kayit-ol" component={JobSeekerForRegister} />
          <Route path="/aday/giris" component={JobSeekerForLogin} />
          <Route exact path="/isveren/kayit-ol" component={EmployerForRegister} />
          <Route path="/isveren/giris" component={EmployerForLogin} />
        </div>
      </div>
    </div>
  );
}

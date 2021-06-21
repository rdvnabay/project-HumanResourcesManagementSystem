import React from "react";
import { Route } from "react-router";
import Navi from "./Navi";
import CityList from "../pages/CityList";
import JobSeekerForLogin from "../pages/auth/JobSeekerForLogin";
import EmployerForRegister from "../pages/auth/EmployerForRegister";
import JobSeekerForRegister from "../pages/auth/JobSeekerForRegister";
import JobBoard from "../pages/jobBoard/JobBoard";
import EmployerForLogin from "../pages/auth/EmployerForLogin";
import UserProfile from "../pages/jobSeekerProfile/UserProfile";
import Footer from "./Footer";
import ForgotPassword from "../pages/auth/ForgotPassword";
import NotFound from "../pages/NotFound";
import Demo from "../pages/Demo";
import Demo2 from "../pages/Demo2";

export default function Dashboard() {
  return (
    <div className="grid grid-cols-1">
      <div>
        <Navi />
      </div>
      <Route exact path="/" component={JobBoard} />
      <Route exact path="/cities" component={CityList} />
      <Route exact path="/aday/kayit-ol" component={JobSeekerForRegister} />
      <Route path="/aday/giris" component={JobSeekerForLogin} />
      <Route exact path="/isveren/kayit-ol" component={EmployerForRegister} />
      <Route path="/isveren/giris" component={EmployerForLogin} />
      <Route path="/profile" component={UserProfile} />
      <Route path="/forgot" component={ForgotPassword} />
      <Route path="/notfound" component={NotFound} />
      <Route path="/demo" component={Demo2} />
      <Footer />
    </div>
      
  );
}

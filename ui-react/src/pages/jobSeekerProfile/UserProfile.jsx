import React from 'react'
import { Route } from "react-router";
import Sidebar from './Sidebar'
import Content from './Content'
import EducationInformation from './EducationInformation';
import Ayarlar from './Ayarlar';
import Demo from '../Demo';
import Demo2 from '../Demo2';
import Home from '../home/Home';

export default function UserProfile() {
    return (
     
        <div className="grid grid-cols-12">
      
        <div className="col-span-4 mx-auto">
          <Sidebar/>
        </div>
        <div className="col-span-8 col-start-5">
        <Route exact path="/profile/bilgilerim" component={Content} />
        <Route exact path="/profile/egitim" component={EducationInformation} />
        <Route exact path="/profile/deneyimlerim" component={Content} />
        <Route exact path="/profile/hobilerim" component={Content} />
        <Route exact path="/profile/yeteneklerim" component={Content} />
        <Route exact path="/profile/ayarlar" component={Home} />
        </div>
      </div>
    )
}

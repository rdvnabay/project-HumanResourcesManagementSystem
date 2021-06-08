import React,{useState,useEffect} from "react";
import CityService from "../services/cityService";

function CityList() {
  const [cities, setCities] = useState([]);
  useEffect(() => {
    let cityService = new CityService();
    cityService.getCities().then((result) => setCities(result.data.data));
  });
  return (
    <div>
      <table className="table table-bordered">
        <thead>
          <tr>
            <th>#</th>
            <th>Şehirler</th>
          </tr>
        </thead>
        <tbody>
          {cities.map((city) => (
            <tr key={city.id}>
              <th>{city.id}</th>
              <th>{city.name}</th>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default CityList;

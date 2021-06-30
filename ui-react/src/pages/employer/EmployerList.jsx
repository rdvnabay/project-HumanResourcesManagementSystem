import React, { useState, useEffect } from "react";
import EmployerService from "../../services/employerService";

export default function EmployerList() {
  const [employers, setEmployers] = useState([]);
  useEffect(() => {
    let employerService = new EmployerService();
    employerService
      .getEmployers()
      .then((result) => setEmployers(result.data.data));
  });
  return (
    <div className="flex flex-col">
      <div className="-my-2 overflow-x-auto sm:-mx-6 lg:-mx-8">
        <div className="py-2 align-middle inline-block min-w-full sm:px-6 lg:px-8">
          <div className="shadow overflow-hidden border-b border-gray-200 sm:rounded-lg">
            <table className="min-w-full divide-y divide-gray-200">
              <thead className="bg-gray-50">
                <tr>
                  <th scope="col" className="hrms-th-item">
                    #
                  </th>
                  <th scope="col" className="hrms-th-item">
                    Şirket Adı
                  </th>
                  <th scope="col" className="hrms-th-item">
                    Telefon Numarası
                  </th>
                  <th scope="col" className="hrms-th-item">
                    Web Sitesi
                  </th>
                  <th scope="col" className="hrms-th-item">
                    E-posta Adresi
                  </th>
                </tr>
              </thead>
              <tbody className="bg-white divide-y divide-gray-200">
                {employers.map((employer) => (
                  <tr key={employer.id}>
                    <td className="hrms-td-item">{employer.id}</td>
                    <td className="hrms-td-item">{employer.companyName}</td>
                    <td className="hrms-td-item">{employer.phoneNumber}</td>
                    <td className="hrms-td-item">{employer.webSiteAddress}</td>
                    <td className="hrms-td-item">{employer.email}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  );
}

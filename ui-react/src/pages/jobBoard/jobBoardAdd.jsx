import React from "react";
import { Formik } from "formik";
import * as Yup from "yup";
import AuthService from "../../services/authService";

function JobBoardAdd({cities,jobPositions}) {
  return (
        <Formik
          initialValues={{
            companyName: "",
            email: "",
            phoneNumber: "",
            webSiteAddress: "",
            applicationDeadLine:"",
            openPositionQuantity:"",
            minMaxSalary:""
          }}
          validationSchema={Yup.object({
            companyName: Yup.string().required("Şirket adı giriniz"),
            email: Yup.string()
              .email("Eposta adresiniz doğru formatta giriniz")
              .required("Eposta adresini giriniz"),
          })}
          onSubmit={(values, { setSubmitting }) => {
            let authService = new AuthService();
            authService
              .registerEmployer(values)
              .then((response) => {
                console.log(values);
                console.log(response);
              })
              .catch((error) => {
                console.log(error);
              });
          }}
        >
          {({
            values,
            errors,
            touched,
            handleChange,
            handleBlur,
            handleSubmit,
            isSubmitting,
          }) => (
            <form onSubmit={handleSubmit}>
              <div className="shadow overflow-hidden sm:rounded-md">
                <div className="px-4 py-5 bg-white-200 sm:p-6">
                  <div className="grid grid-cols-2 gap-6">
                    <div className="col-span-1">
                      <div className="col-span-6 sm:col-span-3 mb-4">
                        <label
                          htmlFor="city"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Şehir Seçiniz
                        </label>
                        <select
                          id="city"
                          name="city"
                          autoComplete="city"
                          className="mt-1 block w-full py-2 px-3 border border-gray-300 rounded-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
                        >
                          {
                            cities.map(city=>(
                              <option key={city.id}>{city.name}</option>
                            ))
                          }
                        </select>
                      </div>

                      <div className="col-span-6 sm:col-span-3 mb-4">
                        <label
                          htmlFor="country"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Pozisyon
                        </label>
                        <select
                          id="position"
                          name="position"
                          autoComplete="position"
                          className="mt-1 block w-full py-2 px-3 border border-gray-300 bg-white rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
                        >
                           {
                            jobPositions.map(jobPosition=>(
                              <option key={jobPosition.id}>{jobPosition.name}</option>
                            ))
                          }
                        </select>
                      </div>

                      <div className="col-span-6 sm:col-span-3 mb-4">
                        <label
                          htmlFor="country"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Çalışma Şekli
                        </label>
                        <select
                          id="country"
                          name="country"
                          autoComplete="country"
                          className="mt-1 block w-full py-2 px-3 border border-gray-300 bg-white rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
                        >
                          <option>Tam Zamanlı</option>
                          <option>Yarı Zamanlı</option>
                          <option>Stajer</option>
                        </select>
                      </div>

                      <div className="col-span-6 sm:col-span-3 mb-4">
                        <label
                          htmlFor="country"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Çalışma Ortamı
                        </label>
                        <select
                          id="country"
                          name="country"
                          autoComplete="country"
                          className="mt-1 block w-full py-2 px-3 border border-gray-300 bg-white rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
                        >
                          <option>Ofis</option>
                          <option>Ev</option>
                        </select>
                      </div>
                    </div>

                    <div className="col-span-1 gap-6">
                      <div className="col-span-6 sm:col-span-3 mb-4">
                        <label
                          htmlFor="applicationDeadLine"
                          className="block text-sm font-medium text-gray-700"
                        >
                          İlan Bitiş Tarihi
                        </label>
                        <input
                          type="date"
                          name="applicationDeadLine"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          value={values.applicationDeadLine}
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        />
                      </div>

                      <div className="col-span-6 sm:col-span-3 mb-4">
                        <label
                          htmlFor="openPositionQuantity"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Alınacak Kişi Sayısı
                        </label>
                        <input
                          type="number"
                          name="openPositionQuantity"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          value={values.openPositionQuantity}
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        />
                      </div>

                      <div className="col-span-6 sm:col-span-3 mb-4">
                        <label
                          htmlFor="minMaxSalary"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Maaş Aralığı
                        </label>
                        <input
                          type="text"
                          name="minMaxSalary"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          value={values.minMaxSalary}
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        />
                      </div>
                     
                    </div>
                  </div>
                </div>
              </div>
            </form>
          )}
        </Formik>
  );
}

export default JobBoardAdd;
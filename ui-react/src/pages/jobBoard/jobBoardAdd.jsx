import React from "react";
import { Formik } from "formik";
import * as Yup from "yup";
import AuthService from "../../services/authService";

export default function JobBoardAdd() {
  return (
    <div className="mt-10 sm:mt-0">
      <div className="mt-5 md:mt-0 md:col-span-2">
        <Formik
          initialValues={{
            companyName: "",
            email: "",
            phoneNumber: "",
            webSiteAddress: "",
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
                      <div className="col-span-6 sm:col-span-3">
                        <label
                          htmlFor="country"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Şehir Seçiniz
                        </label>
                        <select
                          id="country"
                          name="country"
                          autoComplete="country"
                          className="mt-1 block w-full py-2 px-3 border border-gray-300 rounded-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
                        >
                          <option>İstanbul</option>
                          <option>Bitlis</option>
                          <option>Ordu</option>
                        </select>
                      </div>

                      <div className="col-span-6 sm:col-span-3">
                        <label
                          htmlFor="country"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Pozisyon
                        </label>
                        <select
                          id="country"
                          name="country"
                          autoComplete="country"
                          className="mt-1 block w-full py-2 px-3 border border-gray-300 bg-white rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
                        >
                          <option>Yazılım Geliştiricisi</option>
                          <option>Analist</option>
                          <option>Front-end Developer</option>
                        </select>
                      </div>

                      <div className="col-span-6 sm:col-span-3">
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

                      <div className="col-span-6 sm:col-span-3">
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
                      <div className="col-span-6 sm:col-span-3">
                        <label
                          htmlFor="companyName"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Şirket Adı
                        </label>
                        <input
                          type="text"
                          name="companyName"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          value={values.companyName}
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        />
                      </div>

                      <div className="col-span-6 sm:col-span-3">
                        <label
                          htmlFor="webSiteAddress"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Web Sitesi
                        </label>
                        <input
                          type="text"
                          name="webSiteAddress"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          value={values.webSiteAddress}
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        />
                      </div>

                      <div className="col-span-6 sm:col-span-3">
                        <label
                          htmlFor="lastName"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Telefon Numarası
                        </label>
                        <input
                          type="text"
                          name="phoneNumber"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          value={values.phoneNumber}
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        />
                      </div>

                      <div className="col-span-6 sm:col-span-3">
                        <label
                          htmlFor="email"
                          className="block text-sm font-medium text-gray-700"
                        >
                          Eposta Adresi
                        </label>
                        <input
                          type="text"
                          name="email"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          value={values.email}
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
      </div>
    </div>
  );
}

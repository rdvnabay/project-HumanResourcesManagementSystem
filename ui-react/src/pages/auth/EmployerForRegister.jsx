import React from "react";
import { Formik, Form, Field, ErrorMessage } from "formik";
import * as Yup from "yup";
import AuthService from "../../services/authService";

export default function EmployerForRegister() {
  const initialValues = {
    companyName: "",
    email: "",
    phoneNumber: "",
    webSiteAddress: "",
    password: "",
    passwordAgain: ""
  };
  const validationSchema = Yup.object({
    companyName: Yup.string().required("Şirket adı giriniz"),
    email: Yup.string()
      .email("Eposta adresiniz doğru formatta giriniz")
      .required("Eposta adresini giriniz"),
    phoneNumber: Yup.string().required("Telefon numaranızı giriniz"),
    password:Yup.string().required("Şifrenizi giriniz")
  });
  return (
    <div className="mt-10 sm:mt-0 mx-auto">
      <div className="md:grid md:grid-cols-3 md:gap-6">
        <div className="mt-5 md:mt-0 md:col-span-2">
          <Formik
            initialValues={initialValues}
            validationSchema={validationSchema}
            onSubmit={(values) => {
              console.log(values);
              let authService = new AuthService();
              authService
                .registerEmployer(values)
                .then((response) => {
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
              <Form onSubmit={handleSubmit}>
                <div className="shadow overflow-hidden sm:rounded-md">
                  <div className="px-4 py-5 bg-white sm:p-6">
                    <div className="grid grid-cols-6 gap-6">
                      <div className="col-span-6 sm:col-span-3">
                        {/* <HrmsTextInput name="companyName" placeholder="Şirket adı giriniz"/> */}
                        <Field
                          name="companyName"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          placeholder="Şirket adı giriniz"
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        ></Field>
                        <span className="text-red-700 align-middle text-xs">
                          <ErrorMessage name="companyName"></ErrorMessage>
                        </span>
                      </div>

                      <div className="col-span-6 sm:col-span-3">
                        <Field
                          name="phoneNumber"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          placeholder="Telefon numaranızı giriniz"
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        ></Field>
                        <span className="text-red-700 align-middle text-xs">
                          <ErrorMessage name="phoneNumber"></ErrorMessage>
                        </span>
                      </div>

                      <div className="col-span-6 sm:col-span-3">
                        <Field
                          type="email"
                          name="email"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          placeholder="Eposta adresini giriniz"
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        ></Field>
                        <span className="text-red-700 align-middle text-xs">
                          <ErrorMessage name="email"></ErrorMessage>
                        </span>
                      </div>

                      <div className="col-span-6 sm:col-span-6 lg:col-span-3">
                        <Field
                          type="text"
                          name="webSiteAddress"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          placeholder="Web Site Adresi giriniz"
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        ></Field>
                      </div>
                      <div className="col-span-6 sm:col-span-6 lg:col-span-3">
                        <Field
                          type="password"
                          name="password"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          placeholder="Şifre giriniz"
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        ></Field>
                      </div>
                      <div className="col-span-6 sm:col-span-6 lg:col-span-3">
                        <Field
                          type="password"
                          name="passwordAgain"
                          onChange={handleChange}
                          onBlur={handleBlur}
                          placeholder="Şifre tekrarı giriniz"
                          className="appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mt-1 focus:ring-indigo-500 focus:border-indigo-500 block shadow-sm sm:text-sm border-gray-300 rounded-md"
                        ></Field>
                      </div>
                    </div>
                    <div className="px-4 py-3 bg-gray-50 text-right sm:px-6">
                      <button
                        type="submit"
                        // disabled={isSubmitting}
                        className="inline-flex justify-center py-2 px-4 border border-transparent shadow-sm text-sm font-medium rounded-md text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500"
                      >
                        Kayıt Ol
                      </button>
                    </div>
                  </div>
                </div>
              </Form>
            )}
          </Formik>
        </div>
      </div>
    </div>
  );
}

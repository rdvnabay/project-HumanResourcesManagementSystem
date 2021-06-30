import React from 'react'
import { NavLink } from "react-router-dom";

export default function CompanyDetail() {
    return (
        <div className="bg-white rounded">
        <div className=" px-1 text-center items-center"></div>
        <div className="mx-2 bg-white rounded">
          <div className="flex-col">
            <div className="flex-col mt-3 rounded">
              <div className="py-1 px-1 text-gray-700 rounded text-xs font-semibold antialiased tracking-normal">
                Firma Adı
              </div>
              <div className="flex px-2 py-2 hover:bg-gray-200">
                <img
                  className="w-6 h-6 rounded-full"
                  src="https://st.depositphotos.com/2101611/3925/v/600/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"
                  alt=""
                />
                <div className="font-normal text-gray-700 ml-3 text-xs">
                  Abc Şirketi
                </div>
              </div>
            </div>
            <div className="flex-col mt-3 rounded">
              <div className="py-1 px-1 text-gray-700 rounded text-xs font-semibold antialiased tracking-normal">
                Yayınlayan
              </div>
              <div className="flex px-2 py-2 hover:bg-gray-200">
                <img
                  className="w-6 h-6 rounded-full"
                  src="https://st.depositphotos.com/2101611/3925/v/600/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"
                  alt=""
                />
                <div className="font-normal text-gray-700 ml-3 text-xs">
                  Rıdvan Abay
                </div>
              </div>
            </div>
            <div className="flex-col mt-3 rounded">
              <div className="py-1 px-1 text-gray-700 rounded text-xs font-semibold antialiased tracking-normal">
                Etiketler
              </div>
              <div className="flex px-2 py-2 hover:bg-gray-200">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  className="h-4 w-4"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke="currentColor"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="M7 7h.01M7 3h5c.512 0 1.024.195 1.414.586l7 7a2 2 0 010 2.828l-7 7a2 2 0 01-2.828 0l-7-7A1.994 1.994 0 013 12V7a4 4 0 014-4z"
                  />
                </svg>
                <div className="font-normal text-gray-700 ml-3 text-xs">
                  Java,React,Api
                </div>
              </div>
            </div>
            <div className="flex-col mt-3 rounded">
              <div className="py-1 px-1 text-gray-700 rounded text-xs font-semibold antialiased tracking-normal">
                Web Sitesi
              </div>
              <div className="flex px-2 py-2 hover:bg-gray-200">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  className="h-4 w-4"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke="currentColor"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="M21 12a9 9 0 01-9 9m9-9a9 9 0 00-9-9m9 9H3m9 9a9 9 0 01-9-9m9 9c1.657 0 3-4.03 3-9s-1.343-9-3-9m0 18c-1.657 0-3-4.03-3-9s1.343-9 3-9m-9 9a9 9 0 019-9"
                  />
                </svg>
                <div className="font-normal bg-white p-1 underline hover:bg-transparent rounded text-gray-700 ml-3 text-xs">
                  https://www.google.com/
                </div>
              </div>
            </div>
            <div className="flex-col mt-3 rounded">
              <div className="py-1 px-1 text-gray-700 rounded text-xs font-semibold antialiased tracking-normal">
                Konum
              </div>
              <div className="flex px-2 py-2 hover:bg-gray-200">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  className="h-5 w-5"
                  viewBox="0 0 20 20"
                  fill="currentColor"
                >
                  <path
                    fill-rule="evenodd"
                    d="M5.05 4.05a7 7 0 119.9 9.9L10 18.9l-4.95-4.95a7 7 0 010-9.9zM10 11a2 2 0 100-4 2 2 0 000 4z"
                    clip-rule="evenodd"
                  />
                </svg>
                <div className="font-normal text-gray-700 hover:text-blue-500 hover:underline ml-3 text-xs">
                  İstanbul/Anadolu
                </div>
              </div>
            </div>
            <div className="flex-col mt-3 rounded">
              <div className="py-1 px-1 text-gray-700 rounded text-xs font-semibold antialiased tracking-normal">
                Öncelik
              </div>
              <div className="flex px-2 py-2 hover:bg-gray-200">
                <svg
                  className="h-4 w-4 text-yellow-500 "
                  fill="currentColor "
                  xmlns="http://www.w3.org/2000/svg"
                  viewBox="0 0 20 20"
                >
                  <path
                    fillRule="evenodd"
                    d="M10 .75L15.5 6H12v13H8V6H4.5L10 .75z"
                  />
                </svg>
                <div className="font-normal text-gray-700 ml-3 text-xs">
                  Acil
                </div>
              </div>
            </div>
            <div className="flex-col mt-3 rounded">
              <div className="px-2 py-2 hover:bg-gray-200">
                <div className="flex self-center text-sm font-medium antialiased rounded text-blue-500">
                  <svg
                    className="h-4 w-4 mt-1 ml-1"
                    xmlns="http://www.w3.org/2000/svg"
                    fill="currentColor"
                    viewBox="0 0 20 20"
                  >
                    <path
                      fillRule="evenodd"
                      d="M4.516 7.548c.436-.446 1.043-.481 1.576 0L10 11.295l3.908-3.747c.533-.481 1.141-.446 1.574 0 .436.445.408 1.197 0 1.615-.406.418-4.695 4.502-4.695 4.502a1.095 1.095 0 01-1.576 0S4.924 9.581 4.516 9.163c-.409-.418-.436-1.17 0-1.615z"
                    />
                  </svg>
                  <NavLink to="#" className="text-blue-600">
                    Show 5 More Field
                  </NavLink>
                </div>
                <div className="text-xs pl-3 font-light antialiased rounded text-gray-500">
                  Original Estimate, Time tracking
                </div>
              </div>
            </div>
            <div className="border mt-2" />
          </div>
        </div>
        <div className="flex justify-between px-1 text-left ">
          <div className="p-2 text-xs text-gray-600 antialiased tracking-normal">
            Created July 3, 2020, 6:24 PM
            <br />
            Updated 4 days ago
            <br />
            Configure
          </div>
        </div>
      </div>
    )
}

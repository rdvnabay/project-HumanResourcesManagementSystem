import React,{useState,useEffect} from 'react'
import { PaperClipIcon } from '@heroicons/react/solid'
import { NavLink } from "react-router-dom";
import JobSeekerService from '../../services/jobSeekerService'

export default function Content() {
    const [jobSeeker,setJobSeeker]=useState("")
    useEffect(()=>{
        let jobSeekerService=new JobSeekerService();
        jobSeekerService.getById(14).then((result)=>setJobSeeker(result.data.data))
    })
    return (
        <div>
             {/* Sidebar ends */}
        {/* Remove class [ h-64 ] when adding a card block */}
        <div className="container py-10 h-64 md:w-4/5 w-11/12 px-6">
            <div className="w-full h-full rounded border-gray-300">
            <div className="bg-white shadow overflow-hidden sm:rounded-lg">
      <div className="px-4 py-5 sm:px-6">
        <h3 className="text-lg leading-6 font-medium text-gray-900">Ünvan</h3>
        <p className="mt-1 max-w-2xl text-sm text-gray-500">Yazılım Geliştirici</p>
      </div>
      <div className="border-t border-gray-200">
        <dl>
          <div className="bg-gray-50 px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6">
            <dt className="text-sm font-medium text-gray-500">Ad Soyad</dt>
            <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">Rıdvan Abay</dd>
          </div>
          <div className="bg-white px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6">
            <dt className="text-sm font-medium text-gray-500">Ünvan</dt>
            <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">Yazılım Geliştirici</dd>
          </div>
          <div className="bg-gray-50 px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6">
            <dt className="text-sm font-medium text-gray-500">Eposta Adresi</dt>
            <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">margotfoster@example.com</dd>
          </div>
          <div className="bg-white px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6">
            <dt className="text-sm font-medium text-gray-500">Salary expectation</dt>
            <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">$120,000</dd>
          </div>
          <div className="bg-gray-50 px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6">
            <dt className="text-sm font-medium text-gray-500">Hakkımda</dt>
            <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">
              Fugiat ipsum ipsum deserunt culpa aute sint do nostrud anim incididunt cillum culpa consequat. Excepteur
              qui ipsum aliquip consequat sint. Sit id mollit nulla mollit nostrud in ea officia proident. Irure nostrud
              pariatur mollit ad adipisicing reprehenderit deserunt qui eu.
            </dd>
          </div>
          <div className="bg-white px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6">
            <dt className="text-sm font-medium text-gray-500">Attachments</dt>
            <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">
              <ul className="border border-gray-200 rounded-md divide-y divide-gray-200">
                <li className="pl-3 pr-4 py-3 flex items-center justify-between text-sm">
                  <div className="w-0 flex-1 flex items-center">
                    <PaperClipIcon className="flex-shrink-0 h-5 w-5 text-gray-400" aria-hidden="true" />
                    <span className="ml-2 flex-1 w-0 truncate">resume_back_end_developer.pdf</span>
                  </div>
                  <div className="ml-4 flex-shrink-0">
                    <NavLink to="#" className="font-medium text-indigo-600 hover:text-indigo-500">
                      Download
                    </NavLink>
                  </div>
                </li>
                <li className="pl-3 pr-4 py-3 flex items-center justify-between text-sm">
                  <div className="w-0 flex-1 flex items-center">
                    <PaperClipIcon className="flex-shrink-0 h-5 w-5 text-gray-400" aria-hidden="true" />
                    <span className="ml-2 flex-1 w-0 truncate">coverletter_back_end_developer.pdf</span>
                  </div>
                  <div className="ml-4 flex-shrink-0">
                    <NavLink to="#" className="font-medium text-indigo-600 hover:text-indigo-500">
                      Download
                    </NavLink>
                  </div>
                </li>
              </ul>
            </dd>
          </div>
        </dl>
      </div>
    </div>
               </div>
        </div>
        </div>
    )
}

import React from "react";

export default function JobBoardDescription() {
  return (
    <div className="mr-10">
      <div className="w-full px-2 hover:bg-blue-100 py-2 text-2xl font-semibold">
        Yazılım Geliştirici
      </div>
      <div className="flex mt-1"></div>
      <div className="items-center py-1 mt-5 mb-1 text-sm font-medium text-gray-800">
        Description
      </div>
      <div className="flex-col p-2 rounded ">
        <div className="flex">
          <div className="h-5 w-5">
            <svg
              className="h-5 w-5 text-gray-600"
              fill="currentColor"
              xmlns="http://www.w3.org/2000/svg"
              viewBox="0 0 20 20"
            >
              <path
                fillRule="evenodd"
                d="M7.8 10a2.2 2.2 0 004.4 0 2.2 2.2 0 00-4.4 0z"
              />
            </svg>
          </div>
          <div className="text-sm ml-1 text-gray-800 antialiased tracking-normal font-normal ">
          Lorem ipsum is typically a corrupted version of De finibus bonorum
            et malorum, a first-century BC text by the Roman statesman and
            philosopher Cicero, with words altered, added, and removed to make
            it nonsensical, improper Latin.
            Lorem ipsum is typically a corrupted version of De finibus bonorum
            et malorum, a first-century BC text by the Roman statesman and
            philosopher Cicero, with words altered, added, and removed to make
            it nonsensical, improper Latin.
          </div>
        </div>
        <div className="flex mt-10">
          <div className="h-5 w-5">
            <svg
              className="h-5 w-5 text-gray-600"
              fill="currentColor"
              xmlns="http://www.w3.org/2000/svg"
              viewBox="0 0 20 20"
            >
              <path
                fillRule="evenodd"
                d="M7.8 10a2.2 2.2 0 004.4 0 2.2 2.2 0 00-4.4 0z"
              />
            </svg>
          </div>
          <div className="text-sm ml-1 text-gray-800 antialiased tracking-normal font-normal ">
            Lorem ipsum is typically a corrupted version of De finibus bonorum
            et malorum, a first-century BC text by the Roman statesman and
            philosopher Cicero, with words altered, added, and removed to make
            it nonsensical, improper Latin.
          </div>
        </div>
      </div>
      <div className="items-center py-1 mt-5 text-sm font-medium text-gray-800">
        Environment
      </div>
      <div className="flex-col p-2 rounded hover:bg-gray-200">
        <div className="flex">
          <div className="text-sm ml-1 text-gray-800 antialiased tracking-normal font-normal ">
            None
          </div>
        </div>
      </div>
      <div className="items-center py-1 mt-5 text-sm font-medium text-gray-800">
        Activity
      </div>
      <div className="flex p-2 rounded">
        <div className="flex">
          <div className="text-sm ml-1 py-1 text-gray-800 antialiased tracking-normal font-normal ">
            Show :
          </div>
          <div className="text-sm ml-2 py-1 cursor-pointer rounded px-2 text-white bg-gray-700 antialiased tracking-normal font-normal ">
            Comments
          </div>
          <div className="text-sm ml-2 py-1 cursor-pointer rounded px-2 text-gray-800 bg-gray-200 antialiased tracking-normal font-normal ">
            History
          </div>
          <div className="text-sm ml-2 py-1 cursor-pointer rounded px-2 text-gray-800 bg-gray-200 text-gray-800 antialiased tracking-normal font-normal ">
            Work Log
          </div>
        </div>
      </div>
    </div>
  );
}

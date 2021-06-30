import { Menu } from "@headlessui/react";

export default function Demo() {
  return (
    <div className="h-screen flex">
      <main
        className="flex-1 bg-white dark:bg-gray-900 overflow-y-auto transition
      duration-500 ease-in-out mr-60"
      >
        <div
          className="px-0 py-12 text-gray-700 dark:text-gray-500 transition
        duration-500 ease-in-out"
        >
          <div className="mt-1 mb-4 flex items-center justify-between">
            <div className="flex items-center select-none">
              <span className="hover:text-pink-500 cursor-pointer mr-3">
                <svg viewBox="0 0 512 512" className="h-5 w-5 fill-current">
                  <path
                    d="M505 442.7L405.3
                  343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7
                  44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1
                  208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4
                  2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9
                  0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7
                  0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0
                  128 57.2 128 128 0 70.7-57.2 128-128 128z"
                  ></path>
                </svg>
              </span>

              <input
                className="bg-transparent focus:outline-none"
                placeholder="Search in activity"
              />
            </div>

            <button
              className="flex items-center focus:outline-none border
            rounded-full py-2 px-6 leading-none border-gray-500
            select-none hover:text-pink-600 hover:bg-pink-300"
            >
              <svg className="h-5 w-5 fill-current mr-1" viewBox="0 0 24 24">
                <path
                  d="M12 1L8 5h3v9h2V5h3m2 18H6a2 2 0 01-2-2V9a2 2 0
                012-2h3v2H6v12h12V9h-3V7h3a2 2 0 012 2v12a2 2 0 01-2
                2z"
                ></path>
              </svg>
              <span>Export</span>
            </button>

            <div className="flex items-center select-none">
              <span>Filter</span>
              <button
                className="ml-3 bg-gray-100 dark:bg-gray-600
              dark:text-gray-400 rounded-full p-2 focus:outline-none
              hover:text-gray-500 hover:bg-gray-300 transition
              duration-500 ease-in-out"
              >
                <svg className="h-5 w-5 fill-current" viewBox="0 0 24 24">
                  <path
                    d="M14 12v7.88c.04.3-.06.62-.29.83a.996.996 0
                  01-1.41 0l-2.01-2.01a.989.989 0
                  01-.29-.83V12h-.03L4.21 4.62a1 1 0
                  01.17-1.4c.19-.14.4-.22.62-.22h14c.22 0
                  .43.08.62.22a1 1 0 01.17 1.4L14.03 12H14z"
                  ></path>
                </svg>
              </button>
              <button
                className="ml-2 bg-gray-100 dark:bg-gray-600
              dark:text-gray-400 rounded-full p-2 focus:outline-none
              hover:text-gray-500 hover:bg-gray-300 transition
              duration-500 ease-in-out"
              >
                <svg className="h-5 w-5 fill-current" viewBox="0 0 24 24">
                  <path
                    d="M18 21l-4-4h3V7h-3l4-4 4 4h-3v10h3M2
                  19v-2h10v2M2 13v-2h7v2M2 7V5h4v2H2z"
                  ></path>
                </svg>
              </button>
              <button
                className="ml-2 bg-gray-100 dark:bg-gray-600
              dark:text-gray-400 rounded-full p-2 focus:outline-none
              hover:text-gray-500 hover:bg-gray-300 transition
              duration-500 ease-in-out"
              >
                <svg className="h-5 w-5 fill-current" viewBox="0 0 24 24">
                  <path
                    d="M12 4a4 4 0 014 4 4 4 0 01-4 4 4 4 0 01-4-4 4
                  4 0 014-4m0 10c4.42 0 8 1.79 8 4v2H4v-2c0-2.21
                  3.58-4 8-4z"
                  ></path>
                </svg>
              </button>
            </div>
          </div>

          <div
            className="border dark:border-gray-700 transition duration-500
          ease-in-out w-9/12"
          ></div>
          <div className="flex flex-col mt-2">
            <div className="flex flex-row mt-2">
              <div
                className="flex w-full items-center justify-between bg-white
              dark:bg-gray-800 px-8 py-1 border-l-4 border-green-500
              dark:border-green-300"
              >
                <div className="flex">
                  <img
                    className="h-12 w-12 rounded-full object-cover"
                    src="https://png.pngtree.com/png-clipart/20190604/original/pngtree-creative-company-logo-png-image_1420804.jpg"
                    alt="infamous"
                  />

                  <div className="flex flex-col ml-6">
                    <span className="text-lg font-bold">
                      Yazılım Geliştirici
                    </span>
                    <div className="mt-4 flex">
                      <div className="flex">
                        <svg
                          className="h-5 w-5 fill-current
                        dark:text-gray-300"
                          viewBox="0 0 24 24"
                        >
                          <path
                            d="M12 4a4 4 0 014 4 4 4 0 01-4 4
                          4 4 0 01-4-4 4 4 0 014-4m0
                          10c4.42 0 8 1.79 8
                          4v2H4v-2c0-2.21 3.58-4 8-4z"
                          ></path>
                        </svg>
                        <span
                          className="ml-2 text-sm text-gray-600
                        dark:text-gray-300 capitalize"
                        >
                          Abc Şirketi
                        </span>
                      </div>
                      <div className="flex">
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
                        <span
                          className="ml-2 text-sm text-gray-600
                        dark:text-gray-300 capitalize"
                        >
                          İstanbul
                        </span>
                      </div>
                      <div className="flex ml-6">
                        <svg
                          className="h-5 w-5 fill-current
                        dark:text-gray-300"
                          viewBox="0 0 24 24"
                        >
                          <path
                            d="M19
                          19H5V8h14m-3-7v2H8V1H6v2H5c-1.11
                          0-2 .89-2 2v14a2 2 0 002 2h14a2 2
                          0 002-2V5a2 2 0 00-2-2h-1V1m-1
                          11h-5v5h5v-5z"
                          ></path>
                        </svg>
                        <span
                          className="ml-2 text-sm text-gray-600
                        dark:text-gray-300 capitalize"
                        >
                          13 aug 2016
                        </span>
                      </div>
                      <div
                        className="text-center flex flex-col items-center
              justify-center bg-white dark:bg-gray-800
              dark:text-gray-300 ml-1 px-4 cursor-pointer
              hover:bg-gray-100 dark-hover:bg-gray-100 rounded-lg"
                      >
                        <svg
                          className="h-6 w-6 fill-current"
                          viewBox="0 0 24 24"
                        >
                          <path
                            d="M9.47 9.65l-1.41 1.42L11
                  14l5.19-5.18-1.41-1.42L11 11.18M17 3H7c-1.1 0-2
                  .9-2 2v16l7-3 7 3V5c0-1.1-.9-2-2-2m0 15l-5-2.18L7
                  18V5h10z"
                          ></path>
                        </svg>
                      </div>
                    </div>

                    <div className="mt-4 flex">
                      <button
                        className="flex items-center ml-4
                      focus:outline-none border rounded-full
                      py-2 px-6 leading-none border-blue-500
                      dark:border-blue-600 select-none
                      hover:bg-blue-400 hover:text-white
                      dark-hover:text-gray-200"
                      >
                        <svg
                          className="h-5 w-5 fill-current mr-2
                        text-blue-600"
                          viewBox="0 0 576 512"
                        >
                          <path
                            d="M402.3 344.9l32-32c5-5
                          13.7-1.5 13.7 5.7V464c0 26.5-21.5
                          48-48 48H48c-26.5
                          0-48-21.5-48-48V112c0-26.5
                          21.5-48 48-48h273.5c7.1 0 10.7
                          8.6 5.7 13.7l-32 32c-1.5 1.5-3.5
                          2.3-5.7
                          2.3H48v352h352V350.5c0-2.1.8-4.1
                          2.3-5.6zm156.6-201.8L296.3
                          405.7l-90.4 10c-26.2
                          2.9-48.5-19.2-45.6-45.6l10-90.4L432.9
                          17.1c22.9-22.9 59.9-22.9 82.7
                          0l43.2 43.2c22.9 22.9 22.9 60 .1
                          82.8zM460.1 174L402 115.9 216.2
                          301.8l-7.3 65.3 65.3-7.3L460.1
                          174zm64.8-79.7l-43.2-43.2c-4.1-4.1-10.8-4.1-14.8
                          0L436 82l58.1 58.1
                          30.9-30.9c4-4.2 4-10.8-.1-14.9z"
                          ></path>
                        </svg>
                        <span>İncele</span>
                      </button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </main>
    </div>
  );
}

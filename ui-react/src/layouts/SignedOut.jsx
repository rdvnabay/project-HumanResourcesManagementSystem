import React from "react";
import { Fragment } from "react";
import { NavLink } from "react-router-dom";
import { Menu, Transition } from "@headlessui/react";
import { BellIcon } from "@heroicons/react/outline";

function classNames(...classes) {
  return classes.filter(Boolean).join(" ");
}

export default function SignedOut({ signIn }) {
  return (
    <div className="absolute inset-y-0 right-0 flex items-center pr-2 sm:static sm:inset-auto sm:ml-6 sm:pr-0">
      <NavLink
        to="/aday/giris"
        onClick={signIn} 
        className={classNames(
          "text-gray-300 hover:bg-gray-700 hover:text-white block px-3 py-2 rounded-md text-base font-medium"
        )}
      >
        Giriş Yap
      </NavLink>
      <NavLink
        to="/aday/kayit-ol"
        className={classNames(
          "text-gray-300 hover:bg-gray-700 hover:text-white block px-3 py-2 rounded-md text-base font-medium"
        )}
      >
        Kayıt Ol
      </NavLink>
    </div>
  );
}

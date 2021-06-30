import React from "react";
import { NavLink } from "react-router-dom";

export default function BreadCrumb() {
  return (
    <div>
      <nav className="bg-grey-light p-2 rounded font-sans w-full m-2s text-sm">
        <ol className="list-reset flex text-grey-dark">
          <li>
            <NavLink to="#" className="text-blue font-bold">
              Home
            </NavLink>
          </li>
          <li>
            <span className="mx-2">/</span>
          </li>
          <li>
            <NavLink to="#" className="text-blue font-bold">
              Library
            </NavLink>
          </li>
          <li>
            <span className="mx-2">/</span>
          </li>
          <li>Data</li>
        </ol>
      </nav>
    </div>
  );
}

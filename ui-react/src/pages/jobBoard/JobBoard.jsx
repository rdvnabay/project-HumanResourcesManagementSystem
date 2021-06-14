import React from "react";
import JobBoardAdd from "./jobBoardAdd";
import JobBoardPreview from "./JobBoardPreview";

export default function JobBoard() {
  return (
    <div className="grid grid-cols-6">
      <div className="col-span-3 gap-6">
        <JobBoardAdd />
      </div>
      <div className="col-span-3 gap-6">
      <JobBoardPreview />
      </div>
    </div>
  );
}

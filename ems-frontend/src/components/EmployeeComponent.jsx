import React, { useState } from "react";

const EmployeeComponent = () => {

  const [firstName, setFirstname] = useState("");
  const [lastName, setLastname] = useState("");
  const [email, setEmail] = useState("");

  return( 
  <div className="container"> 
  <div className="row">
    <div className="card">
        <h2 className="text-center">add employee</h2>
        <div className="card-body">
            <form action="">
                <div className="form-group mb-2">
                    <label className="form-label">firstName :</label>
                    <input type="text"
                    placeholder="Enter employee first name"
                    name="firstName"
                    value={firstName} />

                </div>
            </form>
        </div>
    </div>

  </div>

  </div>
  )
};

export default EmployeeComponent;

import { useState } from "react";
import React from "react";
import "bootstrap/dist/css/bootstrap.css";
import { useEffect } from "react";
import { listOfEmployees } from "../services/EmployeeService";

const ListEmployee = () => {
  // const dummyData = [
  //   {
  //     id: "1",
  //     firstName: "Jong",
  //     lastName: "Un",
  //     email: "kim@test.com",
  //   },
  //   {
  //     id: "2",
  //     firstName: "Donald",
  //     lastName: "trump",
  //     email: "trump@test.com",
  //   },
  // ];

  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    listOfEmployees()
      .then((response) => {
        setEmployees(response.data);
      })
      .catch((error) => {
        console.error(error);
      });
  }, []);
  return (
    <div className="container">
      <h1>ListEmployee</h1>

      <table className="table table-striped table-bordered">
        <thead>
          <tr>
            <th>Employee Id</th>
            <th>Employee first name</th>
            <th>Employee last name</th>
            <th>Employee email</th>
          </tr>
        </thead>
        <tbody>
          {employees.map((employee) => (
            <tr key={employee.id}>
              <td>{employee.id}</td>
              <td>{employee.firstName}</td>
              <td>{employee.lastName}</td>
              <td>{employee.email}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ListEmployee;

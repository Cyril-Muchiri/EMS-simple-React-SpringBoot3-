import axios from "axios";

const BASE_URL='http://localhost:8080/api/employees';
const POST_URL='http://localhost:8080/api/employees/add-employee'

export const listOfEmployees=() => axios.get(BASE_URL);
export const createEmployee=(employee) => axios.post(POST_URL,employee);
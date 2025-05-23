<!-- 8c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
....
...
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
Grand Salary : 45000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->


<!-- -- Create the database
CREATE DATABASE Employee;

-- Use the database
USE Employee;

-- Create the Emp table
CREATE TABLE Emp (
    Emp_NO INT PRIMARY KEY,
    Emp_Name VARCHAR(100) NOT NULL,
    BasicSalary DECIMAL(10,2) NOT NULL
); -->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Add Employee</title></head>
<body>
  <h2>Add Employee Record</h2>
  <form action="insert.jsp" method="post">
    Emp No:       <input type="number" name="empno" required><br>
    Emp Name:     <input type="text"   name="empname" required><br>
    Basic Salary: <input type="number" name="basicsalary" required><br>
    <button type="submit">Add</button>
  </form>
  <p><a href="report.jsp">View Salary Report</a></p>
</body>
</html>

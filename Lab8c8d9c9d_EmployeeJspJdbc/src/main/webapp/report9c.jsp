<!-- 9c. Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and Generate
the report as follows for the table Emp (Emp_NO , Emp_Name, Basicsalary ) using HTML and JSP
to get the field and display the results respectively -->
<%@ page import="java.sql.*" %>
<%
  String url      = "jdbc:mysql://localhost:3306/Employee";
  String user     = "root";
  String password = "";

  Class.forName("com.mysql.cj.jdbc.Driver");
  int grandTotal = 0;
%>
<html>
<head><title>Salary Report</title></head>
<body>
  <h1>Salary Report</h1>
  <hr>
<%
  try (Connection conn = DriverManager.getConnection(url, user, password);
       Statement stmt = conn.createStatement();
       ResultSet rs   = stmt.executeQuery("SELECT * FROM Emp")) {

    while (rs.next()) {
      int no    = rs.getInt("Emp_NO");
      String nm = rs.getString("Emp_Name");
      int sal   = rs.getInt("Basicsalary");
      grandTotal += sal;
%>
  <p>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
    Emp_No : <%= no %><br>
    Emp_Name: <%= nm %><br>
    Basic   : <%= sal %><br>
  </p>
<%
    }
  }
%>
  <p>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
    <strong>Grand Salary : <%= grandTotal %></strong><br>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  </p>
  <p><a href="input.jsp">Add More Employees</a></p>
</body>
</html>

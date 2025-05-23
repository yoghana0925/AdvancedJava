<!-- 8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively -->
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<html>
<body>
<h2>Enter Employee Details</h2>
<form method="post">
  Emp No: <input type="text" name="empno"/><br/>
  Name: <input type="text" name="empname"/><br/>
  Basic Salary: <input type="text" name="salary"/><br/>
  <input type="submit" value="Submit"/>
</form>

<%
Connection con = null;
try {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

    String empnoStr = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String salaryStr = request.getParameter("salary");

    if(empnoStr != null && empname != null && salaryStr != null &&
       !empnoStr.isEmpty() && !empname.isEmpty() && !salaryStr.isEmpty()) {

        int empno = Integer.parseInt(empnoStr);
        int salary = Integer.parseInt(salaryStr);

        String sql = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?) " +
                     "ON DUPLICATE KEY UPDATE Emp_Name = VALUES(Emp_Name), Basicsalary = VALUES(Basicsalary)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, empno);
        ps.setString(2, empname);
        ps.setInt(3, salary);

        int i = ps.executeUpdate();
        if(i > 0) {
            out.println("<p style='color:green;'>Employee inserted or updated successfully.</p>");
        }
    }

    // Generate Salary Report
    out.println("<hr/>");
    out.println("<h3>Salary Report</h3>");
    out.println("<pre>");
    out.println("---------------------------------------------");

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

    int total = 0;
    while(rs.next()) {
        int eno = rs.getInt("Emp_NO");
        String ename = rs.getString("Emp_Name");
        int basic = rs.getInt("Basicsalary");
        total += basic;

        out.println("Emp_No   : " + eno);
        out.println("Emp_Name : " + ename);
        out.println("Basic    : " + basic);
        out.println("---------------------------------------------");
    }

    out.println("Grand Salary : " + total);
    out.println("---------------------------------------------");
    out.println("</pre>");

} catch(Exception e) {
    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
} finally {
    if(con != null) con.close();
}
%>
</body>
</html>

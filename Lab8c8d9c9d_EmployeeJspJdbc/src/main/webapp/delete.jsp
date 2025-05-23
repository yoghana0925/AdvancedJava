<%@ page import="java.sql.*" %>
<html>
<head>
  <title>Delete Employee</title>
</head>
<body>
<h2>Delete Employee Record</h2>
<form method="post">
  Emp No: <input type="text" name="empno" required/><br/><br/>
  <input type="submit" value="Delete"/>
</form>

<%
Connection con = null;
try {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

    String empnoStr = request.getParameter("empno");
    if (empnoStr != null && !empnoStr.trim().isEmpty()) {
        int empno = Integer.parseInt(empnoStr);

        PreparedStatement ps = con.prepareStatement("DELETE FROM Emp WHERE Emp_NO = ?");
        ps.setInt(1, empno);

        int i = ps.executeUpdate();
        if(i > 0) {
            out.println("<p style='color:green;'>Employee record deleted successfully.</p>");
        } else {
            out.println("<p style='color:red;'>No employee found with the given Emp No.</p>");
        }
    }
} catch(Exception e) {
    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
} finally {
    if(con != null) con.close();
}
%>
</body>
</html>

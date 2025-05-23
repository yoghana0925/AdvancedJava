<%@ page import="java.sql.*" %>
<%
  String url      = "jdbc:mysql://localhost:3306/Employee";
  String user     = "root";
  String password = "";           // XAMPP’s default root has no password
  int    empno    = Integer.parseInt(request.getParameter("empno"));
  String empname  = request.getParameter("empname");
  int    basic    = Integer.parseInt(request.getParameter("basicsalary"));

  Class.forName("com.mysql.cj.jdbc.Driver");
  try (Connection conn = DriverManager.getConnection(url, user, password)) {
    String sql = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setInt(1, empno);
      ps.setString(2, empname);
      ps.setInt(3, basic);
      ps.executeUpdate();
    }
  }

  // Redirect back to input form (or directly to report.jsp)
  response.sendRedirect("input.jsp");
%>

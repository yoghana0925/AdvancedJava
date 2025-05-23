<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Update Coffee Product</title>
</head>
<body>
    <h2>Updating Coffee Product...</h2>
    <%
        String idStr = request.getParameter("id");
        String coffeeName = request.getParameter("coffee_name");
        String priceStr = request.getParameter("price");

        if (idStr != null && coffeeName != null && priceStr != null) {
            int id = Integer.parseInt(idStr);
            double price = Double.parseDouble(priceStr);

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "");

                String sql = "UPDATE coffee SET coffee_name=?, price=? WHERE id=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, coffeeName);
                ps.setDouble(2, price);
                ps.setInt(3, id);

                int rowsAffected = ps.executeUpdate();

                if (rowsAffected > 0) {
                    out.println("<p>Product updated successfully!</p>");
                } else {
                    out.println("<p>No product found with ID " + id + ".</p>");
                }

                ps.close();
                con.close();

            } catch (Exception e) {
                out.println("<p>Error: " + e.getMessage() + "</p>");
            }
        } else {
            out.println("<p>Please fill in all fields!</p>");
        }
    %>
    <br>
    <a href="ViewCoffee.jsp">View Coffee List</a>
</body>
</html>

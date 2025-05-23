<%@ page import="java.sql.*" %>
<%
    String name = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    if (name != null && priceStr != null && !name.isEmpty() && !priceStr.isEmpty()) {
        double price = Double.parseDouble(priceStr);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO coffee(coffee_name, price) VALUES (?, ?)");
            ps.setString(1, name);
            ps.setDouble(2, price);

            int result = ps.executeUpdate();

            if (result > 0) {
                out.println("<h3>Coffee added successfully!</h3>");
            } else {
                out.println("<h3>Failed to add coffee!</h3>");
            }

            con.close();

        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
%>

<a href="ViewCoffee.jsp">View Coffee List</a>

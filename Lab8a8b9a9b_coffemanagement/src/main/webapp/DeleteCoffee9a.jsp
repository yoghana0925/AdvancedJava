<!-- 9a. Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively -->
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Delete Coffee</title>
</head>
<body>
    <h2>Delete a Coffee Product</h2>

    <!-- Form to delete a coffee by ID -->
    <form method="post" action="">
        Enter Coffee ID to Delete: <input type="text" name="coffee_id" required />
        <input type="submit" value="Delete Coffee" />
    </form>

    <%
        String coffeeIdStr = request.getParameter("coffee_id");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "");

            if (coffeeIdStr != null && !coffeeIdStr.isEmpty()) {
                int coffeeId = Integer.parseInt(coffeeIdStr);

                // Delete the coffee with given ID
                String deleteQuery = "DELETE FROM coffee WHERE id=?";
                PreparedStatement ps = con.prepareStatement(deleteQuery);
                ps.setInt(1, coffeeId);

                int result = ps.executeUpdate();

                if (result > 0) {
                    out.println("<p style='color:green;'>Coffee with ID " + coffeeId + " deleted successfully!</p>");
                } else {
                    out.println("<p style='color:red;'>No coffee found with ID " + coffeeId + ".</p>");
                }
            }

            // Display remaining coffee records
            out.println("<h3>Current Coffee Records</h3>");
            out.println("<table border='1' cellpadding='5' cellspacing='0'>");
            out.println("<tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt("id") + "</td>");
                out.println("<td>" + rs.getString("coffee_name") + "</td>");
                out.println("<td>" + rs.getDouble("price") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");

            con.close();

        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    %>

    <br>
    <a href="insert.jsp">Add New Coffee</a> | 
    <a href="ViewCoffee.jsp">View Coffee List (Starting with 'D')</a>

</body>
</html>

<!-- 9b. Read all the existing records from the table coffee which is from the database test and query
coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
results respectively -->

<%@ page import="java.sql.*" %>
<html>
<head>
    <title>View Coffee List</title>
</head>
<body>
    <h2>Coffee Records Starting with 'D'</h2>

    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>

        <%
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "");

                // SQL query to get coffee names starting with 'D'
                String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                while(rs.next()) {
        %>
                    <tr>
                        <td><%= rs.getInt("id") %></td>
                        <td><%= rs.getString("coffee_name") %></td>
                        <td><%= rs.getDouble("price") %></td>
                    </tr>
        <%
                }

                con.close();

            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
    </table>

    <br>
    <a href="insert.jsp">Add New Coffee</a>
</body>
</html>

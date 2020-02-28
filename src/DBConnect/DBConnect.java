package DBConnect;

import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "Y@24giri");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from workers");
            while (rs.next()) {
                System.out.println(rs.getString("First_Name"));
            }


        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

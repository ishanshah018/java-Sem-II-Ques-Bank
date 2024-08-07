import java.util.*;
import java.sql.*;

class QB383 {
    public static void main(String[] args) throws Exception {
        String drivername = "com.mysql.cj.jdbc.Driver";
        Class.forName(drivername);

        String dburl = "jdbc:mysql://localhost:3306/ishan_database";
        String dbname = "root";
        String dbpass = "";

        Connection con = DriverManager.getConnection(dburl, dbname, dbpass);

        if (con != null) {
            System.out.println("Connection Succesfull");
        } else {
            System.out.println("Connection Failed !!");

        }

        String sql = "{call getEmployees()}";
        CallableStatement cst = con.prepareCall(sql);
        ResultSet rs = cst.executeQuery();

        while (rs.next()) {
            System.out.println("Name: " + rs.getString("emp_name"));
            System.out.println("Age: " + rs.getInt("emp_age"));
            System.out.println("Mobile: " + rs.getLong("emp_mob"));
            System.out.println("Salary: " + rs.getFloat("emp_salary"));
        }
    }
}

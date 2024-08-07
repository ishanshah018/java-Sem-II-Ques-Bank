import java.sql.*;

class QB371 {
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
    }
}

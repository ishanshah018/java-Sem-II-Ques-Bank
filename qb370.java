import java.sql.*;
import java.util.*;

class QB370 {
    public static void main(String[] args) throws Exception {
        String drivername = "com.mysql.cj.jdbc.Driver";
        Class.forName(drivername);

        String dburl = "jdbc:mysql://localhost:3306/admission";
        String dbname = "root";
        String dbpass = "";

        Connection con = DriverManager.getConnection(dburl, dbname, dbpass);

        if (con != null) {
            System.out.println("Connection Succesfull");
        } else {
            System.out.println("Connection Failed !!");
        }

        String sql = "insert into student(stdId,stdName,stdMarks) values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, 1);
        pst.setString(2, "Ishan");
        pst.setFloat(3, 320);
        pst.executeUpdate();

        pst.setInt(1, 2);
        pst.setString(2, "Raj");
        pst.setFloat(3, 290);
        pst.executeUpdate();

        pst.setInt(1, 3);
        pst.setString(2, "Yash");
        pst.setFloat(3, 230);
        int r = pst.executeUpdate();

        if (r > 0) {
            System.out.println("Insertion Successfull");
        } else {
            System.out.println("Insertion Failed");
        }

    }
}

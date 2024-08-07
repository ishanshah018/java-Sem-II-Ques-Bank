import java.sql.*;

class rsmd1 {
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

        String sql = "Select * from bank";
        PreparedStatement pst = con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();
        ResultSetMetaData rss = rs.getMetaData();

        System.out.println(rss.getTableName(1));
        int cc = rss.getColumnCount();
        System.out.println("No.of Columns: " + cc);

        for (int i = 1; i <= cc; i++) {
            System.out.println(rss.getColumnTypeName(i));
        }

        int rowcount = 0;
        while (rs.next()) {
            rowcount++;
        }
        System.out.println("Total Rows: " + rowcount);
    }
}

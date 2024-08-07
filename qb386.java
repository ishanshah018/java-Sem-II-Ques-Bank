import java.sql.*;

class QB386 {
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

        Statement st = con.createStatement();

        // Insertion
        String sql = "Insert into bank(AccountNo,CustomerName,Balance,Phone,Address) values(1987678965789435,'Ishan',3500,9898098765,'65,pragatipark maninagar')";
        int r = st.executeUpdate(sql);

        String sql0 = "Insert into bank(AccountNo,CustomerName,Balance,Phone,Address) values(1777678965450935,'Paresh',12900,82984558765,'77,rajeshparkmaninagar')";
        st.executeUpdate(sql0);

        String sql11 = "Insert into bank(AccountNo,CustomerName,Balance,Phone,Address)values(1087409965789435,'Ramesh',25000,9855656578,'87,vijaypark maninagar')";
        st.executeUpdate(sql11);

        if (r > 0) {
            System.out.println("Insertion Succesfull");
        } else {
            System.out.println("Insertion Failed..");
        }

        // Updation
        Statement stt = con.createStatement();
        String sql2 = "Update bank set Balance=50000 where CustomerName='Ishan' ";
        int r1 = stt.executeUpdate(sql2);
        if (r1 > 0) {
            System.out.println("Updation Succesfull");
        } else {
            System.out.println("Updation Failed..");
        }

        // Print values of all customers whose balance is greater than 20,000.
        System.out.println("Available Data of Customers having Balance>20000");
        String sql3 = "Select * from bank where Balance>20000 ";
        PreparedStatement pst2 = con.prepareStatement(sql3);
        ResultSet rs = pst2.executeQuery();

        while (rs.next()) {
            System.out.println("Account Number: " + rs.getLong(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Balance: " + rs.getLong(3));
            System.out.println("Phone: " + rs.getLong(4));
            System.out.println("Address: " + rs.getString(5));
            System.out.println("-------------------------------------------------------");
        }

    }
}

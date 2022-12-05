import java.sql.*;

public class ConnectSQL {
    private static String DB_URL = "jdbc:mysql://localhost:3306/employee";
    private static String USER_NAME = "root";
    private static String PASSWORD = "1234";

    //Gán giá trị của employee vào a
    public static boolean addEmployee(Employee a){
        String sql = "INSERT INTO employee (fullName, birthDay, phone, email) VALUES " +
                "(?,?,?,?);";
        Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
        try {
            // create statement
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setString(1, String.valueOf(a.getId()));
            ps.setString(1, a.getFullName());
            ps.setString(2, a.getBirthDay());
            ps.setString(3, a.getPhone());
            ps.setString(4, a.getEmail());
            System.out.println("\nSaved to database!\n");
            //Thao tác thay đổi csdl dùng executeUpdate
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static void getListEmployee(){
        try {
            // connnect to database 'employee'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // create statement
            Statement stmt = conn.createStatement();
            // get data from table 'employee'
            //đọc dữ liệu dùng Query
            ResultSet rs = stmt.executeQuery("select * from employee");
            // show data
            while (rs.next()) {
                System.out.format("\n\t Nhân viên số: ");
                System.out.format("\t\t%20s | ", rs.getString(1));
                System.out.format("\t\t%20s | ", rs.getString(2));
                System.out.format("\t\t%20s | ", rs.getString(3));
                System.out.format("\t\t%20s | ", rs.getString(4));
                System.out.format("\t\t%20s | ", rs.getString(5));
                System.out.print("\n\n");
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Phương thức kết nối đến Database
    public static Connection getConnection(String dbURL, String userName,
                                           String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
        } catch (Exception ex) {
            System.out.println("Connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
import java.sql.*;

public class MyConnection {

		public static Connection getConnection() {
			Connection con=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "Nadeem@786");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
}

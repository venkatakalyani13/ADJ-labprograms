package databases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBDataAccess {
	public static void main(String args[]) {
		try {
			//load the jdbc driver-4 into application for mysql
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection
			//DriverManager.getConnection(connectionURL, user name, password);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employes", "root", "");
			
			//statement object creation
			Statement st = con.createStatement();
			
			//execution of sql statement and output is table which is represented as resultset in application
			ResultSet rs = st.executeQuery("select * from emp");
			
			//retrieve the data from result set
			System.out.println("empno\tename\tsal\tdept");
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}

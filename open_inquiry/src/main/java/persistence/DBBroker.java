package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class DBBroker {

	private static String connectionString = "user=root&password=Calidad";
	private static DBBroker instance = null;
	private static Connection connection = null;
	public static String dbPath = "jdbc:mysql://localhost:3386/multas?";

	public DBBroker() throws SQLException, Exception{
		Driver.class.newInstance();
		System.out.println("Registro exitoso");
		connection = DriverManager.getConnection(dbPath + connectionString);
	}
	
	public static DBBroker getInstance() throws SQLException, Exception{
		if(instance == null){
			instance = new DBBroker();
			return instance;
		}else{
			return instance;
		}
	}

	/**
	 * 
	 * @param query
	 */
	public ResultSet read(String query)  throws SQLException{
		ResultSet rs = null;
		Statement cmd = null;
		cmd = connection.createStatement();
		rs = cmd.executeQuery(query);
		return rs;
	}

	/**
	 * 
	 * 
	 * @param query
	 */
	public int update(String query) throws SQLException{
		Statement statement = connection.createStatement();
		int update_done = statement.executeUpdate(query);
		return update_done;
	}
	
	/**
	 * 
	 * 
	 * @param query
	 */
	public int insert(String query) throws SQLException{
		Statement statement = connection.createStatement();
		int insert_done = statement.executeUpdate(query);
		return insert_done;
	}
	
	/**
	 * 
	 * 
	 * @param query
	 */
	public int delete(String query) throws SQLException{
		Statement statement = connection.createStatement();
		int delete_done = statement.executeUpdate(query);
		return delete_done;
	}

}
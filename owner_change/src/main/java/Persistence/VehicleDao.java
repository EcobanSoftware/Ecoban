package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import Domain.*;

/**
 * Iteration 4 - Construction.
 */
public class VehicleDao extends GeneralDao {

	public VehicleDao() throws Exception {
		super();
	}

	/**
	 * 
	 * @param license
	 */
	public Vehicle findByLicense(String license) throws Exception{
		// TODO - implement GeneralDao.update
				throw new UnsupportedOperationException();
	}
	
	public int update(Vehicle vehicle) throws SQLException {
		return broker.update("UPDATE vehicle SET owner_id=" 
				+ vehicle.getOwner().getId()
				+ " WHERE license=" + vehicle.getLicense()
				+ ";");
	}
	
}
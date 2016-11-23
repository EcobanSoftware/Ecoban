package Persistence;

import java.sql.ResultSet;

import Domain.Owner;

public class DriverDao extends GeneralDao {

	/**
	 * 
	 * @param dni
	 */
	public Owner findByDNI(String dni) throws Exception{
		Owner owner = null;
		DBBroker broker = DBBroker.getInstance();
		
		String query = "SELECT idOwner FROM OwnerVehicle WHERE license = " + dni + ";";
		
		ResultSet rs = broker.read(query);
		
		rs.next();
		int owner_id = rs.getInt("owner_id");
		owner = new Owner(owner_id);
		
		rs.close();
		return owner;
	}

	public DriverDao() {
		// TODO - implement DriverDao.DriverDao
		throw new UnsupportedOperationException();
	}

}
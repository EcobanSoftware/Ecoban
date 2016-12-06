package Persistence;

import Domain.*;
import java.sql.ResultSet;


public class OwnerDAO extends GeneralDao {

	public OwnerDAO() throws Exception {
		super();
	}

	/**
	 * 
	 * @param dni
	 */
	public Owner findByDNI(String dni) {
		// TODO - implement OwnerDAO.findByDNI
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param license
	 */
	public Owner findByLicense(String license) throws Exception{
		Owner owner = null;
		DBBroker broker = DBBroker.getInstance();
		
		String query = "SELECT * FROM Vehicle WHERE license = " + license + ";";
		
		ResultSet rs = broker.read(query);
		
		rs.next();
		int owner_id = rs.getInt("owner_id");
		owner = new Owner(owner_id);
		
		rs.close();
		return owner;
	}

	public void OwnerDao() {
		// TODO - implement OwnerDAO.OwnerDao
		throw new UnsupportedOperationException();
	}

}
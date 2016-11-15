package persistence;

import java.sql.ResultSet;

import domain.Owner;

public class OwnerDAO {

	private Owner list_of_owners;

	public void getList_of_owners() {
		// TODO - implement OwnerDAO.getList_of_owners
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param list_of_owners
	 */
	public void setList_of_owners(int list_of_owners) {
		// TODO - implement OwnerDAO.setList_of_owners
		throw new UnsupportedOperationException();
	}

	public int update() {
		// TODO - implement OwnerDAO.update
		throw new UnsupportedOperationException();
	}

	public int insert() {
		// TODO - implement OwnerDAO.insert
		throw new UnsupportedOperationException();
	}

	public void read() {
		// TODO - implement OwnerDAO.read
		throw new UnsupportedOperationException();
	}

	public int delete() {
		// TODO - implement OwnerDAO.delete
		throw new UnsupportedOperationException();
	}

	public Owner findByDNI() {
		// TODO - implement OwnerDAO.findByDNI
		throw new UnsupportedOperationException();
	}

	public Owner findByLicense(String license) throws Exception{
		Owner owner = null;
		DBBroker broker = DBBroker.getInstance();
		
		String query = "SELECT * FROM Vehicle WHERE license = " + license + ";";
		
		ResultSet rs = broker.read(query);
		
		rs.next();
		String owner_id = rs.getString("owner_id");
		owner = new Owner(owner_id);
		
		rs.close();
		return owner;
	}

}
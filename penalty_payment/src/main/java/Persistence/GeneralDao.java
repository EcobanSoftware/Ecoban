package Persistence;

import java.sql.ResultSet;

import Domain.Inquiry;
import Domain.Sanction;

public class GeneralDao {

	private DBBroker broker;

	public GeneralDao() throws Exception{
		broker = DBBroker.getInstance();
	}

	/**
	 * 
	 * @param object
	 */
	public int insert(Object object) {
		// TODO - implement GeneralDao.insert
		throw new UnsupportedOperationException();
	}
	
	public int insertInquiry(Inquiry inquiry) throws Exception{
		return broker.insert("INSERT INTO inquiry (id,dateOfIssue,location,maxSpeed,speed) VALUES (" 
				+ inquiry.getId() + "," 
				+ inquiry.getDateofissue() + ","
				+ inquiry.getLocation() + ","		
				+ inquiry.getMaxspeed() + ","
				+ inquiry.getSpeed() + ","
				+ ")");
	}

	/**
	 * 
	 * @param object
	 */
	public int update(Object object) {
		// TODO - implement GeneralDao.update
		throw new UnsupportedOperationException();
	}
	
	public int updateSanction(Sanction sanction) throws Exception{
		java.sql.Date dateOfPayment = new java.sql.Date(sanction.getDateOfPayment().getTime());
		java.sql.Date dateOfReception = new java.sql.Date(sanction.getDateofReception().getTime());
		return broker.update("INSERT INTO inquiry (id,amount,points,dateOfPayment,dateOfReception) VALUES (" 
				+ sanction.getId() + "," 
				+ sanction.getAmount() + "," 
				+ sanction.getPoints() + "," 
				+ dateOfPayment.getTime() + "," 
				+ dateOfReception.toString() + "," 
				+ ")");
	}

	/**
	 * 
	 * @param object
	 */
	public int delete(Object object) {
		// TODO - implement GeneralDao.delete
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param object
	 */
	public void readById(Object object) {
		// TODO - implement GeneralDao.readById
		throw new UnsupportedOperationException();
	}

	public void readAll() {
		// TODO - implement GeneralDao.readAll
		throw new UnsupportedOperationException();
	}

}
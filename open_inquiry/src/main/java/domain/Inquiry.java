package Domain;

import java.util.Date;

import Persistence.OwnerDAO;

public class Inquiry {

	private int id;
	private Date dateofissue;
	private String location;
	private double maxspeed;
	private double speed;
	private String license;
	
	public Inquiry(Date dateofissue, String location, double maxspeed, double speed, String license) {
		this.dateofissue = dateofissue;
		this.location = location;
		this.maxspeed = maxspeed;
		this.speed = speed;
		this.license = license;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateofissue() {
		return dateofissue;
	}

	public void setDateofissue(Date dateofissue) {
		this.dateofissue = dateofissue;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(double maxspeed) {
		this.maxspeed = maxspeed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}
	
	/**
	 * 
	 * @param license
	 */
	public Owner findOwner(String license) throws Exception{
		OwnerDAO dao = new OwnerDAO();
		Owner owner = dao.findByLicense(license);
		return owner;
	}
	
}
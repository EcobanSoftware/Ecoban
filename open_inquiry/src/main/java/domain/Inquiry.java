package domain;

import java.util.Date;

import persistence.OwnerDAO;
import domain.Owner;

public class Inquiry {

	private int id;
	private Date dateofissue;
	private String location;
	private double maxspeed;
	private double speed;
	private Owner owner;

	public Inquiry(String license, double speed, double maxSpeed, String location) throws Exception{
		this.dateofissue=new Date(System.currentTimeMillis());
		this.speed=speed;
		this.maxspeed=maxSpeed;
		this.location=location;
		this.owner = findOwner(license);
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


	public Owner getOwner() {
		return owner;
	}


	public void setOwner(Owner owner) {
		this.owner = owner;
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
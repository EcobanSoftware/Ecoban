package Domain;

import java.util.Date;

public class Inquiry {

	private int id;
	private Date dateofissue;
	private String location;
	private double maxspeed;
	private double speed;
	private String license;
	private Sanction sanction;
	private Owner owner;
	
	/**
	 * 
	 * @param license
	 * @param speed
	 * @param maxSpeed
	 * @param location
	 */
	public Inquiry(String license, double speed, double maxSpeed, String location) {
		this.dateofissue = new Date(System.currentTimeMillis());
		this.speed=speed;
		this.maxspeed = maxSpeed;
		this.location = location;
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



	public String getLicense() {
		return license;
	}



	public void setLicense(String license) {
		this.license = license;
	}



	public Sanction getSanction() {
		return sanction;
	}



	public void setSanction(Sanction sanction) {
		this.sanction = sanction;
	}



	/**
	 * 
	 * @param license
	 */
	public Owner findOwner(String license) {
		OwnerDao dao=new OwnerDao();
		return dao.findByLicense(license);
	}

	public int calculateAmount() {
		if (maxspeed==30) {
			if (speed>=31 && speed<=50) 
				return 100;
			else if (speed>=51 && speed<=60)
				return 300;
			else if (speed>=61 && speed<=70)
				return 400;
			else if (speed>=71 && speed<=80)
				return 500;
			else
				return 6;
		} else if (maxspeed==40) {
			if (speed>=41 && speed<=60) 
				return 100;
			else if (speed>=61 && speed<=70)
				return 300;
			else if (speed>=71 && speed<=80)
				return 400;
			else if (speed>=81 && speed<=90)
				return 500;
			else
				return 600;
		} else if (maxspeed==60) {
			if (speed>=61 && speed<=90) 
				return 100;
			else if (speed>=91 && speed<=110)
				return 300;
			else if (speed>=111 && speed<=120)
				return 400;
			else if (speed>=121 && speed<=130)
				return 500;
			else 
				return 600;
		} else if (maxspeed==70) {
			if (speed>=71 && speed<=100) 
				return 100;
			else if (speed>=101 && speed<=120)
				return 300;
			else if (speed>=121 && speed<=130)
				return 400;
			else if (speed>=131 && speed<=140)
				return 500;
			else
				return 600;
		} else if (maxspeed==80) {
			if (speed>=81 && speed<=110) 
				return 100;
			else if (speed>=111 && speed<=130)
				return 300;
			else if (speed>=131 && speed<=140)
				return 400;
			else if (speed>=141 && speed<=150)
				return 500;
			else
				return 600;
		} else if (maxspeed==90) {
			if (speed>=91 && speed<=120) 
				return 100;
			else if (speed>=121 && speed<=140)
				return 300;
			else if (speed>=141 && speed<=150)
				return 400;
			else if (speed>=151 && speed<=160)
				return 500;
			else
				return 600;
		} else if (maxspeed==100) {
			if (speed>=101 && speed<=130) 
				return 100;
			else if (speed>=131 && speed<=150)
				return 300;
			else if (speed>=151 && speed<=160)
				return 400;
			else if (speed>=161 && speed<=170)
				return 500;
			else
				return 600;
		} else if (maxspeed==110) {
			if (speed>=111 && speed<=140) 
				return 100;
			else if (speed>=141 && speed<=160)
				return 300;
			else if (speed>=161 && speed<=170)
				return 400;
			else if (speed>=171 && speed<=180)
				return 500;
			else
				return 600;
		} else if (maxspeed==120) {
			if (speed>=121 && speed<=150) 
				return 100;
			else if (speed>=151 && speed<=170)
				return 300;
			else if (speed>=171 && speed<=180)
				return 400;
			else if (speed>=181 && speed<=190)
				return 500;
			else return 600;
		}
		return 0;
	}

	public int calculatePoints() {
		if (maxspeed==30) {
			if (speed>=31 && speed<=50) 
				return 0;
			else if (speed>=51 && speed<=60)
				return 2;
			else if (speed>=61 && speed<=70)
				return 4;
			else if (speed>=71)
				return 6;
		} else if (maxspeed==40) {
			if (speed>=41 && speed<=60) 
				return 0;
			else if (speed>=61 && speed<=70)
				return 2;
			else if (speed>=71 && speed<=80)
				return 4;
			else if (speed>=81)
				return 6;
		} else if (maxspeed==60) {
			if (speed>=61 && speed<=90) 
				return 0;
			else if (speed>=91 && speed<=110)
				return 2;
			else if (speed>=111 && speed<=120)
				return 4;
			else if (speed>=121)
				return 6;
		} else if (maxspeed==70) {
			if (speed>=71 && speed<=100) 
				return 0;
			else if (speed>=101 && speed<=120)
				return 2;
			else if (speed>=121 && speed<=130)
				return 4;
			else if (speed>=131)
				return 6;
		} else if (maxspeed==80) {
			if (speed>=81 && speed<=110) 
				return 0;
			else if (speed>=111 && speed<=130)
				return 2;
			else if (speed>=131 && speed<=140)
				return 4;
			else if (speed>=141)
				return 6;
		} else if (maxspeed==90) {
			if (speed>=91 && speed<=120) 
				return 0;
			else if (speed>=121 && speed<=140)
				return 2;
			else if (speed>=141 && speed<=150)
				return 4;
			else if (speed>=151)
				return 6;
		} else if (maxspeed==100) {
			if (speed>=101 && speed<=130) 
				return 0;
			else if (speed>=131 && speed<=150)
				return 2;
			else if (speed>=151 && speed<=160)
				return 4;
			else if (speed>=161)
				return 6;
		} else if (maxspeed==110) {
			if (speed>=111 && speed<=140) 
				return 0;
			else if (speed>=141 && speed<=160)
				return 2;
			else if (speed>=161 && speed<=170)
				return 4;
			else if (speed>=171)
				return 6;
		} else if (maxspeed==120) {
			if (speed>=121 && speed<=150) 
				return 0;
			else if (speed>=151 && speed<=170)
				return 2;
			else if (speed>=171 && speed<=180)
				return 4;
			else if (speed>=181)
				return 6;
		}
		return 0;
	}

	/**
	 * 
	 * @param dni
	 */
	public Sanction createSanctionFor(String dni) {
		// TODO - implement Inquiry.createSanctionFor
		throw new UnsupportedOperationException();
	}

}
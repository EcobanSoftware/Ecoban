package Domain;

import Persistence.*;

/**
 * Iteration 3 - Construction
 */
public class Manager {

	private Manager manager;

	public Manager ManagerHolder() {
		if(manager == null){
			manager = new Manager();
			return manager;
		}else{
			return manager;
		}
	}


	/**
	 * 
	 * @param license
	 * @param speed
	 * @param location
	 * @param maxSpeed
	 */
	public int openInquiry(String license, double speed, String location, double maxSpeed) throws Exception{
		Inquiry inquiry=new Inquiry(license, speed, maxSpeed, location);
		GeneralDao dao=new GeneralDao();
		dao.insertInquiry(inquiry);
		return inquiry.getId();
	}

	public void pay(int idSanction) throws Exception{
		GeneralDao dao=new GeneralDao();
		Sanction sanction = new Sanction();
		sanction.pay();
		dao.updateSanction(sanction);
	}

	/**
	 * 
	 * @param license
	 * @param newDni
	 */
	public void changeOwner(String license, String newDni) throws Exception{
		VehicleDao daoVehicle = new VehicleDao();
		Vehicle vehicle = daoVehicle.findByLicense(license);
		OwnerDAO daoOwner = new OwnerDAO();
		Owner owner = daoOwner.findByDNI(newDni);
		vehicle.setOwner(owner);
		daoVehicle.update(vehicle);
	}

}
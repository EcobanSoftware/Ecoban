package Domain;

import Domain.Manager;

/**
 * Iteration 5 - Construction.
 */
public class RadarManager {

	private static RadarManager radarmanager;
	private boolean working;

	public RadarManager() {
		this.working = false;
	}
	
	public static RadarManager getRadarmanager(){
		if(radarmanager == null){
			radarmanager = new RadarManager();
			return radarmanager;
		}else{
			return radarmanager;
		}
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
		if(working == true){
			simulateWorking();
		}
	}
	
	private void simulateWorking(){
		Manager manager = Manager.ManagerHolder();
		int max_license = 3216;
		while(this.working == true){ // The radar is working
			int license_int = (int) (Math.random() * max_license) + 1;
			String license = Integer.toString(license_int);
			double speed = (int) (Math.random() * 200) + 50;
			String location = "A4, km 186. Valdepeñas.";
			double maxSpeed = 120;
			try {
				manager.openInquiry(license, speed, location, maxSpeed);
			} catch (Exception e) {
				System.out.println("Exception found when executing simulateWorking on RadarManager."
						+ "\n" + e.toString());
			}
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				System.out.println("Exception found in thread.sleep()");
			}
		}
	}



}
package Domain;

public class Driver extends SanctionHolder {

	private int points;

	public Driver() {
		this.points = 12;
	}
	
	/**
	 * 
	 * @param dni
	 * @param name
	 * @param lastName
	 * @param fullAddress
	 */
	public Driver(String dni, String name, String lastName, String fullAddress) {
		super(dni, name, lastName, fullAddress);
	}


	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	

}
package Domain;

/**
 * Iteration 4 - Construction.
 */
public class Vehicle {

	private String license;
	private Owner owner;
	

	/**
	 * 
	 * @param license
	 */
	public Vehicle(String license) {
		this.license = license;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
package domain;

import java.util.Set;

public class Owner {

	private String dni;
	private String name;
	private String lastName;
	private String fullAddress;
	private Set<Inquiry> inquiries;
	
	/**
	 * 
	 * @param dni
	 * @param name
	 * @param lastName
	 * @param fullAddress
	 */
	public Owner(String dni, String name, String lastName, String fullAddress) {
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.fullAddress = fullAddress;
	}
	
	public Owner(String dni){
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public Set<Inquiry> getInquiries() {
		return inquiries;
	}

	public void setInquiries(Set<Inquiry> inquiries) {
		this.inquiries = inquiries;
	}

}
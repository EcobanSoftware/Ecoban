package Domain;

import java.util.Set;

public class Owner extends SanctionHolder {

	public Owner(int id) {
		super(id);
	}
	
	/**
	 * 
	 * @param dni
	 * @param name
	 * @param lastName
	 * @param fullAddress
	 */
	public Owner(String dni, String name, String lastName, String fullAddress) {
		super(dni, name, lastName, fullAddress);
	}

	public Set<Inquiry> getInquiries() {
		// TODO - implement Owner.getInquiries
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param inquiries
	 */
	public void setInquiries(int inquiries) {
		// TODO - implement Owner.setInquiries
		throw new UnsupportedOperationException();
	}

}
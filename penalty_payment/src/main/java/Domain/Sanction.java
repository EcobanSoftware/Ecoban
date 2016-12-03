package Domain;

import java.util.Date;

public class Sanction {

	private int id;
	private double amount;
	private int points;
	private Date dateofReception;
	private Date dateOfPayment;
	private SanctionHolder sanctionHolder;

	public Sanction() {
		this.dateofReception = new Date(System.currentTimeMillis());
	}

	/**
	 * Iteration 3 - Elaboration - Analysis & Design
	 */
	public void pay() {
		this.dateOfPayment = new Date(System.currentTimeMillis());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Date getDateofReception() {
		return dateofReception;
	}

	public void setDateofReception(Date dateofReception) {
		this.dateofReception = dateofReception;
	}

	public Date getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	
	public SanctionHolder getSanctionHolder() {
		return sanctionHolder;
	}

	public void setSanctionHolder(SanctionHolder sanctionHolder) {
		this.sanctionHolder = sanctionHolder;
	}
	

}
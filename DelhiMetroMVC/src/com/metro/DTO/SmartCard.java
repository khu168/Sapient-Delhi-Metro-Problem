package com.metro.DTO;
public class SmartCard {
    long id;
    Traveller traveller;
    double balance;
 // Getters and Setters not shown for brevity
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the traveller
	 */
	public Traveller getTraveller() {
		return traveller;
	}
	/**
	 * @param traveller the traveller to set
	 */
	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
    
    
}
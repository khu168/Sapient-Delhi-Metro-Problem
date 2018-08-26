package com.metro.DTO;
import java.time.LocalDateTime;

import com.metro.fare.FareStrategy;

public class CardTrx {
    long id;
    SmartCard card;
    Station source;
    Station destination;
    int distance;
    LocalDateTime startTime;
    LocalDateTime endTime;
    double balance;
    double fare;
    FareStrategy fareStrategyUsed;
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
	 * @return the card
	 */
	public SmartCard getCard() {
		return card;
	}
	/**
	 * @param card the card to set
	 */
	public void setCard(SmartCard card) {
		this.card = card;
	}
	/**
	 * @return the source
	 */
	public Station getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(Station source) {
		this.source = source;
	}
	/**
	 * @return the destination
	 */
	public Station getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Station destination) {
		this.destination = destination;
	}
	/**
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(int distance) {
		this.distance = distance;
	}
	/**
	 * @return the startTime
	 */
	public LocalDateTime getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public LocalDateTime getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
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
	/**
	 * @return the fare
	 */
	public double getFare() {
		return fare;
	}
	/**
	 * @param fare the fare to set
	 */
	public void setFare(double fare) {
		this.fare = fare;
	}
	/**
	 * @return the fareStrategyUsed
	 */
	public FareStrategy getFareStrategyUsed() {
		return fareStrategyUsed;
	}
	/**
	 * @param fareStrategyUsed the fareStrategyUsed to set
	 */
	public void setFareStrategyUsed(FareStrategy fareStrategyUsed) {
		this.fareStrategyUsed = fareStrategyUsed;
	}
    
}
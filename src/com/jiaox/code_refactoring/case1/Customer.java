package com.jiaox.code_refactoring.case1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客
 * 
 * @author Administrator
 * 
 */
public class Customer {
	private String _name;
	private Vector _rentals = new Vector();

	public Customer(String _name) {
		super();
		this._name = _name;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public Vector get_rentals() {
		return _rentals;
	}

	public void set_rentals(Vector _rentals) {
		this._rentals = _rentals;
	}

	/**
	 * 生成详单
	 * 
	 * @return
	 */
	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for" + get_name() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();
			switch (each.get_movie().get_priceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (each.get_daysRented() > 2) {
					thisAmount += (each.get_daysRented() - 2) * 1.5;
				}
				break;
			case Movie.NEW_RELEASE:
				thisAmount += each.get_daysRented() * 3;
				break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (each.get_daysRented() > 3) {
					thisAmount += (each.get_daysRented() - 3) * 1.5;
					break;
				}
			}
			frequentRenterPoints++;
			if ((each.get_movie().get_priceCode() == Movie.NEW_RELEASE)
					&& each.get_daysRented() > 1)
				frequentRenterPoints++;
			result += "\t" + each.get_movie().get_title() + "\t"
					+ String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		result += "Amount owed is" + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";
		return result;
	}
}

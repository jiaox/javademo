package com.jiaox.code_refactoring.case1;
/**
 * 租客租了一部电影
 * @author Administrator
 *
 */
public class Rental {
	private Movie _movie;
	private int _daysRented;
	public Rental(Movie _movie, int _daysRented) {
		super();
		this._movie = _movie;
		this._daysRented = _daysRented;
	}
	public Movie get_movie() {
		return _movie;
	}
	public void set_movie(Movie _movie) {
		this._movie = _movie;
	}
	public int get_daysRented() {
		return _daysRented;
	}
	public void set_daysRented(int _daysRented) {
		this._daysRented = _daysRented;
	}
	
}

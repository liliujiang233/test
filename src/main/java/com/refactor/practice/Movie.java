package com.refactor.practice;

public class Movie{

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	private String _title;
	private int _priceCode;
	private Strategy strategy;

	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
		if (priceCode == REGULAR) {
			strategy = new RegularMovieStrategy();
		}else if (priceCode == NEW_RELEASE) {
			strategy = new NewMovieStrategy();
		}else {
			strategy = new ChildrenMovieStrategy();
		}
	}

	public String getTitle() {
		return _title;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public void setPriceCode(int _priceCode) {
		this._priceCode = _priceCode;
	}

	public Strategy getStrategy() {
		return strategy;
	}
}

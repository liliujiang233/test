package com.refactor.practice;

public class NewMovieStrategy implements Strategy {
    @Override
    public double getAmount(int dayRented) {
        return dayRented * 3;
    }


    @Override
    public int getRenterPoints(int dayRented) {
        return dayRented > 1 ? 2 : 1;
    }
}

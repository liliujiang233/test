package com.refactor.practice;

public class RegularMovieStrategy implements Strategy {
    @Override
    public double getAmount(int dayRented) {
        double amount = 2;
        if (dayRented > 2) {
            amount += (dayRented - 2) * 1.5;
        }
        return amount;
    }

    @Override
    public int getRenterPoints(int dayRented) {
        return 1;
    }
}

package com.refactor.practice;

public class ChildrenMovieStrategy implements Strategy {
    @Override
    public double getAmount(int dayRented) {
        double amount = 1.5;
        if (dayRented > 3) {
            amount += (dayRented - 3) * 1.5;
        }
        return amount;
    }

    @Override
    public int getRenterPoints(int dayRented) {
        return 1;
    }
}

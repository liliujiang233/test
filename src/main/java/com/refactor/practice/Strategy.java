package com.refactor.practice;

public interface Strategy {
    double getAmount(int dayRented);

    int getRenterPoints(int dayRented);
}

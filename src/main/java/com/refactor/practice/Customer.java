package com.refactor.practice;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals;

    public Customer(String _name, Vector _rentals) {
        this._name = _name;
        this._rentals = _rentals;
    }

    public String getName() {
        return _name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //determine amounts for each line
            double thisAmount = each.getMovie().getStrategy().getAmount(each.getDayRented());

            //add frequent renter points
            frequentRenterPoints += each.getMovie().getStrategy().getRenterPoints(each.getDayRented());

            //show figures for this rental
            result += each.getMovie().getTitle() + ": " + String.valueOf(thisAmount) + "<BR>\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "<P>You owe <EM>" + String.valueOf(totalAmount) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(frequentRenterPoints) + "</EM> frequent renter points<P>";
        return result;
    }
}

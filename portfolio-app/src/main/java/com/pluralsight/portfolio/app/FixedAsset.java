package com.pluralsight.portfolio.app;

abstract public class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getValue(){
        return marketValue;
    }

}

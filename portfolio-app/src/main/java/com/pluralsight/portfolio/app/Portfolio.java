package com.pluralsight.portfolio.app;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable v){
        assets.add(v);
    }

    public double getValue(){
        return 0;
    }
}

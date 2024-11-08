package com.pluralsight.finance;

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
        double sum = 0;
        for(Valuable asset : assets){
            sum += asset.getValue();
        }

        return sum;

    }

    public Valuable getMostValuable(){
        Valuable mostValueAsset = null;
        double highestValue = 0;
        for(Valuable asset : assets){
            if (asset.getValue() > highestValue){
                highestValue = asset.getValue();
                mostValueAsset = asset;
                System.out.println(mostValueAsset);
            }
        }
        return mostValueAsset;
    }

    // make sure this checks a credit card
    public Valuable getLeastValuable(){
        Valuable leastValueAsset = null;
        double lowestValue = Double.MAX_VALUE;
        for(Valuable asset : assets){
            if (asset.getValue() < lowestValue){
                lowestValue = asset.getValue();
                leastValueAsset = asset;
            }
        }
        return leastValueAsset;
    }
}

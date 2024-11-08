package com.pluralsight;

import com.pluralsight.finance.*;

public class FinancialApplication {
    public static void main(String[] args) {
        Portfolio myPortfolio = new Portfolio("assets", "Adrian");
        myPortfolio.add(new Jewelry("ring", 500, 14));
        myPortfolio.add(new Gold("chain", 1000, 14));
        myPortfolio.add(new House("myHouse", 350000, 2004,1500,3));
//        System.out.println(myPortfolio.getMostValuable());
        System.out.println(myPortfolio.getLeastValuable());
    }
}

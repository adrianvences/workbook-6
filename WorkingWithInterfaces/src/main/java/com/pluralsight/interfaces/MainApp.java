package com.pluralsight.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("adrian","Vences",26));
        myFamily.add(new Person("xiomara","Vences",25));
        myFamily.add(new Person("baby","rivera",3));
        myFamily.add(new Person("scotch","rivera",2));

        Collections.sort(myFamily);

        for(Person p : myFamily){
            System.out.println(p);
        }
    }


}

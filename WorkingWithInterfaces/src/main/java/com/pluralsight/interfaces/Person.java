package com.pluralsight.interfaces;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        if( o == null) throw new NullPointerException("Object is null");
        System.out.println("comparing");
        String s1 = o.getLastName();
        String s2 = this.getLastName();
        if (s2.compareToIgnoreCase(s1) == 0){
            return this.getFirstName().compareToIgnoreCase(o.firstName);
        }
        return s2.compareToIgnoreCase(s1);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

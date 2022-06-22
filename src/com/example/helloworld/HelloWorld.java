package com.example.helloworld;

public class HelloWorld {
    /**
     *
     * @param args this is something I'm not using
     */
    public static void main(String[] args) {

        Person a = new Person();
        a.setName("James D");
        System.out.println("First Class A: " + System.lineSeparator() + a);
        Person b = new Person("Jillian");


        System.out.println("First Class B: " + System.lineSeparator() + b);

        Person c = new Person ("Quynh", 48);
        System.out.println("Person C:" + System.lineSeparator() + c);


    }
}

package com.example.helloworld;

public class Person {

    public String getName() {
        return name + " Byrer";
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }

    public static void setCOUNTER(int COUNTER) {
        Person.COUNTER = COUNTER;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name = "default";
    private static int COUNTER;
    private int age = Integer.MIN_VALUE;
    Person(){
        COUNTER ++;
    }
    Person(String newName){
        COUNTER ++;
        name = newName;
    }
    Person(String newName, int newAge){
        COUNTER ++;
        name = newName;
        age = newAge;
    }

    public String toString(){
        String newLine = System.lineSeparator();
        String response;
        response = "Class Type: First Class" + newLine;
        response += "Name:      " + this.getName() + newLine;
        response += "Counter:   " + getCOUNTER() + newLine;
        response += "age:       " + getAge();
        return response;
    }

}

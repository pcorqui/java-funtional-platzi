package com.paul.consumer;

class Persona{
    private int age;
    private String firstName, lastName, record;
    public Persona(int age, String firstName, String lastName){
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getAge(){return age;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getRecord(){return record;}

    public void setRecord(String record){
        this.record = record;
    }
}

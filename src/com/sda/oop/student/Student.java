package com.sda.oop.student;

public class Student {
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public void sayHello(){
        System.out.println("Mam na imie " + this.name + " i mam " + this.age + " lat.");
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

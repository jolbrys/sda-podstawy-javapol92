package com.sda.oop.student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jakub", 27);
        student1.sayHello();

        Student student2 = new Student("Kasia", 35);
        student2.sayHello();

        student1.setAge(38);

        System.out.println(student1.getName() + " ma " + student1.getAge() + " lat." );
    }
}

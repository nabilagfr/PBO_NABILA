/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila30112022;

/**
 *
 * @author User
 */
public class Student extends Person {

    public Student() {
        super("Ali", "Padang");
        super.name = "Ali";
        super.address = "Some address";
        System.out.println("Inside Student:Constructor");
    }

    @Override
    public String getName() {
        System.out.println("Student: getName");
        return name;
    }

    public static void main(String[] args) {
        Student anna = new Student();
        anna.name = "Anna";
        System.out.println(anna.name);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas
 */
public class PersonTest {
    public static void main(String args[])
    {
        Person sumanth = new Person();
        sumanth.name = "Sumanth";
        sumanth.address = "Toronto";
        sumanth.age = 20;
        
        System.out.println("Name : " + sumanth.name + "\n address : " + sumanth.address + "\n age : " + sumanth.age);
        
//        Person Tejas = new Person();
//        Tejas.setName();
//        String nm = Tejas.getName();
//        Tejas.setAddress();
//        String add = Tejas.getAddress();
//        Tejas.setAge();
//        int age = Tejas.getAge();
//        System.out.println("Name : " + nm + "\nAddress : " + add + "\nAge : " + age);
//        Person tej = new Person();
//        tej.setData();
//        System.out.println(tej.toString());
        
        Person navdeep = new Person();
        System.out.println(navdeep.toString());
        
        Person rimpal = new Person("Rimpal","Brampton",20);
        System.out.println(rimpal.toString());
        
        Person rimpal2 = new Person(rimpal);
        System.out.println(rimpal2.toString());
        
    }
}

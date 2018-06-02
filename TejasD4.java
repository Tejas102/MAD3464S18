/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas
 */
public class TejasD4 {
    public static void main(String args[])
    {
        Employee emp1 = new Employee("Tejas","Toronto",23,"E101","12 May 2017",10);
//        emp1.name = "Tejas";
//        emp1.address = "Toronto";
//        emp1.age = 23;
        System.out.println("Name : " + emp1.name + "\nAddress : " + emp1.address + "\nAge : " + emp1.age);
        System.out.println(emp1.toString());
        
    }
}

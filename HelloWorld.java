/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas
 */
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello Java");
        
        int n1 = 10;
        float f1 = 10.5f;
        double d1 = 12.3434344;
        short s1 = 12;
        char c1 = 'a';
        String str1 = "Java";
        boolean b1 = true;
        
        System.out.println("value of n1 is " + n1);
        System.out.println("value of f1 is " + f1);
        System.out.println("value of d1 is " + d1);
        System.out.println("value of s1 is " + s1);
        System.out.println("value of c1 is " + c1);
        System.out.println("value of str1 is " + str1);
        
        n1 *=20; //n1 = n1 * 20
        System.out.println("value of n1 is " + n1);
        
        n1++; // n1 = n1 + 1
        System.out.println("value of n1 is " + n1);
        
        ++n1; // n1 = 202
        System.out.println("value of n1 is " + n1);
        
        n1--; // n1 = n1 - 1 n1 = 201
        System.out.println("value of n1 is " + n1);
        
        int n2 = n1++;
        System.out.println("value of n2 is " + n2);
        System.out.println("value of n1 is " + n1);
        
        System.out.println("value of n1 is " + (n1 + 10));
        
        c1 = 'A';
        // A-Z 65-97
        System.out.println("value of c1 is " + c1);
        System.out.println("value of c1 is " + (char)(c1 + 10));
        System.out.println("value of c1 is " + ++c1);
        System.out.println("value of c1 is " + c1++);
       
    }
}

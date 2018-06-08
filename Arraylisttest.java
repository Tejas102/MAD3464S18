
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Arraylisttest {
    public static void main(String args[])
    {
        ArrayList<String> productsName = new ArrayList<String>();
        productsName.add("Projector");
        productsName.add("Excel");
        productsName.add("Contigo");
        productsName.add("Apple");
        
        productsName.add(2,"Oracle");
        
        for(String Tejas : productsName)
        {
            System.out.println(Tejas);
        }
        System.out.println("=======");
        if (productsName.contains("Oracle"))
        {
        productsName.remove("Oracle");
        }
        else
        {
            System.err.println("Buy Oracle first");
        }
        for(String Tejas : productsName)
        {
            System.out.println(Tejas);
        }
        Collections.sort(productsName);
        System.out.println("=======");
        
        for(String Tejas : productsName)
        {
            System.out.println(Tejas);
    }
        ArrayList<Books> library = new ArrayList<Books> ();
        Books book1 = new Books(101, "The sky is falling", 9);
        Books book2 = new Books(102, "Pride and prejudice", 5);
        Books book3 = new Books(103, "The Monk", 3);
        Books book4 = new Books(105, "Courage", 2);
        
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        
        for(Books bk : library)
        {
            bk.displayInfo();
        }
        System.out.println("No. of Books in library : " + library.size());
        
        if(library.contains(book2))
        {
            library.remove(book2);
        }
        System.out.println("No. of books in library : " + library.size());
        
        library.add(2, new Books(120,"Pearls",11));
        for(Books bk : library)
        {
            bk.displayInfo();
        }
        Collections.sort(library, new bookTitleComparator());
        for(Books bk : library)
        {
            bk.displayInfo();
        }
        Collections.sort(library, new bookRatingComparator());
        for(Books bk : library)
        {
            bk.displayInfo();
        }
        
}
}

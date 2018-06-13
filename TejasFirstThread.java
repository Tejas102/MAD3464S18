/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class TejasFirstThread extends Thread {
    TejasFirstThread()
    {
        super("First thread");
        System.out.println("First thread created");
        start();
    }
    public void run()
    {
        try{
        for(int i=1; i<=3; i++)
        {
            System.out.println("First Thread : " + i);
            Thread.sleep(1000);
        }
    }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Exiting from First thread");
        }
    }
}

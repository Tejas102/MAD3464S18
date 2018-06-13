/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class TejasMultithreading {
    public static void main(String[] args)
    {
        Thread t1 = Thread.currentThread();
        System.out.println(" current thread : " + t1);
        t1.setName(" Test Thread ");
        t1.setPriority(10);
        System.out.println("State of thread t1 : " + t1.getState());
        System.out.println(" Thread info after modification : " + t1);
        System.out.println("Alive or Dead : " + t1.isAlive());
        System.out.println("Daemon or non-daemon : " + t1.isDaemon());
        System.out.println("Inrerrupted or not : " + t1.isInterrupted());
        
        try{
        for(int i=1; i<=3; i++)
        {
            System.out.println("Main Thread : " + i);
            new TejasFirstThread();
            new TejasSecondThread("Second cup");
            new TejasSecondThread("Second Inning");
            Thread.sleep(6000);
        }
    }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Exiting from Main thread");
        }
}
}
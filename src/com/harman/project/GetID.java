package com.harman.project;

class Loop extends Thread

{
    public void run()

    {

        try
        {
            System.out.println("Thread Executed " + Thread.currentThread().getId());  // Also use getName() in that !!!
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}


public class GetID

{

    public static void main(String[] args)
    {

        for(int i = 0; i <= 10; i++)  // It prints the "n" number of times in that for the looping but, in different ID numbers in every execution!!!

        {
            Loop l_obj = new Loop();
            l_obj.start();
        }
    }

}

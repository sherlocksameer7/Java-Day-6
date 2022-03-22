package com.harman.project;

class Programs extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Thread Executed !!! ");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}


public class Multithread
{

    public static void main(String[] args)
    {

        Programs p_obj = new Programs();
        p_obj.start();

        Programs p_obj_2 = new Programs();          // We have to give a new object and print another time with the same process again and again
        p_obj_2.start();                            // This is called Multi threading !!!
    }
}

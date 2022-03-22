package com.harman.project;

class RunnableThread implements Runnable
{
    @Override   // Our Wish !!!

    public void run()
    {
        System.out.println("Thread Executed !!! ");
    }


    public static void main(String[] args)
    {

        RunnableThread Run_obj = new RunnableThread();
        Thread Thr_obj = new Thread(Run_obj);  // We have to run the Runnable using the Thread inside the Runnable create an Object!!!


        Thr_obj.start(); // With the thread object we have to Start the execution !!!

    }

}

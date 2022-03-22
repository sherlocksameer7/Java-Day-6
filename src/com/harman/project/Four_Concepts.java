package com.harman.project;

import java.util.Scanner;

class Check_Div_by_8 extends Thread
{
    int x;

    public Check_Div_by_8(int x)
    {
        this.x = x;
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Check the number is Divisible by 8 or Not: ");
            if(x%8 == 0)
            {
                System.out.println("It is divisible by 8 ");
            }
            else
            {
                System.out.println("It is not divisible by 8 ");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}



class Check_even_or_odd extends Thread
{
    int x;

    public Check_even_or_odd(int x) {
        this.x = x;
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Check the number is Even or Odd: ");
            if(x%2 == 0)
            {
                System.out.println("The given number is EVEN ");
            }
            else
            {
                System.out.println("The given number is ODD ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}




class Print_Prime extends Thread {

    @Override
    public void run()
    {

        int min = 2;
        int max = 500;

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }

        }

    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}




class Check_prime extends Thread {
        int x;

        public Check_prime(int x) {
            this.x = x;
        }

        @Override
        public void run() {
            int temp;
            boolean isPrime = true;
            for (int i = 2; i <= x / 2; i++) {
                temp = x % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(x + " is a prime number ");
            else
                System.out.println(x + " not a prime number ");
        }

    }



    public class Four_Concepts {

        public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            int a;
            System.out.println("Enter a Number to do an Operation: ");
            a = inp.nextInt();

            Check_Div_by_8 div_obj = new Check_Div_by_8(a);
            Check_even_or_odd even_obj = new Check_even_or_odd(a);
            Print_Prime print_obj = new Print_Prime();
            Check_prime prime_obj = new Check_prime(a);

            div_obj.start();
            even_obj.start();
            print_obj.start();
            prime_obj.start();


        }

    }

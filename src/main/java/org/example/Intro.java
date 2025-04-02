package org.example;

import java.util.Random;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {

        int a = 3;
        System.out.println(a);
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
       int b = sc.nextInt();
        System.out.println(b);

        //if statement
        //switch
        //etc

        //loop
        for(int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        int[] array = new int[]{1, 3, 4, 7, 9};
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String [] months = new String[] {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Sept",
                "Oct",
                "Nov",
                "Dec"
        };
        for(int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        for(int i = months.length -1 ; i > 0; i--) {
            System.out.println(months[i]);
        }

        //do while
//        Random rand = new Random();
//        int n = rand.nextInt() % 100;

//        Scanner sc1 = new Scanner(System.in);
//        int guess = sc1.nextInt();
//
//        if(guess == n ){
//            System.out.println("You guessed correctly!");
//        }else {
//            if( guess > n ){
//                System.out.println("less");
//            }else{
//                System.out.println("greater");
//            }
//        }

        int star = 5;
        for(int i = 1 ; i <= star ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");



            
        }


    }



}

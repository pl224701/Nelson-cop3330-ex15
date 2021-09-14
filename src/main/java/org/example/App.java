
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the password? ");
        String str = sc.nextLine();
        if(str.equals("abc$123"))
            System.out.print("Welcome!");
        else
            System.out.print("I don't know you");
    }
}

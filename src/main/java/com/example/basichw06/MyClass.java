package com.example.basichw06;


import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int CLY=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Year of the West");
        CLY = scanner.nextInt();
        if(CLY%4!=0)
            System.out.print("leap year?  no");
        else if(CLY%100!=0)
            System.out.print("leap year?  yes");
        else if(CLY%400!=0)
            System.out.print("leap year?  no");
        else
            System.out.print("leap year?  yes");
    }

}
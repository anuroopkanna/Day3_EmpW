package com.blEmpW;

import java.util.Random;
import java.util.Scanner;

public class EmpDataWages {
    public static void main(String[] args) {
        System.out.println("Welcome to Bridgelabz EmpDataWages");
        int empPresent;
        System.out.println("Enter the values 0 or 1");
        Scanner sc=new Scanner(System.in);
         empPresent = sc.nextInt();
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck == empPresent){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is absent");
        }



    }
}

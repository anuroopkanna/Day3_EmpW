package com.blEmpW;

import java.util.Random;
import java.util.Scanner;

public class EmpDataWages {
    public static void main(String[] args) {
        System.out.println("Welcome to Bridgelabz EmpDataWages");
        int emp_FullTime=1;
        int emp_PartTime=2;
        int emp_WagePerHour=20;
        int empHrs,empWage;
       // Scanner sc=new Scanner(System.in);
      //  System.out.println("Enter the values 2 or 1");
        //int emp=sc.nextInt();
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck==emp_FullTime){
            System.out.println("Employee is FullTime Job Holder.");
            empHrs=8;
        } else if (empCheck==emp_PartTime) {
            System.out.println("Employee is PartTime Job Holder.");
            empHrs=4;
        }else {
        System.out.println("Employee is absent");
            empHrs=0;
        }
        empWage=empHrs*emp_WagePerHour;
        System.out.println("Emp Hours: " +empHrs);
        System.out.println("Emp Wages: "+empWage);



    }
}

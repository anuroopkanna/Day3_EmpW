package com.blEmpW;

import java.util.Random;
import java.util.Scanner;

public class EmpDataWages {


        private static final int emp_FullTime=1;
        private  static final int emp_PartTime=2;

        private static final int emp_WagePerHour=20;
    public static void main(String[] args) {
        int empHrs,empWage;
       // Scanner sc=new Scanner(System.in);
      //  System.out.println("Enter the values 2 or 1");
        //int emp=sc.nextInt();
        int  empType  =(int) Math.floor(Math.random()*10)%3;
        System.out.println("Welcome to Bridgelabz EmpDataWages");
        switch (empType){
            case emp_FullTime:
            System.out.println("Employee is FullTime Job Holder.");
            empHrs=8;
            break;
        case emp_PartTime:
            System.out.println("Employee is PartTime Job Holder.");
            empHrs=4;
            break;
            default:
        System.out.println("Employee is absent");
            empHrs=0;
            break;
        }
        empWage=empHrs*emp_WagePerHour;
        System.out.println("Emp Hours: " +empHrs);
        System.out.println("Emp Wages: "+empWage);
    }
}

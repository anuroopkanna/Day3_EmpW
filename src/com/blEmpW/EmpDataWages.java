package com.blEmpW;

import java.util.Random;
import java.util.Scanner;

public class EmpDataWages {
    public static void main(String[] args) {
        System.out.println("Welcome to Bridgelabz EmpDataWages");
        int emp_Present =1;
        int emp_WagePerHour=20;
        int empHrs,empWage;
        System.out.println("Enter the values 0 or 1");
        Scanner sc=new Scanner(System.in);
         emp_Present = sc.nextInt();
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck == emp_Present){
            System.out.println("Employee is present");
            empHrs=8;
        }else {
            System.out.println("Employee is absent");
            empHrs=0;
        }
        empWage=empHrs*emp_WagePerHour;
        System.out.println("Emp Hours: " +empHrs);
        System.out.println("Emp Wages: "+empWage);



    }
}

package com.blEmpW;

import java.util.Random;
import java.util.Scanner;

public class EmpDataWages {


        private static final int emp_FullTime=1;
        private  static final int emp_PartTime=2;
        private static final int emp_WagePerHour=20;
        private static final int emp_WorkingDaysperMonth=20;
    public static void main(String[] args) {
        System.out.println("Emp Working Days Per Month");
        int empHrs=0,empWagePerDay=0,empWagePerMonth=0;
        int  empType  =(int) Math.floor(Math.random()*10)%3;
        System.out.println("Switch case starts");
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
        empWagePerDay=empHrs*emp_WagePerHour;
        empWagePerMonth= empHrs*empWagePerDay;
        System.out.println("Emp Hours: " +empHrs);
        System.out.println("Emp WagePerDay: "+empWagePerDay);
        System.out.println("Emp WagesPerMonth: " +empWagePerMonth);
    }
}

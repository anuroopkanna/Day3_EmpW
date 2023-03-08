package com.blEmpW;

import java.util.Random;
import java.util.Scanner;

public class EmpDataWages {
        private static final int emp_FullTime=1;
        private  static final int emp_PartTime=2;
        private static final int emp_WagePerHour=20;
        private static final int emp_WorkingDaysPerMonth=20;
        private static final int emp_TotalWorkingHrs=100;
    public static void main(String[] args) {
        int empHrs=0;
        int empWagePerMonth=0;
        int empTotalHrs=0;
        int empTotalWorkingDays=0;
        while (empTotalHrs<=emp_TotalWorkingHrs && empTotalWorkingDays<emp_WorkingDaysPerMonth) {
            empTotalWorkingDays++;
        }
            int empType = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("Switch case starts");
            switch (empType) {
                case emp_FullTime:
                    System.out.println("Employee is FullTime Job Holder.");
                    empHrs = 8;
                    break;
                case emp_PartTime:
                    System.out.println("Employee is PartTime Job Holder.");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHrs = 0;
                    break;
            }
        empTotalHrs = emp_WorkingDaysPerMonth+empHrs;
       int empWagePerDay = empHrs*empTotalHrs;
        empWagePerMonth = empHrs*empWagePerDay;
        System.out.println("Emp WagePerDay: "+empWagePerDay);
        System.out.println("Emp WagesPerMonth: " +empWagePerMonth);
    }
}

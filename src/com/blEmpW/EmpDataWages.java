package com.blEmpW;


import java.util.Scanner;

public class EmpDataWages {
    //class constants
  public static final int emp_FullTime=1;
    public   static final int emp_PartTime=2;
    public static int emp_WagePerHour,emp_WorkingDaysPerMonth,emp_TotalWorkingHrs;
    public void EmpWageBuilder1(){
        emp_WagePerHour=400;
        emp_WorkingDaysPerMonth=25;
        emp_TotalWorkingHrs=100;
        System.out.println("Total company wage:" +(emp_WagePerHour*emp_TotalWorkingHrs));
    }
    public void EmpWageBuilder2(){
        emp_WagePerHour=200;
        emp_WorkingDaysPerMonth=22;
        emp_TotalWorkingHrs=110;
        System.out.println("Total company wage:" +(emp_WagePerHour*emp_TotalWorkingHrs));
    }
    public void EmpWageBuilder3(){
        emp_WagePerHour=600;
        emp_WorkingDaysPerMonth=24;
        emp_WorkingDaysPerMonth=150;
        System.out.println("Total company wage:" +(emp_WagePerHour*emp_TotalWorkingHrs));
    }





    public void CalulateTotalWages() {
        int empTotalHrs=0;
        int emp_WagePerDay;
        int emp_TotalWorkingDays=0;
        int empWagePerMonth=0;
        empTotalHrs=0;
        int totalWage;
        int empHrs=0;
       while (empTotalHrs <=emp_TotalWorkingHrs && emp_TotalWorkingDays< emp_WorkingDaysPerMonth) {
           emp_TotalWorkingDays++;
           int empType = (int) (Math.floor(Math.random() * 10) % 3);
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
       }
          empTotalHrs+= empHrs;
        emp_WagePerDay = empHrs * emp_WagePerHour;
       empWagePerMonth+=emp_WagePerDay;
          System.out.println("Emp wage per day:" +emp_WagePerDay);
        //TotalEmpWage = emp_WorkingDaysPerMonth * empWagePerDay;
       // System.out.println("Emp WagePerDay: " + empWagePerDay);
        System.out.println("Emp WagesPerMonth: " + empWagePerMonth);
        totalWage=empWagePerMonth*12;
          System.out.println("ToTal of the employee per yr:" +totalWage);
       /*System.out.println("Total Working Hours for " + company + " company " + empHrs + " And total working Hours " + emp_WorkingDaysPerMonth);
        System.out.println("total Working days " + empTotalWorkingDays + " working hours " + empTotalHrs + " Wage Per Day is: " +empWagePerDay);
        System.out.println();
        System.out.println("Total wages of :" + company+ " company is "+ empWagePerMonth);*/
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Employee Wages: ");
        System.out.println();
        System.out.println("Enter the company name: \n 1.TCS\n 2.Tesla\n 3.Tata");
        int company =in.nextInt();
        EmpDataWages emp=new EmpDataWages();
        switch (company){
            case 1:
                emp.EmpWageBuilder1();
                emp.CalulateTotalWages();
                break;
            case 2:
                emp.EmpWageBuilder2();
                emp.CalulateTotalWages();
                break;
            case 3:
                emp.EmpWageBuilder3();
                emp.CalulateTotalWages();
                break;
            default:
                System.out.println("Enter valid company name");
                break;
        }
      /* EmpDataWages Tesla =new EmpDataWages("Tesla",20,4,10);
        EmpDataWages Microsoft  = new EmpDataWages("Microsoft",40,5,20);
        EmpDataWages Tata = new EmpDataWages("Tata",45,6,20);
         Tesla.CalulateTotalWages();
        System.out.println(Tesla);
        System.out.println();
        Microsoft.CalulateTotalWages();
        System.out.println(Microsoft);
        System.out.println();
        Tata.CalulateTotalWages();
        System.out.println(Tata);
        System.out.println();*/
    }
}

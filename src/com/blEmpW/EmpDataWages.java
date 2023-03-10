package com.blEmpW;

public class EmpDataWages {


  /*      private static final int emp_FullTime=1;
        private  static final int emp_PartTime=2;
        private static final int emp_WagePerHour=20;
        private static final int emp_WorkingDaysPerMonth=20;
        private static final int emp_TotalWorkingHrs=100;*/
    public static void CalulateTotalWages(String CompanyName,int emp_WagePerHour,int emp_TotalWorkingHrs,int emp_WorkingDaysPerMonth) {
        System.out.println("Welcome to the Employee Wages: ");
        final int emp_FullTime=1;
        final int emp_PartTime=2;
        int empHrs=0;
        int empWagePerMonth = 20;
        int empTotalHrs = 0;
        int empTotalWorkingDays = 0;
        System.out.println("Details of "+CompanyName+"employee");
        System.out.println("emp_WagePerHour "+emp_WagePerHour);
        System.out.println("Total working days "+empTotalWorkingDays);
        System.out.println("Total working hours "+empTotalHrs);
        while (empTotalHrs < emp_TotalWorkingHrs && empTotalWorkingDays < emp_WorkingDaysPerMonth) {
            empTotalWorkingDays++;
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
                empHrs=0;
                break;

        }
            empTotalHrs = emp_WagePerHour + empHrs;
    }
        int empWagePerDay = empHrs * empTotalHrs;
        empWagePerMonth = emp_WorkingDaysPerMonth * empWagePerDay;
        System.out.println("Emp WagePerDay: " + empWagePerDay);
        System.out.println("Emp WagesPerMonth: " + empWagePerMonth);
    }

    public static void main(String[] args) {
       EmpDataWages e =new EmpDataWages();
        //e.CalulateTotalWages();
        e.CalulateTotalWages("Tesla",80,15,400);
        e.CalulateTotalWages("TCS",100,10,1000);
        e.CalulateTotalWages("Infosys",90,8,900);
    }
}

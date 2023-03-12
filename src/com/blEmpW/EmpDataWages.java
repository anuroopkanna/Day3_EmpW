package com.blEmpW;

public class EmpDataWages {
   private static final int emp_FullTime=1;
    private  static final int emp_PartTime=2;
    private final String company;
    private final int emp_WagePerHour;
    private final int emp_TotalWorkingHrs;
    private final int emp_WorkingDaysPerMonth;

    //instance variables
    int getEmpWagePerMonth;


  public EmpDataWages(String company, int emp_WagePerHour, int emp_TotalWorkingHrs, int emp_WorkingDaysPerMonth){
      this.company=company;
      this.emp_WagePerHour= emp_WagePerHour;
      this.emp_TotalWorkingHrs= emp_TotalWorkingHrs;
      this.emp_WorkingDaysPerMonth= emp_WorkingDaysPerMonth;

  }

   /* public String getCompany() {
        return company;
    }*/

    public void CalulateTotalWages() {
        System.out.println("Welcome to the Employee Wages: ");

        int empHrs=0;
        int empWagePerMonth = 0;
        int empTotalHrs = 0;
        int empTotalWorkingDays = 0;
        System.out.println("Details of " +company+ " employee");
        System.out.println("emp_WagePerHour "+emp_WagePerHour);
        System.out.println("Total working days "+emp_WorkingDaysPerMonth);
        System.out.println("Total working hours "+emp_TotalWorkingHrs);
        System.out.println("Total wage per month" + getEmpWagePerMonth);
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
        getEmpWagePerMonth= emp_WorkingDaysPerMonth * empWagePerDay;
       // System.out.println("Emp WagePerDay: " + empWagePerDay);
        System.out.println("Emp WagesPerMonth: " + getEmpWagePerMonth);
      /*  System.out.println("Total Working Hours for " + company + " company " + empHrs + " And total working Hours " + emp_WorkingDaysPerMonth);
        System.out.println("total Working days " + empTotalWorkingDays + " working hours " + empTotalHrs + " Wage Per Day is: " +empWagePerDay);
        System.out.println();
        System.out.println("Total wages of :" + company+ " company is "+ empWagePerMonth);*/
    }

    public String toString() {
        System.out.println("Details of " + company + "Employee");
        System.out.println("--------");
        System.out.println("Wage per hour:" + emp_WagePerHour);
        System.out.println("total working days:" + emp_WorkingDaysPerMonth);
        System.out.println("Max workinghours:" + emp_TotalWorkingHrs);
       // System.out.println("Total wages per month emp:" +);

        return "Total wage for month of " + company + " employee is " +getEmpWagePerMonth+"\n";
    }

    public static void main(String[] args) {
       EmpDataWages Tesla =new EmpDataWages("Tesla",20,4,10);
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
        System.out.println();
    }
}

package com.blEmpW;

public class EmpDataWages {
   public static final int emp_FullTime=1;
    public   static final int emp_PartTime=2;

    private final String company;
    private final int emp_WagePerHour;
    private final int emp_TotalWorkingHrs;
    private final int emp_WorkingDaysPerMonth;
    int sal,id,total_sal;
    String name;
    private void sal(int sal){
        total_sal=sal*12;
    }
  public EmpDataWages(String company, int emp_WagePerHour, int emp_TotalWorkingHrs, int emp_WorkingDaysPerMonth){
      this.company=company;
      this.emp_WagePerHour= emp_WagePerHour;
      this.emp_TotalWorkingHrs= emp_TotalWorkingHrs;
      this.emp_WorkingDaysPerMonth= emp_WorkingDaysPerMonth;

  }

    public void CalulateTotalWages() {
        System.out.println("Welcome to the Employee Wages: ");

        int empHrs=0;
        int empWagePerMonth = 0;
        int empTotalHrs = 0;
        int empTotalWorkingDays = 0;
        System.out.println("Details of " +company+ " employee");
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
       // System.out.println("Emp WagePerDay: " + empWagePerDay);
        //System.out.println("Emp WagesPerMonth: " + empWagePerMonth);
        System.out.println("Total Working Hours for " + company + " company " + empHrs + " And total working Hours " + emp_WorkingDaysPerMonth);
        System.out.println("total Working days " + empTotalWorkingDays + " working hours " + empTotalHrs + " Wage Per Day is: " +empWagePerDay);
        System.out.println();
        System.out.println("Total wages of :" + company+ " company is "+ empWagePerMonth);
    }

    public String toString(){
      return super.toString();
    }
    public void display(){
        System.out.println("Name of the employee:" +name);
        System.out.println("Total sal of the employee: " +total_sal);
        System.out.println("Id of the employee: " +id);
    }


    public static void main(String[] args) {
       EmpDataWages e =new EmpDataWages("Tesla",20,4,10);

        EmpDataWages e1  = new EmpDataWages("Infosys",40,5,20);
        EmpDataWages e2 = new EmpDataWages("Tata",45,6,20);
         e.CalulateTotalWages();
        System.out.println(e);
        System.out.println();
        e1.CalulateTotalWages();
        System.out.println(e1);
        System.out.println();
        e2.CalulateTotalWages();
        System.out.println(e2);
        System.out.println();
    }
}

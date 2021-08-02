package day38_CostumeClass;

public class Employee {

    public String employeeName;
    public char gender;
    public int  sSN;
    public int  employeeID;
    public String jobTitle;
    public double salary;

    public void setInfo(String employeeName,char gender,int  sSN,int  employeeID,String jobTitle,double salary){
       this.employeeName = employeeName;
       this.gender = gender;
       this.employeeID = employeeID;
       this.jobTitle = jobTitle;
       this.salary = salary;
    }
    public String toString() {
        return "Employee{" +
                "name='" + employeeName + '\'' +
                ", gender=" + gender +
                ", ID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }






}
/*
Employees:
    Attributes:
        employeeName, gender, SSN, employeeID, JobTitle, Salary

    Actions:
        attendMeeting, Workoing, getInfo, SetInfo

    ArrayList of employees:
        1. remove all the employtees who are makeing lass than 100K
        2. remove all the QAs

 */
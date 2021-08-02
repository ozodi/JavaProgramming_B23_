package day38_CostumeClass;

public class Employees {

    public String employeeName;
    public String gender;
    public int  sSN;
    public int  employeeID;
    public String JobTitle;
    public int Salary;

    public void attendMeeting(String employeeName){
        System.out.println(employeeName+" Attended the meeting");
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
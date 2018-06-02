/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas
 */
public class Employee extends Person {
    String eID;
    String joiningDate;
    int deptNo;
    
    Employee()
    {
        this.eID = "E000";
        this.joiningDate = "DD MM YY";
        this.deptNo = 0;
    }
    Employee(String name, String address, int age, String eID, String joiningDate, int deptNo)
    {
        super(name, address, age);
        this.eID = eID;
        this.joiningDate = joiningDate;
        this.deptNo = deptNo;
    }
    @Override
    public String toString()
    {
        String personalDetails = super.toString();
        String data = "Employee ID : " + eID + "\n Joining Date : " + this.joiningDate + "\n Dept No : " + this.deptNo;
        return data;
    }
}

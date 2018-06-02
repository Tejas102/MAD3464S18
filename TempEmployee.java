/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas
 */
public class TempEmployee extends Employee {
    String designation;
    float hourlyRate;
    
    public TempEmployee()
    {
        this.designation = "Unknown";
        this.hourlyRate = 0.0f;
    }
    public TempEmployee(String name, String address, int age, String eID, String joiningDate, int deptNo, String designation, float hourlyRate)
    {
        super(name, address, age, eID, joiningDate, deptNo);
        this.designation = designation;
        this.hourlyRate = hourlyRate;
    }
    public String toString()
    {
        return (super.toString() + "\nDesignation : " + this.designation + "\nHourly Rate : " + this.hourlyRate);
    }
}

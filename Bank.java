/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas
 */
public class Bank {
    String Bankname;
    String BankID;
    
    Bank()
    {
        this.Bankname = "Unknown";
        this.BankID = "I#####";
    }
    Bank(String Bankname,String Bankid)
    {
        this.Bankname = Bankname;
        this.BankID = Bankid;
    }
    void setBankname()
    {
        System.out.println("Bank Name : " + Bankname);
    }
    String getBankname()
    {
        return Bankname;
    }
    void setBankid()
    {
        System.out.println("Bank ID : " + BankID);
    }
    String getBankid()
    {
        return BankID;
    }
    public String toString()
    {
        String data = "BankName : " + Bankname + "\n Bankid :" + BankID;
        return data;
    }
    
}

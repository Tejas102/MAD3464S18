/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas
 */
public class BankAccount extends Bank {
    String AccountNo;
    String OwnerName;
    String BalanceAmount;
    
    BankAccount()
    {
        super();
        this.AccountNo = "AC#########";
        this.BalanceAmount = "B000000";
        this.OwnerName = "Unknown";
    }
    BankAccount(String Bankname, String BankID, String AccountNo, String OwnerName, String BalanceAmount)
    {
        super(Bankname, BankID);
        this.AccountNo = AccountNo;
        this.BalanceAmount = BalanceAmount;
        this.OwnerName = OwnerName;
    }
    @Override
    public String toString()
    {
        String personalDetails = super.toString();
        String data = "\n AccountNo : " + this.AccountNo + "\n OwnerName : " + this.OwnerName + "\n BalanceAmount : " + this.BalanceAmount;
        return personalDetails + data;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas
 */
public class OverDraftAccount extends BankAccount {
    double OverDraftlimits;
    
    OverDraftAccount()
    {
        super();
        this.OverDraftlimits = 0;
    }
    OverDraftAccount(String AccountNo, String OwnerName, double BalanceAmount, double DraftLimit)
    {
        super(Bankname, BankID, OwnerName, AccountNo, BalanceAmount);
        this.OverDraftlimits = OverDraftLimits;
    }
    void withdraw(int balance)
    {
        String money = "withdraw money";
        if(balance<=balance)
        {
            BalanceAmount + = balance money + = ("withdraw money" + OverDraftLimits);
        }
        if(balance<=BalanceAmount)
        {
            BalanceAmount = BalanceAmount - balance;
            System.out.println("withdraw money - " = balance);
        }
    }
    
}

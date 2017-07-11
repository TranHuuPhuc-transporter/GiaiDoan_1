package com.example.huuphuc.demomvp.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuuPhuc on 11/07/2017.
 */

public class Accounts {
    private List<Account> lsAccount;
    private int size=10;
    public Accounts(int _size)
    {
        size=_size;
        lsAccount=new ArrayList<>(size);
        for(int i=0;i<10;i++)
        {
            Account ac=new Account("Account"+i,"111111");
            lsAccount.add(ac);
        }
    }

    public boolean CheckAccount(Account account)
    {
        for (Account ac:lsAccount) {
            if(ac.getUsername().equals(account.getUsername())&& ac.getPassword().equals(account.getPassword()))
                return true;
        }
        return false;
    }
}

package com.example.huuphuc.demomvp.Controlers;

import com.example.huuphuc.demomvp.Models.Account;
import com.example.huuphuc.demomvp.Models.Accounts;
import com.example.huuphuc.demomvp.Views.DangNhapImpl;

/**
 * Created by HuuPhuc on 11/07/2017.
 */

public class XuLyDangNhap {
    private DangNhapImpl dangNhap;
    Accounts accounts;
    public XuLyDangNhap(DangNhapImpl _dangNhap)
    {
        dangNhap=_dangNhap;
        accounts=new Accounts(10);
    }

    public void KiemTraDangNhap(Account account)
    {
        if(accounts.CheckAccount(account)==true)
            dangNhap.DangNhapThanhCong();
        else dangNhap.DangNhapThatBai();
    }
}

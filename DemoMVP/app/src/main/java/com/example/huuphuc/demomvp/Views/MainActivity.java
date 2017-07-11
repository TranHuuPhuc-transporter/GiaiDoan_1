package com.example.huuphuc.demomvp.Views;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.afollestad.materialdialogs.MaterialDialog;
import com.example.huuphuc.demomvp.Controlers.XuLyDangNhap;
import com.example.huuphuc.demomvp.Models.Account;
import com.example.huuphuc.demomvp.R;
import com.rengwuxian.materialedittext.MaterialEditText;

public class MainActivity extends AppCompatActivity implements DangNhapImpl, View.OnClickListener {

    MaterialEditText txtUserName,txtPassword;
    Button btnLogin,btnCancel;
    MaterialDialog materialDialog;
    XuLyDangNhap xuLyDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    void init()
    {
        txtUserName= (MaterialEditText) findViewById(R.id.txtUserName);
        txtPassword= (MaterialEditText) findViewById(R.id.txtPassword);
        btnLogin= (Button) findViewById(R.id.btnDangNhap);
        btnCancel= (Button) findViewById(R.id.btnCancel);

        xuLyDangNhap=new XuLyDangNhap(this);

        btnLogin.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void DangNhapThanhCong() {
        materialDialog =new MaterialDialog.Builder(this)
                .title("Check account")
                .content("Login Success")
                .positiveText("Ok")
                .show();
    }

    @Override
    public void DangNhapThatBai() {
        materialDialog =new MaterialDialog.Builder(this)
                .title("Check account")
                .content("Login fail")
                .positiveText("Ok")
                .show();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnDangNhap)
        {
            Account ac=new Account(txtUserName.getText().toString(),txtPassword.getText().toString());
            xuLyDangNhap.KiemTraDangNhap(ac);
        }
        else {
            txtUserName.setText("");
            txtPassword.setText("");
        }
    }
}

package com.example.mvp_3.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvp_3.R;
import com.example.mvp_3.base.BaseActivity;
import com.example.mvp_3.contract.MainContract;
import com.example.mvp_3.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IMainVieww {

    private EditText name;
    private EditText pwd;
    private MainPresenter presenter;


    @Override
    protected void initData() {
        presenter = new MainPresenter(this);
    }

    @Override
    protected void initView() {
        name = findViewById(R.id.et_name);
        pwd = findViewById(R.id.et_pwd);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter(this);
    }

    public void LoginButton(View view) {
        if (!TextUtils.isEmpty(getUserNmae()) && !TextUtils.isEmpty(getPassword())){
            presenter.login(getUserNmae(),getPassword());
            Toast.makeText(this, "登陆成功！！！", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public String getUserNmae() {
        return name.getText().toString();
    }

    @Override
    public String getPassword() {
        return pwd.getText().toString();
    }

    @Override
    public void getLoginData(String string) {

    }
}
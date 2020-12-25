package com.wf.ds.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.wf.ds.R;
import com.wf.ds.base.BaseActivity;
import com.wf.ds.contract.MainContract;
import com.wf.ds.presenter.MainPresenterImpl;

public class LoginActivity extends BaseActivity<MainPresenterImpl> implements MainContract.IMainView {

    private EditText editTextTextPersonName;
    private EditText editTextTextPassword;

    @Override
    protected void initData() {
        presenter.login(getUserName(),getPassword());
    }

    @Override
    protected void initView() {
        editTextTextPersonName.findViewById(R.id.editTextTextPersonName);
        editTextTextPassword.findViewById(R.id.editTextTextPassword);
    }

    @Override
    protected int getLayoutID() { return R.layout.activity_main; }

    @Override
    public MainPresenterImpl getPresenter() {
        return new MainPresenterImpl(this);
    }

    /**
     * 登录按钮
     * @param view
     */
    public void loginButton(View view) {
        if(!TextUtils.isEmpty(getUserName()) && !TextUtils.isEmpty(getPassword())){

            presenter.login(getUserName(),getPassword());

        }
    }


    @Override
    public String getUserName() {
        return editTextTextPersonName.getText().toString();
    }

    @Override
    public String getPassword() {
        return editTextTextPassword.getText().toString();
    }



    //数据返回
    @Override
    public void getLoginData(String string) {




    }


}
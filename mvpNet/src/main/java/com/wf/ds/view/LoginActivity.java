package com.wf.ds.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.wf.ds.R;
import com.wf.ds.base.BaseActivity;
import com.wf.ds.contract.MainContract;
import com.wf.ds.model.UserBean;
import com.wf.ds.presenter.MainPresenterImpl;
import com.wf.ds.utils.net.INetCallBack;
import com.wf.ds.utils.net.RetrofitUtils;
import com.wf.ds.utils.net.URLConstant;

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

    };


    @Override
    protected int getLayoutID() { return R.layout.activity_main; }

    @Override
    public MainPresenterImpl add() {
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

    @Override
    public void getData(UserBean string) {
        Log.e("TAG", "getData: "+string.getResults().size() );
        //网络请求返回

    }



}
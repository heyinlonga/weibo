package com.wf.ds.model;


import com.wf.ds.contract.MainContract;

public class MainModelImpl implements MainContract.IMainModel {

    private MainContract.IMainPresenter presenter;


    public MainModelImpl(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getLoginData() {

//        这里有一千行代码。
//        结果返回了
        presenter.loginResult("登录成功了");



    }
}

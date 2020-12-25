package com.example.mvp_3.model;

import com.example.mvp_3.contract.MainContract;

public class MainModel implements MainContract.IMainModel {
    private MainContract.IMainPresenter presenter;

    public MainModel(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getLoginData() {
        presenter.loginResult("登陆成功");
    }
}

package com.example.mvp_3.presenter;

import com.example.mvp_3.contract.MainContract;
import com.example.mvp_3.model.MainModel;

public class MainPresenter implements MainContract.IMainPresenter {
    private final MainModel mainModel;
    private MainContract.IMainVieww mainView;

    public MainPresenter(MainContract.IMainVieww mainView) {
        mainModel = new MainModel(this);
        this.mainView = mainView;
    }

    @Override
    public void login(String name, String pwd) {
        mainModel.getLoginData();
    }

    @Override
    public void loginResult(String result) {
        mainView.getLoginData(result);
    }
}

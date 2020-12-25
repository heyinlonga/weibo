package com.wf.ds.presenter;

import com.wf.ds.base.BasePresenter;
import com.wf.ds.contract.MainContract;
import com.wf.ds.model.MainModelImpl;

public class MainPresenterImpl extends BasePresenter implements MainContract.IMainPresenter{

    private MainContract.IMainModel mainModel;
    private MainContract.IMainView mainView;

    public MainPresenterImpl(MainContract.IMainView mainView) {
        this.mainModel = new MainModelImpl(this);
        this.mainView = mainView;
    }
    @Override
    public void login(String name,String password) {
        mainModel.getLoginData();
    }
    @Override
    public void loginResult(String result) {
//做判单的
        mainView.getLoginData(result);
    }
}

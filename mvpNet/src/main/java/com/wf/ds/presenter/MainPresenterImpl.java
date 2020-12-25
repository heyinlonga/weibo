package com.wf.ds.presenter;

import com.wf.ds.base.BasePresenter;
import com.wf.ds.contract.MainContract;
import com.wf.ds.model.MainModelImpl;
import com.wf.ds.model.UserBean;
import com.wf.ds.utils.net.INetCallBack;

public class MainPresenterImpl extends BasePresenter implements MainContract.IMainPresenter{

    private MainContract.IMainModel mainModel;
    private MainContract.IMainView mainView;

    public MainPresenterImpl(MainContract.IMainView mainView) {
        this.mainModel = new MainModelImpl(this);
        this.mainView = mainView;
    }
    @Override
    public void login(String name,String password) {

//        URL就在P层确定,不要从Activity中传递过来
        mainModel.getLoginData("https://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/3", new INetCallBack<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {

                    mainView.getData(userBean);

            }

            @Override
            public void onFail(String err) {

            }
        });
    }

    @Override
    public void loginResult(String result) {

    }
}

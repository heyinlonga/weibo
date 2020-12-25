package com.wf.ds.contract;

public class MainContract {
    public interface IMainModel {
        void getLoginData();
    }
    public  interface IMainPresenter {
        void login(String name,String password);
        void loginResult(String result);
    }
    public interface IMainView {
        String getUserName();
        String getPassword();
        void getLoginData(String string);
    }
}

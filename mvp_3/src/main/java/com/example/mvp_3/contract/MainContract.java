package com.example.mvp_3.contract;

public class MainContract {

    public interface IMainVieww {
        String getUserNmae();

        String getPassword();

        void getLoginData(String string);
    }

    public interface IMainModel {
        void getLoginData();
    }

    public interface IMainPresenter {
        void login(String name, String pwd);

        void loginResult(String result);
    }
}

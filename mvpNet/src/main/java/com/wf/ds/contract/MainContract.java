package com.wf.ds.contract;

import com.wf.ds.model.UserBean;
import com.wf.ds.utils.net.INetCallBack;

public class MainContract {
    public interface IMainModel {
        <T> void getLoginData(String url,INetCallBack<T> callBack);
    }
    public  interface IMainPresenter {
        void login(String name,String password);
        void loginResult(String result);
    }
    public interface IMainView {

        String getUserName();
        String getPassword();
        void getData(UserBean string);
    }
}

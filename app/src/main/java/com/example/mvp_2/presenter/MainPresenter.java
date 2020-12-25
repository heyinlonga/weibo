package com.example.mvp_2.presenter;

import com.example.mvp_2.model.MainModel;
import com.example.mvp_2.view.MainView;

public class MainPresenter {
    private MainView mainView;
    private final MainModel mainModel;

    public MainPresenter(MainView mainView) {
        mainModel = new MainModel();
        this.mainView = mainView;
    }

    public void setData() {
        mainModel.setData();
    }
}

package com.wf.ds.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wf.ds.contract.MainContract;
import com.wf.ds.presenter.MainPresenterImpl;

public abstract class BaseActivity<T>  extends AppCompatActivity {

    public T presenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        if(presenter ==null){
            presenter  = getPresenter();
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayoutID();

    public abstract T getPresenter();


}

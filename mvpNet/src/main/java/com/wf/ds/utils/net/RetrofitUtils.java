package com.wf.ds.utils.net;

import com.google.gson.Gson;
import com.wf.ds.model.UserBean;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.logging.XMLFormatter;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils implements INetWorkInterface{

    private static RetrofitUtils retrofitUtils;

    private ApiServices apiServices;

    private RetrofitUtils() {

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URLConstant.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        apiServices = retrofit.create(ApiServices.class);

    }


    public static RetrofitUtils getInstance() {
        if(retrofitUtils == null){
            synchronized (RetrofitUtils.class){
                if(retrofitUtils == null){
                    retrofitUtils = new RetrofitUtils();
                }
            }
        }
        return retrofitUtils;
    }


    //拿这个东西举例
    @Override
    public <T> void get(String url,INetCallBack<T> callBack) {
//        此处提问：罗传波，没听课
//        佘亮,上个月没学好
        apiServices.get(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                    }
                        @Override
                    public void onNext(@NonNull ResponseBody responseBody) {
                        try {
                            String string = responseBody.string();
//                            获取参数化类型
                            Type[] genericInterfaces = callBack.getClass().getGenericInterfaces();

//                              获取参数化类型的实际类型
                            Type[] actualTypeArguments = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
                            Type t = actualTypeArguments[0];
                            Gson gson =  new Gson();
                           T resultt =  gson.fromJson(string, t);
                           callBack.onSuccess(resultt);


                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public <T> void post(String url,INetCallBack<T> callBack) {



//        此处提问：罗传波，没听课
//        佘亮,上个月没学好
        apiServices.post(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ResponseBody responseBody) {
                        try {
                            String string = responseBody.string();
//                            获取参数化类型
                            Type[] genericInterfaces = callBack.getClass().getGenericInterfaces();

//                              获取参数化类型的实际类型
                            Type[] actualTypeArguments = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
                            Type t = actualTypeArguments[0];
                            Gson gson =  new Gson();
                            T resultt =  gson.fromJson(string, t);
                            callBack.onSuccess(resultt);


                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }

    @Override
    public <T> void post(String url, HashMap<String, String> map,INetCallBack<T> callBack) {

//        此处提问：罗传波，没听课
//        佘亮,上个月没学好
        apiServices.post(url,map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {}
                    @Override
                    public void onNext(@NonNull ResponseBody responseBody) {


                        try {
                            String string = responseBody.string();
//                            获取参数化类型
                            Type[] genericInterfaces = callBack.getClass().getGenericInterfaces();

//                              获取参数化类型的实际类型
                            Type[] actualTypeArguments = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
                            Type t = actualTypeArguments[0];
                            Gson gson =  new Gson();
                            T resultt =  gson.fromJson(string, t);
                            callBack.onSuccess(resultt);


                        } catch (IOException e) {
                            e.printStackTrace();
                        }



                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

package com.example.mvp_2;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    String School_Url="http://cdwan.cn:7000/";
    @GET("exam2003/anewslist.json")
    Observable<SchoolBean> getSchool();

}

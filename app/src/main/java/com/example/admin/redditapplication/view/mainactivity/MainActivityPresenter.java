package com.example.admin.redditapplication.view.mainactivity;

import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.example.admin.redditapplication.data.GsonRequest;
import com.example.admin.redditapplication.model.Child;
import com.example.admin.redditapplication.model.MyResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 11/5/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter{

    public static final String BASE_URL = "https://www.reddit.com/r/";
    private static final String TAG = "MainActivPresen";

    MainActivityContract.View view;
//    List<Child> items = new ArrayList<>();


    public MainActivityPresenter() {
    }

    @Override
    public void attachView(MainActivityContract.View view) {
        Log.d(TAG, "attachView: ");
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void makeRequest(String query) {
        String url = BASE_URL + query + "/.json";

        GsonRequest<MyResponse> gsonRequest = new GsonRequest<>(url, MyResponse.class, null,
                new Response.Listener<MyResponse>() {

                    @Override
                    public void onResponse(MyResponse response) {
//                        MyResponse > Data > Child > Data_
                        view.updateRecyclerView( response.getData().getChildren() );
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse (VolleyError error){
                        Log.e(TAG, "onErrorResponse: ", error);
                    }
                });

        view.addRequest(gsonRequest);
    }
}

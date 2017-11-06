package com.example.admin.redditapplication;

/**
 * Created by user on 10/25/17.
 */

public interface BasePresenter<V extends BaseView> {

    void attachView(V view);
    void detachView();
}

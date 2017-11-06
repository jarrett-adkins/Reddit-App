package com.example.admin.redditapplication.view.mainactivity;

import com.example.admin.redditapplication.BasePresenter;
import com.example.admin.redditapplication.BaseView;
import com.example.admin.redditapplication.data.GsonRequest;
import com.example.admin.redditapplication.model.Child;
import com.example.admin.redditapplication.model.MyResponse;

import java.util.List;

/**
 * Created by Admin on 11/5/2017.
 */

public interface MainActivityContract {

    interface View extends BaseView {

        void updateRecyclerView(List<Child> recipeList);
        void addRequest(GsonRequest<MyResponse> gsonRequest);
    }

    interface Presenter extends BasePresenter<View> {
        void makeRequest(String query);
    }
}

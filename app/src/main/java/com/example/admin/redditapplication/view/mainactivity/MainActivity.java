package com.example.admin.redditapplication.view.mainactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.admin.redditapplication.R;
import com.example.admin.redditapplication.data.GsonRequest;
import com.example.admin.redditapplication.di.mainactivity.DaggerMainActivityComponent;
import com.example.admin.redditapplication.model.Child;
import com.example.admin.redditapplication.model.MyResponse;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private static final String TAG = "MainActivity";

    @BindView(R.id.rvQueryList)
    RecyclerView rvQueryList;
    @BindView(R.id.tvStatus)
    TextView tvStatus;

    @Inject
    MainActivityPresenter presenter;
    private RecyclerView.LayoutManager layoutManager;
//    private MyItemListAdapter adapter;
    private RequestQueue queue;
    private List<Child> childList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //initialize presenter with injection
        DaggerMainActivityComponent.create().inject( this );
        queue = Volley.newRequestQueue(this);
        initRecyclerView();
        presenter.attachView(this);
        presenter.makeRequest("funny");
//        makeCall( "https://www.reddit.com/r/funny/.json" );
    }

    private void initRecyclerView() {
        layoutManager = new LinearLayoutManager( this );
        rvQueryList.setLayoutManager( layoutManager );
//        rvQueryList.setItemAnimator( new DefaultItemAnimator() );
        rvQueryList.setAdapter( new MyItemListAdapter( childList ));
//        rvQueryList.addOnScrollListener(new EndlessRecyclerViewScrollListener( layoutManager ) {
//            @Override
//            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
//                rvQueryList.getAdapter().notifyDataSetChanged();
//            }
//        });
    }

    public void addRequest(GsonRequest<MyResponse> gsonRequest) {
        queue.add(gsonRequest);
    }

    public void updateRecyclerView(List<Child> list) {
        Log.d(TAG, "updateRecyclerView: adding " + list.size() + " items to the Recycler View.");
        childList.addAll(list);
        rvQueryList.getAdapter().notifyDataSetChanged();
    }

    @Override
    public void showError(String error) {

    }

    //    public void makeCall( String url ) {
//        RequestQueue queue = Volley.newRequestQueue(this);
//
//        GsonRequest<MyResponse> gsonRequest = new GsonRequest<>(url, MyResponse.class, null,
//                new Response.Listener<MyResponse>() {
//
//                    @Override
//                    public void onResponse(MyResponse response) {
//                        Log.d(TAG, "onResponse: " + response.getData().getChildren().size());
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse (VolleyError error){
//                        Log.e(TAG, "onErrorResponse: ", error);
//                    }
//                });
//
//        queue.add(gsonRequest);
//    }
}

/*
Required:
X -load posts from r/funny by default.
-Use search view. new search should re poll redit.
-a table cell's height should be dynamic based on length of post
-must pass lint test
-Use android.content.Intent.ACTION_SEND intent to share posts when they are tapped--either to Email
 or SMS.
-use title, author, thumbnail, num_comments, ups, downs fields from json.
X -MVP
X -Dagger
X -Volley

Try to do some of the Optional features mentioned as well:
-kotlin
-image caching for profile pics
-pull to refresh
-show profile pic as circle with provided background art
-make posts animate in
-add shadow to profile pics
-make use of android architecture components
-obfuscate release code

URL:
https://www.reddit.com/r/funny/.json
https://www.reddit.com/r/technology/.json
 */
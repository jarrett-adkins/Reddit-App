package com.example.admin.redditapplication.di.mainactivity;

import com.example.admin.redditapplication.view.mainactivity.MainActivity;

import dagger.Component;

/**
 * Created by Admin on 10/20/2017.
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}

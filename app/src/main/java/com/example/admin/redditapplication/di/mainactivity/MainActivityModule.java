package com.example.admin.redditapplication.di.mainactivity;

import com.example.admin.redditapplication.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 10/20/2017.
 */

//denote the module with @module annotation
@Module
public class MainActivityModule {

    //method that provides the mainActivityPresenter object
    @Provides
    MainActivityPresenter providesMainActivityPresenter () {
        return new MainActivityPresenter();
    }
}

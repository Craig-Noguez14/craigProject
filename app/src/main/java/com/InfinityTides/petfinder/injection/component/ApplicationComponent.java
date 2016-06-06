package com.InfinityTides.petfinder.injection.component;

import android.app.Application;
import android.content.Context;

import com.InfinityTides.petfinder.data.DataManager;
import com.InfinityTides.petfinder.data.SyncService;
import com.InfinityTides.petfinder.data.local.DatabaseHelper;
import com.InfinityTides.petfinder.data.local.PreferencesHelper;
import com.InfinityTides.petfinder.data.remote.RibotsService;
import com.InfinityTides.petfinder.injection.ApplicationContext;
import com.InfinityTides.petfinder.injection.module.ApplicationModule;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    Bus eventBus();

}

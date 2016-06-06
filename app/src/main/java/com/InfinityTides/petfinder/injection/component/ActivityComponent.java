package com.InfinityTides.petfinder.injection.component;

import com.InfinityTides.petfinder.injection.PerActivity;
import com.InfinityTides.petfinder.injection.module.ActivityModule;
import com.InfinityTides.petfinder.ui.main.MainActivity;

import dagger.Component;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}

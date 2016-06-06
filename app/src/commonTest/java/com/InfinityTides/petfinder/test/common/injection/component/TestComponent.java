package com.InfinityTides.petfinder.test.common.injection.component;

import com.InfinityTides.petfinder.injection.component.ApplicationComponent;
import com.InfinityTides.petfinder.test.common.injection.module.ApplicationTestModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}

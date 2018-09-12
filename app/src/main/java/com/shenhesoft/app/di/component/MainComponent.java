package com.shenhesoft.app.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.shenhesoft.app.di.module.MainModule;

import com.jess.arms.di.scope.ActivityScope;
import com.shenhesoft.app.mvp.ui.activity.MainActivity;

@ActivityScope
@Component(modules = MainModule.class, dependencies = AppComponent.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
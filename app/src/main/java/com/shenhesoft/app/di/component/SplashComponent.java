package com.shenhesoft.app.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.shenhesoft.app.di.module.SplashModule;

import com.jess.arms.di.scope.ActivityScope;
import com.shenhesoft.app.mvp.ui.activity.SplashActivity;

@ActivityScope
@Component(modules = SplashModule.class, dependencies = AppComponent.class)
public interface SplashComponent {
    void inject(SplashActivity activity);
}
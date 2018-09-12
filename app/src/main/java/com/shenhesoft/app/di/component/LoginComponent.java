package com.shenhesoft.app.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.shenhesoft.app.di.module.LoginModule;

import com.jess.arms.di.scope.ActivityScope;
import com.shenhesoft.app.mvp.ui.activity.LoginActivity;

@ActivityScope
@Component(modules = LoginModule.class, dependencies = AppComponent.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}
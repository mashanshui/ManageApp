package com.shenhesoft.app.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.shenhesoft.app.di.module.RegisterModule;

import com.jess.arms.di.scope.ActivityScope;
import com.shenhesoft.app.mvp.ui.activity.RegisterActivity;

@ActivityScope
@Component(modules = RegisterModule.class, dependencies = AppComponent.class)
public interface RegisterComponent {
    void inject(RegisterActivity activity);
}
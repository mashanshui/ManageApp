package com.shenhesoft.app.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.shenhesoft.app.di.module.ForgetPasswordModule;

import com.jess.arms.di.scope.ActivityScope;
import com.shenhesoft.app.mvp.ui.activity.ForgetPasswordActivity;

@ActivityScope
@Component(modules = ForgetPasswordModule.class, dependencies = AppComponent.class)
public interface ForgetPasswordComponent {
    void inject(ForgetPasswordActivity activity);
}
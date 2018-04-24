package com.asvacode.mynamecard.injection.builder;

import com.asvacode.mynamecard.ui.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by cheasocheat on 4/24/18.
 */

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract MainActivity bindMainActivity();
}
package com.asvacode.mynamecard.injection.module.activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cheasocheat on 4/24/18.
 */

@Module
public class MainActivityModule {
    @Provides
    public String provideGreeting(){
        return "Hello My Namecard In Main Module";
    }
}

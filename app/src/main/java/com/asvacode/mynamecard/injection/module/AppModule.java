package com.asvacode.mynamecard.injection.module;

import android.content.Context;

import com.asvacode.mynamecard.application.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cheasocheat on 4/24/18.
 */

@Module
@Singleton
public class AppModule {

    @Provides
    Context provideContext(App application) {
        return application.getApplicationContext();
    }

    @Provides
    public String provideGreeting() {
        return "Hello My Namecard";
    }
}

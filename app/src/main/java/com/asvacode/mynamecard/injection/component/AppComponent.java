package com.asvacode.mynamecard.injection.component;

import com.asvacode.mynamecard.application.App;
import com.asvacode.mynamecard.injection.builder.ActivityBuilder;
import com.asvacode.mynamecard.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by cheasocheat on 4/24/18.
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class /* Use AndroidInjectionModule.class if you're not using support library */,
        AppModule.class,
        ActivityBuilder.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(App application);

        AppComponent build();
    }

    void inject(App application);
}

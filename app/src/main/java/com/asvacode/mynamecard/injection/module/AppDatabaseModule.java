package com.asvacode.mynamecard.injection.module;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.asvacode.mynamecard.database.AppDatabase;
import com.asvacode.mynamecard.database.dao.CardDao;
import com.asvacode.mynamecard.database.dao.CategoryDao;
import com.asvacode.mynamecard.util.SecurityManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cheasocheat on 4/25/18.
 */
@Module
public class AppDatabaseModule {

    @Provides
    @Singleton
    public AppDatabase provideAppDatabase(Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, SecurityManager.getDatabaseName())
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
    }

    @Provides
    @Singleton
    public CardDao provideCardDao(AppDatabase appDatabase){
        return appDatabase.getCardDao();
    }
    @Provides
    @Singleton
    public CategoryDao provideCategoryDao(AppDatabase appDatabase){
        return appDatabase.getCategoryDao();
    }
}

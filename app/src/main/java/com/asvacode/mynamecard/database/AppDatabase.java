package com.asvacode.mynamecard.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.asvacode.mynamecard.database.dao.CardDao;
import com.asvacode.mynamecard.database.dao.CategoryDao;
import com.asvacode.mynamecard.database.entity.CardRoom;
import com.asvacode.mynamecard.database.entity.CategoryRoom;
import com.asvacode.mynamecard.util.AppConstant;

/**
 * Created by cheasocheat on 4/24/18.
 */

@Database(entities = {
        CardRoom.class,
        CategoryRoom.class
}, version = AppConstant.DATABASE_VERSION)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CardDao getCardDao();
    public abstract CategoryDao getCategoryDao();
}

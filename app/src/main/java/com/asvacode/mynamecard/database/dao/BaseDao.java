package com.asvacode.mynamecard.database.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by cheasocheat on 5/1/18.
 */

public interface BaseDao<R> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    int insert(R room);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<R> listRooms);

    @Update
    void update(R room);

    @Delete
    void delete(R room);
}

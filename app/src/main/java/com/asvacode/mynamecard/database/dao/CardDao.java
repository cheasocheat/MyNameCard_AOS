package com.asvacode.mynamecard.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.asvacode.mynamecard.database.entity.CardRoom;

import java.util.List;

/**
 * Created by cheasocheat on 4/24/18.
 */

@Dao
public interface CardDao extends BaseDao<CardRoom>{
    @Query("select * from tb_card order by updated_date")
    List<CardRoom> getAll();
}

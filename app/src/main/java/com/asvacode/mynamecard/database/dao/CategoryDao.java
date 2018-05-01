package com.asvacode.mynamecard.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.asvacode.mynamecard.database.entity.CategoryRoom;

import java.util.List;

/**
 * Created by cheasocheat on 5/1/18.
 */
@Dao
public interface CategoryDao extends BaseDao<CategoryRoom> {

    @Query("select * from tb_category order by updated_date")
    List<CategoryRoom> getAll();

}

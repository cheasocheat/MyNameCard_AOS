package com.asvacode.mynamecard.database.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.asvacode.mynamecard.util.DateConverter;

import java.util.Date;

/**
 * Created by cheasocheat on 5/1/18.
 */
@Entity(tableName = "tb_category")
public class CategoryRoom {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "desc")
    private String desc;
    @ColumnInfo(name = "record_status")
    private String recStatus;
    @ColumnInfo(name = "created_date")
    @TypeConverters(DateConverter.class)
    private Date createdDate;
    @TypeConverters(DateConverter.class)
    @ColumnInfo(name = "updated_date")
    private Date updateDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRecStatus() {
        return recStatus;
    }

    public void setRecStatus(String recStatus) {
        this.recStatus = recStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}

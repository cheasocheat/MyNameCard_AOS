package com.asvacode.mynamecard.database.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.asvacode.mynamecard.util.DateConverter;

import java.util.Date;

/**
 * Created by cheasocheat on 4/24/18.
 */
@Entity(tableName = "tb_card")
public class CardRoom {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "cate_id")
    private int cateId;
    @ColumnInfo(name = "uri")
    private String uri;
    @ColumnInfo(name = "favorite")
    private boolean favorite;
    @ColumnInfo(name = "record_status")
    private String recStatus;
    @TypeConverters(DateConverter.class)
    @ColumnInfo(name = "created_date")
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

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
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

package com.example.administrator.crimeintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2016/4/30.
 * 保存每个Crime的Id，标题，日期，是否解决
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSloved() {
        return mSolved;
    }

    public void setSloved(boolean sloved) {
        mSolved = sloved;
    }
}

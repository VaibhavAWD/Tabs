package com.vaibhavdhunde.android.tabs.model;

public class Project {
    private String mTitle;
    private String mDescription;
    private int mStatus;

    public Project(String title, String description, int status) {
        mTitle = title;
        mDescription = description;
        mStatus = status;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getStatus() {
        return mStatus;
    }
}

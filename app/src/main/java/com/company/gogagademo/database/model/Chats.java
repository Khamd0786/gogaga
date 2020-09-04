package com.company.gogagademo.database.model;

import com.company.gogagademo.R;

public class Chats {
    private String name;
    private String time;
    private String message;
    private int profile;
    private String unRead;

    public Chats(String name, String time, String message, int profile, String unRead) {
        this.name = name;
        this.time = time;
        this.message = message;
        if (profile != 0)
            this.profile = profile;
        else
            this.profile = R.drawable.no_dp;

        this.unRead = unRead;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    public int getProfile() {
        return profile;
    }

    public String getUnRead() {
        return unRead;
    }
}

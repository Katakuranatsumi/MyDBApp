package com.example.katakuranatsumi.mydbapp;

import android.provider.BaseColumns;

public final class UserContract {
    public UserContract() {}

    public static abstract class Users implements BaseColumns {
     public static final String TABLE_NAME = "users";
     public static final String COL_NAME = "name";
     public static final String COL_SCORE = "score";
    }
}

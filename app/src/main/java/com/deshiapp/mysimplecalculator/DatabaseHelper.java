package com.deshiapp.mysimplecalculator;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABSE_NAME = "bookmark.db";
    private static final String SQL_CREATE_TABLE = "CREATE TABLE userAuth(name text, email text, password text);";
    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int Older_Version, int New_Version) {
        db.execSQL("DROP TABLE IF EXISTS userAuth");
        onCreate(db);
    }
}

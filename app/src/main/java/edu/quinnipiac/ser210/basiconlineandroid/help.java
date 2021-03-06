/*
Authors: Megan Forster and Alexandra Martin
Basic Online for Android
Android Development Final Project
2 May 2020
 */


package edu.quinnipiac.ser210.basiconlineandroid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;


public class help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //For changing colors and font sizes
        setTheme(getThemeFlag() ? R.style.AppTheme : R.style.AppTheme2);
        setTheme(getFontFlag() ? R.style.Font: R.style.Font2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    //Returns which theme to use
    private boolean getThemeFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("origColor", false);
    }

    //Returns which font to use
    private boolean getFontFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("origSize", false);
    }
}

package edu.quinnipiac.ser210.basiconlineandroid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;


public class help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(getThemeFlag() ? R.style.AppTheme : R.style.AppTheme2);
        setTheme(getFontFlag() ? R.style.Font: R.style.Font2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    private boolean getThemeFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("origColor", false);
    }

    private boolean getFontFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("origSize", false);
    }
}

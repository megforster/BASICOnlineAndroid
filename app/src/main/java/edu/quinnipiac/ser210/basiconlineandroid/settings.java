package edu.quinnipiac.ser210.basiconlineandroid;


import android.Manifest;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.res.ResourcesCompat;


public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(getThemeFlag() ? R.style.AppTheme : R.style.AppTheme2);
        setTheme(getFontFlag() ? R.style.Font: R.style.Font2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final Button changeColor = (Button) findViewById(R.id.colorButton);
        changeColor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                saveThemeFlag(!getThemeFlag());
                Runtime.getRuntime().exit(0);
            }
        });

        final Button changeSize = (Button) findViewById(R.id.fontButton);
        changeSize.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                saveFontFlag(!getFontFlag());
                Runtime.getRuntime().exit(0);

            }
        });
    }

    private void saveThemeFlag(boolean flag){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("origColor", flag);
        editor.commit();
    }

    private boolean getThemeFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("origColor", false);
    }

    private void saveFontFlag(boolean flag){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("origSize", flag);
        editor.commit();
    }

    private boolean getFontFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("origSize", false);
    }



}
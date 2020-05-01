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

    Boolean largeFont = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(getThemeFlag() ? R.style.AppTheme : R.style.AppTheme2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final Button changeColor = (Button) findViewById(R.id.colorButton);
        changeColor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                saveThemeFlag(!getThemeFlag());

                /*Intent settingsIntent = new Intent(settings.this,settings.class); //settings.class
                startActivity(settingsIntent);*/
                Runtime.getRuntime().exit(0);
            }
        });

        final Button changeSize = (Button) findViewById(R.id.fontButton);
        changeSize.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(largeFont){
                    changeColor.setTextSize(30);
                    changeSize.setTextSize(30);
                    largeFont = false;
                }else{
                    changeColor.setTextSize(15);
                    changeSize.setTextSize(15);
                    largeFont = true;
                }

            }
        });
    }

    /*public void changeFontSize(View view) {
        Toast.makeText(this, "In the future this will allow you to change the font size of the information screens", Toast.LENGTH_SHORT).show();
    }

    public void changeColor(View view) {
        Toast.makeText(this, "In the future this will allow you to change main colors of this android app", Toast.LENGTH_SHORT).show();
    }*/

    private void saveThemeFlag(boolean flag){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("orig", flag);
        editor.commit();
    }

    private boolean getThemeFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("orig", false);
    }



}
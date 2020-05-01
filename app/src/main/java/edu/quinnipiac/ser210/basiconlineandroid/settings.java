package edu.quinnipiac.ser210.basiconlineandroid;


import android.Manifest;
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
        setTheme(getFlag() ? R.style.AppTheme2 : R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button changeColor = (Button) findViewById(R.id.colorButton);
        changeColor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                saveFlag(!getFlag());

                Intent intent = new Intent(settings.this, settings.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void changeFontSize(View view) {
        Toast.makeText(this, "In the future this will allow you to change the font size of the information screens", Toast.LENGTH_SHORT).show();
    }

    public void changeColor(View view) {
        Toast.makeText(this, "In the future this will allow you to change main colors of this android app", Toast.LENGTH_SHORT).show();
    }

    private void saveFlag(boolean flag){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("orig", flag);
        editor.commit();
    }

    private boolean getFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("orig", false);
    }



}
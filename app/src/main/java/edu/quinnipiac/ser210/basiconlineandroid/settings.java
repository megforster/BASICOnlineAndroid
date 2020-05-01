package edu.quinnipiac.ser210.basiconlineandroid;


import android.Manifest;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.res.ResourcesCompat;


public class settings extends AppCompatActivity {
    Boolean useAlternativeTheme = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void changeFontSize(View view) {
        Toast.makeText(this, "In the future this will allow you to change the font size of the information screens", Toast.LENGTH_SHORT).show();
    }

    public void changeColor(View view) {
        System.out.println("Chaning color");
        if(useAlternativeTheme==false){
            useAlternativeTheme = true;
        }else{
            useAlternativeTheme = false;
        }
        getTheme();
        recreate();
        Toast.makeText(this, "In the future this will allow you to change main colors of this android app", Toast.LENGTH_SHORT).show();
    }

    @Override
    public Resources.Theme getTheme() {
        Resources.Theme theme = super.getTheme();
        //System.out.println(theme);
        if(useAlternativeTheme){
            System.out.println("Should be setting theme");
            theme.applyStyle(R.style.AppTheme, true);
        }else{
            System.out.println("Setting theme back");
            theme.applyStyle(R.style.AppTheme2, true);
        }
        return theme;
    }
}
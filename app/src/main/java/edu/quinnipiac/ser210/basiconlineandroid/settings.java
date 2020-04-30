package edu.quinnipiac.ser210.basiconlineandroid;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void changeFontSize(View view) {
        Toast.makeText(this, "In the future this will allow you to change the font size of the information screens", Toast.LENGTH_SHORT).show();
    }

    public void changeColor(View view) {
        Toast.makeText(this, "In the future this will allow you to change main colors of this android app", Toast.LENGTH_SHORT).show();
    }
}
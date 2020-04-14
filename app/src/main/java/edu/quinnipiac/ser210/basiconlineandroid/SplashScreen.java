package edu.quinnipiac.ser210.basiconlineandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    public void onEnter(View view) {
        Intent intent = new Intent(this,HomeScreen.class);
        startActivity(intent);
    }
}

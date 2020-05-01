package edu.quinnipiac.ser210.basiconlineandroid;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //For changing colors and font sizes
        setTheme(getThemeFlag() ? R.style.AppTheme : R.style.AppTheme2);
        setTheme(getFontFlag() ? R.style.Font: R.style.Font2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    //Returns which theme to use
    private boolean getThemeFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("origColor", false);
    }

    //Returns which font size to use
    private boolean getFontFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("origSize", false);
    }

    //Prompts user to enter name and gets user entered name then passes it to the home screen
    public void onEnter(View view) {

        TextView welcomeView = (TextView) findViewById(R.id.welcome);
        EditText nameView = (EditText) findViewById(R.id.enterName);
        String nameText = nameView.getText().toString();

        Intent intent = new Intent(this,HomeScreen.class);
        intent.putExtra(HomeScreen.USER_NAME, nameText);
        startActivity(intent);
    }
}

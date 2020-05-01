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
        setTheme(getThemeFlag() ? R.style.AppTheme : R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    private boolean getThemeFlag(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getBoolean("orig", false);
    }

    public void onEnter(View view) {

        TextView welcomeView = (TextView) findViewById(R.id.welcome); //welcome message for splash screen
        EditText nameView = (EditText) findViewById(R.id.enterName);// get the name of the user
        String nameText = nameView.getText().toString();

        Intent intent = new Intent(this,HomeScreen.class); // go to the home screen
        intent.putExtra(HomeScreen.USER_NAME, nameText); // create and intent and then add the name to the intent
        startActivity(intent);
    }
}

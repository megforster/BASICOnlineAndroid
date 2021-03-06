/*
Authors: Megan Forster and Alexandra Martin
Basic Online for Android
Android Development Final Project
2 May 2020
 */


package edu.quinnipiac.ser210.basiconlineandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;

public class HomeScreen extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static final String USER_NAME = "welcomeName";
    private DrawerLayout nav_drawer;
    private ShareActionProvider shareActionProvider;
    private SectionsPagerAdapter pagerAdapter;

    //RootFragment rootFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //For changing colors and font sizes
        setTheme(getThemeFlag() ? R.style.AppTheme : R.style.AppTheme2);
        setTheme(getFontFlag() ? R.style.Font: R.style.Font2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Navigation for navigation side menu
        nav_drawer = findViewById(R.id.home_drawer_layout);
        NavigationView navView = findViewById(R.id.nav_drawer_view);
        navView.setNavigationItemSelectedListener(this);


        //Creating button to click action bar from Toolbar
        ActionBarDrawerToggle toggleNav = new ActionBarDrawerToggle(this,nav_drawer, toolbar,R.string.nav_open_drawer, R.string.nav_close_drawer);
        nav_drawer.addDrawerListener(toggleNav);
        toggleNav.syncState();

        getUserName();

        pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(pagerAdapter);
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

    //Accesses name user entered on splash screen to set welcome message
    public void getUserName(){
        Intent intent = getIntent(); // get the intent
        String nameText = intent.getStringExtra(USER_NAME); // get the player name
        TextView nameView = (TextView) findViewById(R.id.welcomeName); //welcome message for splash screen
        nameView.setText("Welcome " + nameText);

    }

    //Helps set up share feature and upper-right hand side menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);

        MenuItem menuItem = menu.findItem(R.id.share);
        shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent("Look at the progress I am making.");

        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    //Required for share feature
    private void setShareActionIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }

    //Controls part of drawer navifation
    @Override
    public void onBackPressed(){
       if(nav_drawer.isDrawerOpen(GravityCompat.START)){
           nav_drawer.closeDrawer(GravityCompat.START);
       }else {
           super.onBackPressed();
       }
    }

    //Controls switching screens when upper-right hand side menu option is selected
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help_menu:
                Intent intentHelp = new Intent(this, help.class);
                startActivity(intentHelp);
                return true;
            case R.id.settings_menu:
                Intent intentSettings = new Intent(this, settings.class);
                startActivityForResult(intentSettings, 0);
                return true;

            case R.id.libraries_menu:
                Intent intentLibraries = new Intent(this, findLibrary.class);
                startActivity(intentLibraries);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    //Method to allow button action clicks on the navigation side menu
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.nav_homescreen:
                //Intent to get home screen
                Intent intentHome = new Intent(this, HomeScreen.class); // go to the Home Screen

                startActivity(intentHome);
                break;

            case R.id.nav_quiz:
                //Intent to get quiz screen
                Intent intentQuiz = new Intent(this, QuizActivity.class); // go to the Quiz Screen
                startActivity(intentQuiz);
                break;

            case R.id.nav_favorites:
                //Favorites not yet implemented
                break;
            case R.id.nav_library:
                Intent intentLibrary = new Intent(this, findLibrary.class);
                startActivity(intentLibrary);
                break;
            case R.id.nav_help:
                //Intent to pass to access Help screen from the navside menu
                Intent intentHelp = new Intent(this, help.class); // go to the Help Screen
                startActivity(intentHelp);
                break;

            case R.id.nav_settings:
                //Intent to pass to access Help screen from the navside menu
                Intent intentSettings = new Intent(this, settings.class); // go to the Help Screen
                startActivity(intentSettings);
                break;

            case R.id.nav_share:
                shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
                setShareActionIntent("Look at the progress I am making.");
                break;
        }
        nav_drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //Helps handle swapping currently visible fragment with selected fragment
    public static class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new RootFragment();
                default:
                    break;

            }
            return null;
        }
    }



}









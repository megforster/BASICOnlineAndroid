package edu.quinnipiac.ser210.basiconlineandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

public class HomeScreen extends AppCompatActivity {

    public static final String USER_NAME = "welcomeName";
    private DrawerLayout nav_drawer;
    private ShareActionProvider shareActionProvider;
    private SectionsPagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Attach the SectionsPagerAdapter to theViewPager

        //Creating button to click action bar from Toolbar
        nav_drawer = findViewById(R.id.home_drawer_layout);
        ActionBarDrawerToggle toggleNav = new ActionBarDrawerToggle(this,nav_drawer, toolbar,R.string.nav_open_drawer, R.string.nav_close_drawer);
        nav_drawer.addDrawerListener(toggleNav);
        toggleNav.syncState();

        Intent intent = getIntent(); // get the intent
        String nameText = intent.getStringExtra(USER_NAME); // get the player name
        TextView nameView = (TextView) findViewById(R.id.welcomeName); //welcome message for splash screen
        nameView.setText("Welcome To BASIC " + nameText);

        pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(pagerAdapter);

//        //Attach the ViewPager to the TabLayout
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(pager);
    }
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

    private void setShareActionIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }

    @Override
    public void onBackPressed(){
       if(nav_drawer.isDrawerOpen(GravityCompat.START)){
           nav_drawer.closeDrawer(GravityCompat.START);
       }else {
           super.onBackPressed();
       }
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        switch (item.getItemId()) {
            case R.id.help_menu:
                Intent intentHelp = new Intent(this, help.class);
                startActivity(intentHelp);
                return true;
            case R.id.settings_menu:
                Intent intentSettings = new Intent(this, settings.class);
                startActivity(intentSettings);
                return true;

            case R.id.libraries_menu:
                Intent intentLibraries = new Intent(this, searchForNearbyLibraries.class);
                startActivity(intentLibraries);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }



        /*switch (item.getItemId()) {
            case R.id.help_menu:

                displayView(0);
                return true ;

            case R.id.settings_menu:
                displayView(1);
                return true;

            case R.id.libraries_menu:
               displayView(2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/

    }

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
            //System.out.println("gettingItem");
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









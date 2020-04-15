package edu.quinnipiac.ser210.basiconlineandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class HomeScreen extends AppCompatActivity {

    public static final String USER_NAME = "welcomeName";

    private ShareActionProvider shareActionProvider;
    private SectionsPagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Attach the SectionsPagerAdapter to theViewPager

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
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


//        switch (item.getItemId()) {
//            case R.id.help_menu:
//                Intent intentHelp = new Intent(this, help.class);
//                startActivity(intentHelp);
//                return true;
//            case R.id.settings_menu:
//                Intent intentSettings = new Intent(this, settings.class);
//                startActivity(intentSettings);
//                return true;
//
//            case R.id.libraries_menu:
//                Intent intentLibraries = new Intent(this, searchForNearbyLibraries.class);
//                startActivity(intentLibraries);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//
//    }

        switch (item.getItemId()) {
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
        }

    }
    // does not work correctly trying to have go to fragments
    private void displayView(int position) {
        // update the main content by replacing fragments
        Fragment fragment = null;
        switch (position) {
            case 0:

                fragment = new help();

                break;
            case 1:

                fragment = new settings();
                break;

            case 2:

                fragment = new searchForNearbyLibraries();
                break;

            default:
                break;
        }

//
//        if (fragment != null) {
//            FragmentManager fragmentManager = getFragmentManager();
//            fragmentManager.beginTransaction()
//                    .replace(R.id.frame_container, fragment).commit();
//
//
//        } else {
//            // error in creating fragment
//            Log.e("MainActivity", "Error in creating fragment");
//        }

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



        /*@Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getResources().getText(R.string.home_tab); // example for tabs pizza to
                case 1:
                    return getResources().getText(R.string.);
                case 2:
                    return getResources().getText(R.string.);
                case 3:
                    return getResources().getText(R.string.);
            }
            return null;

        }*/


    }



}









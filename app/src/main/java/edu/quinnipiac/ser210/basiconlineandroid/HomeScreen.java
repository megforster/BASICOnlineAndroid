package edu.quinnipiac.ser210.basiconlineandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class HomeScreen extends AppCompatActivity {

    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        //Attach the SectionsPagerAdapter to theViewPager

//        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
//        ViewPager pager = (ViewPager) findViewById(R.id.pager);
//        pager.setAdapter(pagerAdapter);

//        //Attach the ViewPager to the TabLayout
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(pager);
//    }




//private class SectionsPagerAdapter extends FragmentPagerAdapter {
//    public SectionsPagerAdapter(FragmentManager fm) {
//        super(fm);
//    }
//
//    @Override
//    public int getCount() {
//        return 7;
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//        switch (position) {
//
//            case 0:
//                return new internetBrowserInformation();
//            case 1:
//                return new learnAboutComputerParts();
//            case 2:
//                return new learnAboutInternetBrowser();
//            case 3:
//                return new learnAboutOnlineSafety();
//            case 4:
//                return new learnAboutSocialMedia();
//            case 5:
//                return new onlineSafetyInformation();
//            case 6:
//                return new socialMediaInformation();
//            case 7:
//                return new quizFeature();
//
//        }
//        return null;
//    }

//    @Override
//    public CharSequence getPageTitle(int position) {
//        switch (position) {
//            case 0:
//                return getResources().getText(R.string.home_tab); // example for tabs pizza to
//            case 1:
//                return getResources().getText(R.string.);
//            case 2:
//                return getResources().getText(R.string.);
//            case 3:
//                return getResources().getText(R.string.);
//        }
//        return null;
//
//    }



}




}









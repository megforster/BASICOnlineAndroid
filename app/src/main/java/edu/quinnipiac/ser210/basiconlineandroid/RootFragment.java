
/*
Authors: Megan Forster and Alexandra Martin
Basic Online for Android
Android Development Final Project
2 May 2020
 */

package edu.quinnipiac.ser210.basiconlineandroid;


import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class RootFragment extends Fragment {

    //private static final String TAG = "RootFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /* Inflate the layout for this fragment */
        View view = inflater.inflate(R.layout.fragment_root, container, false);

        FragmentTransaction transaction = getFragmentManager()
                .beginTransaction();

        //Initially eplaces base fragment with home buttons screen
        transaction.replace(R.id.root_frame, new homeButtons());

        transaction.commit();

        return view;
    }


}

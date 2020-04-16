package edu.quinnipiac.ser210.basiconlineandroid;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class internetBrowserInformation extends Fragment {

    View view;
    String text;
    public internetBrowserInformation(String text) {
        this.text = text;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_internet_browser_information, container, false);
        setText(text);
        return view;
    }

    public void setText(String text){
        TextView textV = view.findViewById(R.id.text);
        textV.setText(text);
    }


}

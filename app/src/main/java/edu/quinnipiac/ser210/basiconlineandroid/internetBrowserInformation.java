package edu.quinnipiac.ser210.basiconlineandroid;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class internetBrowserInformation extends Fragment {

    View view;
    String text;

    //Gets the user selected text to be used for setting the fragment text
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

    //Changes fragment text to match user selection and enables scrolling
    public void setText(String text){
        TextView textV = view.findViewById(R.id.text);
        textV.setText(text);
        textV.setMovementMethod(new ScrollingMovementMethod());
    }


}

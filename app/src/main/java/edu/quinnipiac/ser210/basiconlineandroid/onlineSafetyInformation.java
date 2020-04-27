package edu.quinnipiac.ser210.basiconlineandroid;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class onlineSafetyInformation extends Fragment {

    View view;
    String text;

    public onlineSafetyInformation(String text) {
        this.text = text;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_online_safety_information, container, false);
        setText(text);
        return view;
    }

    public void setText(String text){
        TextView textV = view.findViewById(R.id.text);
        textV.setText(text);
        textV.setMovementMethod(new ScrollingMovementMethod());
    }


}

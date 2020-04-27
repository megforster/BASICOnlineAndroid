package edu.quinnipiac.ser210.basiconlineandroid;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class computerPartsInformation extends Fragment {

    View view;
    String text;
    public computerPartsInformation(String text) {
        this.text = text;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_computer_parts_information, container, false);
        setText(text);
        return view;
    }

    public void setText(String text){
        TextView textV = view.findViewById(R.id.text);
        textV.setText(text);
        textV.setMovementMethod(new ScrollingMovementMethod());
    }

}
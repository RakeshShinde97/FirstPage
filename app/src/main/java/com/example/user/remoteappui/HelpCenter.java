package com.example.user.remoteappui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User on 12/13/2017.
 */

public class HelpCenter extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.helpcenter, container, false);
//        ImageButton imgbtnHelp = (ImageButton)rootView.findViewById(R.id.btnHelp);
//        imgbtnHelp.setImageResource(R.drawable.help);
        return rootView;
    }
}

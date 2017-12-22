package com.example.user.remoteappui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;


public class Registration extends Fragment implements OnClickListener{
    View rootView;
    String TAG = "Debugg";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.registration, container, false);
        Button btnRegister = (Button)rootView.findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);
        return rootView;
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnRegister)
        {
            Log.i(TAG, "btnRegister is pressed ");
        }
    }
}

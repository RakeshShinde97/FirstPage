package com.example.user.remoteappui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by User on 12/13/2017.
 */
public class Login extends Fragment{

    String TAG = "Debugg";
    Button btnLogin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.login, container, false);

        return rootView;
    }


}


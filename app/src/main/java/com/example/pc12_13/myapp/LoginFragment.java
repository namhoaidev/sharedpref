package com.example.pc12_13.myapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginFragment extends Fragment{
    @BindView(R.id.edtUsername) EditText edtUsername;
    @BindView(R.id.edtPassword) EditText edtPassword;
    @BindView(R.id.cbShow) CheckBox cbShow;
    @BindView(R.id.btnLogin) Button btnLogin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_login, container, false);
        ButterKnife.bind(this, view);
            
        btnLogin.setOnClickListener(v -> {
        });

        return view;
    }
}

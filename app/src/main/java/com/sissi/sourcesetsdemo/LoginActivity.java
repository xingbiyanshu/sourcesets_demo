package com.sissi.sourcesetsdemo;

import android.os.Bundle;
import android.view.View;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void onLoginSuccess(View view) {
        emit(EmEvent.LOGIN_SUCCESS);
    }
}

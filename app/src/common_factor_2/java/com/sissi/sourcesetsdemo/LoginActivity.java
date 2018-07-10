package com.sissi.sourcesetsdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ((TextView)findViewById(R.id.content)).setText("here is common_factor_2 sourceset");
    }


    public void onLoginSuccess(View view) {
        emit(EmEvent.LOGIN_SUCCESS);
    }
}

package com.sissi.sourcesetsdemo;

import android.os.Bundle;
import android.view.View;

import static com.sissi.sourcesetsdemo.EmEvent.LOGIN_SUCCESS;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onLoginSuccess(View view) {
        emit(LOGIN_SUCCESS);
    }
}

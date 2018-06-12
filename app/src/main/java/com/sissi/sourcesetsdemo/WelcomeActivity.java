package com.sissi.sourcesetsdemo;

import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void onWelcomeFinished(View view) {
        emit(EmEvent.WELCOME_FINISHED);
    }
}

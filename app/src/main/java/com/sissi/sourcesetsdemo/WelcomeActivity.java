package com.sissi.sourcesetsdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ((TextView)findViewById(R.id.content)).setText("here is main sourceset");
    }

    public void onWelcomeFinished(View view) {
        emit(EmEvent.WELCOME_FINISHED);
    }
}

package com.sissi.sourcesetsdemo;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class CActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        ((TextView)findViewById(R.id.content)).setText("here is common_factor_1 sourceset");
    }

}

package com.sissi.sourcesetsdemo;

import android.app.Activity;

/**
 * Created by Sissi on 2018/6/8.
 */

public class BaseActivity extends Activity {
    private ActivitySwitcher as = ActivitySwitcher.instance();

    protected void emit(EmEvent event){
        as.startActivity(this, event);
    }
}

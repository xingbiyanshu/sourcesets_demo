package com.sissi.sourcesetsdemo;

import android.app.Activity;

/**
 * Created by Sissi on 2018/6/8.
 */

public class BaseActivity extends Activity {
    private IntentDispatcher intentDispatcher = IntentDispatcher.instance();
    private AccessoryIntentDispatcher accessoryIntentDispatcher = AccessoryIntentDispatcher.instance();

    protected void emit(EmEvent event){
        if (!intentDispatcher.processEvent(this, event)){
            accessoryIntentDispatcher.processEvent(this, event);
        }
    }
}

package com.sissi.sourcesetsdemo;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Sissi on 2018/6/8.
 */

public class ActivitySwitcher {
    private static ActivitySwitcher instance = new ActivitySwitcher();

    private ActivitySwitcher(){}

    public static ActivitySwitcher instance(){
        return instance;
    }

    public void startActivity(Context context, EmEvent event){
        Intent intent = new Intent();
        if (EmEvent.LOGIN_SUCCESS.equals(event)){
            intent.setClass(context, AActivity.class);
            context.startActivity(intent);
        }
    }
}

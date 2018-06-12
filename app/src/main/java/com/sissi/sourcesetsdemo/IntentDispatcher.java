package com.sissi.sourcesetsdemo;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Sissi on 2018/6/12.
 */
// common intent dispatcher applied to all source sets
public class IntentDispatcher {
    private static IntentDispatcher instance = new IntentDispatcher();

    private IntentDispatcher(){}

    public static IntentDispatcher instance(){
        return instance;
    }

    public boolean processEvent(Context context, EmEvent event){
        Intent intent = new Intent();
        if (EmEvent.WELCOME_FINISHED.equals(event)){
            intent.setClass(context, LoginActivity.class);
            context.startActivity(intent);
        }else{
            return false;
        }

        return true;
    }
}

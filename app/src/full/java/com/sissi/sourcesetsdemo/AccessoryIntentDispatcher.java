package com.sissi.sourcesetsdemo;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Sissi on 2018/6/12.
 */
// special intent dispatcher only applied to this source sets
public class AccessoryIntentDispatcher {
    private static AccessoryIntentDispatcher instance = new AccessoryIntentDispatcher();

    private AccessoryIntentDispatcher(){}

    public static AccessoryIntentDispatcher instance(){
        return instance;
    }

    public boolean processEvent(Context context, EmEvent event){
        Intent intent = new Intent();
        if (EmEvent.LOGIN_SUCCESS.equals(event)){
            intent.setClass(context, CActivity.class);
            context.startActivity(intent);
        }else{
            return false;
        }

        return true;
    }
}

gradle sourceset测试，以后tt、sky、sm等不用拉新流。源集测试：

用例1：
main/moduleA
debug/moduleB{使用moduleA的方法}

用例2：
main/moduleA
debug/moduleA（定义和main/moduleA相同的方法，看是否覆盖）

用例3：
main/moduleA<-moduleC (<-表示依赖，简单点说为activity跳转的关系)
debug/moduleB(现在要使得依赖关系变为A<-B<-C，能不改变main源集吗)
解耦activity之间的跳转？写一个全局控制跳转类 ActivitySwitcher （BaseActivity中引用），定义“事件->界面跳转”映射关系（事件最终写入android的intent）？
如(OnLoginSuccess, MainUI)，表示期望登录成功后跳转到MainUI界面，如(OnConferenceRoomClicked, ConfRoom)，表示点击会议室图标后跳转到会议室界面，

ActivitySwitcher{
switch(intent){
    int ev = intent.getEvent();
    Activity act = getTarget(ev);
    intent.setActivity(act);
    startActivity(intent);
}
}

BaseActivity{
ActivitySwitcher as;
emitIntent(intent){
    as.switch(intent);
}
}

LoginActivity implements LoginPresenter.LoginResultListener{

    public void onLoginResult(int resCode){
    
        if (success){
            new intent;
            intent.setevent(OnLoginSuccess);
            emitIntent(intent);
        }
    }
    
}


关键在于各activity只发射自身事件，而不关注该事件触发什么跳转，这样就解除了和外部的耦合。

如果这样的话，在将“A跳到C”改为“A跳到B跳到C”时，只需在源集debug中定制ActivitySwitcher。如果考虑Fragment的情形呢？
在fragA中点击按钮弹开fragB，现在要改为弹开fragC；先把activity和fragment解耦
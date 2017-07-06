package com.example.nhdangdh.callbackpractice;

import android.app.Activity;

public class CallBackFinishApp implements CallBack {

    Activity activity;

    @Override
    public void finishApp() {
        activity.finish();
    }
}

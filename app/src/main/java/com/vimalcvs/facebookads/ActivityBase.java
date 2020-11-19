package com.vimalcvs.facebookads;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;

/**
 *  https://github.com/vimalcvs
 *
 *  Date: 19/11/2020
 */

public class ActivityBase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AudienceNetworkAds.initialize(this);
    }
}

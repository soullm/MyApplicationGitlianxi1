package com.example.soul.myapplication;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

public class Appsss extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UMConfigure.init(this,"5ad55c0bf43e4867a100002b"
                ,"umeng",UMConfigure.DEVICE_TYPE_PHONE,"");//58edcfeb310c93091c000be2 5965ee00734be40b580001a0
        PlatformConfig.setQQZone("1106769767","4zXpGAfrRV2EyAuB");
        PlatformConfig.setSinaWeibo("3490511228","4dda820c24755ae629cd70e29ed000c0","http://sns.whalecloud.com/sina2/callback");
    }
}

package com.example.mac.plugintest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by shake on 17-4-6.
 */
public class SecondService extends Service {


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("TAG", "执行了插件中SecondService的onCreate方法");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.i("TAG", "执行了插件中SecondService的onCreate方法，参数intent是："+intent+",参数startId是："+startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "执行了插件中SecondService的onDestroy方法");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }



}

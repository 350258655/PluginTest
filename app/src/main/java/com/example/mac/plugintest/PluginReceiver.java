package com.example.mac.plugintest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by shake on 17-4-6.
 */
public class PluginReceiver extends BroadcastReceiver {

    static final String SEND_ACTION = "com.example.mac.plugintest.PLUGIN_ACTION";

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "这里来自插件的吐司", Toast.LENGTH_SHORT).show();
        context.sendBroadcast(new Intent(SEND_ACTION));
    }
}

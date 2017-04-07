package com.example.mac.plugintest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by shake on 17-4-1.
 */
public class BaoshouActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("我是保守Activity");

        setContentView(tv);
    }
}

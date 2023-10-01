package com.example.wifi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
 * NOTE:  Starting from Android 10 (API level 29) and above, there are restrictions on changing Wi-Fi state programmatically.
 *        Android has tightened security and privacy measures.
 *        So, This code will not work for Android 10 (API level 29) and above. 
 */

public class MainActivity extends AppCompatActivity {

    Button on,off;
    WifiManager wm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        on = (Button) findViewById(R.id.turn_on);
        off = (Button) findViewById(R.id.turn_off);

        wm = (WifiManager) getSystemService(Context.WIFI_SERVICE);


        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wm.isWifiEnabled()){
                    wm.setWifiEnabled(false);
                }
                Toast.makeText(MainActivity.this, "turn on", Toast.LENGTH_SHORT).show();
            }
        });

        off.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!wm.isWifiEnabled()){
                    wm.setWifiEnabled(true);
                }
                Toast.makeText(MainActivity.this, "turn off", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
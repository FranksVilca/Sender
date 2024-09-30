package com.example.sender;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class WeatherBroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String message = intent.getStringExtra("message");
        Toast.makeText(context, "Mensaje recibido: " + message, Toast.LENGTH_LONG).show();
    }
}

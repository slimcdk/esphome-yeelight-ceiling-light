package com.yeelight.yeelib.service;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import com.yeelight.yeelib.managers.C8272e;

@RequiresApi(api = 21)
public class ConnectionStateMonitor extends ConnectivityManager.NetworkCallback {
    public static final String TAG = ConnectionStateMonitor.class.getSimpleName();
    final NetworkRequest networkRequest = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).build();

    public void enable(Context context) {
        ((ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(this.networkRequest, this);
    }

    public void onAvailable(Network network) {
        C8272e.m19511b().mo35213n();
    }

    public void onLost(Network network) {
        C8272e.m19511b().mo35213n();
    }

    public void onUnavailable() {
        C8272e.m19511b().mo35213n();
    }
}

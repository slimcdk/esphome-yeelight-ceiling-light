package com.yeelight.yeelib.service;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import com.yeelight.yeelib.p152f.C9784e;

@RequiresApi(api = 21)
public class ConnectionStateMonitor extends ConnectivityManager.NetworkCallback {
    public static final String TAG = ConnectionStateMonitor.class.getSimpleName();
    final NetworkRequest networkRequest = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).build();

    public void enable(Context context) {
        ((ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(this.networkRequest, this);
    }

    public void onAvailable(Network network) {
        C9784e.m23711b().mo31637n();
    }

    public void onLost(Network network) {
        C9784e.m23711b().mo31637n();
    }

    public void onUnavailable() {
        C9784e.m23711b().mo31637n();
    }
}

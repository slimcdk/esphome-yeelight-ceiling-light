package com.miot.service.connection.wifi;

import android.net.ConnectivityManager;
import android.net.Network;

public abstract class QConnectCallback {
    public ConnectivityManager.NetworkCallback callback;

    public void onAvailable(Network network) {
    }

    public void onLost(Network network) {
    }

    public void onUnavailable() {
    }
}

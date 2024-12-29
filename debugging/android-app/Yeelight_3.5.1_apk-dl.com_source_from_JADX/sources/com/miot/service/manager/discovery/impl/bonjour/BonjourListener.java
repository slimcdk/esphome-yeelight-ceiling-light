package com.miot.service.manager.discovery.impl.bonjour;

import com.miot.service.manager.discovery.impl.bonjour.serviceinfo.BonjourServiceInfo;

public interface BonjourListener {
    void onServiceFound(BonjourServiceInfo bonjourServiceInfo);

    void onServiceLost(BonjourServiceInfo bonjourServiceInfo);

    void onStartFailed();

    void onStarted();

    void onStopped();
}

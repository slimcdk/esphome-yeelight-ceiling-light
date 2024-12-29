package com.miot.service.manager.discovery.impl.bonjour;

import com.miot.service.manager.discovery.impl.bonjour.serviceinfo.BonjourServiceInfo;

public interface Bonjour {
    void registerService(BonjourServiceInfo bonjourServiceInfo);

    void setListener(BonjourListener bonjourListener);

    void start();

    void startDiscovery(String str);

    void stop();

    void stopAllDiscovery();

    void unregisterService(BonjourServiceInfo bonjourServiceInfo);
}

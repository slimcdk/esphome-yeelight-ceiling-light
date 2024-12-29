package com.miot.service.manager.discovery.impl.bonjour.serviceinfo;

import java.util.Map;

public interface BonjourServiceInfo {
    String getIp();

    String getName();

    int getPort();

    Map<String, String> getProperties();

    String getType();

    void setIp(String str);

    void setName(String str);

    void setPort(int i);

    void setProperties(Map<String, String> map);

    void setType(String str);
}

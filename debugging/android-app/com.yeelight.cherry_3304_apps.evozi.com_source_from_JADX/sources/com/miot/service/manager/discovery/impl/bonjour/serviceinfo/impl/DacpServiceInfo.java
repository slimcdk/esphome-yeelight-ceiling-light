package com.miot.service.manager.discovery.impl.bonjour.serviceinfo.impl;

import com.miot.service.manager.discovery.impl.bonjour.serviceinfo.BonjourServiceInfo;
import com.miot.service.manager.timer.TimerCodec;
import java.util.HashMap;
import java.util.Map;

public class DacpServiceInfo implements BonjourServiceInfo {
    public static final String SERVICE_TYPE = "_dacp._tcp";

    /* renamed from: ip */
    private String f6710ip = null;
    private Map<String, String> mProperties;
    private String name = null;
    private int port = 0;
    private String type = null;

    public DacpServiceInfo(String str, int i) {
        HashMap hashMap = new HashMap();
        this.mProperties = hashMap;
        this.type = SERVICE_TYPE;
        this.name = str;
        this.port = i;
        hashMap.put("txtvers", TimerCodec.ENABLE);
        this.mProperties.put("Ver", "131075");
        this.mProperties.put("DbId", "63B5E5C0C201542E");
        this.mProperties.put("OSsi", "0x1F5");
    }

    public String getIp() {
        return this.f6710ip;
    }

    public String getName() {
        return this.name;
    }

    public int getPort() {
        return this.port;
    }

    public Map<String, String> getProperties() {
        return this.mProperties;
    }

    public String getType() {
        return this.type;
    }

    public void setIp(String str) {
        this.f6710ip = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setProperties(Map<String, String> map) {
        this.mProperties = map;
    }

    public void setType(String str) {
        this.type = str;
    }
}

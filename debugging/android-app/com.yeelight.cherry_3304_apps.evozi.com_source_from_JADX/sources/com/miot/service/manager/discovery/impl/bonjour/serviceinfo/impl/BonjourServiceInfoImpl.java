package com.miot.service.manager.discovery.impl.bonjour.serviceinfo.impl;

import com.miot.service.manager.discovery.impl.bonjour.serviceinfo.BonjourServiceInfo;
import java.util.HashMap;
import java.util.Map;

public class BonjourServiceInfoImpl implements BonjourServiceInfo {

    /* renamed from: ip */
    private String f6709ip;
    private String name;
    private int port;
    private Map<String, String> properties = new HashMap();
    private String type;

    public String getIp() {
        return this.f6709ip;
    }

    public String getName() {
        return this.name;
    }

    public int getPort() {
        return this.port;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }

    public String getType() {
        return this.type;
    }

    public void setIp(String str) {
        this.f6709ip = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setProperties(Map<String, String> map) {
        this.properties = map;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "name: " + this.name + " type" + this.type + " ip:" + this.f6709ip + " port:" + this.port;
    }
}

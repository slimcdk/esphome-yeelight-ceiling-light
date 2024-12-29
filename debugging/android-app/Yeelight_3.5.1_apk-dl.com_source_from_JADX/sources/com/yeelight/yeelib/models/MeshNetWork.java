package com.yeelight.yeelib.models;

import java.io.Serializable;

public class MeshNetWork implements Serializable {

    /* renamed from: id */
    private int f14265id;
    private String name = "yeelight_ms";
    private String networkName = "yeelight_ms";
    private String password = "YLu2M80aE";

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof MeshNetWork)) {
            return false;
        }
        MeshNetWork meshNetWork = (MeshNetWork) obj;
        return meshNetWork.getNetworkName().equals(getNetworkName()) && meshNetWork.getPassword().equals(getPassword());
    }

    public int getId() {
        return this.f14265id;
    }

    public String getName() {
        return this.name;
    }

    public String getNetworkName() {
        return this.networkName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(int i) {
        this.f14265id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNetworkName(String str) {
        this.networkName = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String toString() {
        return "MeshNetWork{id=" + this.f14265id + ", name='" + this.name + '\'' + ", networkName='" + this.networkName + '\'' + ", password='" + this.password + '\'' + '}';
    }
}

package com.miot.service.manager.discovery.impl;

import android.text.TextUtils;
import com.google.gson.C2469e;
import com.miot.common.utils.Logger;
import java.util.Map;
import org.json.JSONObject;

public class MiotWanDevice {
    private static final String TAG = "MiotWanDevice";
    private int adminFlag;
    private String bssid;
    private String did;
    private Map<String, Object> extra;
    private boolean isOnline;
    private double latitude;
    private String localip;
    private double longitude;
    private String mac;
    private String model;
    private String name;
    private OwnerBean owner;
    private String parent_id;
    private String parent_model;
    private String pid;
    private Map<String, Object> prop;
    private int shareFlag;
    private String ssid;
    private String token;

    public static class OwnerBean {
        private String icon;
        private String nickname;
        private String userid;

        public String getIcon() {
            return this.icon;
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getUserid() {
            return this.userid;
        }
    }

    public static MiotWanDevice create(JSONObject jSONObject) {
        C2469e eVar = new C2469e();
        String jSONObject2 = jSONObject.toString();
        Logger.m7499d(TAG, "device: " + jSONObject2);
        try {
            return (MiotWanDevice) eVar.mo19225h(jSONObject2, MiotWanDevice.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getBssid() {
        return this.bssid;
    }

    public String getDeviceId() {
        return this.did;
    }

    public Map<String, Object> getExtra() {
        return this.extra;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public String getLocalIp() {
        return this.localip;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getMacAddress() {
        return this.mac;
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }

    public OwnerBean getOwner() {
        return this.owner;
    }

    public String getParentDeviceId() {
        return this.parent_id;
    }

    public String getParentModel() {
        return this.parent_model;
    }

    public String getPid() {
        return this.pid;
    }

    public Map<String, Object> getProp() {
        return this.prop;
    }

    public String getSsid() {
        return this.ssid;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isMainDevice() {
        return TextUtils.isEmpty(this.parent_id);
    }

    public boolean isMine() {
        return this.adminFlag == 1;
    }

    public boolean isOnline() {
        return this.isOnline;
    }

    public boolean isShared() {
        return this.shareFlag == 1;
    }

    public void setName(String str) {
        this.name = str;
    }
}

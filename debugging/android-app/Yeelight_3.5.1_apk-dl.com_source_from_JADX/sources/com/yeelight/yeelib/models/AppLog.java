package com.yeelight.yeelib.models;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLog implements Serializable {
    private String device_id;

    /* renamed from: id */
    private int f14263id;
    private String operate;
    private String operate_at;
    private String operate_extra;

    public AppLog() {
        this.f14263id = 0;
        this.operate = "";
        this.operate_at = "";
        this.operate_extra = "";
        this.device_id = "";
    }

    public AppLog(String str, String str2, String str3) {
        this(str, str2, "", str3);
    }

    public AppLog(String str, String str2, String str3, String str4) {
        this.f14263id = 0;
        this.operate = "";
        this.operate_at = "";
        this.operate_extra = "";
        this.device_id = "";
        this.operate = str;
        this.operate_at = str2;
        this.operate_extra = str3;
        setDevice_id(str4);
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public int getId() {
        return this.f14263id;
    }

    public String getOperate() {
        return this.operate;
    }

    public String getOperate_at() {
        return this.operate_at;
    }

    public String getOperate_extra() {
        return this.operate_extra;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setId(int i) {
        this.f14263id = i;
    }

    public void setOperate(String str) {
        this.operate = str;
    }

    public void setOperate_at(String str) {
        this.operate_at = str;
    }

    public void setOperate_extra(String str) {
        this.operate_extra = str;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("operate", this.operate);
            jSONObject.put("operate_at", this.operate_at);
            jSONObject.put("operate_extra", this.operate_extra);
            jSONObject.put("device_id", this.device_id);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}

package com.miot.common.share;

import com.google.gson.C2469e;
import org.json.JSONObject;

public final class SharedRequestBean {
    private long ctime;
    private String device_name;
    private String did;
    private long expire_time;
    private int inv_id;
    private String model;
    private String msgId;
    private String sender;
    private String sender_name;
    private int status;

    private SharedRequestBean() {
    }

    public static SharedRequestBean create(JSONObject jSONObject) {
        try {
            return (SharedRequestBean) new C2469e().mo19225h(jSONObject.toString(), SharedRequestBean.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getDeviceId() {
        return this.did;
    }

    public String getDeviceName() {
        return this.device_name;
    }

    public long getExpireTime() {
        return this.expire_time;
    }

    public int getInvitedId() {
        return this.inv_id;
    }

    public String getMessageId() {
        return this.msgId;
    }

    public String getModel() {
        return this.model;
    }

    public String getOwnerId() {
        return this.sender;
    }

    public String getOwnerName() {
        return this.sender_name;
    }

    public int getShareStatus() {
        return this.status;
    }

    public long getShareTime() {
        return this.ctime;
    }
}

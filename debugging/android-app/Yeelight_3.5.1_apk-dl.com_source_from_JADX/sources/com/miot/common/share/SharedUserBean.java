package com.miot.common.share;

import com.google.gson.C2469e;
import org.json.JSONObject;

public final class SharedUserBean {
    private String icon;
    private String nickname;
    private int sharetime;
    private int status;
    private String userid;

    private SharedUserBean() {
    }

    public static SharedUserBean create(JSONObject jSONObject) {
        try {
            return (SharedUserBean) new C2469e().mo19225h(jSONObject.toString(), SharedUserBean.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getIcon() {
        return this.icon;
    }

    public int getShareStatus() {
        return this.status;
    }

    public int getShareTime() {
        return this.sharetime;
    }

    public String getUserId() {
        return this.userid;
    }

    public String getUserName() {
        return this.nickname;
    }
}

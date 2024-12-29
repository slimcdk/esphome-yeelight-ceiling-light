package com.yeelight.yeelib.models;

import com.miot.service.qrcode.ScanBarcodeActivity;
import java.io.Serializable;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class SceneTemplateBean implements Serializable {
    protected int mBright;
    protected int mColor;
    protected int mCt;
    protected String mDescription;
    private Set<String> mDeviceIds;
    private int mIconId;
    protected String mMethodParam;
    protected int mNightBright;
    private String mOnoff;
    protected String mTemplateId;
    protected String mTitle;

    public SceneTemplateBean(JSONObject jSONObject) {
        try {
            this.mTemplateId = jSONObject.getString("id");
            this.mIconId = jSONObject.getInt("icon_id");
            this.mTitle = jSONObject.getString(ScanBarcodeActivity.TITLE);
            this.mBright = jSONObject.getInt("bright");
            this.mCt = jSONObject.getInt("color_temperature");
            this.mColor = jSONObject.getInt("wrgb");
            this.mMethodParam = jSONObject.getString("colorflow");
            this.mDescription = jSONObject.getString("description");
            this.mNightBright = jSONObject.getInt("night_bright");
            this.mOnoff = jSONObject.getString("onoff");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public int getBright() {
        return this.mBright;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getCt() {
        return this.mCt;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public Set<String> getDeviceIds() {
        return this.mDeviceIds;
    }

    public int getIconId() {
        return this.mIconId;
    }

    public String getMethodParam() {
        return this.mMethodParam;
    }

    public int getNightBright() {
        return this.mNightBright;
    }

    public String getOnoff() {
        return this.mOnoff;
    }

    public String getTemplateId() {
        return this.mTemplateId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setDeviceIds(Set<String> set) {
        this.mDeviceIds = set;
    }

    public void setIconId(int i) {
        this.mIconId = i;
    }
}

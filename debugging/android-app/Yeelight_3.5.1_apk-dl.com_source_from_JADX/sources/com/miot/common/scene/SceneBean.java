package com.miot.common.scene;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.C2469e;
import com.miot.service.manager.timer.TimerCodec;
import org.json.JSONObject;

public class SceneBean implements Parcelable {
    public static final Parcelable.Creator<SceneBean> CREATOR = new Parcelable.Creator<SceneBean>() {
        public SceneBean createFromParcel(Parcel parcel) {
            return new SceneBean(parcel);
        }

        public SceneBean[] newArray(int i) {
            return new SceneBean[i];
        }
    };
    private Object authed;
    private int home_id;
    private String identify;
    private String local_dev;
    private String name;
    private SettingBean setting;
    private int sr_id;
    private int st_id;
    private int status;
    private int type;
    private int uid;
    private int us_id;

    public static class SettingBean implements Parcelable {
        public static final Parcelable.Creator<SettingBean> CREATOR = new Parcelable.Creator<SettingBean>() {
            public SettingBean createFromParcel(Parcel parcel) {
                return new SettingBean(parcel);
            }

            public SettingBean[] newArray(int i) {
                return new SettingBean[i];
            }
        };
        private Object action_list;
        private String enable;
        private String enable_push;
        private Object launch;

        public SettingBean() {
        }

        protected SettingBean(Parcel parcel) {
            Class<Object> cls = Object.class;
            this.enable = parcel.readString();
            this.enable_push = parcel.readString();
            this.launch = parcel.readValue(cls.getClassLoader());
            this.action_list = parcel.readValue(cls.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public Object getActionList() {
            return this.action_list;
        }

        public boolean getEnablePush() {
            return TextUtils.equals(this.enable_push, TimerCodec.ENABLE);
        }

        public Object getLaunch() {
            return this.launch;
        }

        public boolean isEnable() {
            return TextUtils.equals(this.enable, TimerCodec.ENABLE);
        }

        public void setEnable(boolean z) {
            this.enable = z ? TimerCodec.ENABLE : TimerCodec.DISENABLE;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.enable);
            parcel.writeString(this.enable_push);
            parcel.writeValue(this.launch);
            parcel.writeValue(this.action_list);
        }
    }

    public SceneBean() {
    }

    protected SceneBean(Parcel parcel) {
        this.us_id = parcel.readInt();
        this.type = parcel.readInt();
        this.status = parcel.readInt();
        this.home_id = parcel.readInt();
        this.uid = parcel.readInt();
        this.name = parcel.readString();
        this.st_id = parcel.readInt();
        this.sr_id = parcel.readInt();
        this.identify = parcel.readString();
        this.local_dev = parcel.readString();
        this.setting = (SettingBean) parcel.readParcelable(SettingBean.class.getClassLoader());
        this.authed = parcel.readValue(Object.class.getClassLoader());
    }

    public static SceneBean create(JSONObject jSONObject) {
        try {
            return (SceneBean) new C2469e().mo19225h(jSONObject.toString(), SceneBean.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public int getSceneId() {
        return this.us_id;
    }

    public SettingBean getSetting() {
        return this.setting;
    }

    public boolean isEnable() {
        return this.setting.isEnable();
    }

    public void setEnable(boolean z) {
        this.setting.setEnable(z);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.us_id);
        parcel.writeInt(this.type);
        parcel.writeInt(this.status);
        parcel.writeInt(this.home_id);
        parcel.writeInt(this.uid);
        parcel.writeString(this.name);
        parcel.writeInt(this.st_id);
        parcel.writeInt(this.sr_id);
        parcel.writeString(this.identify);
        parcel.writeString(this.local_dev);
        parcel.writeParcelable(this.setting, i);
        parcel.writeValue(this.authed);
    }
}

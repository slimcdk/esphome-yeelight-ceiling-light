package com.p022mi.iot.runtime.wan.http.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.mi.iot.runtime.wan.http.bean.DeviceBeen */
public class DeviceBeen {
    @SerializedName("devices")
    public List<DeviceBean> deviceBeans;

    /* renamed from: com.mi.iot.runtime.wan.http.bean.DeviceBeen$DeviceBean */
    public static class DeviceBean {
        @SerializedName("category")
        public String category;
        @SerializedName("cloud_id")
        public String cloud_id;
        @SerializedName("did")
        public String deviceId;
        @SerializedName("is_shared")
        public boolean isShared;
        @SerializedName("last_update_timestamp")
        public String last_update_timestamp;
        @SerializedName("mac")
        public String mac;
        @SerializedName("model")
        public String model;
        @SerializedName("name")
        public String name;
        @SerializedName("online")
        public boolean online;
        @SerializedName("pdid")
        public String parentDeviceId;
        @SerializedName("real_did")
        public String real_did;
        @SerializedName("rid")
        public String roomId;
        @SerializedName("type")
        public String type;
    }
}

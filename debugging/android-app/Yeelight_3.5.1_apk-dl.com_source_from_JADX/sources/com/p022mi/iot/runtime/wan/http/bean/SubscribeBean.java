package com.p022mi.iot.runtime.wan.http.bean;

import com.google.gson.annotations.SerializedName;
import com.p022mi.iot.runtime.wan.http.bean.PropertyBeen;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mi.iot.runtime.wan.http.bean.SubscribeBean */
public class SubscribeBean {
    public String authorization;
    @SerializedName("push-id")
    public String identifier;
    public List<String> properties = new ArrayList();
    public String topic;
    public String type;
    @SerializedName("receive-url")
    public String url;

    /* renamed from: com.mi.iot.runtime.wan.http.bean.SubscribeBean$Receiver */
    public static class Receiver {
        public String authorization;
        @SerializedName("push-id")
        public String identifier;
        public String type;
        @SerializedName("receiver-url")
        public String url;
    }

    /* renamed from: com.mi.iot.runtime.wan.http.bean.SubscribeBean$Response */
    public static class Response {
        public int expired;
        public List<PropertyBeen.PropertyBean> properties = new ArrayList();
    }
}

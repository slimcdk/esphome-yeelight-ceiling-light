package com.p146mi.iot.runtime.wan.http.bean;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mi.iot.runtime.wan.http.bean.PropertyBeen */
public class PropertyBeen {
    @SerializedName("oid")
    public String opId;
    @SerializedName("properties")
    public List<PropertyBean> propertyBeans = new ArrayList();

    /* renamed from: com.mi.iot.runtime.wan.http.bean.PropertyBeen$PropertyBean */
    public static class PropertyBean {
        @SerializedName("pid")
        public String pid;
        @SerializedName("status")
        public int status;
        @SerializedName("value")
        public Object value;
    }

    public void addPropertyBean(PropertyBean propertyBean) {
        this.propertyBeans.add(propertyBean);
    }
}

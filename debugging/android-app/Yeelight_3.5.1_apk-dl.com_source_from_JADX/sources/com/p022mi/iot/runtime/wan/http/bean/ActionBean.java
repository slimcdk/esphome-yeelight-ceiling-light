package com.p022mi.iot.runtime.wan.http.bean;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mi.iot.runtime.wan.http.bean.ActionBean */
public class ActionBean {
    @SerializedName("aid")
    public String aid;
    @SerializedName("description")
    public String description;
    @SerializedName("in")
    public List<Object> inArgs = new ArrayList();
    @SerializedName("oid")
    public String opId;
    @SerializedName("out")
    public List<Object> outArgs;
    @SerializedName("status")
    public int status;
}

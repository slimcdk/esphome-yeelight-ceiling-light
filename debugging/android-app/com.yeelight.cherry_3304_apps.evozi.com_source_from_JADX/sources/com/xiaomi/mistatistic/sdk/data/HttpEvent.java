package com.xiaomi.mistatistic.sdk.data;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.xiaomi.mistatistic.sdk.controller.C4113c;
import com.xiaomi.mistatistic.sdk.controller.C4132j;
import com.yeelight.yeelib.p150c.p183m.C7260t;
import org.json.JSONObject;

public class HttpEvent {
    public static final int FLOW_DOWNLOAD = 2;
    public static final int FLOW_UNDEFINED = 0;
    public static final int FLOW_UPLOAD = 1;
    private String exceptionName;
    private long firstPacketCost;
    private int flowStatus;

    /* renamed from: ip */
    private String f7140ip;

    /* renamed from: net  reason: collision with root package name */
    private String f23129net;
    private long netFlow;
    private String operator;
    private String reqId;
    private int responseCode;
    private long time;
    private long timeCost;
    private String url;

    public HttpEvent(String str, long j) {
        this(str, j, -1, (String) null);
    }

    public HttpEvent(String str, long j, int i, String str2) {
        this(str, j, 0, i, str2);
    }

    public HttpEvent(String str, long j, long j2) {
        this(str, j, j2, -1, (String) null);
    }

    public HttpEvent(String str, long j, long j2, int i) {
        this(str, j, j2, i, (String) null);
    }

    public HttpEvent(String str, long j, long j2, int i, String str2) {
        this.time = System.currentTimeMillis();
        this.netFlow = 0;
        this.flowStatus = 0;
        this.url = str;
        this.timeCost = j;
        this.responseCode = i;
        this.exceptionName = str2;
        this.netFlow = j2;
        setNet();
    }

    public HttpEvent(String str, long j, String str2) {
        this(str, j, -1, str2);
    }

    public HttpEvent(String str, String str2) {
        this(str, -1, -1, str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HttpEvent)) {
            return false;
        }
        HttpEvent httpEvent = (HttpEvent) obj;
        return TextUtils.equals(this.url, httpEvent.url) && TextUtils.equals(this.f23129net, httpEvent.f23129net) && TextUtils.equals(this.exceptionName, httpEvent.exceptionName) && TextUtils.equals(this.f7140ip, httpEvent.f7140ip) && this.responseCode == httpEvent.responseCode && this.timeCost == httpEvent.timeCost && this.time == httpEvent.time && this.netFlow == httpEvent.netFlow && this.flowStatus == httpEvent.flowStatus && TextUtils.equals(this.reqId, httpEvent.reqId) && this.firstPacketCost == httpEvent.firstPacketCost;
    }

    public long getFirstPacketCost() {
        return this.firstPacketCost;
    }

    public int getFlowStatus() {
        return this.flowStatus;
    }

    public String getIp() {
        return this.f7140ip;
    }

    public long getNetFlow() {
        return this.netFlow;
    }

    public String getRequestId() {
        return this.reqId;
    }

    public String getUrl() {
        return this.url;
    }

    public void setFirstPacketCost(long j) {
        this.firstPacketCost = j;
    }

    public void setFlowStatus(int i) {
        this.flowStatus = i;
    }

    public void setIp(String str) {
        this.f7140ip = str;
    }

    public void setNet() {
        if (C4113c.m11105a() != null) {
            String b = C4132j.m11194b(C4113c.m11105a());
            if (!TextUtils.isEmpty(b)) {
                this.f23129net = b;
                if (!"WIFI".equalsIgnoreCase(b)) {
                    this.operator = ((TelephonyManager) C4113c.m11105a().getSystemService("phone")).getSimOperator();
                    return;
                }
                return;
            }
        }
        this.f23129net = "NULL";
    }

    public void setNet(String str) {
        this.f23129net = str;
    }

    public void setRequestId(String str) {
        this.reqId = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("net", this.f23129net);
        long j = this.timeCost;
        if (j > 0) {
            jSONObject.put("cost", j);
        }
        long j2 = this.firstPacketCost;
        if (j2 > 0) {
            jSONObject.put("first_byte_t", j2);
        }
        int i = this.responseCode;
        if (i != -1) {
            jSONObject.put("code", i);
        }
        if (!TextUtils.isEmpty(this.exceptionName)) {
            jSONObject.put("exception", this.exceptionName);
        }
        if (!TextUtils.isEmpty(this.operator)) {
            jSONObject.put("op", this.operator);
        }
        long j3 = this.netFlow;
        if (j3 > 0) {
            jSONObject.put("flow", j3);
        }
        int i2 = this.flowStatus;
        if (i2 == 1 || i2 == 2) {
            jSONObject.put("flow_status", this.flowStatus);
        }
        if (!TextUtils.isEmpty(this.reqId)) {
            jSONObject.put("rid", this.reqId);
        }
        if (!TextUtils.isEmpty(this.f7140ip)) {
            jSONObject.put("dns", this.f7140ip);
        }
        jSONObject.put(C7260t.f14794G, this.time);
        return jSONObject;
    }
}

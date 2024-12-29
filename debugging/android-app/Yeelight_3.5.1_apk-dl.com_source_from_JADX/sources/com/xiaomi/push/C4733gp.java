package com.xiaomi.push;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.xiaomi.push.gp */
public class C4733gp extends C4731gn {

    /* renamed from: a */
    private int f8315a = Integer.MIN_VALUE;

    /* renamed from: a */
    private C4734a f8316a = null;

    /* renamed from: a */
    private C4735b f8317a = C4735b.available;

    /* renamed from: b */
    private String f8318b = null;

    /* renamed from: com.xiaomi.push.gp$a */
    public enum C4734a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    /* renamed from: com.xiaomi.push.gp$b */
    public enum C4735b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        f8332g,
        probe
    }

    public C4733gp(Bundle bundle) {
        super(bundle);
        if (bundle.containsKey("ext_pres_type")) {
            this.f8317a = C4735b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.f8318b = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f8315a = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f8316a = C4734a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    public C4733gp(C4735b bVar) {
        mo29265a(bVar);
    }

    /* renamed from: a */
    public Bundle mo29223a() {
        Bundle a = super.mo29223a();
        C4735b bVar = this.f8317a;
        if (bVar != null) {
            a.putString("ext_pres_type", bVar.toString());
        }
        String str = this.f8318b;
        if (str != null) {
            a.putString("ext_pres_status", str);
        }
        int i = this.f8315a;
        if (i != Integer.MIN_VALUE) {
            a.putInt("ext_pres_prio", i);
        }
        C4734a aVar = this.f8316a;
        if (!(aVar == null || aVar == C4734a.available)) {
            a.putString("ext_pres_mode", aVar.toString());
        }
        return a;
    }

    /* renamed from: a */
    public String m14087a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<presence");
        if (mo29262p() != null) {
            sb.append(" xmlns=\"");
            sb.append(mo29262p());
            sb.append("\"");
        }
        if (mo29251j() != null) {
            sb.append(" id=\"");
            sb.append(mo29251j());
            sb.append("\"");
        }
        if (mo29254l() != null) {
            sb.append(" to=\"");
            sb.append(C4745gy.m14115a(mo29254l()));
            sb.append("\"");
        }
        if (mo29256m() != null) {
            sb.append(" from=\"");
            sb.append(C4745gy.m14115a(mo29256m()));
            sb.append("\"");
        }
        if (mo29252k() != null) {
            sb.append(" chid=\"");
            sb.append(C4745gy.m14115a(mo29252k()));
            sb.append("\"");
        }
        if (this.f8317a != null) {
            sb.append(" type=\"");
            sb.append(this.f8317a);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f8318b != null) {
            sb.append("<status>");
            sb.append(C4745gy.m14115a(this.f8318b));
            sb.append("</status>");
        }
        if (this.f8315a != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.f8315a);
            sb.append("</priority>");
        }
        C4734a aVar = this.f8316a;
        if (!(aVar == null || aVar == C4734a.available)) {
            sb.append("<show>");
            sb.append(this.f8316a);
            sb.append("</show>");
        }
        sb.append(mo29260o());
        C4737gr a = mo29223a();
        if (a != null) {
            sb.append(a.mo29267a());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo29263a(int i) {
        if (i < -128 || i > 128) {
            throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
        }
        this.f8315a = i;
    }

    /* renamed from: a */
    public void mo29264a(C4734a aVar) {
        this.f8316a = aVar;
    }

    /* renamed from: a */
    public void mo29265a(C4735b bVar) {
        Objects.requireNonNull(bVar, "Type cannot be null");
        this.f8317a = bVar;
    }

    /* renamed from: a */
    public void mo29228a(String str) {
        this.f8318b = str;
    }
}

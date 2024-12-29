package com.xiaomi.push;

import android.os.Bundle;

/* renamed from: com.xiaomi.push.gl */
public class C4703gl extends C4701gj {

    /* renamed from: a */
    private int f8850a = Integer.MIN_VALUE;

    /* renamed from: a */
    private C4704a f8851a = null;

    /* renamed from: a */
    private C4705b f8852a = C4705b.available;

    /* renamed from: b */
    private String f8853b = null;

    /* renamed from: com.xiaomi.push.gl$a */
    public enum C4704a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    /* renamed from: com.xiaomi.push.gl$b */
    public enum C4705b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        f8867g,
        probe
    }

    public C4703gl(Bundle bundle) {
        super(bundle);
        if (bundle.containsKey("ext_pres_type")) {
            this.f8852a = C4705b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.f8853b = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f8850a = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f8851a = C4704a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    public C4703gl(C4705b bVar) {
        mo25228a(bVar);
    }

    /* renamed from: a */
    public Bundle mo25186a() {
        Bundle a = super.mo25186a();
        C4705b bVar = this.f8852a;
        if (bVar != null) {
            a.putString("ext_pres_type", bVar.toString());
        }
        String str = this.f8853b;
        if (str != null) {
            a.putString("ext_pres_status", str);
        }
        int i = this.f8850a;
        if (i != Integer.MIN_VALUE) {
            a.putInt("ext_pres_prio", i);
        }
        C4704a aVar = this.f8851a;
        if (!(aVar == null || aVar == C4704a.available)) {
            a.putString("ext_pres_mode", aVar.toString());
        }
        return a;
    }

    /* renamed from: a */
    public String m14433a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<presence");
        if (mo25225p() != null) {
            sb.append(" xmlns=\"");
            sb.append(mo25225p());
            sb.append("\"");
        }
        if (mo25214j() != null) {
            sb.append(" id=\"");
            sb.append(mo25214j());
            sb.append("\"");
        }
        if (mo25217l() != null) {
            sb.append(" to=\"");
            sb.append(C4715gu.m14461a(mo25217l()));
            sb.append("\"");
        }
        if (mo25219m() != null) {
            sb.append(" from=\"");
            sb.append(C4715gu.m14461a(mo25219m()));
            sb.append("\"");
        }
        if (mo25215k() != null) {
            sb.append(" chid=\"");
            sb.append(C4715gu.m14461a(mo25215k()));
            sb.append("\"");
        }
        if (this.f8852a != null) {
            sb.append(" type=\"");
            sb.append(this.f8852a);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f8853b != null) {
            sb.append("<status>");
            sb.append(C4715gu.m14461a(this.f8853b));
            sb.append("</status>");
        }
        if (this.f8850a != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.f8850a);
            sb.append("</priority>");
        }
        C4704a aVar = this.f8851a;
        if (!(aVar == null || aVar == C4704a.available)) {
            sb.append("<show>");
            sb.append(this.f8851a);
            sb.append("</show>");
        }
        sb.append(mo25223o());
        C4707gn a = mo25186a();
        if (a != null) {
            sb.append(a.mo25230a());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo25226a(int i) {
        if (i < -128 || i > 128) {
            throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
        }
        this.f8850a = i;
    }

    /* renamed from: a */
    public void mo25227a(C4704a aVar) {
        this.f8851a = aVar;
    }

    /* renamed from: a */
    public void mo25228a(C4705b bVar) {
        if (bVar != null) {
            this.f8852a = bVar;
            return;
        }
        throw new NullPointerException("Type cannot be null");
    }

    /* renamed from: a */
    public void mo25191a(String str) {
        this.f8853b = str;
    }
}

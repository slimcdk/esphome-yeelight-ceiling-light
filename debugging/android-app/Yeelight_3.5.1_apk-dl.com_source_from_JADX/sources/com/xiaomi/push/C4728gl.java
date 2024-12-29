package com.xiaomi.push;

import android.os.Bundle;
import com.miot.api.Constants;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.gl */
public class C4728gl extends C4731gn {

    /* renamed from: a */
    private C4729a f8280a = C4729a.f8282a;

    /* renamed from: a */
    private final Map<String, String> f8281a = new HashMap();

    /* renamed from: com.xiaomi.push.gl$a */
    public static class C4729a {

        /* renamed from: a */
        public static final C4729a f8282a = new C4729a("get");

        /* renamed from: b */
        public static final C4729a f8283b = new C4729a("set");

        /* renamed from: c */
        public static final C4729a f8284c = new C4729a("result");

        /* renamed from: d */
        public static final C4729a f8285d = new C4729a(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2);

        /* renamed from: e */
        public static final C4729a f8286e = new C4729a(Constants.EXTRA_PUSH_COMMAND);

        /* renamed from: a */
        private String f8287a;

        private C4729a(String str) {
            this.f8287a = str;
        }

        /* renamed from: a */
        public static C4729a m14038a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            C4729a aVar = f8282a;
            if (aVar.toString().equals(lowerCase)) {
                return aVar;
            }
            C4729a aVar2 = f8283b;
            if (aVar2.toString().equals(lowerCase)) {
                return aVar2;
            }
            C4729a aVar3 = f8285d;
            if (aVar3.toString().equals(lowerCase)) {
                return aVar3;
            }
            C4729a aVar4 = f8284c;
            if (aVar4.toString().equals(lowerCase)) {
                return aVar4;
            }
            C4729a aVar5 = f8286e;
            if (aVar5.toString().equals(lowerCase)) {
                return aVar5;
            }
            return null;
        }

        public String toString() {
            return this.f8287a;
        }
    }

    public C4728gl() {
    }

    public C4728gl(Bundle bundle) {
        super(bundle);
        if (bundle.containsKey("ext_iq_type")) {
            this.f8280a = C4729a.m14038a(bundle.getString("ext_iq_type"));
        }
    }

    /* renamed from: a */
    public Bundle mo29223a() {
        Bundle a = super.mo29223a();
        C4729a aVar = this.f8280a;
        if (aVar != null) {
            a.putString("ext_iq_type", aVar.toString());
        }
        return a;
    }

    /* renamed from: a */
    public C4729a m14033a() {
        return this.f8280a;
    }

    /* renamed from: a */
    public String m14034a() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("<iq ");
        if (mo29251j() != null) {
            sb.append("id=\"" + mo29251j() + "\" ");
        }
        if (mo29254l() != null) {
            sb.append("to=\"");
            sb.append(C4745gy.m14115a(mo29254l()));
            sb.append("\" ");
        }
        if (mo29256m() != null) {
            sb.append("from=\"");
            sb.append(C4745gy.m14115a(mo29256m()));
            sb.append("\" ");
        }
        if (mo29252k() != null) {
            sb.append("chid=\"");
            sb.append(C4745gy.m14115a(mo29252k()));
            sb.append("\" ");
        }
        for (Map.Entry next : this.f8281a.entrySet()) {
            sb.append(C4745gy.m14115a((String) next.getKey()));
            sb.append("=\"");
            sb.append(C4745gy.m14115a((String) next.getValue()));
            sb.append("\" ");
        }
        if (this.f8280a == null) {
            str = "type=\"get\">";
        } else {
            sb.append("type=\"");
            sb.append(mo29223a());
            str = "\">";
        }
        sb.append(str);
        String b = mo29226b();
        if (b != null) {
            sb.append(b);
        }
        sb.append(mo29260o());
        C4737gr a = mo29223a();
        if (a != null) {
            sb.append(a.mo29267a());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo29224a(C4729a aVar) {
        if (aVar == null) {
            aVar = C4729a.f8282a;
        }
        this.f8280a = aVar;
    }

    /* renamed from: a */
    public synchronized void mo29225a(Map<String, String> map) {
        this.f8281a.putAll(map);
    }

    /* renamed from: b */
    public String mo29226b() {
        return null;
    }
}

package com.xiaomi.push;

import android.os.Bundle;
import com.miot.api.Constants;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.gh */
public class C4698gh extends C4701gj {

    /* renamed from: a */
    private C4699a f8815a = C4699a.f8817a;

    /* renamed from: a */
    private final Map<String, String> f8816a = new HashMap();

    /* renamed from: com.xiaomi.push.gh$a */
    public static class C4699a {

        /* renamed from: a */
        public static final C4699a f8817a = new C4699a("get");

        /* renamed from: b */
        public static final C4699a f8818b = new C4699a("set");

        /* renamed from: c */
        public static final C4699a f8819c = new C4699a("result");

        /* renamed from: d */
        public static final C4699a f8820d = new C4699a(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2);

        /* renamed from: e */
        public static final C4699a f8821e = new C4699a(Constants.EXTRA_PUSH_COMMAND);

        /* renamed from: a */
        private String f8822a;

        private C4699a(String str) {
            this.f8822a = str;
        }

        /* renamed from: a */
        public static C4699a m14384a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            if (f8817a.toString().equals(lowerCase)) {
                return f8817a;
            }
            if (f8818b.toString().equals(lowerCase)) {
                return f8818b;
            }
            if (f8820d.toString().equals(lowerCase)) {
                return f8820d;
            }
            if (f8819c.toString().equals(lowerCase)) {
                return f8819c;
            }
            if (f8821e.toString().equals(lowerCase)) {
                return f8821e;
            }
            return null;
        }

        public String toString() {
            return this.f8822a;
        }
    }

    public C4698gh() {
    }

    public C4698gh(Bundle bundle) {
        super(bundle);
        if (bundle.containsKey("ext_iq_type")) {
            this.f8815a = C4699a.m14384a(bundle.getString("ext_iq_type"));
        }
    }

    /* renamed from: a */
    public Bundle mo25186a() {
        Bundle a = super.mo25186a();
        C4699a aVar = this.f8815a;
        if (aVar != null) {
            a.putString("ext_iq_type", aVar.toString());
        }
        return a;
    }

    /* renamed from: a */
    public C4699a m14379a() {
        return this.f8815a;
    }

    /* renamed from: a */
    public String m14380a() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("<iq ");
        if (mo25214j() != null) {
            sb.append("id=\"" + mo25214j() + "\" ");
        }
        if (mo25217l() != null) {
            sb.append("to=\"");
            sb.append(C4715gu.m14461a(mo25217l()));
            sb.append("\" ");
        }
        if (mo25219m() != null) {
            sb.append("from=\"");
            sb.append(C4715gu.m14461a(mo25219m()));
            sb.append("\" ");
        }
        if (mo25215k() != null) {
            sb.append("chid=\"");
            sb.append(C4715gu.m14461a(mo25215k()));
            sb.append("\" ");
        }
        for (Map.Entry next : this.f8816a.entrySet()) {
            sb.append(C4715gu.m14461a((String) next.getKey()));
            sb.append("=\"");
            sb.append(C4715gu.m14461a((String) next.getValue()));
            sb.append("\" ");
        }
        if (this.f8815a == null) {
            str = "type=\"get\">";
        } else {
            sb.append("type=\"");
            sb.append(mo25186a());
            str = "\">";
        }
        sb.append(str);
        String b = mo25189b();
        if (b != null) {
            sb.append(b);
        }
        sb.append(mo25223o());
        C4707gn a = mo25186a();
        if (a != null) {
            sb.append(a.mo25230a());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo25187a(C4699a aVar) {
        if (aVar == null) {
            aVar = C4699a.f8817a;
        }
        this.f8815a = aVar;
    }

    /* renamed from: a */
    public synchronized void mo25188a(Map<String, String> map) {
        this.f8816a.putAll(map);
    }

    /* renamed from: b */
    public String mo25189b() {
        return null;
    }
}

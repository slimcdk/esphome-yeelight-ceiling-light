package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.xiaomi.push.gn */
public class C4707gn {

    /* renamed from: a */
    private int f8870a;

    /* renamed from: a */
    private String f8871a;

    /* renamed from: a */
    private List<C4697gg> f8872a = null;

    /* renamed from: b */
    private String f8873b;

    /* renamed from: c */
    private String f8874c;

    /* renamed from: d */
    private String f8875d;

    /* renamed from: com.xiaomi.push.gn$a */
    public static class C4708a {

        /* renamed from: a */
        public static final C4708a f8876a = new C4708a("internal-server-error");

        /* renamed from: b */
        public static final C4708a f8877b = new C4708a("forbidden");

        /* renamed from: c */
        public static final C4708a f8878c = new C4708a("bad-request");

        /* renamed from: d */
        public static final C4708a f8879d = new C4708a("conflict");

        /* renamed from: e */
        public static final C4708a f8880e = new C4708a("feature-not-implemented");

        /* renamed from: f */
        public static final C4708a f8881f = new C4708a("gone");

        /* renamed from: g */
        public static final C4708a f8882g = new C4708a("item-not-found");

        /* renamed from: h */
        public static final C4708a f8883h = new C4708a("jid-malformed");

        /* renamed from: i */
        public static final C4708a f8884i = new C4708a("not-acceptable");

        /* renamed from: j */
        public static final C4708a f8885j = new C4708a("not-allowed");

        /* renamed from: k */
        public static final C4708a f8886k = new C4708a("not-authorized");

        /* renamed from: l */
        public static final C4708a f8887l = new C4708a("payment-required");

        /* renamed from: m */
        public static final C4708a f8888m = new C4708a("recipient-unavailable");

        /* renamed from: n */
        public static final C4708a f8889n = new C4708a("redirect");

        /* renamed from: o */
        public static final C4708a f8890o = new C4708a("registration-required");

        /* renamed from: p */
        public static final C4708a f8891p = new C4708a("remote-server-error");

        /* renamed from: q */
        public static final C4708a f8892q = new C4708a("remote-server-not-found");

        /* renamed from: r */
        public static final C4708a f8893r = new C4708a("remote-server-timeout");

        /* renamed from: s */
        public static final C4708a f8894s = new C4708a("resource-constraint");

        /* renamed from: t */
        public static final C4708a f8895t = new C4708a("service-unavailable");

        /* renamed from: u */
        public static final C4708a f8896u = new C4708a("subscription-required");

        /* renamed from: v */
        public static final C4708a f8897v = new C4708a("undefined-condition");

        /* renamed from: w */
        public static final C4708a f8898w = new C4708a("unexpected-request");

        /* renamed from: x */
        public static final C4708a f8899x = new C4708a("request-timeout");
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f8900a;

        public C4708a(String str) {
            this.f8900a = str;
        }

        public String toString() {
            return this.f8900a;
        }
    }

    public C4707gn(int i, String str, String str2, String str3, String str4, List<C4697gg> list) {
        this.f8870a = i;
        this.f8871a = str;
        this.f8874c = str2;
        this.f8873b = str3;
        this.f8875d = str4;
        this.f8872a = list;
    }

    public C4707gn(Bundle bundle) {
        this.f8870a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f8871a = bundle.getString("ext_err_type");
        }
        this.f8873b = bundle.getString("ext_err_cond");
        this.f8874c = bundle.getString("ext_err_reason");
        this.f8875d = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f8872a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                C4697gg a = C4697gg.m14367a((Bundle) parcelable);
                if (a != null) {
                    this.f8872a.add(a);
                }
            }
        }
    }

    public C4707gn(C4708a aVar) {
        m14438a(aVar);
        this.f8875d = null;
    }

    /* renamed from: a */
    private void m14438a(C4708a aVar) {
        this.f8873b = aVar.f8900a;
    }

    /* renamed from: a */
    public Bundle mo25230a() {
        Bundle bundle = new Bundle();
        String str = this.f8871a;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.f8870a);
        String str2 = this.f8874c;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.f8873b;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.f8875d;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<C4697gg> list = this.f8872a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            for (C4697gg a : this.f8872a) {
                Bundle a2 = a.mo25180a();
                if (a2 != null) {
                    bundleArr[i] = a2;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* renamed from: a */
    public String m14440a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<error code=\"");
        sb.append(this.f8870a);
        sb.append("\"");
        if (this.f8871a != null) {
            sb.append(" type=\"");
            sb.append(this.f8871a);
            sb.append("\"");
        }
        if (this.f8874c != null) {
            sb.append(" reason=\"");
            sb.append(this.f8874c);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f8873b != null) {
            sb.append("<");
            sb.append(this.f8873b);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f8875d != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.f8875d);
            sb.append("</text>");
        }
        for (C4702gk d : mo25230a()) {
            sb.append(d.mo25184d());
        }
        sb.append("</error>");
        return sb.toString();
    }

    /* renamed from: a */
    public synchronized List<C4697gg> m14441a() {
        if (this.f8872a == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.f8872a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f8873b;
        if (str != null) {
            sb.append(str);
        }
        sb.append("(");
        sb.append(this.f8870a);
        sb.append(")");
        if (this.f8875d != null) {
            sb.append(" ");
            sb.append(this.f8875d);
        }
        return sb.toString();
    }
}

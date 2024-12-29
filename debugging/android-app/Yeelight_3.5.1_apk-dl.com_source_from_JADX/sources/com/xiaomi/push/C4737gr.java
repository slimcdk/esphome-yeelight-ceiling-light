package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.xiaomi.push.gr */
public class C4737gr {

    /* renamed from: a */
    private int f8335a;

    /* renamed from: a */
    private String f8336a;

    /* renamed from: a */
    private List<C4727gk> f8337a = null;

    /* renamed from: b */
    private String f8338b;

    /* renamed from: c */
    private String f8339c;

    /* renamed from: d */
    private String f8340d;

    /* renamed from: com.xiaomi.push.gr$a */
    public static class C4738a {

        /* renamed from: a */
        public static final C4738a f8341a = new C4738a("internal-server-error");

        /* renamed from: b */
        public static final C4738a f8342b = new C4738a("forbidden");

        /* renamed from: c */
        public static final C4738a f8343c = new C4738a("bad-request");

        /* renamed from: d */
        public static final C4738a f8344d = new C4738a("conflict");

        /* renamed from: e */
        public static final C4738a f8345e = new C4738a("feature-not-implemented");

        /* renamed from: f */
        public static final C4738a f8346f = new C4738a("gone");

        /* renamed from: g */
        public static final C4738a f8347g = new C4738a("item-not-found");

        /* renamed from: h */
        public static final C4738a f8348h = new C4738a("jid-malformed");

        /* renamed from: i */
        public static final C4738a f8349i = new C4738a("not-acceptable");

        /* renamed from: j */
        public static final C4738a f8350j = new C4738a("not-allowed");

        /* renamed from: k */
        public static final C4738a f8351k = new C4738a("not-authorized");

        /* renamed from: l */
        public static final C4738a f8352l = new C4738a("payment-required");

        /* renamed from: m */
        public static final C4738a f8353m = new C4738a("recipient-unavailable");

        /* renamed from: n */
        public static final C4738a f8354n = new C4738a("redirect");

        /* renamed from: o */
        public static final C4738a f8355o = new C4738a("registration-required");

        /* renamed from: p */
        public static final C4738a f8356p = new C4738a("remote-server-error");

        /* renamed from: q */
        public static final C4738a f8357q = new C4738a("remote-server-not-found");

        /* renamed from: r */
        public static final C4738a f8358r = new C4738a("remote-server-timeout");

        /* renamed from: s */
        public static final C4738a f8359s = new C4738a("resource-constraint");

        /* renamed from: t */
        public static final C4738a f8360t = new C4738a("service-unavailable");

        /* renamed from: u */
        public static final C4738a f8361u = new C4738a("subscription-required");

        /* renamed from: v */
        public static final C4738a f8362v = new C4738a("undefined-condition");

        /* renamed from: w */
        public static final C4738a f8363w = new C4738a("unexpected-request");

        /* renamed from: x */
        public static final C4738a f8364x = new C4738a("request-timeout");
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f8365a;

        public C4738a(String str) {
            this.f8365a = str;
        }

        public String toString() {
            return this.f8365a;
        }
    }

    public C4737gr(int i, String str, String str2, String str3, String str4, List<C4727gk> list) {
        this.f8335a = i;
        this.f8336a = str;
        this.f8339c = str2;
        this.f8338b = str3;
        this.f8340d = str4;
        this.f8337a = list;
    }

    public C4737gr(Bundle bundle) {
        this.f8335a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f8336a = bundle.getString("ext_err_type");
        }
        this.f8338b = bundle.getString("ext_err_cond");
        this.f8339c = bundle.getString("ext_err_reason");
        this.f8340d = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f8337a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                C4727gk a = C4727gk.m14020a((Bundle) parcelable);
                if (a != null) {
                    this.f8337a.add(a);
                }
            }
        }
    }

    public C4737gr(C4738a aVar) {
        m14092a(aVar);
        this.f8340d = null;
    }

    /* renamed from: a */
    private void m14092a(C4738a aVar) {
        this.f8338b = aVar.f8365a;
    }

    /* renamed from: a */
    public Bundle mo29267a() {
        Bundle bundle = new Bundle();
        String str = this.f8336a;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.f8335a);
        String str2 = this.f8339c;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.f8338b;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.f8340d;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<C4727gk> list = this.f8337a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            for (C4727gk a : this.f8337a) {
                Bundle a2 = a.mo29216a();
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
    public String m14094a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<error code=\"");
        sb.append(this.f8335a);
        sb.append("\"");
        if (this.f8336a != null) {
            sb.append(" type=\"");
            sb.append(this.f8336a);
            sb.append("\"");
        }
        if (this.f8339c != null) {
            sb.append(" reason=\"");
            sb.append(this.f8339c);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f8338b != null) {
            sb.append("<");
            sb.append(this.f8338b);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f8340d != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.f8340d);
            sb.append("</text>");
        }
        for (C4732go d : mo29267a()) {
            sb.append(d.mo29221d());
        }
        sb.append("</error>");
        return sb.toString();
    }

    /* renamed from: a */
    public synchronized List<C4727gk> m14095a() {
        List<C4727gk> list = this.f8337a;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f8338b;
        if (str != null) {
            sb.append(str);
        }
        sb.append("(");
        sb.append(this.f8335a);
        sb.append(")");
        if (this.f8340d != null) {
            sb.append(" ");
            sb.append(this.f8340d);
        }
        return sb.toString();
    }
}

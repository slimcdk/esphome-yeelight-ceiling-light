package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;

/* renamed from: com.xiaomi.push.gm */
public class C4730gm extends C4731gn {

    /* renamed from: a */
    private boolean f8288a = false;

    /* renamed from: b */
    private String f8289b = null;

    /* renamed from: b */
    private boolean f8290b = false;

    /* renamed from: c */
    private String f8291c = null;

    /* renamed from: d */
    private String f8292d;

    /* renamed from: e */
    private String f8293e;

    /* renamed from: f */
    private String f8294f;

    /* renamed from: g */
    private String f8295g;

    /* renamed from: h */
    private String f8296h;

    /* renamed from: i */
    private String f8297i = "";

    /* renamed from: j */
    private String f8298j = "";

    /* renamed from: k */
    private String f8299k = "";

    /* renamed from: l */
    private String f8300l = "";

    public C4730gm() {
    }

    public C4730gm(Bundle bundle) {
        super(bundle);
        this.f8289b = bundle.getString("ext_msg_type");
        this.f8292d = bundle.getString("ext_msg_lang");
        this.f8291c = bundle.getString("ext_msg_thread");
        this.f8293e = bundle.getString("ext_msg_sub");
        this.f8294f = bundle.getString("ext_msg_body");
        this.f8295g = bundle.getString("ext_body_encode");
        this.f8296h = bundle.getString("ext_msg_appid");
        this.f8288a = bundle.getBoolean("ext_msg_trans", false);
        this.f8290b = bundle.getBoolean("ext_msg_encrypt", false);
        this.f8297i = bundle.getString("ext_msg_seq");
        this.f8298j = bundle.getString("ext_msg_mseq");
        this.f8299k = bundle.getString("ext_msg_fseq");
        this.f8300l = bundle.getString("ext_msg_status");
    }

    /* renamed from: a */
    public Bundle mo29223a() {
        Bundle a = super.mo29223a();
        if (!TextUtils.isEmpty(this.f8289b)) {
            a.putString("ext_msg_type", this.f8289b);
        }
        String str = this.f8292d;
        if (str != null) {
            a.putString("ext_msg_lang", str);
        }
        String str2 = this.f8293e;
        if (str2 != null) {
            a.putString("ext_msg_sub", str2);
        }
        String str3 = this.f8294f;
        if (str3 != null) {
            a.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.f8295g)) {
            a.putString("ext_body_encode", this.f8295g);
        }
        String str4 = this.f8291c;
        if (str4 != null) {
            a.putString("ext_msg_thread", str4);
        }
        String str5 = this.f8296h;
        if (str5 != null) {
            a.putString("ext_msg_appid", str5);
        }
        if (this.f8288a) {
            a.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.f8297i)) {
            a.putString("ext_msg_seq", this.f8297i);
        }
        if (!TextUtils.isEmpty(this.f8298j)) {
            a.putString("ext_msg_mseq", this.f8298j);
        }
        if (!TextUtils.isEmpty(this.f8299k)) {
            a.putString("ext_msg_fseq", this.f8299k);
        }
        if (this.f8290b) {
            a.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.f8300l)) {
            a.putString("ext_msg_status", this.f8300l);
        }
        return a;
    }

    /* renamed from: a */
    public String m14040a() {
        C4737gr a;
        StringBuilder sb = new StringBuilder();
        sb.append("<message");
        if (mo29262p() != null) {
            sb.append(" xmlns=\"");
            sb.append(mo29262p());
            sb.append("\"");
        }
        if (this.f8292d != null) {
            sb.append(" xml:lang=\"");
            sb.append(mo29244h());
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
        if (!TextUtils.isEmpty(mo29235d())) {
            sb.append(" seq=\"");
            sb.append(mo29235d());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(mo29237e())) {
            sb.append(" mseq=\"");
            sb.append(mo29237e());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(mo29240f())) {
            sb.append(" fseq=\"");
            sb.append(mo29240f());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(mo29242g())) {
            sb.append(" status=\"");
            sb.append(mo29242g());
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
        if (this.f8288a) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.f8296h)) {
            sb.append(" appid=\"");
            sb.append(mo29233c());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(this.f8289b)) {
            sb.append(" type=\"");
            sb.append(this.f8289b);
            sb.append("\"");
        }
        if (this.f8290b) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.f8293e != null) {
            sb.append("<subject>");
            sb.append(C4745gy.m14115a(this.f8293e));
            sb.append("</subject>");
        }
        if (this.f8294f != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.f8295g)) {
                sb.append(" encode=\"");
                sb.append(this.f8295g);
                sb.append("\"");
            }
            sb.append(">");
            sb.append(C4745gy.m14115a(this.f8294f));
            sb.append("</body>");
        }
        if (this.f8291c != null) {
            sb.append("<thread>");
            sb.append(this.f8291c);
            sb.append("</thread>");
        }
        if (XiaomiOAuthConstants.EXTRA_ERROR_CODE_2.equalsIgnoreCase(this.f8289b) && (a = mo29223a()) != null) {
            sb.append(a.mo29267a());
        }
        sb.append(mo29260o());
        sb.append("</message>");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo29228a(String str) {
        this.f8296h = str;
    }

    /* renamed from: a */
    public void mo29229a(String str, String str2) {
        this.f8294f = str;
        this.f8295g = str2;
    }

    /* renamed from: a */
    public void mo29230a(boolean z) {
        this.f8288a = z;
    }

    /* renamed from: b */
    public String mo29226b() {
        return this.f8289b;
    }

    /* renamed from: b */
    public void mo29231b(String str) {
        this.f8297i = str;
    }

    /* renamed from: b */
    public void mo29232b(boolean z) {
        this.f8290b = z;
    }

    /* renamed from: c */
    public String mo29233c() {
        return this.f8296h;
    }

    /* renamed from: c */
    public void mo29234c(String str) {
        this.f8298j = str;
    }

    /* renamed from: d */
    public String mo29235d() {
        return this.f8297i;
    }

    /* renamed from: d */
    public void mo29236d(String str) {
        this.f8299k = str;
    }

    /* renamed from: e */
    public String mo29237e() {
        return this.f8298j;
    }

    /* renamed from: e */
    public void mo29238e(String str) {
        this.f8300l = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4730gm gmVar = (C4730gm) obj;
        if (!super.equals(gmVar)) {
            return false;
        }
        String str = this.f8294f;
        if (str == null ? gmVar.f8294f != null : !str.equals(gmVar.f8294f)) {
            return false;
        }
        String str2 = this.f8292d;
        if (str2 == null ? gmVar.f8292d != null : !str2.equals(gmVar.f8292d)) {
            return false;
        }
        String str3 = this.f8293e;
        if (str3 == null ? gmVar.f8293e != null : !str3.equals(gmVar.f8293e)) {
            return false;
        }
        String str4 = this.f8291c;
        if (str4 == null ? gmVar.f8291c == null : str4.equals(gmVar.f8291c)) {
            return this.f8289b == gmVar.f8289b;
        }
        return false;
    }

    /* renamed from: f */
    public String mo29240f() {
        return this.f8299k;
    }

    /* renamed from: f */
    public void mo29241f(String str) {
        this.f8289b = str;
    }

    /* renamed from: g */
    public String mo29242g() {
        return this.f8300l;
    }

    /* renamed from: g */
    public void mo29243g(String str) {
        this.f8293e = str;
    }

    /* renamed from: h */
    public String mo29244h() {
        return this.f8292d;
    }

    /* renamed from: h */
    public void mo29245h(String str) {
        this.f8294f = str;
    }

    public int hashCode() {
        String str = this.f8289b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8294f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8291c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8292d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8293e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public void mo29247i(String str) {
        this.f8291c = str;
    }

    /* renamed from: j */
    public void mo29248j(String str) {
        this.f8292d = str;
    }
}

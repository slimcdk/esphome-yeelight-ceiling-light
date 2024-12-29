package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;

/* renamed from: com.xiaomi.push.gi */
public class C4700gi extends C4701gj {

    /* renamed from: a */
    private boolean f8823a = false;

    /* renamed from: b */
    private String f8824b = null;

    /* renamed from: b */
    private boolean f8825b = false;

    /* renamed from: c */
    private String f8826c = null;

    /* renamed from: d */
    private String f8827d;

    /* renamed from: e */
    private String f8828e;

    /* renamed from: f */
    private String f8829f;

    /* renamed from: g */
    private String f8830g;

    /* renamed from: h */
    private String f8831h;

    /* renamed from: i */
    private String f8832i = "";

    /* renamed from: j */
    private String f8833j = "";

    /* renamed from: k */
    private String f8834k = "";

    /* renamed from: l */
    private String f8835l = "";

    public C4700gi() {
    }

    public C4700gi(Bundle bundle) {
        super(bundle);
        this.f8824b = bundle.getString("ext_msg_type");
        this.f8827d = bundle.getString("ext_msg_lang");
        this.f8826c = bundle.getString("ext_msg_thread");
        this.f8828e = bundle.getString("ext_msg_sub");
        this.f8829f = bundle.getString("ext_msg_body");
        this.f8830g = bundle.getString("ext_body_encode");
        this.f8831h = bundle.getString("ext_msg_appid");
        this.f8823a = bundle.getBoolean("ext_msg_trans", false);
        this.f8825b = bundle.getBoolean("ext_msg_encrypt", false);
        this.f8832i = bundle.getString("ext_msg_seq");
        this.f8833j = bundle.getString("ext_msg_mseq");
        this.f8834k = bundle.getString("ext_msg_fseq");
        this.f8835l = bundle.getString("ext_msg_status");
    }

    /* renamed from: a */
    public Bundle mo25186a() {
        Bundle a = super.mo25186a();
        if (!TextUtils.isEmpty(this.f8824b)) {
            a.putString("ext_msg_type", this.f8824b);
        }
        String str = this.f8827d;
        if (str != null) {
            a.putString("ext_msg_lang", str);
        }
        String str2 = this.f8828e;
        if (str2 != null) {
            a.putString("ext_msg_sub", str2);
        }
        String str3 = this.f8829f;
        if (str3 != null) {
            a.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.f8830g)) {
            a.putString("ext_body_encode", this.f8830g);
        }
        String str4 = this.f8826c;
        if (str4 != null) {
            a.putString("ext_msg_thread", str4);
        }
        String str5 = this.f8831h;
        if (str5 != null) {
            a.putString("ext_msg_appid", str5);
        }
        if (this.f8823a) {
            a.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.f8832i)) {
            a.putString("ext_msg_seq", this.f8832i);
        }
        if (!TextUtils.isEmpty(this.f8833j)) {
            a.putString("ext_msg_mseq", this.f8833j);
        }
        if (!TextUtils.isEmpty(this.f8834k)) {
            a.putString("ext_msg_fseq", this.f8834k);
        }
        if (this.f8825b) {
            a.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.f8835l)) {
            a.putString("ext_msg_status", this.f8835l);
        }
        return a;
    }

    /* renamed from: a */
    public String m14386a() {
        C4707gn a;
        StringBuilder sb = new StringBuilder();
        sb.append("<message");
        if (mo25225p() != null) {
            sb.append(" xmlns=\"");
            sb.append(mo25225p());
            sb.append("\"");
        }
        if (this.f8827d != null) {
            sb.append(" xml:lang=\"");
            sb.append(mo25207h());
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
        if (!TextUtils.isEmpty(mo25198d())) {
            sb.append(" seq=\"");
            sb.append(mo25198d());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(mo25200e())) {
            sb.append(" mseq=\"");
            sb.append(mo25200e());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(mo25203f())) {
            sb.append(" fseq=\"");
            sb.append(mo25203f());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(mo25205g())) {
            sb.append(" status=\"");
            sb.append(mo25205g());
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
        if (this.f8823a) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.f8831h)) {
            sb.append(" appid=\"");
            sb.append(mo25196c());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(this.f8824b)) {
            sb.append(" type=\"");
            sb.append(this.f8824b);
            sb.append("\"");
        }
        if (this.f8825b) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.f8828e != null) {
            sb.append("<subject>");
            sb.append(C4715gu.m14461a(this.f8828e));
            sb.append("</subject>");
        }
        if (this.f8829f != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.f8830g)) {
                sb.append(" encode=\"");
                sb.append(this.f8830g);
                sb.append("\"");
            }
            sb.append(">");
            sb.append(C4715gu.m14461a(this.f8829f));
            sb.append("</body>");
        }
        if (this.f8826c != null) {
            sb.append("<thread>");
            sb.append(this.f8826c);
            sb.append("</thread>");
        }
        if (XiaomiOAuthConstants.EXTRA_ERROR_CODE_2.equalsIgnoreCase(this.f8824b) && (a = mo25186a()) != null) {
            sb.append(a.mo25230a());
        }
        sb.append(mo25223o());
        sb.append("</message>");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo25191a(String str) {
        this.f8831h = str;
    }

    /* renamed from: a */
    public void mo25192a(String str, String str2) {
        this.f8829f = str;
        this.f8830g = str2;
    }

    /* renamed from: a */
    public void mo25193a(boolean z) {
        this.f8823a = z;
    }

    /* renamed from: b */
    public String mo25189b() {
        return this.f8824b;
    }

    /* renamed from: b */
    public void mo25194b(String str) {
        this.f8832i = str;
    }

    /* renamed from: b */
    public void mo25195b(boolean z) {
        this.f8825b = z;
    }

    /* renamed from: c */
    public String mo25196c() {
        return this.f8831h;
    }

    /* renamed from: c */
    public void mo25197c(String str) {
        this.f8833j = str;
    }

    /* renamed from: d */
    public String mo25198d() {
        return this.f8832i;
    }

    /* renamed from: d */
    public void mo25199d(String str) {
        this.f8834k = str;
    }

    /* renamed from: e */
    public String mo25200e() {
        return this.f8833j;
    }

    /* renamed from: e */
    public void mo25201e(String str) {
        this.f8835l = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4700gi.class != obj.getClass()) {
            return false;
        }
        C4700gi giVar = (C4700gi) obj;
        if (!super.equals(giVar)) {
            return false;
        }
        String str = this.f8829f;
        if (str == null ? giVar.f8829f != null : !str.equals(giVar.f8829f)) {
            return false;
        }
        String str2 = this.f8827d;
        if (str2 == null ? giVar.f8827d != null : !str2.equals(giVar.f8827d)) {
            return false;
        }
        String str3 = this.f8828e;
        if (str3 == null ? giVar.f8828e != null : !str3.equals(giVar.f8828e)) {
            return false;
        }
        String str4 = this.f8826c;
        if (str4 == null ? giVar.f8826c == null : str4.equals(giVar.f8826c)) {
            return this.f8824b == giVar.f8824b;
        }
        return false;
    }

    /* renamed from: f */
    public String mo25203f() {
        return this.f8834k;
    }

    /* renamed from: f */
    public void mo25204f(String str) {
        this.f8824b = str;
    }

    /* renamed from: g */
    public String mo25205g() {
        return this.f8835l;
    }

    /* renamed from: g */
    public void mo25206g(String str) {
        this.f8828e = str;
    }

    /* renamed from: h */
    public String mo25207h() {
        return this.f8827d;
    }

    /* renamed from: h */
    public void mo25208h(String str) {
        this.f8829f = str;
    }

    public int hashCode() {
        String str = this.f8824b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8829f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8826c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8827d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8828e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public void mo25210i(String str) {
        this.f8826c = str;
    }

    /* renamed from: j */
    public void mo25211j(String str) {
        this.f8827d = str;
    }
}

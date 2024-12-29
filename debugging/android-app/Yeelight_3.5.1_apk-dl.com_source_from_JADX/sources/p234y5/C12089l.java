package p234y5;

import com.xiaomi.mipush.sdk.Constants;
import p239z5.C12159d;
import p239z5.C12193w;

/* renamed from: y5.l */
public class C12089l implements C12159d.C12167h {

    /* renamed from: a */
    private final String f22142a;

    /* renamed from: b */
    private final C12193w f22143b;

    public C12089l(String str, C12193w wVar) {
        this.f22142a = str;
        this.f22143b = wVar;
    }

    public String getAuthMethod() {
        return this.f22142a;
    }

    public C12193w getUserIdentity() {
        return this.f22143b;
    }

    public String toString() {
        return "{User," + getAuthMethod() + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f22143b + "}";
    }
}

package p164h.p211a.p212a.p220e;

import com.xiaomi.mipush.sdk.Constants;
import p164h.p211a.p212a.p222f.C11018d;
import p164h.p211a.p212a.p222f.C11046u;

/* renamed from: h.a.a.e.m */
public class C10991m implements C11018d.C11025g {

    /* renamed from: a */
    private final String f21472a;

    /* renamed from: b */
    private final C11046u f21473b;

    public C10991m(String str, C11046u uVar) {
        this.f21472a = str;
        this.f21473b = uVar;
    }

    /* renamed from: a */
    public C11046u mo34765a() {
        return this.f21473b;
    }

    /* renamed from: c */
    public String mo34766c() {
        return this.f21472a;
    }

    public String toString() {
        return "{User," + mo34766c() + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f21473b + "}";
    }
}

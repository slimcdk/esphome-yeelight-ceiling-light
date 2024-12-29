package p164h.p211a.p212a.p216c;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;

/* renamed from: h.a.a.c.h */
public class C10896h extends IOException {

    /* renamed from: a */
    int f21103a;

    /* renamed from: b */
    String f21104b;

    public C10896h(int i) {
        this.f21103a = i;
        this.f21104b = null;
    }

    public C10896h(int i, String str) {
        this.f21103a = i;
        this.f21104b = str;
    }

    public C10896h(int i, String str, Throwable th) {
        this.f21103a = i;
        this.f21104b = str;
        initCause(th);
    }

    /* renamed from: a */
    public String mo34455a() {
        return this.f21104b;
    }

    /* renamed from: b */
    public int mo34456b() {
        return this.f21103a;
    }

    public String toString() {
        return "HttpException(" + this.f21103a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f21104b + Constants.ACCEPT_TIME_SEPARATOR_SP + super.getCause() + ")";
    }
}

package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetSocketAddress;

/* renamed from: com.xiaomi.push.ct */
public final class C4598ct {

    /* renamed from: a */
    private int f7751a;

    /* renamed from: a */
    private String f7752a;

    public C4598ct(String str, int i) {
        this.f7752a = str;
        this.f7751a = i;
    }

    /* renamed from: a */
    public static C4598ct m13220a(String str, int i) {
        int lastIndexOf = str.lastIndexOf(Constants.COLON_SEPARATOR);
        if (lastIndexOf != -1) {
            String substring = str.substring(0, lastIndexOf);
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                if (parseInt > 0) {
                    i = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
            str = substring;
        }
        return new C4598ct(str, i);
    }

    /* renamed from: a */
    public static InetSocketAddress m13221a(String str, int i) {
        C4598ct a = m13220a(str, i);
        return new InetSocketAddress(a.mo28875a(), a.mo28875a());
    }

    /* renamed from: a */
    public int mo28875a() {
        return this.f7751a;
    }

    /* renamed from: a */
    public String m13223a() {
        return this.f7752a;
    }

    public String toString() {
        if (this.f7751a <= 0) {
            return this.f7752a;
        }
        return this.f7752a + Constants.COLON_SEPARATOR + this.f7751a;
    }
}

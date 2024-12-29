package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetSocketAddress;

/* renamed from: com.xiaomi.push.cx */
public final class C4584cx {

    /* renamed from: a */
    private int f8352a;

    /* renamed from: a */
    private String f8353a;

    public C4584cx(String str, int i) {
        this.f8353a = str;
        this.f8352a = i;
    }

    /* renamed from: a */
    public static C4584cx m13646a(String str, int i) {
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
        return new C4584cx(str, i);
    }

    /* renamed from: a */
    public static InetSocketAddress m13647a(String str, int i) {
        C4584cx a = m13646a(str, i);
        return new InetSocketAddress(a.mo24886a(), a.mo24886a());
    }

    /* renamed from: a */
    public int mo24886a() {
        return this.f8352a;
    }

    /* renamed from: a */
    public String m13649a() {
        return this.f8353a;
    }

    public String toString() {
        if (this.f8352a <= 0) {
            return this.f8353a;
        }
        return this.f8353a + Constants.COLON_SEPARATOR + this.f8352a;
    }
}

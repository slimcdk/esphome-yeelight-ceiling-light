package p011c.p083d.p084a;

import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import p163g.C4411f;

/* renamed from: c.d.a.m */
public final class C1126m {
    /* renamed from: a */
    public static String m2688a(String str, String str2) {
        try {
            String a = C4411f.m12869l((str + Constants.COLON_SEPARATOR + str2).getBytes("ISO-8859-1")).mo24285a();
            return "Basic " + a;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}

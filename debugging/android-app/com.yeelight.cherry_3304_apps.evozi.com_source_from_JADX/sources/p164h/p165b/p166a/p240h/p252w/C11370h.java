package p164h.p165b.p166a.p240h.p252w;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import p164h.p165b.p166a.p240h.C11216f;

/* renamed from: h.b.a.h.w.h */
public class C11370h {

    /* renamed from: a */
    final String[] f22550a;

    public C11370h(String[] strArr) {
        this.f22550a = strArr;
    }

    /* renamed from: b */
    public static C11370h m29798b(String str) {
        if (str == null || str.length() == 0) {
            return new C11370h(new String[0]);
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        String[] strArr = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            strArr[i] = split[i].trim();
        }
        return new C11370h(strArr);
    }

    /* renamed from: a */
    public String[] mo36068a() {
        return this.f22550a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C11370h.class == obj.getClass() && Arrays.equals(this.f22550a, ((C11370h) obj).f22550a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f22550a);
    }

    public String toString() {
        return C11216f.m29269f(mo36068a());
    }
}

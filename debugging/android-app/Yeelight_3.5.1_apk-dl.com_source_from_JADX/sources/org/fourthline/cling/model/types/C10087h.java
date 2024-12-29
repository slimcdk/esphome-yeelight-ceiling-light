package org.fourthline.cling.model.types;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import org.fourthline.cling.model.C10018f;

/* renamed from: org.fourthline.cling.model.types.h */
public class C10087h {

    /* renamed from: a */
    final String[] f18608a;

    public C10087h(String[] strArr) {
        this.f18608a = strArr;
    }

    /* renamed from: b */
    public static C10087h m25126b(String str) {
        if (str == null || str.length() == 0) {
            return new C10087h(new String[0]);
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        String[] strArr = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            strArr[i] = split[i].trim();
        }
        return new C10087h(strArr);
    }

    /* renamed from: a */
    public String[] mo40601a() {
        return this.f18608a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C10087h.class == obj.getClass() && Arrays.equals(this.f18608a, ((C10087h) obj).f18608a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f18608a);
    }

    public String toString() {
        return C10018f.m24807f(mo40601a());
    }
}

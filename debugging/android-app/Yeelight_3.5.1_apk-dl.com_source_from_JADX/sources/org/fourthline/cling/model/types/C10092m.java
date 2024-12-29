package org.fourthline.cling.model.types;

import com.xiaomi.mipush.sdk.Constants;

/* renamed from: org.fourthline.cling.model.types.m */
public class C10092m {

    /* renamed from: a */
    private String f18616a;

    /* renamed from: b */
    private int f18617b;

    public C10092m() {
    }

    public C10092m(String str, int i) {
        this.f18616a = str;
        this.f18617b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10092m.class != obj.getClass()) {
            return false;
        }
        C10092m mVar = (C10092m) obj;
        return this.f18617b == mVar.f18617b && this.f18616a.equals(mVar.f18616a);
    }

    public int hashCode() {
        return (this.f18616a.hashCode() * 31) + this.f18617b;
    }

    public String toString() {
        return this.f18616a + Constants.COLON_SEPARATOR + this.f18617b;
    }
}

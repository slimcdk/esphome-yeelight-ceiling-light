package org.fourthline.cling.model.types;

import java.util.logging.Logger;

/* renamed from: org.fourthline.cling.model.types.z */
public class C10105z {

    /* renamed from: a */
    private String f18648a;

    static {
        Logger.getLogger(C10105z.class.getName());
    }

    public C10105z(String str) {
        this.f18648a = str;
    }

    /* renamed from: b */
    public static C10105z m25185b(String str) {
        if (str.startsWith("uuid:")) {
            str = str.substring(5);
        }
        return new C10105z(str);
    }

    /* renamed from: a */
    public String mo40661a() {
        return this.f18648a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10105z)) {
            return false;
        }
        return this.f18648a.equals(((C10105z) obj).f18648a);
    }

    public int hashCode() {
        return this.f18648a.hashCode();
    }

    public String toString() {
        return "uuid:" + mo40661a();
    }
}

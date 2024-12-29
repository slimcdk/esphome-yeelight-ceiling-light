package com.xiaomi.push;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.ax */
public class C4519ax {

    /* renamed from: a */
    public int f8193a;

    /* renamed from: a */
    public String f8194a;

    /* renamed from: a */
    public Map<String, String> f8195a = new HashMap();

    /* renamed from: a */
    public String mo24753a() {
        return this.f8194a;
    }

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", new Object[]{Integer.valueOf(this.f8193a), this.f8195a.toString(), this.f8194a});
    }
}

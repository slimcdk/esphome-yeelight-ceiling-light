package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* renamed from: com.xiaomi.mipush.sdk.x */
class C4501x {

    /* renamed from: a */
    int f7526a = 0;

    /* renamed from: a */
    String f7527a = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4501x)) {
            return false;
        }
        C4501x xVar = (C4501x) obj;
        return !TextUtils.isEmpty(xVar.f7527a) && xVar.f7527a.equals(this.f7527a);
    }
}

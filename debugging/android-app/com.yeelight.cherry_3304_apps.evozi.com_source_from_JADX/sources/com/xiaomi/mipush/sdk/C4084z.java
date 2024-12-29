package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* renamed from: com.xiaomi.mipush.sdk.z */
class C4084z {

    /* renamed from: a */
    int f6968a = 0;

    /* renamed from: a */
    String f6969a = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4084z)) {
            return false;
        }
        C4084z zVar = (C4084z) obj;
        return !TextUtils.isEmpty(zVar.f6969a) && zVar.f6969a.equals(this.f6969a);
    }
}

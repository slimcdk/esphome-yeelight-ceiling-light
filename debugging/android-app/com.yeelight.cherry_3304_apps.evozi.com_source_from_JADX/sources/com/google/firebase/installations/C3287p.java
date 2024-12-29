package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.p135q.C3294d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.installations.p */
class C3287p {

    /* renamed from: a */
    public static final long f6357a = TimeUnit.HOURS.toSeconds(1);

    C3287p() {
    }

    /* renamed from: a */
    public long mo17903a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /* renamed from: b */
    public boolean mo17904b(C3294d dVar) {
        return TextUtils.isEmpty(dVar.mo17905b()) || dVar.mo17912h() + dVar.mo17906c() < mo17903a() + f6357a;
    }
}

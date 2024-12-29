package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.iid.h1 */
final /* synthetic */ class C3227h1 implements Callable {

    /* renamed from: a */
    private final Intent f6245a;

    C3227h1(Intent intent) {
        this.f6245a = intent;
    }

    public final Object call() {
        Intent intent = this.f6245a;
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                sb.toString();
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m9992b().mo17796w();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.m9992b().mo17798y();
            }
        }
        return -1;
    }
}

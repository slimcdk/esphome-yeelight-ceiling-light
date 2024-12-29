package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;
import p011c.p012a.p019b.p028b.p038e.C0619h;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f6194a = C3250s0.m10107b();

    /* renamed from: b */
    static final /* synthetic */ void m10022b(boolean z, BroadcastReceiver.PendingResult pendingResult, C0619h hVar) {
        if (z) {
            pendingResult.setResultCode(hVar.mo8654o() ? ((Integer) hVar.mo8650k()).intValue() : 500);
        }
        pendingResult.finish();
    }

    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                intent = intent2;
            }
            intent.setComponent((ComponentName) null);
            intent.setPackage(context.getPackageName());
            if (Build.VERSION.SDK_INT <= 18) {
                intent.removeCategory(context.getPackageName());
            }
            ("google.com/iid".equals(intent.getStringExtra("from")) ? new C3230i1(this.f6194a) : new C3210c(context, this.f6194a)).mo17810b(intent).mo8642c(this.f6194a, new C3209b1(isOrderedBroadcast(), goAsync()));
        }
    }
}

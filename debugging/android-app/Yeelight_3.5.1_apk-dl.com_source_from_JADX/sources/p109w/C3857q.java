package p109w;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.C0788i;

/* renamed from: w.q */
public abstract class C3857q implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static C3857q m10960b(Activity activity, @Nullable Intent intent, int i) {
        return new C3855o(intent, activity, i);
    }

    /* renamed from: c */
    public static C3857q m10961c(@NonNull C0788i iVar, @Nullable Intent intent, int i) {
        return new C3856p(intent, iVar, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26326a();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        android.os.Build.FINGERPRINT.contains("generic");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r2.dismiss();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r2, int r3) {
        /*
            r1 = this;
            r1.mo26326a()     // Catch:{ ActivityNotFoundException -> 0x0009 }
            r2.dismiss()
            return
        L_0x0007:
            r3 = move-exception
            goto L_0x0014
        L_0x0009:
            java.lang.String r3 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x0007 }
            java.lang.String r0 = "generic"
            r3.contains(r0)     // Catch:{ all -> 0x0007 }
            r2.dismiss()
            return
        L_0x0014:
            r2.dismiss()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p109w.C3857q.onClick(android.content.DialogInterface, int):void");
    }
}

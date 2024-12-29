package p014c0;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: c0.h */
public class C0619h implements C0616e {

    /* renamed from: a */
    private static final C0619h f231a = new C0619h();

    private C0619h() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public static C0616e m208d() {
        return f231a;
    }

    /* renamed from: a */
    public final long mo11029a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo11030b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo11031c() {
        return System.nanoTime();
    }
}

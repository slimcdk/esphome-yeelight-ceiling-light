package p024d0;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* renamed from: d0.b */
public class C3124b implements ThreadFactory {

    /* renamed from: a */
    private final String f5002a;

    /* renamed from: b */
    private final AtomicInteger f5003b = new AtomicInteger();

    /* renamed from: c */
    private final ThreadFactory f5004c = Executors.defaultThreadFactory();

    @KeepForSdk
    public C3124b(@NonNull String str) {
        C0917i.m1420k(str, "Name must not be null");
        this.f5002a = str;
    }

    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f5004c.newThread(new C3125c(runnable, 0));
        String str = this.f5002a;
        int andIncrement = this.f5003b.getAndIncrement();
        newThread.setName(str + "[" + andIncrement + "]");
        return newThread;
    }
}

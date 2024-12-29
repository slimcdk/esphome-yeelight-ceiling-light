package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C0895b;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.b */
final class C0890b implements Runnable {

    /* renamed from: a */
    private final Uri f926a;
    @Nullable

    /* renamed from: b */
    private final Bitmap f927b;

    /* renamed from: c */
    private final CountDownLatch f928c;

    /* renamed from: d */
    final /* synthetic */ ImageManager f929d;

    public C0890b(ImageManager imageManager, @Nullable Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f926a = uri;
        this.f927b = bitmap;
        this.f928c = countDownLatch;
    }

    public final void run() {
        C0895b.m1287a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f927b;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) ImageManager.m1260h(this.f929d).remove(this.f926a);
        if (imageReceiver != null) {
            ArrayList a = imageReceiver.f917b;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C0891c cVar = (C0891c) a.get(i);
                Bitmap bitmap2 = this.f927b;
                if (bitmap2 == null || bitmap == null) {
                    ImageManager.m1258f(this.f929d).put(this.f926a, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.f929d;
                    cVar.mo12158b(ImageManager.m1253a(imageManager), ImageManager.m1255c(imageManager), false);
                } else {
                    cVar.mo12159c(ImageManager.m1253a(this.f929d), bitmap2, false);
                }
                ImageManager.m1259g(this.f929d).remove(cVar);
            }
        }
        this.f928c.countDown();
        synchronized (ImageManager.f914a) {
            ImageManager.f915b.remove(this.f926a);
        }
    }
}

package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import androidx.collection.LruCache;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C1548c;
import com.google.android.gms.internal.base.zak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Object f2908i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static HashSet<Uri> f2909j = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f2910a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f2911b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f2912c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1538a f2913d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zak f2914e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map<C1541a, ImageReceiver> f2915f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map<Uri, ImageReceiver> f2916g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Map<Uri, Long> f2917h;

    @KeepName
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        private final Uri f2918a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ArrayList<C1541a> f2919b;

        /* renamed from: c */
        private final /* synthetic */ ImageManager f2920c;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f2920c.f2912c.execute(new C1539b(this.f2918a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    private static final class C1538a extends LruCache<C1542b, Bitmap> {
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    private final class C1539b implements Runnable {

        /* renamed from: a */
        private final Uri f2921a;

        /* renamed from: b */
        private final ParcelFileDescriptor f2922b;

        public C1539b(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f2921a = uri;
            this.f2922b = parcelFileDescriptor;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap;
            C1548c.m4203b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            ParcelFileDescriptor parcelFileDescriptor = this.f2922b;
            boolean z2 = false;
            Bitmap bitmap2 = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError unused) {
                    String valueOf = String.valueOf(this.f2921a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    sb.toString();
                    z2 = true;
                }
                try {
                    this.f2922b.close();
                } catch (IOException unused2) {
                }
                z = z2;
                bitmap = bitmap2;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.f2911b.post(new C1540c(this.f2921a, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused3) {
                String valueOf2 = String.valueOf(this.f2921a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(valueOf2);
                sb2.toString();
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    private final class C1540c implements Runnable {

        /* renamed from: a */
        private final Uri f2924a;

        /* renamed from: b */
        private final Bitmap f2925b;

        /* renamed from: c */
        private final CountDownLatch f2926c;

        /* renamed from: d */
        private boolean f2927d;

        public C1540c(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f2924a = uri;
            this.f2925b = bitmap;
            this.f2927d = z;
            this.f2926c = countDownLatch;
        }

        public final void run() {
            C1548c.m4202a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.f2925b != null;
            if (ImageManager.this.f2913d != null) {
                if (this.f2927d) {
                    ImageManager.this.f2913d.evictAll();
                    System.gc();
                    this.f2927d = false;
                    ImageManager.this.f2911b.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f2913d.put(new C1542b(this.f2924a), this.f2925b);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f2916g.remove(this.f2924a);
            if (imageReceiver != null) {
                ArrayList a = imageReceiver.f2919b;
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    C1541a aVar = (C1541a) a.get(i);
                    ImageManager imageManager = ImageManager.this;
                    if (z) {
                        aVar.mo11107a(imageManager.f2910a, this.f2925b, false);
                    } else {
                        imageManager.f2917h.put(this.f2924a, Long.valueOf(SystemClock.elapsedRealtime()));
                        aVar.mo11108b(ImageManager.this.f2910a, ImageManager.this.f2914e, false);
                    }
                    ImageManager.this.f2915f.remove(aVar);
                }
            }
            this.f2926c.countDown();
            synchronized (ImageManager.f2908i) {
                ImageManager.f2909j.remove(this.f2924a);
            }
        }
    }
}

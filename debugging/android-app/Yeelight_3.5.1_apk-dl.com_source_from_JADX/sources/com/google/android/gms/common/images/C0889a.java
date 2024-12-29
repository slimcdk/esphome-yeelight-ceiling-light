package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0895b;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.a */
final class C0889a implements Runnable {

    /* renamed from: a */
    private final Uri f923a;
    @Nullable

    /* renamed from: b */
    private final ParcelFileDescriptor f924b;

    /* renamed from: c */
    final /* synthetic */ ImageManager f925c;

    public C0889a(ImageManager imageManager, @Nullable Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f923a = uri;
        this.f924b = parcelFileDescriptor;
    }

    public final void run() {
        boolean z;
        Bitmap bitmap;
        C0895b.m1288b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f924b;
        Bitmap bitmap2 = null;
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError unused) {
                "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f923a));
                z2 = true;
            }
            try {
                this.f924b.close();
            } catch (IOException unused2) {
            }
            bitmap = bitmap2;
            z = z2;
        } else {
            bitmap = null;
            z = false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.f925c;
        ImageManager.m1254b(imageManager).post(new C0890b(imageManager, this.f923a, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
            "Latch interrupted while posting ".concat(String.valueOf(this.f923a));
        }
    }
}

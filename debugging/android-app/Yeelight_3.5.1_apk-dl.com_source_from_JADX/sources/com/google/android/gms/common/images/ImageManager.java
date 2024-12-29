package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.base.zam;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f914a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static HashSet f915b = new HashSet();

    @KeepName
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        private final Uri f916a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ArrayList f917b;

        /* renamed from: c */
        final /* synthetic */ ImageManager f918c;

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager imageManager = this.f918c;
            ImageManager.m1261i(imageManager).execute(new C0889a(imageManager, this.f916a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Context m1253a(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ Handler m1254b(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ zam m1255c(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ Map m1258f(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ Map m1259g(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ Map m1260h(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: i */
    static /* bridge */ /* synthetic */ ExecutorService m1261i(ImageManager imageManager) {
        throw null;
    }
}

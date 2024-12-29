package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.s */
public abstract class C4365s {

    /* renamed from: com.squareup.picasso.s$a */
    public static final class C4366a {

        /* renamed from: a */
        private final Picasso.LoadedFrom f7285a;

        /* renamed from: b */
        private final Bitmap f7286b;

        /* renamed from: c */
        private final InputStream f7287c;

        /* renamed from: d */
        private final int f7288d;

        public C4366a(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) C4376y.m12430d(bitmap, "bitmap == null"), (InputStream) null, loadedFrom, 0);
        }

        C4366a(Bitmap bitmap, InputStream inputStream, Picasso.LoadedFrom loadedFrom, int i) {
            boolean z = true;
            if ((inputStream == null ? false : z) ^ (bitmap != null)) {
                this.f7286b = bitmap;
                this.f7287c = inputStream;
                this.f7285a = (Picasso.LoadedFrom) C4376y.m12430d(loadedFrom, "loadedFrom == null");
                this.f7288d = i;
                return;
            }
            throw new AssertionError();
        }

        public C4366a(InputStream inputStream, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) null, (InputStream) C4376y.m12430d(inputStream, "stream == null"), loadedFrom, 0);
        }

        /* renamed from: a */
        public Bitmap mo28228a() {
            return this.f7286b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo28229b() {
            return this.f7288d;
        }

        /* renamed from: c */
        public Picasso.LoadedFrom mo28230c() {
            return this.f7285a;
        }

        /* renamed from: d */
        public InputStream mo28231d() {
            return this.f7287c;
        }
    }

    /* renamed from: a */
    static void m12390a(int i, int i2, int i3, int i4, BitmapFactory.Options options, C4361q qVar) {
        int i5;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = (double) (((float) i3) / ((float) i));
            } else if (i == 0) {
                d = (double) (((float) i4) / ((float) i2));
            } else {
                int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor2 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                i5 = qVar.f7249k ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i5 = (int) Math.floor(d);
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: b */
    static void m12391b(int i, int i2, BitmapFactory.Options options, C4361q qVar) {
        m12390a(i, i2, options.outWidth, options.outHeight, options, qVar);
    }

    /* renamed from: d */
    static BitmapFactory.Options m12392d(C4361q qVar) {
        boolean c = qVar.mo28211c();
        boolean z = qVar.f7255q != null;
        BitmapFactory.Options options = null;
        if (c || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c;
            if (z) {
                options.inPreferredConfig = qVar.f7255q;
            }
        }
        return options;
    }

    /* renamed from: g */
    static boolean m12393g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: c */
    public abstract boolean mo28100c(C4361q qVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo28102e() {
        return 0;
    }

    /* renamed from: f */
    public abstract C4366a mo28101f(C4361q qVar, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo28103h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo28104i() {
        return false;
    }
}

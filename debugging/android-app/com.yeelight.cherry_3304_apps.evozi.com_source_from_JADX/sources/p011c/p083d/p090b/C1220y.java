package p011c.p083d.p090b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.InputStream;
import p011c.p083d.p090b.C1203t;

/* renamed from: c.d.b.y */
public abstract class C1220y {

    /* renamed from: c.d.b.y$a */
    public static final class C1221a {

        /* renamed from: a */
        private final C1203t.C1209e f2150a;

        /* renamed from: b */
        private final Bitmap f2151b;

        /* renamed from: c */
        private final InputStream f2152c;

        /* renamed from: d */
        private final int f2153d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C1221a(Bitmap bitmap, C1203t.C1209e eVar) {
            this(bitmap, (InputStream) null, eVar, 0);
            C1173e0.m3013d(bitmap, "bitmap == null");
        }

        C1221a(Bitmap bitmap, InputStream inputStream, C1203t.C1209e eVar, int i) {
            boolean z = true;
            if ((inputStream == null ? false : z) ^ (bitmap != null)) {
                this.f2151b = bitmap;
                this.f2152c = inputStream;
                C1173e0.m3013d(eVar, "loadedFrom == null");
                this.f2150a = eVar;
                this.f2153d = i;
                return;
            }
            throw new AssertionError();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C1221a(InputStream inputStream, C1203t.C1209e eVar) {
            this((Bitmap) null, inputStream, eVar, 0);
            C1173e0.m3013d(inputStream, "stream == null");
        }

        /* renamed from: a */
        public Bitmap mo10041a() {
            return this.f2151b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo10042b() {
            return this.f2153d;
        }

        /* renamed from: c */
        public C1203t.C1209e mo10043c() {
            return this.f2150a;
        }

        /* renamed from: d */
        public InputStream mo10044d() {
            return this.f2152c;
        }
    }

    /* renamed from: a */
    static void m3149a(int i, int i2, int i3, int i4, BitmapFactory.Options options, C1216w wVar) {
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
                i5 = wVar.f2114k ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i5 = (int) Math.floor(d);
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: b */
    static void m3150b(int i, int i2, BitmapFactory.Options options, C1216w wVar) {
        m3149a(i, i2, options.outWidth, options.outHeight, options, wVar);
    }

    /* renamed from: d */
    static BitmapFactory.Options m3151d(C1216w wVar) {
        boolean c = wVar.mo10024c();
        boolean z = wVar.f2120q != null;
        BitmapFactory.Options options = null;
        if (c || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c;
            if (z) {
                options.inPreferredConfig = wVar.f2120q;
            }
        }
        return options;
    }

    /* renamed from: g */
    static boolean m3152g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: c */
    public abstract boolean mo9912c(C1216w wVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9994e() {
        return 0;
    }

    /* renamed from: f */
    public abstract C1221a mo9913f(C1216w wVar, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9995h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9996i() {
        return false;
    }
}

package p011c.p083d.p090b;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.d.b.j */
public interface C1189j {

    /* renamed from: c.d.b.j$a */
    public static class C1190a {

        /* renamed from: a */
        final InputStream f2015a;

        /* renamed from: b */
        final Bitmap f2016b;

        /* renamed from: c */
        final boolean f2017c;

        /* renamed from: d */
        final long f2018d;

        public C1190a(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.f2015a = inputStream;
                this.f2016b = null;
                this.f2017c = z;
                this.f2018d = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }

        @Deprecated
        /* renamed from: a */
        public Bitmap mo9980a() {
            return this.f2016b;
        }

        /* renamed from: b */
        public long mo9981b() {
            return this.f2018d;
        }

        /* renamed from: c */
        public InputStream mo9982c() {
            return this.f2015a;
        }
    }

    /* renamed from: c.d.b.j$b */
    public static class C1191b extends IOException {

        /* renamed from: a */
        final boolean f2019a;

        /* renamed from: b */
        final int f2020b;

        public C1191b(String str, int i, int i2) {
            super(str);
            this.f2019a = C1199q.m3093a(i);
            this.f2020b = i2;
        }
    }

    /* renamed from: a */
    C1190a mo9946a(Uri uri, int i);
}

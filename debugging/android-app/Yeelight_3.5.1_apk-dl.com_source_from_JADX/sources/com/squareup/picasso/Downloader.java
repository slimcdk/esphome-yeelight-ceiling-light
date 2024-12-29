package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public interface Downloader {

    public static class ResponseException extends IOException {
        final boolean localCacheOnly;
        final int responseCode;

        public ResponseException(String str, int i, int i2) {
            super(str);
            this.localCacheOnly = NetworkPolicy.isOfflineOnly(i);
            this.responseCode = i2;
        }
    }

    /* renamed from: com.squareup.picasso.Downloader$a */
    public static class C4324a {

        /* renamed from: a */
        final InputStream f7109a;

        /* renamed from: b */
        final Bitmap f7110b;

        /* renamed from: c */
        final boolean f7111c;

        /* renamed from: d */
        final long f7112d;

        public C4324a(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.f7109a = inputStream;
                this.f7110b = null;
                this.f7111c = z;
                this.f7112d = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }

        @Deprecated
        /* renamed from: a */
        public Bitmap mo28097a() {
            return this.f7110b;
        }

        /* renamed from: b */
        public long mo28098b() {
            return this.f7112d;
        }

        /* renamed from: c */
        public InputStream mo28099c() {
            return this.f7109a;
        }
    }

    /* renamed from: a */
    C4324a mo28096a(Uri uri, int i);
}

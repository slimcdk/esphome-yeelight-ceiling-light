package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.Objects;

/* renamed from: com.squareup.picasso.l */
public class C4355l implements C4342d {

    /* renamed from: a */
    final LinkedHashMap<String, Bitmap> f7216a;

    /* renamed from: b */
    private final int f7217b;

    /* renamed from: c */
    private int f7218c;

    /* renamed from: d */
    private int f7219d;

    /* renamed from: e */
    private int f7220e;

    /* renamed from: f */
    private int f7221f;

    /* renamed from: g */
    private int f7222g;

    public C4355l(int i) {
        if (i > 0) {
            this.f7217b = i;
            this.f7216a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    public C4355l(Context context) {
        this(C4376y.m12428b(context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        throw new java.lang.IllegalStateException(com.squareup.picasso.C4355l.class.getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12354c(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f7218c     // Catch:{ all -> 0x006f }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f7216a     // Catch:{ all -> 0x006f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f7218c     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r3.f7218c     // Catch:{ all -> 0x006f }
            if (r0 <= r4) goto L_0x0050
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f7216a     // Catch:{ all -> 0x006f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f7216a     // Catch:{ all -> 0x006f }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x006f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x006f }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x006f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x006f }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x006f }
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f7216a     // Catch:{ all -> 0x006f }
            r2.remove(r1)     // Catch:{ all -> 0x006f }
            int r1 = r3.f7218c     // Catch:{ all -> 0x006f }
            int r0 = com.squareup.picasso.C4376y.m12437k(r0)     // Catch:{ all -> 0x006f }
            int r1 = r1 - r0
            r3.f7218c = r1     // Catch:{ all -> 0x006f }
            int r0 = r3.f7220e     // Catch:{ all -> 0x006f }
            int r0 = r0 + 1
            r3.f7220e = r0     // Catch:{ all -> 0x006f }
            monitor-exit(r3)     // Catch:{ all -> 0x006f }
            goto L_0x0000
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x006f }
            return
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r0.<init>()     // Catch:{ all -> 0x006f }
            java.lang.Class<com.squareup.picasso.l> r1 = com.squareup.picasso.C4355l.class
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x006f }
            r0.append(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006f }
            r4.<init>(r0)     // Catch:{ all -> 0x006f }
            throw r4     // Catch:{ all -> 0x006f }
        L_0x006f:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006f }
            goto L_0x0073
        L_0x0072:
            throw r4
        L_0x0073:
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C4355l.m12354c(int):void");
    }

    /* renamed from: a */
    public final synchronized int mo28159a() {
        return this.f7217b;
    }

    /* renamed from: b */
    public void mo28160b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.f7219d++;
            this.f7218c += C4376y.m12437k(bitmap);
            Bitmap bitmap2 = (Bitmap) this.f7216a.put(str, bitmap);
            if (bitmap2 != null) {
                this.f7218c -= C4376y.m12437k(bitmap2);
            }
        }
        m12354c(this.f7217b);
    }

    public Bitmap get(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            Bitmap bitmap = this.f7216a.get(str);
            if (bitmap != null) {
                this.f7221f++;
                return bitmap;
            }
            this.f7222g++;
            return null;
        }
    }

    public final synchronized int size() {
        return this.f7218c;
    }
}

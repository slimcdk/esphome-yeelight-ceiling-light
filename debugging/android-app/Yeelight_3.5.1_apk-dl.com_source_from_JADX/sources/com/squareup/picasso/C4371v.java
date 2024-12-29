package com.squareup.picasso;

import java.io.PrintWriter;

/* renamed from: com.squareup.picasso.v */
public class C4371v {

    /* renamed from: a */
    public final int f7306a;

    /* renamed from: b */
    public final int f7307b;

    /* renamed from: c */
    public final long f7308c;

    /* renamed from: d */
    public final long f7309d;

    /* renamed from: e */
    public final long f7310e;

    /* renamed from: f */
    public final long f7311f;

    /* renamed from: g */
    public final long f7312g;

    /* renamed from: h */
    public final long f7313h;

    /* renamed from: i */
    public final long f7314i;

    /* renamed from: j */
    public final long f7315j;

    /* renamed from: k */
    public final int f7316k;

    /* renamed from: l */
    public final int f7317l;

    /* renamed from: m */
    public final int f7318m;

    /* renamed from: n */
    public final long f7319n;

    public C4371v(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f7306a = i;
        this.f7307b = i2;
        this.f7308c = j;
        this.f7309d = j2;
        this.f7310e = j3;
        this.f7311f = j4;
        this.f7312g = j5;
        this.f7313h = j6;
        this.f7314i = j7;
        this.f7315j = j8;
        this.f7316k = i3;
        this.f7317l = i4;
        this.f7318m = i5;
        this.f7319n = j9;
    }

    /* renamed from: a */
    public void mo28245a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f7306a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f7307b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f7307b) / ((float) this.f7306a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f7308c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f7309d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f7316k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f7310e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f7313h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f7317l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f7311f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f7318m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f7312g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f7314i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f7315j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f7306a + ", size=" + this.f7307b + ", cacheHits=" + this.f7308c + ", cacheMisses=" + this.f7309d + ", downloadCount=" + this.f7316k + ", totalDownloadSize=" + this.f7310e + ", averageDownloadSize=" + this.f7313h + ", totalOriginalBitmapSize=" + this.f7311f + ", totalTransformedBitmapSize=" + this.f7312g + ", averageOriginalBitmapSize=" + this.f7314i + ", averageTransformedBitmapSize=" + this.f7315j + ", originalBitmapCount=" + this.f7317l + ", transformedBitmapCount=" + this.f7318m + ", timeStamp=" + this.f7319n + '}';
    }
}

package p011c.p083d.p090b;

import java.io.PrintWriter;

/* renamed from: c.d.b.b0 */
public class C1159b0 {

    /* renamed from: a */
    public final int f1943a;

    /* renamed from: b */
    public final int f1944b;

    /* renamed from: c */
    public final long f1945c;

    /* renamed from: d */
    public final long f1946d;

    /* renamed from: e */
    public final long f1947e;

    /* renamed from: f */
    public final long f1948f;

    /* renamed from: g */
    public final long f1949g;

    /* renamed from: h */
    public final long f1950h;

    /* renamed from: i */
    public final long f1951i;

    /* renamed from: j */
    public final long f1952j;

    /* renamed from: k */
    public final int f1953k;

    /* renamed from: l */
    public final int f1954l;

    /* renamed from: m */
    public final int f1955m;

    /* renamed from: n */
    public final long f1956n;

    public C1159b0(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f1943a = i;
        this.f1944b = i2;
        this.f1945c = j;
        this.f1946d = j2;
        this.f1947e = j3;
        this.f1948f = j4;
        this.f1949g = j5;
        this.f1950h = j6;
        this.f1951i = j7;
        this.f1952j = j8;
        this.f1953k = i3;
        this.f1954l = i4;
        this.f1955m = i5;
        this.f1956n = j9;
    }

    /* renamed from: a */
    public void mo9914a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f1943a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f1944b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f1944b) / ((float) this.f1943a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f1945c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f1946d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f1953k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f1947e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f1950h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f1954l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f1948f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f1955m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f1949g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f1951i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f1952j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f1943a + ", size=" + this.f1944b + ", cacheHits=" + this.f1945c + ", cacheMisses=" + this.f1946d + ", downloadCount=" + this.f1953k + ", totalDownloadSize=" + this.f1947e + ", averageDownloadSize=" + this.f1950h + ", totalOriginalBitmapSize=" + this.f1948f + ", totalTransformedBitmapSize=" + this.f1949g + ", averageOriginalBitmapSize=" + this.f1951i + ", averageTransformedBitmapSize=" + this.f1952j + ", originalBitmapCount=" + this.f1954l + ", transformedBitmapCount=" + this.f1955m + ", timeStamp=" + this.f1956n + '}';
    }
}

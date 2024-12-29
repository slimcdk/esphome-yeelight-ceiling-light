package p011c.p083d.p090b;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* renamed from: c.d.b.m */
public class C1194m implements C1168d {

    /* renamed from: a */
    final LinkedHashMap<String, Bitmap> f2022a;

    /* renamed from: b */
    private final int f2023b;

    /* renamed from: c */
    private int f2024c;

    /* renamed from: d */
    private int f2025d;

    /* renamed from: e */
    private int f2026e;

    /* renamed from: f */
    private int f2027f;

    /* renamed from: g */
    private int f2028g;

    public C1194m(int i) {
        if (i > 0) {
            this.f2023b = i;
            this.f2022a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    public C1194m(Context context) {
        this(C1173e0.m3011b(context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3079d(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f2024c     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f2022a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f2024c     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r3.f2024c     // Catch:{ all -> 0x0071 }
            if (r0 <= r4) goto L_0x0050
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f2022a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f2022a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f2022a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r1 = r3.f2024c     // Catch:{ all -> 0x0071 }
            int r0 = p011c.p083d.p090b.C1173e0.m3020k(r0)     // Catch:{ all -> 0x0071 }
            int r1 = r1 - r0
            r3.f2024c = r1     // Catch:{ all -> 0x0071 }
            int r0 = r3.f2026e     // Catch:{ all -> 0x0071 }
            int r0 = r0 + 1
            r3.f2026e = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0000
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r4.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0075
        L_0x0074:
            throw r4
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p090b.C1194m.m3079d(int):void");
    }

    /* renamed from: a */
    public Bitmap mo9942a(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = this.f2022a.get(str);
                if (bitmap != null) {
                    this.f2027f++;
                    return bitmap;
                }
                this.f2028g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: b */
    public final synchronized int mo9943b() {
        return this.f2023b;
    }

    /* renamed from: c */
    public void mo9944c(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.f2025d++;
            this.f2024c += C1173e0.m3020k(bitmap);
            Bitmap bitmap2 = (Bitmap) this.f2022a.put(str, bitmap);
            if (bitmap2 != null) {
                this.f2024c -= C1173e0.m3020k(bitmap2);
            }
        }
        m3079d(this.f2023b);
    }

    public final synchronized int size() {
        return this.f2024c;
    }
}

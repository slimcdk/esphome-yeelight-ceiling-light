package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

@KeepForSdk
/* renamed from: com.google.android.gms.common.data.e */
public abstract class C1526e<T> extends C1522a<T> {

    /* renamed from: b */
    private boolean f2898b = false;

    /* renamed from: c */
    private ArrayList<Integer> f2899c;

    @KeepForSdk
    protected C1526e(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: f */
    private final void m4141f() {
        synchronized (this) {
            if (!this.f2898b) {
                int count = this.f2892a.getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.f2899c = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String e = mo11088e();
                    String V = this.f2892a.mo11066V(e, 0, this.f2892a.mo11067W(0));
                    int i = 1;
                    while (i < count) {
                        int W = this.f2892a.mo11067W(i);
                        String V2 = this.f2892a.mo11066V(e, i, W);
                        if (V2 != null) {
                            if (!V2.equals(V)) {
                                this.f2899c.add(Integer.valueOf(i));
                                V = V2;
                            }
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(e);
                            sb.append(", at row: ");
                            sb.append(i);
                            sb.append(", for window: ");
                            sb.append(W);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.f2898b = true;
            }
        }
    }

    /* renamed from: h */
    private final int m4142h(int i) {
        if (i >= 0 && i < this.f2899c.size()) {
            return this.f2899c.get(i).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: c */
    public String mo11086c() {
        return null;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: d */
    public abstract T mo11087d(int i, int i2);

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: e */
    public abstract String mo11088e();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        if (r6.f2892a.mo11066V(r4, r7, r3) == null) goto L_0x005b;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T get(int r7) {
        /*
            r6 = this;
            r6.m4141f()
            int r0 = r6.m4142h(r7)
            r1 = 0
            if (r7 < 0) goto L_0x005b
            java.util.ArrayList<java.lang.Integer> r2 = r6.f2899c
            int r2 = r2.size()
            if (r7 != r2) goto L_0x0013
            goto L_0x005b
        L_0x0013:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f2899c
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            if (r7 != r2) goto L_0x0024
            com.google.android.gms.common.data.DataHolder r2 = r6.f2892a
            int r2 = r2.getCount()
            goto L_0x0032
        L_0x0024:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f2899c
            int r4 = r7 + 1
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0032:
            java.util.ArrayList<java.lang.Integer> r4 = r6.f2899c
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r2 = r2 - r4
            if (r2 != r3) goto L_0x005a
            int r7 = r6.m4142h(r7)
            com.google.android.gms.common.data.DataHolder r3 = r6.f2892a
            int r3 = r3.mo11067W(r7)
            java.lang.String r4 = r6.mo11086c()
            if (r4 == 0) goto L_0x005a
            com.google.android.gms.common.data.DataHolder r5 = r6.f2892a
            java.lang.String r7 = r5.mo11066V(r4, r7, r3)
            if (r7 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r1 = r2
        L_0x005b:
            java.lang.Object r7 = r6.mo11087d(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.C1526e.get(int):java.lang.Object");
    }

    @KeepForSdk
    public int getCount() {
        m4141f();
        return this.f2899c.size();
    }
}

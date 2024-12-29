package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@VisibleForTesting
/* renamed from: com.google.android.gms.wearable.h */
public class C2425h {

    /* renamed from: a */
    private final HashMap<String, Object> f4855a = new HashMap<>();

    /* renamed from: v */
    private static void m7884v(String str, Object obj, String str2, ClassCastException classCastException) {
        m7885w(str, obj, str2, "<null>", classCastException);
    }

    /* renamed from: w */
    private static void m7885w(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.";
    }

    /* renamed from: a */
    public <T> T mo13231a(@NonNull String str) {
        return this.f4855a.get(str);
    }

    /* renamed from: b */
    public String mo13232b(@NonNull String str) {
        Object obj = this.f4855a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            m7884v(str, obj, "String", e);
            return null;
        }
    }

    /* renamed from: c */
    public Set<String> mo13233c() {
        return this.f4855a.keySet();
    }

    /* renamed from: d */
    public void mo13234d(@NonNull C2425h hVar) {
        for (String next : hVar.mo13233c()) {
            this.f4855a.put(next, hVar.mo13231a(next));
        }
    }

    /* renamed from: e */
    public void mo13235e(@NonNull String str, Asset asset) {
        this.f4855a.put(str, asset);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.wearable.C2425h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.wearable.h r7 = (com.google.android.gms.wearable.C2425h) r7
            int r0 = r6.mo13254u()
            int r2 = r7.mo13254u()
            if (r0 == r2) goto L_0x0013
            return r1
        L_0x0013:
            java.util.Set r0 = r6.mo13233c()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x00cc
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r6.mo13231a(r2)
            java.lang.Object r2 = r7.mo13231a(r2)
            boolean r5 = r4 instanceof com.google.android.gms.wearable.Asset
            if (r5 == 0) goto L_0x006d
            boolean r5 = r2 instanceof com.google.android.gms.wearable.Asset
            if (r5 != 0) goto L_0x0039
            return r1
        L_0x0039:
            com.google.android.gms.wearable.Asset r4 = (com.google.android.gms.wearable.Asset) r4
            com.google.android.gms.wearable.Asset r2 = (com.google.android.gms.wearable.Asset) r2
            if (r4 == 0) goto L_0x0066
            if (r2 != 0) goto L_0x0042
            goto L_0x0066
        L_0x0042:
            java.lang.String r3 = r4.mo13186S()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0059
            java.lang.String r3 = r4.mo13186S()
            java.lang.String r2 = r2.mo13186S()
            boolean r3 = r3.equals(r2)
            goto L_0x006a
        L_0x0059:
            byte[] r3 = r4.mo13189h()
            byte[] r2 = r2.mo13189h()
            boolean r3 = java.util.Arrays.equals(r3, r2)
            goto L_0x006a
        L_0x0066:
            if (r4 != r2) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            if (r3 != 0) goto L_0x001b
            return r1
        L_0x006d:
            boolean r5 = r4 instanceof java.lang.String[]
            if (r5 == 0) goto L_0x0081
            boolean r3 = r2 instanceof java.lang.String[]
            if (r3 != 0) goto L_0x0076
            return r1
        L_0x0076:
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.String[] r2 = (java.lang.String[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x0081:
            boolean r5 = r4 instanceof long[]
            if (r5 == 0) goto L_0x0095
            boolean r3 = r2 instanceof long[]
            if (r3 != 0) goto L_0x008a
            return r1
        L_0x008a:
            long[] r4 = (long[]) r4
            long[] r2 = (long[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x0095:
            boolean r5 = r4 instanceof float[]
            if (r5 == 0) goto L_0x00a9
            boolean r3 = r2 instanceof float[]
            if (r3 != 0) goto L_0x009e
            return r1
        L_0x009e:
            float[] r4 = (float[]) r4
            float[] r2 = (float[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x00a9:
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x00bd
            boolean r3 = r2 instanceof byte[]
            if (r3 != 0) goto L_0x00b2
            return r1
        L_0x00b2:
            byte[] r4 = (byte[]) r4
            byte[] r2 = (byte[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x00bd:
            if (r4 == 0) goto L_0x00c9
            if (r2 != 0) goto L_0x00c2
            goto L_0x00c9
        L_0x00c2:
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x00c9:
            if (r4 == r2) goto L_0x00cc
            return r1
        L_0x00cc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.C2425h.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public void mo13237f(@NonNull String str, boolean z) {
        this.f4855a.put(str, Boolean.valueOf(z));
    }

    /* renamed from: g */
    public void mo13238g(@NonNull String str, byte b) {
        this.f4855a.put(str, Byte.valueOf(b));
    }

    /* renamed from: h */
    public void mo13239h(@NonNull String str, byte[] bArr) {
        this.f4855a.put(str, bArr);
    }

    public int hashCode() {
        return this.f4855a.hashCode() * 29;
    }

    /* renamed from: i */
    public void mo13241i(@NonNull String str, C2425h hVar) {
        this.f4855a.put(str, hVar);
    }

    /* renamed from: j */
    public void mo13242j(@NonNull String str, ArrayList<C2425h> arrayList) {
        this.f4855a.put(str, arrayList);
    }

    /* renamed from: k */
    public void mo13243k(@NonNull String str, double d) {
        this.f4855a.put(str, Double.valueOf(d));
    }

    /* renamed from: l */
    public void mo13244l(@NonNull String str, float f) {
        this.f4855a.put(str, Float.valueOf(f));
    }

    /* renamed from: m */
    public void mo13245m(@NonNull String str, float[] fArr) {
        this.f4855a.put(str, fArr);
    }

    /* renamed from: n */
    public void mo13246n(@NonNull String str, int i) {
        this.f4855a.put(str, Integer.valueOf(i));
    }

    /* renamed from: o */
    public void mo13247o(@NonNull String str, ArrayList<Integer> arrayList) {
        this.f4855a.put(str, arrayList);
    }

    /* renamed from: p */
    public void mo13248p(@NonNull String str, long j) {
        this.f4855a.put(str, Long.valueOf(j));
    }

    /* renamed from: q */
    public void mo13249q(@NonNull String str, long[] jArr) {
        this.f4855a.put(str, jArr);
    }

    /* renamed from: r */
    public void mo13250r(@NonNull String str, String str2) {
        this.f4855a.put(str, str2);
    }

    /* renamed from: s */
    public void mo13251s(@NonNull String str, String[] strArr) {
        this.f4855a.put(str, strArr);
    }

    /* renamed from: t */
    public void mo13252t(@NonNull String str, ArrayList<String> arrayList) {
        this.f4855a.put(str, arrayList);
    }

    public String toString() {
        return this.f4855a.toString();
    }

    /* renamed from: u */
    public int mo13254u() {
        return this.f4855a.size();
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1230o0;

/* renamed from: com.google.android.gms.measurement.internal.q3 */
public abstract class C1751q3 extends C1230o0 implements C1763r3 {
    public C1751q3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0127, code lost:
        r9.writeNoException();
        r9.writeTypedList(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0190, code lost:
        r9.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12641c(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            switch(r7) {
                case 1: goto L_0x017a;
                case 2: goto L_0x0163;
                case 3: goto L_0x0003;
                case 4: goto L_0x0154;
                case 5: goto L_0x013d;
                case 6: goto L_0x012e;
                case 7: goto L_0x0114;
                case 8: goto L_0x0003;
                case 9: goto L_0x00f9;
                case 10: goto L_0x00e0;
                case 11: goto L_0x00c9;
                case 12: goto L_0x00b1;
                case 13: goto L_0x00a1;
                case 14: goto L_0x0084;
                case 15: goto L_0x006b;
                case 16: goto L_0x0052;
                case 17: goto L_0x003d;
                case 18: goto L_0x002d;
                case 19: goto L_0x0015;
                case 20: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r7 = 0
            return r7
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r7 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzq r7 = (com.google.android.gms.measurement.internal.zzq) r7
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r6.mo14199k0(r7)
            goto L_0x0190
        L_0x0015:
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r10 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r10)
            com.google.android.gms.measurement.internal.zzq r10 = (com.google.android.gms.measurement.internal.zzq) r10
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r6.mo14198k(r7, r10)
            goto L_0x0190
        L_0x002d:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r7 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzq r7 = (com.google.android.gms.measurement.internal.zzq) r7
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r6.mo14205r0(r7)
            goto L_0x0190
        L_0x003d:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            java.util.List r7 = r6.mo14208z(r7, r10, r0)
            goto L_0x0127
        L_0x0052:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r0 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r0)
            com.google.android.gms.measurement.internal.zzq r0 = (com.google.android.gms.measurement.internal.zzq) r0
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            java.util.List r7 = r6.mo14193W(r7, r10, r0)
            goto L_0x0127
        L_0x006b:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            boolean r1 = com.google.android.gms.internal.measurement.C1246p0.m2434g(r8)
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            java.util.List r7 = r6.mo14200l(r7, r10, r0, r1)
            goto L_0x0127
        L_0x0084:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            boolean r0 = com.google.android.gms.internal.measurement.C1246p0.m2434g(r8)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r1 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r1)
            com.google.android.gms.measurement.internal.zzq r1 = (com.google.android.gms.measurement.internal.zzq) r1
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            java.util.List r7 = r6.mo14201l0(r7, r10, r0, r1)
            goto L_0x0127
        L_0x00a1:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzac> r7 = com.google.android.gms.measurement.internal.zzac.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzac r7 = (com.google.android.gms.measurement.internal.zzac) r7
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r6.mo14202n(r7)
            goto L_0x0190
        L_0x00b1:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzac> r7 = com.google.android.gms.measurement.internal.zzac.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzac r7 = (com.google.android.gms.measurement.internal.zzac) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r10 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r10)
            com.google.android.gms.measurement.internal.zzq r10 = (com.google.android.gms.measurement.internal.zzq) r10
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r6.mo14206s0(r7, r10)
            goto L_0x0190
        L_0x00c9:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r7 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzq r7 = (com.google.android.gms.measurement.internal.zzq) r7
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            java.lang.String r7 = r6.mo14207t(r7)
            r9.writeNoException()
            r9.writeString(r7)
            goto L_0x0193
        L_0x00e0:
            long r1 = r8.readLong()
            java.lang.String r3 = r8.readString()
            java.lang.String r4 = r8.readString()
            java.lang.String r5 = r8.readString()
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r0 = r6
            r0.mo14194b0(r1, r3, r4, r5)
            goto L_0x0190
        L_0x00f9:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r7 = com.google.android.gms.measurement.internal.zzaw.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzaw r7 = (com.google.android.gms.measurement.internal.zzaw) r7
            java.lang.String r10 = r8.readString()
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            byte[] r7 = r6.mo14204q(r7, r10)
            r9.writeNoException()
            r9.writeByteArray(r7)
            goto L_0x0193
        L_0x0114:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r7 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzq r7 = (com.google.android.gms.measurement.internal.zzq) r7
            boolean r10 = com.google.android.gms.internal.measurement.C1246p0.m2434g(r8)
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            java.util.List r7 = r6.mo14203o(r7, r10)
        L_0x0127:
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x0193
        L_0x012e:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r7 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzq r7 = (com.google.android.gms.measurement.internal.zzq) r7
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r6.mo14197i(r7)
            goto L_0x0190
        L_0x013d:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r7 = com.google.android.gms.measurement.internal.zzaw.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzaw r7 = (com.google.android.gms.measurement.internal.zzaw) r7
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r6.mo14195e0(r7, r10, r0)
            goto L_0x0190
        L_0x0154:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r7 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzq r7 = (com.google.android.gms.measurement.internal.zzq) r7
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r6.mo14192V(r7)
            goto L_0x0190
        L_0x0163:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzlo> r7 = com.google.android.gms.measurement.internal.zzlo.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzlo r7 = (com.google.android.gms.measurement.internal.zzlo) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r10 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r10)
            com.google.android.gms.measurement.internal.zzq r10 = (com.google.android.gms.measurement.internal.zzq) r10
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r6.mo14190N(r7, r10)
            goto L_0x0190
        L_0x017a:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r7 = com.google.android.gms.measurement.internal.zzaw.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r7)
            com.google.android.gms.measurement.internal.zzaw r7 = (com.google.android.gms.measurement.internal.zzaw) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzq> r10 = com.google.android.gms.measurement.internal.zzq.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.C1246p0.m2428a(r8, r10)
            com.google.android.gms.measurement.internal.zzq r10 = (com.google.android.gms.measurement.internal.zzq) r10
            com.google.android.gms.internal.measurement.C1246p0.m2430c(r8)
            r6.mo14191Q(r7, r10)
        L_0x0190:
            r9.writeNoException()
        L_0x0193:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1751q3.mo12641c(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}

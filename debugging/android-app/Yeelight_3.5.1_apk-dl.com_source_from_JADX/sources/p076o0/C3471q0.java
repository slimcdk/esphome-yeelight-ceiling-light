package p076o0;

import com.google.android.gms.internal.wearable.C1523w;

/* renamed from: o0.q0 */
public abstract class C3471q0 extends C1523w implements C3474r0 {
    public C3471q0() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13834c(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            r3 = 13
            if (r1 == r3) goto L_0x0076
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x005e;
                case 3: goto L_0x0052;
                case 4: goto L_0x0046;
                case 5: goto L_0x003c;
                case 6: goto L_0x0030;
                case 7: goto L_0x0023;
                case 8: goto L_0x0016;
                case 9: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = 0
            return r1
        L_0x0009:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzi> r1 = com.google.android.gms.wearable.internal.zzi.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.wearable.C1520v0.m3844a(r2, r1)
            com.google.android.gms.wearable.internal.zzi r1 = (com.google.android.gms.wearable.internal.zzi) r1
            r0.mo14845S(r1)
            goto L_0x009d
        L_0x0016:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzag> r1 = com.google.android.gms.wearable.internal.zzag.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.wearable.C1520v0.m3844a(r2, r1)
            com.google.android.gms.wearable.internal.zzag r1 = (com.google.android.gms.wearable.internal.zzag) r1
            r0.mo14851x(r1)
            goto L_0x009d
        L_0x0023:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzax> r1 = com.google.android.gms.wearable.internal.zzax.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.wearable.C1520v0.m3844a(r2, r1)
            com.google.android.gms.wearable.internal.zzax r1 = (com.google.android.gms.wearable.internal.zzax) r1
            r0.mo14844L(r1)
            goto L_0x009d
        L_0x0030:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzl> r1 = com.google.android.gms.wearable.internal.zzl.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.wearable.C1520v0.m3844a(r2, r1)
            com.google.android.gms.wearable.internal.zzl r1 = (com.google.android.gms.wearable.internal.zzl) r1
            r0.mo14847p0(r1)
            goto L_0x009d
        L_0x003c:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzfw> r1 = com.google.android.gms.wearable.internal.zzfw.CREATOR
            java.util.ArrayList r1 = r2.createTypedArrayList(r1)
            r0.mo14848u(r1)
            goto L_0x009d
        L_0x0046:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzfw> r1 = com.google.android.gms.wearable.internal.zzfw.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.wearable.C1520v0.m3844a(r2, r1)
            com.google.android.gms.wearable.internal.zzfw r1 = (com.google.android.gms.wearable.internal.zzfw) r1
            r0.mo14850w0(r1)
            goto L_0x009d
        L_0x0052:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzfw> r1 = com.google.android.gms.wearable.internal.zzfw.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.wearable.C1520v0.m3844a(r2, r1)
            com.google.android.gms.wearable.internal.zzfw r1 = (com.google.android.gms.wearable.internal.zzfw) r1
            r0.mo14839B0(r1)
            goto L_0x009d
        L_0x005e:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzfj> r1 = com.google.android.gms.wearable.internal.zzfj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.wearable.C1520v0.m3844a(r2, r1)
            com.google.android.gms.wearable.internal.zzfj r1 = (com.google.android.gms.wearable.internal.zzfj) r1
            r0.mo14846p(r1)
            goto L_0x009d
        L_0x006a:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r1 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.wearable.C1520v0.m3844a(r2, r1)
            com.google.android.gms.common.data.DataHolder r1 = (com.google.android.gms.common.data.DataHolder) r1
            r0.mo14849v0(r1)
            goto L_0x009d
        L_0x0076:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzfj> r1 = com.google.android.gms.wearable.internal.zzfj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.wearable.C1520v0.m3844a(r2, r1)
            com.google.android.gms.wearable.internal.zzfj r1 = (com.google.android.gms.wearable.internal.zzfj) r1
            android.os.IBinder r2 = r2.readStrongBinder()
            if (r2 != 0) goto L_0x0086
            r2 = 0
            goto L_0x009a
        L_0x0086:
            java.lang.String r3 = "com.google.android.gms.wearable.internal.IRpcResponseCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p076o0.C3462n0
            if (r4 == 0) goto L_0x0094
            r2 = r3
            o0.n0 r2 = (p076o0.C3462n0) r2
            goto L_0x009a
        L_0x0094:
            o0.n0 r3 = new o0.n0
            r3.<init>(r2)
            r2 = r3
        L_0x009a:
            r0.mo14843H(r1, r2)
        L_0x009d:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p076o0.C3471q0.mo13834c(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}

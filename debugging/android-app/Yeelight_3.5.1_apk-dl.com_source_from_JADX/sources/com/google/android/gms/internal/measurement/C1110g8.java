package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1110g8;
import com.google.android.gms.internal.measurement.C1174k8;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.g8 */
public class C1110g8<MessageType extends C1174k8<MessageType, BuilderType>, BuilderType extends C1110g8<MessageType, BuilderType>> extends C1376x6<MessageType, BuilderType> {

    /* renamed from: a */
    private final C1174k8 f1341a;

    /* renamed from: b */
    protected C1174k8 f1342b;

    /* renamed from: c */
    protected boolean f1343c = false;

    protected C1110g8(MessageType messagetype) {
        this.f1341a = messagetype;
        this.f1342b = (C1174k8) messagetype.mo12569w(4, (Object) null, (Object) null);
    }

    /* renamed from: j */
    private static final void m2004j(C1174k8 k8Var, C1174k8 k8Var2) {
        C1319t9.m3045a().mo13383b(k8Var.getClass()).mo13047g(k8Var, k8Var2);
    }

    /* renamed from: a */
    public final /* synthetic */ C1191l9 mo12830a() {
        return this.f1341a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ C1376x6 mo12832g(C1391y6 y6Var) {
        mo12836o((C1174k8) y6Var);
        return this;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1376x6 mo12833h(byte[] bArr, int i, int i2) {
        mo12837p(bArr, 0, i2, C1377x7.m3246a());
        return this;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C1376x6 mo12834i(byte[] bArr, int i, int i2, C1377x7 x7Var) {
        mo12837p(bArr, 0, i2, x7Var);
        return this;
    }

    /* renamed from: k */
    public final C1110g8 clone() {
        C1110g8 g8Var = (C1110g8) this.f1341a.mo12569w(5, (Object) null, (Object) null);
        g8Var.mo12836o(mo12829V0());
        return g8Var;
    }

    /* renamed from: o */
    public final C1110g8 mo12836o(C1174k8 k8Var) {
        if (this.f1343c) {
            mo12840s();
            this.f1343c = false;
        }
        m2004j(this.f1342b, k8Var);
        return this;
    }

    /* renamed from: p */
    public final C1110g8 mo12837p(byte[] bArr, int i, int i2, C1377x7 x7Var) {
        if (this.f1343c) {
            mo12840s();
            this.f1343c = false;
        }
        try {
            C1319t9.m3045a().mo13383b(this.f1342b.getClass()).mo13043c(this.f1342b, bArr, 0, i2, new C1029b7(x7Var));
            return this;
        } catch (zzkm e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzkm.zzf();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType mo12838q() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.k8 r0 = r5.mo12829V0()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo12569w(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            com.google.android.gms.internal.measurement.t9 r3 = com.google.android.gms.internal.measurement.C1319t9.m3045a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.w9 r3 = r3.mo13383b(r4)
            boolean r3 = r3.mo13044d(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.mo12569w(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            com.google.android.gms.internal.measurement.zzmk r1 = new com.google.android.gms.internal.measurement.zzmk
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1110g8.mo12838q():com.google.android.gms.internal.measurement.k8");
    }

    /* renamed from: r */
    public MessageType mo12829V0() {
        if (this.f1343c) {
            return this.f1342b;
        }
        C1174k8 k8Var = this.f1342b;
        C1319t9.m3045a().mo13383b(k8Var.getClass()).mo13042b(k8Var);
        this.f1343c = true;
        return this.f1342b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo12840s() {
        C1174k8 k8Var = (C1174k8) this.f1342b.mo12569w(4, (Object) null, (Object) null);
        m2004j(k8Var, this.f1342b);
        this.f1342b = k8Var;
    }
}

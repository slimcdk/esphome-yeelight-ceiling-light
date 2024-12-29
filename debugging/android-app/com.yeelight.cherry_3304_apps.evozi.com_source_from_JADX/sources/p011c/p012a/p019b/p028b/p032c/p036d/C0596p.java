package p011c.p012a.p019b.p028b.p032c.p036d;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: c.a.b.b.c.d.p */
final class C0596p implements Cloneable {

    /* renamed from: a */
    private C0594n<?, ?> f274a;

    /* renamed from: b */
    private Object f275b;

    /* renamed from: c */
    private List<C0601u> f276c = new ArrayList();

    C0596p() {
    }

    /* renamed from: a */
    private final byte[] m439a() {
        byte[] bArr = new byte[mo8614d()];
        mo8611b(C0591k.m408l(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C0596p clone() {
        Object clone;
        C0596p pVar = new C0596p();
        try {
            pVar.f274a = this.f274a;
            if (this.f276c == null) {
                pVar.f276c = null;
            } else {
                pVar.f276c.addAll(this.f276c);
            }
            if (this.f275b != null) {
                if (this.f275b instanceof C0599s) {
                    clone = (C0599s) ((C0599s) this.f275b).clone();
                } else if (this.f275b instanceof byte[]) {
                    clone = ((byte[]) this.f275b).clone();
                } else {
                    int i = 0;
                    if (this.f275b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f275b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        pVar.f275b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f275b instanceof boolean[]) {
                        clone = ((boolean[]) this.f275b).clone();
                    } else if (this.f275b instanceof int[]) {
                        clone = ((int[]) this.f275b).clone();
                    } else if (this.f275b instanceof long[]) {
                        clone = ((long[]) this.f275b).clone();
                    } else if (this.f275b instanceof float[]) {
                        clone = ((float[]) this.f275b).clone();
                    } else if (this.f275b instanceof double[]) {
                        clone = ((double[]) this.f275b).clone();
                    } else if (this.f275b instanceof C0599s[]) {
                        C0599s[] sVarArr = (C0599s[]) this.f275b;
                        C0599s[] sVarArr2 = new C0599s[sVarArr.length];
                        pVar.f275b = sVarArr2;
                        while (i < sVarArr.length) {
                            sVarArr2[i] = (C0599s) sVarArr[i].clone();
                            i++;
                        }
                    }
                }
                pVar.f275b = clone;
            }
            return pVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8611b(C0591k kVar) {
        if (this.f275b == null) {
            for (C0601u next : this.f276c) {
                kVar.mo8598w(next.f280a);
                kVar.mo8595o(next.f281b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8612c(C0601u uVar) {
        NoSuchMethodError noSuchMethodError;
        List<C0601u> list = this.f276c;
        if (list != null) {
            list.add(uVar);
            return;
        }
        Object obj = this.f275b;
        if (obj instanceof C0599s) {
            byte[] bArr = uVar.f281b;
            C0590j d = C0590j.m381d(bArr, 0, bArr.length);
            int o = d.mo8584o();
            if (o == bArr.length - C0591k.m412t(o)) {
                C0599s a = ((C0599s) this.f275b).mo8561a(d);
                this.f274a = this.f274a;
                this.f275b = a;
                this.f276c = null;
                return;
            }
            throw C0598r.m451a();
        }
        boolean z = obj instanceof C0599s[];
        Collections.singletonList(uVar);
        if (z) {
            throw noSuchMethodError;
        } else {
            noSuchMethodError = new NoSuchMethodError();
            throw noSuchMethodError;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo8614d() {
        if (this.f275b == null) {
            int i = 0;
            for (C0601u next : this.f276c) {
                i += C0591k.m415x(next.f280a) + 0 + next.f281b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<C0601u> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0596p)) {
            return false;
        }
        C0596p pVar = (C0596p) obj;
        if (this.f275b == null || pVar.f275b == null) {
            List<C0601u> list2 = this.f276c;
            if (list2 != null && (list = pVar.f276c) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(m439a(), pVar.m439a());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            C0594n<?, ?> nVar = this.f274a;
            if (nVar != pVar.f274a) {
                return false;
            }
            if (!nVar.f269a.isArray()) {
                return this.f275b.equals(pVar.f275b);
            }
            Object obj2 = this.f275b;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) pVar.f275b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) pVar.f275b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) pVar.f275b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) pVar.f275b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) pVar.f275b) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) pVar.f275b) : Arrays.deepEquals((Object[]) obj2, (Object[]) pVar.f275b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m439a()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}

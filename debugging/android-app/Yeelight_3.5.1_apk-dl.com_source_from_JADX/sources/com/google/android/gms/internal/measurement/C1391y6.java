package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1376x6;
import com.google.android.gms.internal.measurement.C1391y6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y6 */
public abstract class C1391y6<MessageType extends C1391y6<MessageType, BuilderType>, BuilderType extends C1376x6<MessageType, BuilderType>> implements C1191l9 {
    protected int zzb = 0;

    /* renamed from: h */
    protected static void m3298h(Iterable iterable, List list) {
        C1270q8.m2546e(iterable);
        if (iterable instanceof C1318t8) {
            List c = ((C1318t8) iterable).mo13350c();
            C1318t8 t8Var = (C1318t8) list;
            int size = list.size();
            for (Object next : c) {
                if (next == null) {
                    int size2 = t8Var.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = t8Var.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            t8Var.remove(size3);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof zzjb) {
                    t8Var.mo13355j0((zzjb) next);
                } else {
                    t8Var.add((String) next);
                }
            }
        } else if (!(iterable instanceof C1303s9)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size();
                    String str2 = "Element at index " + (size5 - size4) + " is null.";
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 >= size4) {
                            list.remove(size6);
                        } else {
                            throw new NullPointerException(str2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: f */
    public final zzjb mo12974f() {
        try {
            int c = mo12908c();
            zzjb zzjb = zzjb.zzb;
            byte[] bArr = new byte[c];
            C1301s7 c2 = C1301s7.m2906c(bArr);
            mo12909d(c2);
            c2.mo13345d();
            return new zziy(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo12912g() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo12914i(int i) {
        throw null;
    }

    /* renamed from: j */
    public final byte[] mo13507j() {
        try {
            byte[] bArr = new byte[mo12908c()];
            C1301s7 c = C1301s7.m2906c(bArr);
            mo12909d(c);
            c.mo13345d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}

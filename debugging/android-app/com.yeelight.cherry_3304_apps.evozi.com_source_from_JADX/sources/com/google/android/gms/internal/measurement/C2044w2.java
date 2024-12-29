package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2044w2;
import com.google.android.gms.internal.measurement.C2075y2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w2 */
public abstract class C2044w2<MessageType extends C2044w2<MessageType, BuilderType>, BuilderType extends C2075y2<MessageType, BuilderType>> implements C2062x5 {
    protected int zza = 0;

    /* renamed from: g */
    protected static <T> void m6256g(Iterable<T> iterable, List<? super T> list) {
        C1925o4.m5642d(iterable);
        if (iterable instanceof C1766e5) {
            List<?> D = ((C1766e5) iterable).mo11599D();
            C1766e5 e5Var = (C1766e5) list;
            int size = list.size();
            for (Object next : D) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(e5Var.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = e5Var.size() - 1; size2 >= size; size2--) {
                        e5Var.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof C1779f3) {
                    e5Var.mo11601b0((C1779f3) next);
                } else {
                    e5Var.add((String) next);
                }
            }
        } else if (iterable instanceof C1858k6) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    /* renamed from: e */
    public final C1779f3 mo12167e() {
        try {
            C1888m3 n = C1779f3.m5076n(mo11846j());
            mo11839b(n.mo11837b());
            return n.mo11836a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: h */
    public final byte[] mo12168h() {
        try {
            byte[] bArr = new byte[mo11846j()];
            C2028v3 f = C2028v3.m6148f(bArr);
            mo11839b(f);
            f.mo12126N();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo11845i() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo11847k(int i) {
        throw new UnsupportedOperationException();
    }
}

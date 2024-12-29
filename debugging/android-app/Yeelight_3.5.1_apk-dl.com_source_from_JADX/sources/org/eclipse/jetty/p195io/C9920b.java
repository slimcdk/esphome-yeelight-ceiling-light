package org.eclipse.jetty.p195io;

import org.eclipse.jetty.p195io.Buffers;

/* renamed from: org.eclipse.jetty.io.b */
public class C9920b {
    /* renamed from: a */
    public static Buffers m24301a(Buffers.Type type, int i, Buffers.Type type2, int i2, Buffers.Type type3, int i3) {
        return i3 >= 0 ? new C9924c(type, i, type2, i2, type3, i3) : new C9925d(type, i, type2, i2, type3);
    }
}

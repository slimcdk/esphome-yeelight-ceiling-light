package org.eclipse.jetty.util;

import java.io.ByteArrayOutputStream;

/* renamed from: org.eclipse.jetty.util.g */
public class C9983g extends ByteArrayOutputStream {
    public C9983g() {
    }

    public C9983g(int i) {
        super(i);
    }

    /* renamed from: a */
    public byte[] mo40241a() {
        return this.buf;
    }

    /* renamed from: c */
    public void mo40242c(int i) {
        this.count = i;
    }

    public int getCount() {
        return this.count;
    }
}

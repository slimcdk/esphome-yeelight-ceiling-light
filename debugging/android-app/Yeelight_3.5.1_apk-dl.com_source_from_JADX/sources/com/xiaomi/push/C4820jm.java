package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.xiaomi.push.jm */
public class C4820jm extends C4823jp {

    /* renamed from: a */
    protected InputStream f9308a = null;

    /* renamed from: a */
    protected OutputStream f9309a = null;

    protected C4820jm() {
    }

    public C4820jm(OutputStream outputStream) {
        this.f9309a = outputStream;
    }

    /* renamed from: a */
    public int mo29876a(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.f9308a;
        if (inputStream != null) {
            try {
                int read = inputStream.read(bArr, i, i2);
                if (read >= 0) {
                    return read;
                }
                throw new C4824jq(4);
            } catch (IOException e) {
                throw new C4824jq(0, (Throwable) e);
            }
        } else {
            throw new C4824jq(1, "Cannot read from null inputStream");
        }
    }

    /* renamed from: a */
    public void m14974a(byte[] bArr, int i, int i2) {
        OutputStream outputStream = this.f9309a;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
            } catch (IOException e) {
                throw new C4824jq(0, (Throwable) e);
            }
        } else {
            throw new C4824jq(1, "Cannot write to null outputStream");
        }
    }
}

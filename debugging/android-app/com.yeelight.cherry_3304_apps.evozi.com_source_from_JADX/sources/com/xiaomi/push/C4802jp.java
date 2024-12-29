package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.xiaomi.push.jp */
public class C4802jp extends C4805js {

    /* renamed from: a */
    protected InputStream f9839a = null;

    /* renamed from: a */
    protected OutputStream f9840a = null;

    protected C4802jp() {
    }

    public C4802jp(OutputStream outputStream) {
        this.f9840a = outputStream;
    }

    /* renamed from: a */
    public int mo25842a(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.f9839a;
        if (inputStream != null) {
            try {
                int read = inputStream.read(bArr, i, i2);
                if (read >= 0) {
                    return read;
                }
                throw new C4806jt(4);
            } catch (IOException e) {
                throw new C4806jt(0, (Throwable) e);
            }
        } else {
            throw new C4806jt(1, "Cannot read from null inputStream");
        }
    }

    /* renamed from: a */
    public void m15337a(byte[] bArr, int i, int i2) {
        OutputStream outputStream = this.f9840a;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
            } catch (IOException e) {
                throw new C4806jt(0, (Throwable) e);
            }
        } else {
            throw new C4806jt(1, "Cannot write to null outputStream");
        }
    }
}

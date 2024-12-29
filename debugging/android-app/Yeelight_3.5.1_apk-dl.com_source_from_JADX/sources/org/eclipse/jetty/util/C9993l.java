package org.eclipse.jetty.util;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: org.eclipse.jetty.util.l */
public class C9993l extends FilterOutputStream {

    /* renamed from: d */
    private static final byte[] f18418d = {ParameterInitDefType.IntVec3Init, 10};

    /* renamed from: e */
    private static final byte[] f18419e = {45, 45};

    /* renamed from: a */
    private String f18420a;

    /* renamed from: b */
    private byte[] f18421b;

    /* renamed from: c */
    private boolean f18422c = false;

    public C9993l(OutputStream outputStream) {
        super(outputStream);
        String str = "jetty" + System.identityHashCode(this) + Long.toString(System.currentTimeMillis(), 36);
        this.f18420a = str;
        this.f18421b = str.getBytes("ISO-8859-1");
        this.f18422c = false;
    }

    /* renamed from: a */
    public String mo40264a() {
        return this.f18420a;
    }

    /* renamed from: c */
    public void mo40265c(String str, String[] strArr) {
        if (this.f18422c) {
            this.out.write(f18418d);
        }
        this.f18422c = true;
        this.out.write(f18419e);
        this.out.write(this.f18421b);
        OutputStream outputStream = this.out;
        byte[] bArr = f18418d;
        outputStream.write(bArr);
        OutputStream outputStream2 = this.out;
        outputStream2.write(("Content-Type: " + str).getBytes("ISO-8859-1"));
        this.out.write(bArr);
        int i = 0;
        while (strArr != null && i < strArr.length) {
            this.out.write(strArr[i].getBytes("ISO-8859-1"));
            this.out.write(f18418d);
            i++;
        }
        this.out.write(f18418d);
    }

    public void close() {
        if (this.f18422c) {
            this.out.write(f18418d);
        }
        OutputStream outputStream = this.out;
        byte[] bArr = f18419e;
        outputStream.write(bArr);
        this.out.write(this.f18421b);
        this.out.write(bArr);
        this.out.write(f18418d);
        this.f18422c = false;
        super.close();
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }
}

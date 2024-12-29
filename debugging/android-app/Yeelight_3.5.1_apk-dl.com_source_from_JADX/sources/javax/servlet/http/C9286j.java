package javax.servlet.http;

import java.io.IOException;
import java.util.ResourceBundle;
import p208s4.C10362n;

/* renamed from: javax.servlet.http.j */
class C9286j extends C10362n {

    /* renamed from: c */
    private static ResourceBundle f17197c = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* renamed from: b */
    private int f17198b = 0;

    C9286j() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo37793c() {
        return this.f17198b;
    }

    public void write(int i) {
        this.f17198b++;
    }

    public void write(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            this.f17198b += i2;
            return;
        }
        throw new IOException(f17197c.getString("err.io.negativelength"));
    }
}

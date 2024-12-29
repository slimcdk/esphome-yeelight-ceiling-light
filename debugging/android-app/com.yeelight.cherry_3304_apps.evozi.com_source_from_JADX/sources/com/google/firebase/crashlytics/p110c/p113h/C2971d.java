package com.google.firebase.crashlytics.p110c.p113h;

import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p112g.C2884h;
import com.google.firebase.crashlytics.p110c.p113h.C2966c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.commons.p271io.IOUtils;

/* renamed from: com.google.firebase.crashlytics.c.h.d */
class C2971d implements C2961a {

    /* renamed from: d */
    private static final Charset f5775d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f5776a;

    /* renamed from: b */
    private final int f5777b;

    /* renamed from: c */
    private C2966c f5778c;

    /* renamed from: com.google.firebase.crashlytics.c.h.d$a */
    class C2972a implements C2966c.C2970d {

        /* renamed from: a */
        final /* synthetic */ byte[] f5779a;

        /* renamed from: b */
        final /* synthetic */ int[] f5780b;

        C2972a(C2971d dVar, byte[] bArr, int[] iArr) {
            this.f5779a = bArr;
            this.f5780b = iArr;
        }

        /* renamed from: a */
        public void mo17327a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f5779a, this.f5780b[0], i);
                int[] iArr = this.f5780b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.h.d$b */
    private class C2973b {

        /* renamed from: a */
        public final byte[] f5781a;

        /* renamed from: b */
        public final int f5782b;

        C2973b(C2971d dVar, byte[] bArr, int i) {
            this.f5781a = bArr;
            this.f5782b = i;
        }
    }

    C2971d(File file, int i) {
        this.f5776a = file;
        this.f5777b = i;
    }

    /* renamed from: f */
    private void m9128f(long j, String str) {
        if (this.f5778c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f5777b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f5778c.mo17321i(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ")}).getBytes(f5775d));
                while (!this.f5778c.mo17326u() && this.f5778c.mo17319S() > this.f5777b) {
                    this.f5778c.mo17318L();
                }
            } catch (IOException e) {
                C2857b.m8687f().mo17133e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: g */
    private C2973b m9129g() {
        if (!this.f5776a.exists()) {
            return null;
        }
        m9130h();
        C2966c cVar = this.f5778c;
        if (cVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[cVar.mo17319S()];
        try {
            this.f5778c.mo17324s(new C2972a(this, bArr, iArr));
        } catch (IOException e) {
            C2857b.m8687f().mo17133e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C2973b(this, bArr, iArr[0]);
    }

    /* renamed from: h */
    private void m9130h() {
        if (this.f5778c == null) {
            try {
                this.f5778c = new C2966c(this.f5776a);
            } catch (IOException e) {
                C2857b f = C2857b.m8687f();
                f.mo17133e("Could not open log file: " + this.f5776a, e);
            }
        }
    }

    /* renamed from: a */
    public void mo17306a() {
        C2884h.m8808e(this.f5778c, "There was a problem closing the Crashlytics log file.");
        this.f5778c = null;
    }

    /* renamed from: b */
    public String mo17307b() {
        byte[] c = mo17308c();
        if (c != null) {
            return new String(c, f5775d);
        }
        return null;
    }

    /* renamed from: c */
    public byte[] mo17308c() {
        C2973b g = m9129g();
        if (g == null) {
            return null;
        }
        int i = g.f5782b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.f5781a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: d */
    public void mo17309d() {
        mo17306a();
        this.f5776a.delete();
    }

    /* renamed from: e */
    public void mo17310e(long j, String str) {
        m9130h();
        m9128f(j, str);
    }
}

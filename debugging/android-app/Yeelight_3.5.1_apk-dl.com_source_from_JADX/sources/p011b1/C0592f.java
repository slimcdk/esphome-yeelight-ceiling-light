package p011b1;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.commons.p194io.IOUtils;
import p011b1.C0587e;
import p118y0.C3916f;

/* renamed from: b1.f */
class C0592f implements C0580a {

    /* renamed from: d */
    private static final Charset f204d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f205a;

    /* renamed from: b */
    private final int f206b;

    /* renamed from: c */
    private C0587e f207c;

    /* renamed from: b1.f$a */
    class C0593a implements C0587e.C0591d {

        /* renamed from: a */
        final /* synthetic */ byte[] f208a;

        /* renamed from: b */
        final /* synthetic */ int[] f209b;

        C0593a(C0592f fVar, byte[] bArr, int[] iArr) {
            this.f208a = bArr;
            this.f209b = iArr;
        }

        /* renamed from: a */
        public void mo10953a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f208a, this.f209b[0], i);
                int[] iArr = this.f209b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: b1.f$b */
    private static class C0594b {

        /* renamed from: a */
        public final byte[] f210a;

        /* renamed from: b */
        public final int f211b;

        C0594b(byte[] bArr, int i) {
            this.f210a = bArr;
            this.f211b = i;
        }
    }

    C0592f(File file, int i) {
        this.f205a = file;
        this.f206b = i;
    }

    /* renamed from: f */
    private void m140f(long j, String str) {
        if (this.f207c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f206b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f207c.mo10947h(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ")}).getBytes(f204d));
                while (!this.f207c.mo10951p() && this.f207c.mo10945I() > this.f206b) {
                    this.f207c.mo10944D();
                }
            } catch (IOException e) {
                C3916f.m11190f().mo26402e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: g */
    private C0594b m141g() {
        if (!this.f205a.exists()) {
            return null;
        }
        m142h();
        C0587e eVar = this.f207c;
        if (eVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[eVar.mo10945I()];
        try {
            this.f207c.mo10950m(new C0593a(this, bArr, iArr));
        } catch (IOException e) {
            C3916f.m11190f().mo26402e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C0594b(bArr, iArr[0]);
    }

    /* renamed from: h */
    private void m142h() {
        if (this.f207c == null) {
            try {
                this.f207c = new C0587e(this.f205a);
            } catch (IOException e) {
                C3916f f = C3916f.m11190f();
                f.mo26402e("Could not open log file: " + this.f205a, e);
            }
        }
    }

    /* renamed from: a */
    public void mo10923a() {
        CommonUtils.m5536e(this.f207c, "There was a problem closing the Crashlytics log file.");
        this.f207c = null;
    }

    /* renamed from: b */
    public String mo10924b() {
        byte[] c = mo10925c();
        if (c != null) {
            return new String(c, f204d);
        }
        return null;
    }

    /* renamed from: c */
    public byte[] mo10925c() {
        C0594b g = m141g();
        if (g == null) {
            return null;
        }
        int i = g.f211b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.f210a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: d */
    public void mo10926d() {
        mo10923a();
        this.f205a.delete();
    }

    /* renamed from: e */
    public void mo10927e(long j, String str) {
        m142h();
        m140f(j, str);
    }
}

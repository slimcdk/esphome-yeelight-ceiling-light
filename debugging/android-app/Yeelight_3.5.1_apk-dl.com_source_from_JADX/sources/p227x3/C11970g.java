package p227x3;

import com.miot.service.manager.timer.TimerCodec;

/* renamed from: x3.g */
public class C11970g extends C11969f {

    /* renamed from: b */
    private String f21864b = TimerCodec.DISENABLE;

    /* renamed from: c */
    private String f21865c;

    /* renamed from: d */
    private String f21866d = TimerCodec.DISENABLE;

    /* renamed from: e */
    private String f21867e = "";

    /* renamed from: f */
    private String f21868f = "";

    public C11970g(String str) {
        this.f21864b = str;
    }

    /* renamed from: m */
    private int m30679m(String str) {
        try {
            return Integer.parseInt(str.replace(".", ""));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public boolean mo42509a(int i) {
        return mo42510b() >= i;
    }

    /* renamed from: b */
    public int mo42510b() {
        return m30679m(this.f21864b);
    }

    /* renamed from: c */
    public String mo42511c() {
        return this.f21864b;
    }

    /* renamed from: d */
    public String mo42512d() {
        return this.f21866d;
    }

    /* renamed from: e */
    public int mo42523e() {
        return 0;
    }

    /* renamed from: f */
    public String mo42525f() {
        return this.f21865c;
    }

    /* renamed from: g */
    public boolean mo42513g() {
        return mo42540l() > mo42510b();
    }

    /* renamed from: i */
    public void mo42514i() {
    }

    /* renamed from: j */
    public void mo42526j(int i) {
    }

    /* renamed from: l */
    public int mo42540l() {
        return m30679m(this.f21866d);
    }

    public String toString() {
        return "GingkoFirmware{mCurrentVersion='" + this.f21864b + '\'' + ", mReleaseNote='" + this.f21865c + '\'' + ", mLatestVersion='" + this.f21866d + '\'' + ", mLatestFileMd5='" + this.f21867e + '\'' + ", mLatestFileUrl='" + this.f21868f + '\'' + '}';
    }
}

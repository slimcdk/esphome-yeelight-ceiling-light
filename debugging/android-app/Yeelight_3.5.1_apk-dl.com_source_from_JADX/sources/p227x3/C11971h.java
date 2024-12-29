package p227x3;

import com.miot.service.manager.timer.TimerCodec;

/* renamed from: x3.h */
public class C11971h extends C11969f {

    /* renamed from: b */
    private String f21869b = TimerCodec.DISENABLE;

    /* renamed from: c */
    private int f21870c = 0;

    /* renamed from: d */
    private int f21871d;

    public C11971h(String str) {
        this.f21869b = str;
    }

    /* renamed from: o */
    private int m30690o(String str) {
        try {
            return Integer.valueOf(str.substring(str.indexOf("_") + 1).trim()).intValue();
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
        return m30690o(this.f21869b);
    }

    /* renamed from: c */
    public String mo42511c() {
        return this.f21869b;
    }

    /* renamed from: d */
    public String mo42512d() {
        return "";
    }

    /* renamed from: e */
    public int mo42523e() {
        return this.f21870c;
    }

    /* renamed from: f */
    public String mo42525f() {
        return "";
    }

    /* renamed from: g */
    public boolean mo42513g() {
        return false;
    }

    /* renamed from: i */
    public void mo42514i() {
    }

    /* renamed from: j */
    public void mo42526j(int i) {
    }

    /* renamed from: l */
    public int mo42542l() {
        return this.f21871d;
    }

    /* renamed from: m */
    public void mo42543m(int i) {
        this.f21871d = i;
    }

    /* renamed from: n */
    public void mo42544n(int i) {
        this.f21870c = i;
    }

    public String toString() {
        return "MeshDeviceFirmware{mCurrentVersion='" + this.f21869b + '}';
    }
}

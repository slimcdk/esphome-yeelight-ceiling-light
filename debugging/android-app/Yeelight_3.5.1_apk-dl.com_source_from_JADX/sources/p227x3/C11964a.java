package p227x3;

import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.utils.AppUtils;

/* renamed from: x3.a */
public abstract class C11964a extends C11969f {

    /* renamed from: f */
    private static final String f21853f = "a";

    /* renamed from: b */
    protected int f21854b = -1;

    /* renamed from: c */
    private boolean f21855c = true;

    /* renamed from: d */
    private int f21856d = -1;

    /* renamed from: e */
    private int f21857e = -1;

    /* renamed from: t */
    private String m30638t(int i) {
        String valueOf = String.valueOf(i);
        if (valueOf.length() != 4) {
            String str = f21853f;
            AppUtils.m8300u(str, "Invalid firmware format!" + i);
            return TimerCodec.DISENABLE;
        }
        String substring = valueOf.substring(0, 1);
        String substring2 = valueOf.substring(1, 2);
        String substring3 = valueOf.substring(2, 4);
        return substring + "." + substring2 + "." + substring3;
    }

    /* renamed from: a */
    public boolean mo42509a(int i) {
        return mo42510b() >= i;
    }

    /* renamed from: b */
    public int mo42510b() {
        return this.f21855c ? this.f21856d : this.f21857e;
    }

    /* renamed from: c */
    public String mo42511c() {
        return m30638t(mo42510b());
    }

    /* renamed from: d */
    public String mo42512d() {
        return m30638t(mo42517n());
    }

    /* renamed from: g */
    public boolean mo42513g() {
        return false;
    }

    /* renamed from: i */
    public void mo42514i() {
        if (mo42518o()) {
            this.f21857e = this.f21854b;
        } else {
            this.f21856d = this.f21854b;
        }
        mo42521r(!mo42518o());
    }

    /* renamed from: l */
    public int mo42515l() {
        return this.f21856d;
    }

    /* renamed from: m */
    public int mo42516m() {
        return this.f21857e;
    }

    /* renamed from: n */
    public int mo42517n() {
        return this.f21854b;
    }

    /* renamed from: o */
    public boolean mo42518o() {
        return this.f21855c;
    }

    /* renamed from: p */
    public void mo42519p(int i) {
        this.f21856d = i;
    }

    /* renamed from: q */
    public void mo42520q(int i) {
        this.f21857e = i;
    }

    /* renamed from: r */
    public void mo42521r(boolean z) {
        this.f21855c = z;
    }

    /* renamed from: s */
    public void mo42522s(int i) {
        this.f21854b = i;
    }
}

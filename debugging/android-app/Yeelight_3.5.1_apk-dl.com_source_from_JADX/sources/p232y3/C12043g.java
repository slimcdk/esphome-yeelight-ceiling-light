package p232y3;

import android.graphics.Color;
import androidx.core.internal.view.SupportMenu;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.models.C8308a;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9188d;

/* renamed from: y3.g */
public class C12043g {

    /* renamed from: a */
    private boolean f22086a;

    /* renamed from: b */
    private DeviceStatusBase.DeviceMode f22087b;

    /* renamed from: c */
    private int f22088c;

    /* renamed from: d */
    private int f22089d;

    /* renamed from: e */
    private int f22090e;

    /* renamed from: f */
    private int f22091f;

    /* renamed from: g */
    private int f22092g;

    /* renamed from: h */
    private boolean f22093h;

    /* renamed from: i */
    private int f22094i;

    /* renamed from: j */
    private List<C12044a> f22095j;

    /* renamed from: k */
    private C8308a f22096k;

    /* renamed from: l */
    private C8308a f22097l;

    /* renamed from: m */
    private int f22098m;

    /* renamed from: n */
    private int f22099n;

    /* renamed from: y3.g$a */
    public static class C12044a {

        /* renamed from: a */
        int f22100a;

        /* renamed from: b */
        int f22101b;

        public C12044a(int i, int i2) {
            this.f22100a = i;
            this.f22101b = i2;
        }

        /* renamed from: a */
        public int mo42713a() {
            return this.f22100a;
        }

        /* renamed from: b */
        public int mo42714b() {
            return this.f22101b;
        }

        /* renamed from: c */
        public void mo42715c(int i) {
            this.f22100a = i;
        }

        /* renamed from: d */
        public void mo42716d(int i) {
            this.f22101b = i;
        }
    }

    public C12043g(boolean z, DeviceStatusBase.DeviceMode deviceMode, int i, int i2, int i3) {
        this(z, deviceMode, i, i2, i3, 0, 0);
    }

    public C12043g(boolean z, DeviceStatusBase.DeviceMode deviceMode, int i, int i2, int i3, int i4, int i5) {
        this.f22094i = 0;
        this.f22095j = new ArrayList();
        this.f22097l = C8308a.m19690e();
        i = (i < 0 || i > 100) ? 100 : i;
        i2 = (i2 < 1700 || i2 > 6500) ? 4000 : i2;
        this.f22086a = z;
        this.f22087b = deviceMode;
        this.f22088c = i;
        this.f22090e = i2;
        this.f22092g = i3;
        this.f22098m = i4;
        this.f22099n = i5;
    }

    /* renamed from: f */
    public static C12043g m31085f() {
        return new C12043g(false, DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE, 100, 4000, SupportMenu.CATEGORY_MASK);
    }

    /* renamed from: A */
    public void mo42684A(int i) {
        this.f22091f = i;
    }

    /* renamed from: B */
    public void mo42685B(boolean z) {
        this.f22086a = z;
    }

    /* renamed from: C */
    public void mo42686C(int i) {
        this.f22099n = i;
    }

    /* renamed from: a */
    public int mo42687a() {
        return this.f22088c;
    }

    /* renamed from: b */
    public int mo42688b() {
        if (this.f22087b != DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV) {
            return this.f22092g;
        }
        return Color.HSVToColor(new float[]{(float) this.f22098m, (float) this.f22099n, C9188d.m22130a(this.f22088c)});
    }

    /* renamed from: c */
    public List<C12044a> mo42689c() {
        return this.f22095j;
    }

    /* renamed from: d */
    public C8308a mo42690d() {
        return this.f22097l;
    }

    /* renamed from: e */
    public int mo42691e() {
        return this.f22090e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12043g)) {
            return false;
        }
        C12043g gVar = (C12043g) obj;
        if (mo42696j() != gVar.mo42696j() || Math.abs(mo42687a() - gVar.mo42687a()) > 3 || Math.abs(mo42691e() - gVar.mo42691e()) > 3) {
            return false;
        }
        if ((mo42701o() && !gVar.mo42701o()) || (!mo42701o() && gVar.mo42701o())) {
            return false;
        }
        if ((mo42700n() && !gVar.mo42700n()) || ((!mo42700n() && gVar.mo42700n()) || mo42689c().size() != gVar.mo42689c().size())) {
            return false;
        }
        for (int i = 0; i < mo42689c().size(); i++) {
            if (mo42689c().get(i).mo42713a() != gVar.mo42689c().get(i).mo42713a() || mo42689c().get(i).mo42714b() != gVar.mo42689c().get(i).mo42714b()) {
                return false;
            }
        }
        return this.f22092g == 0 || mo42688b() == gVar.mo42688b();
    }

    /* renamed from: g */
    public C8308a mo42693g() {
        return this.f22096k;
    }

    /* renamed from: h */
    public int mo42694h() {
        return this.f22098m;
    }

    /* renamed from: i */
    public int mo42695i() {
        return this.f22094i;
    }

    /* renamed from: j */
    public DeviceStatusBase.DeviceMode mo42696j() {
        return this.f22087b;
    }

    /* renamed from: k */
    public int mo42697k() {
        return this.f22089d;
    }

    /* renamed from: l */
    public int mo42698l() {
        return this.f22091f;
    }

    /* renamed from: m */
    public int mo42699m() {
        return this.f22099n;
    }

    /* renamed from: n */
    public boolean mo42700n() {
        return this.f22093h;
    }

    /* renamed from: o */
    public boolean mo42701o() {
        return this.f22086a;
    }

    /* renamed from: p */
    public void mo42702p(int i) {
        this.f22088c = i;
    }

    /* renamed from: q */
    public void mo42703q(int i) {
        this.f22092g = i;
    }

    /* renamed from: r */
    public void mo42704r(List<C12044a> list) {
        this.f22095j.clear();
        this.f22095j.addAll(list);
    }

    /* renamed from: s */
    public void mo42705s(C8308a aVar) {
        this.f22097l = aVar;
    }

    /* renamed from: t */
    public void mo42706t(int i) {
        this.f22090e = i;
    }

    /* renamed from: u */
    public void mo42707u(C8308a aVar) {
        this.f22096k = aVar;
    }

    /* renamed from: v */
    public void mo42708v(boolean z) {
        this.f22093h = z;
    }

    /* renamed from: w */
    public void mo42709w(int i) {
        this.f22098m = i;
    }

    /* renamed from: x */
    public void mo42710x(int i) {
        this.f22094i = i;
    }

    /* renamed from: y */
    public void mo42711y(DeviceStatusBase.DeviceMode deviceMode) {
        this.f22087b = deviceMode;
    }

    /* renamed from: z */
    public void mo42712z(int i) {
        this.f22089d = i;
    }
}

package p197p3;

import com.yeelight.yeelib.device.base.C3012e;
import java.util.Objects;

/* renamed from: p3.a */
public class C10265a {

    /* renamed from: a */
    private C3012e f19327a;

    /* renamed from: b */
    private boolean f19328b;

    /* renamed from: a */
    public C3012e mo41731a() {
        return this.f19327a;
    }

    /* renamed from: b */
    public boolean mo41732b() {
        return this.f19328b;
    }

    /* renamed from: c */
    public void mo41733c(boolean z) {
        this.f19328b = z;
    }

    /* renamed from: d */
    public void mo41734d(C3012e eVar) {
        this.f19327a = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10265a.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f19327a, ((C10265a) obj).f19327a);
    }

    public int hashCode() {
        C3012e eVar = this.f19327a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }
}

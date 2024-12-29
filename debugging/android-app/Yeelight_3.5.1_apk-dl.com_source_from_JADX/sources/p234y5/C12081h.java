package p234y5;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.eclipse.jetty.security.UserDataConstraint;

/* renamed from: y5.h */
public class C12081h {

    /* renamed from: a */
    private boolean f22124a;

    /* renamed from: b */
    private boolean f22125b;

    /* renamed from: c */
    private boolean f22126c;

    /* renamed from: d */
    private UserDataConstraint f22127d;

    /* renamed from: e */
    private final Set<String> f22128e = new CopyOnWriteArraySet();

    /* renamed from: a */
    public void mo42767a(String str) {
        this.f22128e.add(str);
    }

    /* renamed from: b */
    public void mo42768b(C12081h hVar) {
        if (hVar.f22126c) {
            mo42776j(true);
        } else if (!hVar.f22125b) {
            mo42775i(true);
        } else if (hVar.f22124a) {
            mo42774h(true);
        } else if (!this.f22124a) {
            for (String add : hVar.f22128e) {
                this.f22128e.add(add);
            }
        }
        mo42777k(hVar.f22127d);
    }

    /* renamed from: c */
    public Set<String> mo42769c() {
        return this.f22128e;
    }

    /* renamed from: d */
    public UserDataConstraint mo42770d() {
        return this.f22127d;
    }

    /* renamed from: e */
    public boolean mo42771e() {
        return this.f22124a;
    }

    /* renamed from: f */
    public boolean mo42772f() {
        return this.f22125b;
    }

    /* renamed from: g */
    public boolean mo42773g() {
        return this.f22126c;
    }

    /* renamed from: h */
    public void mo42774h(boolean z) {
        this.f22124a = z;
        if (z) {
            this.f22125b = true;
            this.f22128e.clear();
        }
    }

    /* renamed from: i */
    public void mo42775i(boolean z) {
        this.f22125b = z;
        if (!z) {
            this.f22126c = false;
            this.f22128e.clear();
            this.f22124a = false;
        }
    }

    /* renamed from: j */
    public void mo42776j(boolean z) {
        this.f22126c = z;
        if (z) {
            this.f22125b = true;
            this.f22127d = null;
            this.f22124a = false;
            this.f22128e.clear();
        }
    }

    /* renamed from: k */
    public void mo42777k(UserDataConstraint userDataConstraint) {
        Objects.requireNonNull(userDataConstraint, "Null UserDataConstraint");
        UserDataConstraint userDataConstraint2 = this.f22127d;
        if (userDataConstraint2 != null) {
            userDataConstraint = userDataConstraint2.combine(userDataConstraint);
        }
        this.f22127d = userDataConstraint;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{RoleInfo");
        String str = "";
        sb.append(this.f22126c ? ",F" : str);
        if (this.f22125b) {
            str = ",C";
        }
        sb.append(str);
        sb.append(this.f22124a ? ",*" : this.f22128e);
        sb.append("}");
        return sb.toString();
    }
}

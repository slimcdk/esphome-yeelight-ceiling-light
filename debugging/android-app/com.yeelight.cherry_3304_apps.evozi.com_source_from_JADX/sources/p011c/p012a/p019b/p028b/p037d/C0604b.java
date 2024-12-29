package p011c.p012a.p019b.p028b.p037d;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.C2401a;

/* renamed from: c.a.b.b.d.b */
public final class C0604b {

    /* renamed from: a */
    private static final C1382a.C1391g<C2401a> f295a = new C1382a.C1391g<>();
    @ShowFirstParty

    /* renamed from: b */
    private static final C1382a.C1391g<C2401a> f296b = new C1382a.C1391g<>();

    /* renamed from: c */
    public static final C1382a.C1383a<C2401a, C0603a> f297c = new C0605c();

    /* renamed from: d */
    private static final C1382a.C1383a<C2401a, Object> f298d = new C0606d();

    /* renamed from: e */
    public static final C1382a<C0603a> f299e = new C1382a<>("SignIn.API", f297c, f295a);

    static {
        new Scope("profile");
        new Scope(NotificationCompat.CATEGORY_EMAIL);
        new C1382a("SignIn.INTERNAL_API", f298d, f296b);
    }
}

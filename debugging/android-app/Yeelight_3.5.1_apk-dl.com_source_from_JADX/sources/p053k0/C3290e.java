package p053k0;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

/* renamed from: k0.e */
public final class C3290e {

    /* renamed from: a */
    public static final C0722a.C0731g f5310a;
    @ShowFirstParty

    /* renamed from: b */
    public static final C0722a.C0731g f5311b;

    /* renamed from: c */
    public static final C0722a.C0723a f5312c;

    /* renamed from: d */
    static final C0722a.C0723a f5313d;

    /* renamed from: e */
    public static final C0722a f5314e;

    static {
        C0722a.C0731g gVar = new C0722a.C0731g();
        f5310a = gVar;
        C0722a.C0731g gVar2 = new C0722a.C0731g();
        f5311b = gVar2;
        C3287b bVar = new C3287b();
        f5312c = bVar;
        C3288c cVar = new C3288c();
        f5313d = cVar;
        new Scope("profile");
        new Scope(NotificationCompat.CATEGORY_EMAIL);
        f5314e = new C0722a("SignIn.API", bVar, gVar);
        new C0722a("SignIn.INTERNAL_API", cVar, gVar2);
    }
}

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1382a.C1386d;
import com.google.android.gms.common.api.internal.C1409a;
import com.google.android.gms.common.api.internal.C1411a1;
import com.google.android.gms.common.api.internal.C1418c;
import com.google.android.gms.common.api.internal.C1426e;
import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.api.internal.C1454j1;
import com.google.android.gms.common.api.internal.C1456k;
import com.google.android.gms.common.api.internal.C1464m;
import com.google.android.gms.common.api.internal.C1468n;
import com.google.android.gms.common.api.internal.C1503y1;
import com.google.android.gms.common.internal.C1564e;
import com.google.android.gms.common.internal.C1609u;
import java.util.Collections;
import p011c.p012a.p019b.p028b.p038e.C0619h;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.e */
public class C1396e<O extends C1382a.C1386d> {

    /* renamed from: a */
    private final Context f2557a;

    /* renamed from: b */
    private final C1382a<O> f2558b;

    /* renamed from: c */
    private final O f2559c;

    /* renamed from: d */
    private final C1503y1<O> f2560d;

    /* renamed from: e */
    private final Looper f2561e;

    /* renamed from: f */
    private final int f2562f;

    /* renamed from: g */
    private final C1399f f2563g;

    /* renamed from: h */
    protected final C1426e f2564h;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.e$a */
    public static class C1397a {
        @KeepForSdk

        /* renamed from: c */
        public static final C1397a f2565c = new C1398a().mo10824a();

        /* renamed from: a */
        public final C1464m f2566a;

        /* renamed from: b */
        public final Looper f2567b;

        @KeepForSdk
        /* renamed from: com.google.android.gms.common.api.e$a$a */
        public static class C1398a {

            /* renamed from: a */
            private C1464m f2568a;

            /* renamed from: b */
            private Looper f2569b;

            @KeepForSdk
            /* renamed from: a */
            public C1397a mo10824a() {
                if (this.f2568a == null) {
                    this.f2568a = new C1409a();
                }
                if (this.f2569b == null) {
                    this.f2569b = Looper.getMainLooper();
                }
                return new C1397a(this.f2568a, this.f2569b);
            }
        }

        @KeepForSdk
        private C1397a(C1464m mVar, Account account, Looper looper) {
            this.f2566a = mVar;
            this.f2567b = looper;
        }
    }

    @KeepForSdk
    protected C1396e(@NonNull Context context, C1382a<O> aVar, Looper looper) {
        C1609u.m4476l(context, "Null context is not permitted.");
        C1609u.m4476l(aVar, "Api must not be null.");
        C1609u.m4476l(looper, "Looper must not be null.");
        this.f2557a = context.getApplicationContext();
        this.f2558b = aVar;
        this.f2559c = null;
        this.f2561e = looper;
        this.f2560d = C1503y1.m4081a(aVar);
        this.f2563g = new C1411a1(this);
        C1426e j = C1426e.m3746j(this.f2557a);
        this.f2564h = j;
        this.f2562f = j.mo10913m();
    }

    @KeepForSdk
    public C1396e(@NonNull Context context, C1382a<O> aVar, @Nullable O o, C1397a aVar2) {
        C1609u.m4476l(context, "Null context is not permitted.");
        C1609u.m4476l(aVar, "Api must not be null.");
        C1609u.m4476l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f2557a = context.getApplicationContext();
        this.f2558b = aVar;
        this.f2559c = o;
        this.f2561e = aVar2.f2567b;
        this.f2560d = C1503y1.m4082b(aVar, o);
        this.f2563g = new C1411a1(this);
        C1426e j = C1426e.m3746j(this.f2557a);
        this.f2564h = j;
        this.f2562f = j.mo10913m();
        C1464m mVar = aVar2.f2566a;
        this.f2564h.mo10910g(this);
    }

    /* renamed from: k */
    private final <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T m3646k(int i, @NonNull T t) {
        t.mo10853r();
        this.f2564h.mo10911h(this, i, t);
        return t;
    }

    @KeepForSdk
    /* renamed from: a */
    public C1399f mo10812a() {
        return this.f2563g;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public C1564e.C1565a mo10813b() {
        Account account;
        GoogleSignInAccount I;
        GoogleSignInAccount I2;
        C1564e.C1565a aVar = new C1564e.C1565a();
        O o = this.f2559c;
        if (!(o instanceof C1382a.C1386d.C1388b) || (I2 = ((C1382a.C1386d.C1388b) o).mo10787I()) == null) {
            O o2 = this.f2559c;
            account = o2 instanceof C1382a.C1386d.C1387a ? ((C1382a.C1386d.C1387a) o2).mo10786j() : null;
        } else {
            account = I2.mo10717j();
        }
        aVar.mo11205c(account);
        O o3 = this.f2559c;
        aVar.mo11203a((!(o3 instanceof C1382a.C1386d.C1388b) || (I = ((C1382a.C1386d.C1388b) o3).mo10787I()) == null) ? Collections.emptySet() : I.mo10712X());
        aVar.mo11206d(this.f2557a.getClass().getName());
        aVar.mo11207e(this.f2557a.getPackageName());
        return aVar;
    }

    @KeepForSdk
    /* renamed from: c */
    public <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10814c(@NonNull T t) {
        m3646k(0, t);
        return t;
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: d */
    public <A extends C1382a.C1384b, T extends C1456k<A, ?>, U extends C1468n<A, ?>> C0619h<Void> mo10815d(@NonNull T t, U u) {
        C1609u.m4475k(t);
        C1609u.m4475k(u);
        C1609u.m4476l(t.mo10977b(), "Listener has already been released.");
        C1609u.m4476l(u.mo10992a(), "Listener has already been released.");
        C1609u.m4466b(t.mo10977b().equals(u.mo10992a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f2564h.mo10907d(this, t, u);
    }

    @KeepForSdk
    /* renamed from: e */
    public C0619h<Boolean> mo10816e(@NonNull C1445i.C1446a<?> aVar) {
        C1609u.m4476l(aVar, "Listener key cannot be null.");
        return this.f2564h.mo10906c(this, aVar);
    }

    @KeepForSdk
    /* renamed from: f */
    public <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10817f(@NonNull T t) {
        m3646k(1, t);
        return t;
    }

    /* renamed from: g */
    public final C1382a<O> mo10818g() {
        return this.f2558b;
    }

    /* renamed from: h */
    public final int mo10819h() {
        return this.f2562f;
    }

    @KeepForSdk
    /* renamed from: i */
    public Looper mo10820i() {
        return this.f2561e;
    }

    @WorkerThread
    /* renamed from: j */
    public C1382a.C1390f mo10821j(Looper looper, C1426e.C1427a<O> aVar) {
        return this.f2558b.mo10785d().mo8629c(this.f2557a, looper, mo10813b().mo11204b(), this.f2559c, aVar, aVar);
    }

    /* renamed from: l */
    public C1454j1 mo10822l(Context context, Handler handler) {
        return new C1454j1(context, handler, mo10813b().mo11204b());
    }

    /* renamed from: m */
    public final C1503y1<O> mo10823m() {
        return this.f2560d;
    }
}

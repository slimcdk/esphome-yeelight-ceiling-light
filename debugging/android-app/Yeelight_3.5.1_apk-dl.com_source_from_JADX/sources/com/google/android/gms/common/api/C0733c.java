package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0722a.C0726d;
import com.google.android.gms.common.api.internal.C0747a;
import com.google.android.gms.common.api.internal.C0752b;
import com.google.android.gms.common.api.internal.C0763d;
import com.google.android.gms.common.api.internal.C0778g;
import com.google.android.gms.common.api.internal.C0785h1;
import com.google.android.gms.common.api.internal.C0791i2;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.api.internal.C0805l;
import com.google.android.gms.common.api.internal.C0812m1;
import com.google.android.gms.common.api.internal.C0820o;
import com.google.android.gms.common.api.internal.C0834r;
import com.google.android.gms.common.api.internal.C0838s;
import com.google.android.gms.common.api.internal.C0863y;
import com.google.android.gms.common.internal.C0897c;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.tasks.C1872a;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p014c0.C0624m;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.common.api.c */
public abstract class C0733c<O extends C0722a.C0726d> implements C0740e<O> {

    /* renamed from: a */
    private final Context f521a;
    @Nullable

    /* renamed from: b */
    private final String f522b;

    /* renamed from: c */
    private final C0722a f523c;

    /* renamed from: d */
    private final C0722a.C0726d f524d;

    /* renamed from: e */
    private final C0752b f525e;

    /* renamed from: f */
    private final Looper f526f;

    /* renamed from: g */
    private final int f527g;
    @NotOnlyInitialized

    /* renamed from: h */
    private final C0736d f528h;

    /* renamed from: i */
    private final C0834r f529i;
    @NonNull

    /* renamed from: j */
    protected final C0778g f530j;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.c$a */
    public static class C0734a {
        @NonNull
        @KeepForSdk

        /* renamed from: c */
        public static final C0734a f531c = new C0735a().mo11859a();
        @NonNull

        /* renamed from: a */
        public final C0834r f532a;
        @NonNull

        /* renamed from: b */
        public final Looper f533b;

        @KeepForSdk
        /* renamed from: com.google.android.gms.common.api.c$a$a */
        public static class C0735a {

            /* renamed from: a */
            private C0834r f534a;

            /* renamed from: b */
            private Looper f535b;

            @NonNull
            @KeepForSdk
            /* renamed from: a */
            public C0734a mo11859a() {
                if (this.f534a == null) {
                    this.f534a = new C0747a();
                }
                if (this.f535b == null) {
                    this.f535b = Looper.getMainLooper();
                }
                return new C0734a(this.f534a, this.f535b);
            }
        }

        @KeepForSdk
        private C0734a(C0834r rVar, Account account, Looper looper) {
            this.f532a = rVar;
            this.f533b = looper;
        }
    }

    private C0733c(@NonNull Context context, @Nullable Activity activity, C0722a aVar, C0722a.C0726d dVar, C0734a aVar2) {
        C0917i.m1420k(context, "Null context is not permitted.");
        C0917i.m1420k(aVar, "Api must not be null.");
        C0917i.m1420k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f521a = context.getApplicationContext();
        String str = null;
        if (C0624m.m231j()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f522b = str;
        this.f523c = aVar;
        this.f524d = dVar;
        this.f526f = aVar2.f533b;
        C0752b a = C0752b.m748a(aVar, dVar, str);
        this.f525e = a;
        this.f528h = new C0812m1(this);
        C0778g x = C0778g.m817x(this.f521a);
        this.f530j = x;
        this.f527g = x.mo11966m();
        this.f529i = aVar2.f532a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C0863y.m1170u(activity, x, a);
        }
        x.mo11960b(this);
    }

    @KeepForSdk
    public C0733c(@NonNull Context context, @NonNull C0722a<O> aVar, @NonNull O o, @NonNull C0734a aVar2) {
        this(context, (Activity) null, aVar, o, aVar2);
    }

    /* renamed from: o */
    private final C0763d m673o(int i, @NonNull C0763d dVar) {
        dVar.mo11886m();
        this.f530j.mo11955F(this, i, dVar);
        return dVar;
    }

    /* renamed from: p */
    private final C3339g m674p(int i, @NonNull C0838s sVar) {
        C1872a aVar = new C1872a();
        this.f530j.mo11956G(this, i, sVar, aVar, this.f529i);
        return aVar.mo14736a();
    }

    @NonNull
    /* renamed from: b */
    public final C0752b<O> mo11846b() {
        return this.f525e;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public C0736d mo11847c() {
        return this.f528h;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public C0904d.C0905a mo11848d() {
        Account account;
        GoogleSignInAccount H;
        GoogleSignInAccount H2;
        C0904d.C0905a aVar = new C0904d.C0905a();
        C0722a.C0726d dVar = this.f524d;
        if (!(dVar instanceof C0722a.C0726d.C0728b) || (H2 = ((C0722a.C0726d.C0728b) dVar).mo11826H()) == null) {
            C0722a.C0726d dVar2 = this.f524d;
            account = dVar2 instanceof C0722a.C0726d.C0727a ? ((C0722a.C0726d.C0727a) dVar2).mo11825I() : null;
        } else {
            account = H2.mo11709I();
        }
        aVar.mo12257d(account);
        C0722a.C0726d dVar3 = this.f524d;
        aVar.mo12256c((!(dVar3 instanceof C0722a.C0726d.C0728b) || (H = ((C0722a.C0726d.C0728b) dVar3).mo11826H()) == null) ? Collections.emptySet() : H.mo11718h0());
        aVar.mo12258e(this.f521a.getClass().getName());
        aVar.mo12255b(this.f521a.getPackageName());
        return aVar;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public <TResult, A extends C0722a.C0724b> C3339g<TResult> mo11849e(@NonNull C0838s<A, TResult> sVar) {
        return m674p(2, sVar);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: f */
    public <A extends C0722a.C0724b, T extends C0763d<? extends C0744h, A>> T mo11850f(@NonNull T t) {
        m673o(0, t);
        return t;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public <A extends C0722a.C0724b> C3339g<Void> mo11851g(@NonNull C0820o<A, ?> oVar) {
        C0917i.m1419j(oVar);
        C0917i.m1420k(oVar.f717a.mo12031b(), "Listener has already been released.");
        C0917i.m1420k(oVar.f718b.mo12081a(), "Listener has already been released.");
        return this.f530j.mo11968z(this, oVar.f717a, oVar.f718b, oVar.f719c);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public C3339g<Boolean> mo11852h(@NonNull C0793j.C0794a<?> aVar, int i) {
        C0917i.m1420k(aVar, "Listener key cannot be null.");
        return this.f530j.mo11954A(this, aVar, i);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: i */
    public <A extends C0722a.C0724b, T extends C0763d<? extends C0744h, A>> T mo11853i(@NonNull T t) {
        m673o(1, t);
        return t;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: j */
    public String mo11854j() {
        return this.f522b;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: k */
    public Looper mo11855k() {
        return this.f526f;
    }

    /* renamed from: l */
    public final int mo11856l() {
        return this.f527g;
    }

    @WorkerThread
    /* renamed from: m */
    public final C0722a.C0730f mo11857m(Looper looper, C0785h1 h1Var) {
        Looper looper2 = looper;
        C0722a.C0730f c = ((C0722a.C0723a) C0917i.m1419j(this.f523c.mo11819a())).mo11823c(this.f521a, looper2, mo11848d().mo12254a(), this.f524d, h1Var, h1Var);
        String j = mo11854j();
        if (j != null && (c instanceof C0897c)) {
            ((C0897c) c).mo12209R(j);
        }
        if (j != null && (c instanceof C0805l)) {
            ((C0805l) c).mo12027t(j);
        }
        return c;
    }

    /* renamed from: n */
    public final C0791i2 mo11858n(Context context, Handler handler) {
        return new C0791i2(context, handler, mo11848d().mo12254a());
    }
}

package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.p005os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.C1413b;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.C1649c;
import com.google.android.gms.common.util.C1660n;
import com.google.android.gms.common.util.C1661o;
import com.google.firebase.components.C2825d;
import com.google.firebase.components.C2829f;
import com.google.firebase.components.C2834h;
import com.google.firebase.components.C2838l;
import com.google.firebase.components.C2848s;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.p131g.C3194c;
import com.google.firebase.p132h.C3197b;
import com.google.firebase.p137j.C3309a;
import com.google.firebase.p138k.C3312c;
import com.google.firebase.p138k.C3314e;
import com.google.firebase.p138k.C3316g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.c */
public class C2816c {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Object f5431i = new Object();

    /* renamed from: j */
    private static final Executor f5432j = new C2820d();
    @GuardedBy("LOCK")

    /* renamed from: k */
    static final Map<String, C2816c> f5433k = new ArrayMap();

    /* renamed from: a */
    private final Context f5434a;

    /* renamed from: b */
    private final String f5435b;

    /* renamed from: c */
    private final C3176e f5436c;

    /* renamed from: d */
    private final C2838l f5437d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f5438e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f5439f = new AtomicBoolean();

    /* renamed from: g */
    private final C2848s<C3309a> f5440g;

    /* renamed from: h */
    private final List<C2818b> f5441h = new CopyOnWriteArrayList();

    @KeepForSdk
    /* renamed from: com.google.firebase.c$b */
    public interface C2818b {
        @KeepForSdk
        /* renamed from: a */
        void mo17069a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.c$c */
    private static class C2819c implements C1413b.C1414a {

        /* renamed from: a */
        private static AtomicReference<C2819c> f5442a = new AtomicReference<>();

        private C2819c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m8576c(Context context) {
            if (C1660n.m4601a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f5442a.get() == null) {
                    C2819c cVar = new C2819c();
                    if (f5442a.compareAndSet((Object) null, cVar)) {
                        C1413b.m3713c(application);
                        C1413b.m3712b().mo10869a(cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo10882a(boolean z) {
            synchronized (C2816c.f5431i) {
                Iterator it = new ArrayList(C2816c.f5433k.values()).iterator();
                while (it.hasNext()) {
                    C2816c cVar = (C2816c) it.next();
                    if (cVar.f5438e.get()) {
                        cVar.m8566t(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.c$d */
    private static class C2820d implements Executor {

        /* renamed from: a */
        private static final Handler f5443a = new Handler(Looper.getMainLooper());

        private C2820d() {
        }

        public void execute(@NonNull Runnable runnable) {
            f5443a.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.c$e */
    private static class C2821e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C2821e> f5444b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f5445a;

        public C2821e(Context context) {
            this.f5445a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m8579b(Context context) {
            if (f5444b.get() == null) {
                C2821e eVar = new C2821e(context);
                if (f5444b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo17071c() {
            this.f5445a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C2816c.f5431i) {
                for (C2816c b : C2816c.f5433k.values()) {
                    b.m8560l();
                }
            }
            mo17071c();
        }
    }

    protected C2816c(Context context, String str, C3176e eVar) {
        new CopyOnWriteArrayList();
        C1609u.m4475k(context);
        this.f5434a = context;
        C1609u.m4471g(str);
        this.f5435b = str;
        C1609u.m4475k(eVar);
        this.f5436c = eVar;
        List<C2834h> a = C2829f.m8614b(context, ComponentDiscoveryService.class).mo17091a();
        String a2 = C3314e.m10308a();
        Executor executor = f5432j;
        C2825d[] dVarArr = new C2825d[8];
        dVarArr[0] = C2825d.m8593n(context, Context.class, new Class[0]);
        dVarArr[1] = C2825d.m8593n(this, C2816c.class, new Class[0]);
        dVarArr[2] = C2825d.m8593n(eVar, C3176e.class, new Class[0]);
        dVarArr[3] = C3316g.m10312a("fire-android", "");
        dVarArr[4] = C3316g.m10312a("fire-core", "19.3.0");
        dVarArr[5] = a2 != null ? C3316g.m10312a("kotlin", a2) : null;
        dVarArr[6] = C3312c.m10302b();
        dVarArr[7] = C3197b.m9980b();
        this.f5437d = new C2838l(executor, a, dVarArr);
        this.f5440g = new C2848s<>(C2815b.m8553a(this, context));
    }

    /* renamed from: e */
    private void m8558e() {
        C1609u.m4479o(!this.f5439f.get(), "FirebaseApp was deleted");
    }

    @NonNull
    /* renamed from: h */
    public static C2816c m8559h() {
        C2816c cVar;
        synchronized (f5431i) {
            cVar = f5433k.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C1661o.m4611a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m8560l() {
        if (!UserManagerCompat.isUserUnlocked(this.f5434a)) {
            C2821e.m8579b(this.f5434a);
        } else {
            this.f5437d.mo17094e(mo17067q());
        }
    }

    @Nullable
    /* renamed from: m */
    public static C2816c m8561m(@NonNull Context context) {
        synchronized (f5431i) {
            if (f5433k.containsKey("[DEFAULT]")) {
                C2816c h = m8559h();
                return h;
            }
            C3176e a = C3176e.m9911a(context);
            if (a == null) {
                return null;
            }
            C2816c n = m8562n(context, a);
            return n;
        }
    }

    @NonNull
    /* renamed from: n */
    public static C2816c m8562n(@NonNull Context context, @NonNull C3176e eVar) {
        return m8563o(context, eVar, "[DEFAULT]");
    }

    @NonNull
    /* renamed from: o */
    public static C2816c m8563o(@NonNull Context context, @NonNull C3176e eVar, @NonNull String str) {
        C2816c cVar;
        C2819c.m8576c(context);
        String s = m8565s(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f5431i) {
            boolean z = !f5433k.containsKey(s);
            C1609u.m4479o(z, "FirebaseApp name " + s + " already exists!");
            C1609u.m4476l(context, "Application context cannot be null.");
            cVar = new C2816c(context, s, eVar);
            f5433k.put(s, cVar);
        }
        cVar.m8560l();
        return cVar;
    }

    /* renamed from: r */
    static /* synthetic */ C3309a m8564r(C2816c cVar, Context context) {
        return new C3309a(context, cVar.mo17065k(), (C3194c) cVar.f5437d.mo17074a(C3194c.class));
    }

    /* renamed from: s */
    private static String m8565s(@NonNull String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m8566t(boolean z) {
        for (C2818b a : this.f5441h) {
            a.mo17069a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2816c)) {
            return false;
        }
        return this.f5435b.equals(((C2816c) obj).mo17063i());
    }

    @KeepForSdk
    /* renamed from: f */
    public <T> T mo17060f(Class<T> cls) {
        m8558e();
        return this.f5437d.mo17074a(cls);
    }

    @NonNull
    /* renamed from: g */
    public Context mo17061g() {
        m8558e();
        return this.f5434a;
    }

    public int hashCode() {
        return this.f5435b.hashCode();
    }

    @NonNull
    /* renamed from: i */
    public String mo17063i() {
        m8558e();
        return this.f5435b;
    }

    @NonNull
    /* renamed from: j */
    public C3176e mo17064j() {
        m8558e();
        return this.f5436c;
    }

    @KeepForSdk
    /* renamed from: k */
    public String mo17065k() {
        return C1649c.m4576c(mo17063i().getBytes(Charset.defaultCharset())) + "+" + C1649c.m4576c(mo17064j().mo17742c().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk
    /* renamed from: p */
    public boolean mo17066p() {
        m8558e();
        return this.f5440g.get().mo17965b();
    }

    @VisibleForTesting
    @KeepForSdk
    /* renamed from: q */
    public boolean mo17067q() {
        return "[DEFAULT]".equals(mo17063i());
    }

    public String toString() {
        C1599s.C1600a c = C1599s.m4390c(this);
        c.mo11272a("name", this.f5435b);
        c.mo11272a("options", this.f5436c);
        return c.toString();
    }
}

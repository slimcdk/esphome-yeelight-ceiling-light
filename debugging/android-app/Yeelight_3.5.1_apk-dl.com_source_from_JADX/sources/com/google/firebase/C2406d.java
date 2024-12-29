package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.p007os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.C0757c;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.C0961b;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.heartbeatinfo.C2426b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;
import p014c0.C0614c;
import p014c0.C0624m;
import p066m1.C3343c;
import p077o1.C3502b;
import p099t1.C3703a;
import p110w0.C3870d;
import p110w0.C3874g;
import p110w0.C3880n;
import p110w0.C3889t;

/* renamed from: com.google.firebase.d */
public class C2406d {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Object f4027j = new Object();

    /* renamed from: k */
    private static final Executor f4028k = new C2410d();
    @GuardedBy("LOCK")

    /* renamed from: l */
    static final Map<String, C2406d> f4029l = new ArrayMap();

    /* renamed from: a */
    private final Context f4030a;

    /* renamed from: b */
    private final String f4031b;

    /* renamed from: c */
    private final C2429i f4032c;

    /* renamed from: d */
    private final C3880n f4033d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f4034e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f4035f = new AtomicBoolean();

    /* renamed from: g */
    private final C3889t<C3703a> f4036g;

    /* renamed from: h */
    private final C3502b<C2426b> f4037h;

    /* renamed from: i */
    private final List<C2408b> f4038i = new CopyOnWriteArrayList();

    @KeepForSdk
    /* renamed from: com.google.firebase.d$b */
    public interface C2408b {
        @KeepForSdk
        /* renamed from: a */
        void mo18500a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.d$c */
    private static class C2409c implements C0757c.C0758a {

        /* renamed from: a */
        private static AtomicReference<C2409c> f4039a = new AtomicReference<>();

        private C2409c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m6413c(Context context) {
            if (C0624m.m222a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f4039a.get() == null) {
                    C2409c cVar = new C2409c();
                    if (f4039a.compareAndSet((Object) null, cVar)) {
                        C0757c.m753c(application);
                        C0757c.m752b().mo11910a(cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo11923a(boolean z) {
            synchronized (C2406d.f4027j) {
                Iterator it = new ArrayList(C2406d.f4029l.values()).iterator();
                while (it.hasNext()) {
                    C2406d dVar = (C2406d) it.next();
                    if (dVar.f4034e.get()) {
                        dVar.m6402x(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.d$d */
    private static class C2410d implements Executor {

        /* renamed from: a */
        private static final Handler f4040a = new Handler(Looper.getMainLooper());

        private C2410d() {
        }

        public void execute(@NonNull Runnable runnable) {
            f4040a.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.d$e */
    private static class C2411e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C2411e> f4041b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f4042a;

        public C2411e(Context context) {
            this.f4042a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m6416b(Context context) {
            if (f4041b.get() == null) {
                C2411e eVar = new C2411e(context);
                if (f4041b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo18991c() {
            this.f4042a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C2406d.f4027j) {
                for (C2406d d : C2406d.f4029l.values()) {
                    d.m6395o();
                }
            }
            mo18991c();
        }
    }

    protected C2406d(Context context, String str, C2429i iVar) {
        new CopyOnWriteArrayList();
        this.f4030a = (Context) C0917i.m1419j(context);
        this.f4031b = C0917i.m1415f(str);
        this.f4032c = (C2429i) C0917i.m1419j(iVar);
        C3880n e = C3880n.m11022i(f4028k).mo26356d(C3874g.m11010c(context, ComponentDiscoveryService.class).mo26350b()).mo26355c(new FirebaseCommonRegistrar()).mo26354b(C3870d.m10988p(context, Context.class, new Class[0])).mo26354b(C3870d.m10988p(this, C2406d.class, new Class[0])).mo26354b(C3870d.m10988p(iVar, C2429i.class, new Class[0])).mo26357e();
        this.f4033d = e;
        this.f4036g = new C3889t<>(new C2199c(this, context));
        this.f4037h = e.mo26335b(C2426b.class);
        mo18980g(new C2198b(this));
    }

    /* renamed from: h */
    private void m6393h() {
        C0917i.m1424o(!this.f4035f.get(), "FirebaseApp was deleted");
    }

    @NonNull
    /* renamed from: k */
    public static C2406d m6394k() {
        C2406d dVar;
        synchronized (f4027j) {
            dVar = f4029l.get("[DEFAULT]");
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C0961b.m1589a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m6395o() {
        if (!UserManagerCompat.isUserUnlocked(this.f4030a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb.append(mo18984l());
            C2411e.m6416b(this.f4030a);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        sb2.append(mo18984l());
        this.f4033d.mo26353l(mo18988t());
        this.f4037h.get().mo19039m();
    }

    @Nullable
    /* renamed from: p */
    public static C2406d m6396p(@NonNull Context context) {
        synchronized (f4027j) {
            if (f4029l.containsKey("[DEFAULT]")) {
                C2406d k = m6394k();
                return k;
            }
            C2429i a = C2429i.m6489a(context);
            if (a == null) {
                return null;
            }
            C2406d q = m6397q(context, a);
            return q;
        }
    }

    @NonNull
    /* renamed from: q */
    public static C2406d m6397q(@NonNull Context context, @NonNull C2429i iVar) {
        return m6398r(context, iVar, "[DEFAULT]");
    }

    @NonNull
    /* renamed from: r */
    public static C2406d m6398r(@NonNull Context context, @NonNull C2429i iVar, @NonNull String str) {
        C2406d dVar;
        C2409c.m6413c(context);
        String w = m6401w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4027j) {
            Map<String, C2406d> map = f4029l;
            boolean z = !map.containsKey(w);
            C0917i.m1424o(z, "FirebaseApp name " + w + " already exists!");
            C0917i.m1420k(context, "Application context cannot be null.");
            dVar = new C2406d(context, w, iVar);
            map.put(w, dVar);
        }
        dVar.m6395o();
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ C3703a m6399u(Context context) {
        return new C3703a(context, mo18986n(), (C3343c) this.f4033d.mo26333a(C3343c.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m6400v(boolean z) {
        if (!z) {
            this.f4037h.get().mo19039m();
        }
    }

    /* renamed from: w */
    private static String m6401w(@NonNull String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m6402x(boolean z) {
        for (C2408b a : this.f4038i) {
            a.mo18500a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2406d)) {
            return false;
        }
        return this.f4031b.equals(((C2406d) obj).mo18984l());
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo18980g(C2408b bVar) {
        m6393h();
        if (this.f4034e.get() && C0757c.m752b().mo11911d()) {
            bVar.mo18500a(true);
        }
        this.f4038i.add(bVar);
    }

    public int hashCode() {
        return this.f4031b.hashCode();
    }

    @KeepForSdk
    /* renamed from: i */
    public <T> T mo18982i(Class<T> cls) {
        m6393h();
        return this.f4033d.mo26333a(cls);
    }

    @NonNull
    /* renamed from: j */
    public Context mo18983j() {
        m6393h();
        return this.f4030a;
    }

    @NonNull
    /* renamed from: l */
    public String mo18984l() {
        m6393h();
        return this.f4031b;
    }

    @NonNull
    /* renamed from: m */
    public C2429i mo18985m() {
        m6393h();
        return this.f4032c;
    }

    @KeepForSdk
    /* renamed from: n */
    public String mo18986n() {
        return C0614c.m199c(mo18984l().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + C0614c.m199c(mo18985m().mo19045c().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk
    /* renamed from: s */
    public boolean mo18987s() {
        m6393h();
        return this.f4036g.get().mo26111b();
    }

    @VisibleForTesting
    @KeepForSdk
    /* renamed from: t */
    public boolean mo18988t() {
        return "[DEFAULT]".equals(mo18984l());
    }

    public String toString() {
        return C0914h.m1404c(this).mo12279a("name", this.f4031b).mo12279a("options", this.f4032c).toString();
    }
}

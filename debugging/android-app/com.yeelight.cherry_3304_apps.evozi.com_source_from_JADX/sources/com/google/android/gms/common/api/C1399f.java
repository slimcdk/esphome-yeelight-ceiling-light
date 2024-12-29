package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C1518c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.internal.C1418c;
import com.google.android.gms.common.api.internal.C1425d2;
import com.google.android.gms.common.api.internal.C1437g;
import com.google.android.gms.common.api.internal.C1453j0;
import com.google.android.gms.common.api.internal.C1470n1;
import com.google.android.gms.common.api.internal.C1506z1;
import com.google.android.gms.common.internal.C1564e;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p037d.C0603a;
import p011c.p012a.p019b.p028b.p037d.C0604b;
import p011c.p012a.p019b.p028b.p037d.C0607e;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.f */
public abstract class C1399f {
    /* access modifiers changed from: private */
    @GuardedBy("sAllClients")

    /* renamed from: a */
    public static final Set<C1399f> f2570a = Collections.newSetFromMap(new WeakHashMap());

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.f$a */
    public static final class C1400a {

        /* renamed from: a */
        private Account f2571a;

        /* renamed from: b */
        private final Set<Scope> f2572b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f2573c = new HashSet();

        /* renamed from: d */
        private int f2574d;

        /* renamed from: e */
        private View f2575e;

        /* renamed from: f */
        private String f2576f;

        /* renamed from: g */
        private String f2577g;

        /* renamed from: h */
        private final Map<C1382a<?>, C1564e.C1566b> f2578h = new ArrayMap();

        /* renamed from: i */
        private final Context f2579i;

        /* renamed from: j */
        private final Map<C1382a<?>, C1382a.C1386d> f2580j = new ArrayMap();

        /* renamed from: k */
        private C1437g f2581k;

        /* renamed from: l */
        private int f2582l = -1;

        /* renamed from: m */
        private Looper f2583m;

        /* renamed from: n */
        private C1518c f2584n = C1518c.m4095q();

        /* renamed from: o */
        private C1382a.C1383a<? extends C0607e, C0603a> f2585o = C0604b.f297c;

        /* renamed from: p */
        private final ArrayList<C1401b> f2586p = new ArrayList<>();

        /* renamed from: q */
        private final ArrayList<C1402c> f2587q = new ArrayList<>();

        @KeepForSdk
        public C1400a(@NonNull Context context) {
            this.f2579i = context;
            this.f2583m = context.getMainLooper();
            this.f2576f = context.getPackageName();
            this.f2577g = context.getClass().getName();
        }

        /* renamed from: a */
        public final C1400a mo10831a(@NonNull C1382a<? extends Object> aVar) {
            C1609u.m4476l(aVar, "Api must not be null");
            this.f2580j.put(aVar, (Object) null);
            List<Scope> a = aVar.mo10784c().mo10788a(null);
            this.f2573c.addAll(a);
            this.f2572b.addAll(a);
            return this;
        }

        /* renamed from: b */
        public final C1400a mo10832b(@NonNull C1401b bVar) {
            C1609u.m4476l(bVar, "Listener must not be null");
            this.f2586p.add(bVar);
            return this;
        }

        /* renamed from: c */
        public final C1400a mo10833c(@NonNull C1402c cVar) {
            C1609u.m4476l(cVar, "Listener must not be null");
            this.f2587q.add(cVar);
            return this;
        }

        /* renamed from: d */
        public final C1399f mo10834d() {
            C1609u.m4466b(!this.f2580j.isEmpty(), "must call addApi() to add at least one API");
            C1564e e = mo10835e();
            Map<C1382a<?>, C1564e.C1566b> e2 = e.mo11196e();
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayList arrayList = new ArrayList();
            C1382a aVar = null;
            boolean z = false;
            for (C1382a next : this.f2580j.keySet()) {
                C1382a.C1386d dVar = this.f2580j.get(next);
                boolean z2 = e2.get(next) != null;
                arrayMap.put(next, Boolean.valueOf(z2));
                C1425d2 d2Var = new C1425d2(next, z2);
                arrayList.add(d2Var);
                C1382a.C1383a d = next.mo10785d();
                C1382a aVar2 = next;
                C1382a.C1390f c = d.mo8629c(this.f2579i, this.f2583m, e, dVar, d2Var, d2Var);
                arrayMap2.put(aVar2.mo10782a(), c);
                if (d.mo10789b() == 1) {
                    z = dVar != null;
                }
                if (c.mo10791c()) {
                    if (aVar == null) {
                        aVar = aVar2;
                    } else {
                        String b = aVar2.mo10783b();
                        String b2 = aVar.mo10783b();
                        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 21 + String.valueOf(b2).length());
                        sb.append(b);
                        sb.append(" cannot be used with ");
                        sb.append(b2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar != null) {
                if (!z) {
                    C1609u.m4480p(this.f2571a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.mo10783b());
                    C1609u.m4480p(this.f2572b.equals(this.f2573c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.mo10783b());
                } else {
                    String b3 = aVar.mo10783b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(b3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            C1453j0 j0Var = new C1453j0(this.f2579i, new ReentrantLock(), this.f2583m, e, this.f2584n, this.f2585o, arrayMap, this.f2586p, this.f2587q, arrayMap2, this.f2582l, C1453j0.m3883o(arrayMap2.values(), true), arrayList, false);
            synchronized (C1399f.f2570a) {
                C1399f.f2570a.add(j0Var);
            }
            if (this.f2582l < 0) {
                return j0Var;
            }
            C1506z1.m4086k(this.f2581k);
            throw null;
        }

        @KeepForSdk
        @VisibleForTesting
        /* renamed from: e */
        public final C1564e mo10835e() {
            C0603a aVar = C0603a.f286i;
            if (this.f2580j.containsKey(C0604b.f299e)) {
                aVar = (C0603a) this.f2580j.get(C0604b.f299e);
            }
            return new C1564e(this.f2571a, this.f2572b, this.f2578h, this.f2574d, this.f2575e, this.f2576f, this.f2577g, aVar, false);
        }
    }

    /* renamed from: com.google.android.gms.common.api.f$b */
    public interface C1401b {
        /* renamed from: a */
        void mo10836a(int i);

        /* renamed from: c */
        void mo10837c(@Nullable Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.api.f$c */
    public interface C1402c {
        /* renamed from: f */
        void mo10838f(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: d */
    public abstract void mo10825d();

    /* renamed from: e */
    public abstract void mo10826e();

    @KeepForSdk
    /* renamed from: f */
    public <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10827f(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: g */
    public Looper mo10828g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public abstract boolean mo10829h();

    /* renamed from: i */
    public void mo10830i(C1470n1 n1Var) {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C0721a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.internal.C0763d;
import com.google.android.gms.common.api.internal.C0773f;
import com.google.android.gms.common.api.internal.C0783h;
import com.google.android.gms.common.api.internal.C0810m;
import com.google.android.gms.common.api.internal.C0824o2;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
import p053k0.C3286a;
import p053k0.C3290e;

@Deprecated
/* renamed from: com.google.android.gms.common.api.d */
public abstract class C0736d {
    /* access modifiers changed from: private */
    @GuardedBy("sAllClients")

    /* renamed from: a */
    public static final Set f536a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.d$a */
    public static final class C0737a {
        @Nullable

        /* renamed from: a */
        private Account f537a;

        /* renamed from: b */
        private final Set f538b = new HashSet();

        /* renamed from: c */
        private final Set f539c = new HashSet();

        /* renamed from: d */
        private int f540d;

        /* renamed from: e */
        private View f541e;

        /* renamed from: f */
        private String f542f;

        /* renamed from: g */
        private String f543g;

        /* renamed from: h */
        private final Map f544h = new ArrayMap();

        /* renamed from: i */
        private final Context f545i;

        /* renamed from: j */
        private final Map f546j = new ArrayMap();

        /* renamed from: k */
        private C0783h f547k;

        /* renamed from: l */
        private int f548l = -1;
        @Nullable

        /* renamed from: m */
        private C0739c f549m;

        /* renamed from: n */
        private Looper f550n;

        /* renamed from: o */
        private C0721a f551o = C0721a.m617p();

        /* renamed from: p */
        private C0722a.C0723a f552p = C3290e.f5312c;

        /* renamed from: q */
        private final ArrayList f553q = new ArrayList();

        /* renamed from: r */
        private final ArrayList f554r = new ArrayList();

        public C0737a(@NonNull Context context) {
            this.f545i = context;
            this.f550n = context.getMainLooper();
            this.f542f = context.getPackageName();
            this.f543g = context.getClass().getName();
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: a */
        public C0737a mo11870a(@NonNull C0722a<Object> aVar) {
            C0917i.m1420k(aVar, "Api must not be null");
            this.f546j.put(aVar, (Object) null);
            List<Scope> a = ((C0722a.C0729e) C0917i.m1420k(aVar.mo11821c(), "Base client builder must not be null")).mo11827a(null);
            this.f539c.addAll(a);
            this.f538b.addAll(a);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: b */
        public C0737a mo11871b(@NonNull C0738b bVar) {
            C0917i.m1420k(bVar, "Listener must not be null");
            this.f553q.add(bVar);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: c */
        public C0737a mo11872c(@NonNull C0739c cVar) {
            C0917i.m1420k(cVar, "Listener must not be null");
            this.f554r.add(cVar);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.gms.common.api.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.NonNull
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.api.C0736d mo11873d() {
            /*
                r22 = this;
                r1 = r22
                java.util.Map r0 = r1.f546j
                boolean r0 = r0.isEmpty()
                r2 = 1
                r0 = r0 ^ r2
                java.lang.String r3 = "must call addApi() to add at least one API"
                com.google.android.gms.common.internal.C0917i.m1411b(r0, r3)
                com.google.android.gms.common.internal.d r0 = r22.mo11874e()
                java.util.Map r3 = r0.mo12252i()
                androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
                r11.<init>()
                androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
                r14.<init>()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Map r4 = r1.f546j
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r12 = r4.iterator()
                r13 = 0
                r4 = 0
                r16 = r4
                r17 = 0
            L_0x0036:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L_0x00c1
                java.lang.Object r4 = r12.next()
                r10 = r4
                com.google.android.gms.common.api.a r10 = (com.google.android.gms.common.api.C0722a) r10
                java.util.Map r4 = r1.f546j
                java.lang.Object r18 = r4.get(r10)
                java.lang.Object r4 = r3.get(r10)
                if (r4 == 0) goto L_0x0051
                r4 = 1
                goto L_0x0052
            L_0x0051:
                r4 = 0
            L_0x0052:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                r11.put(r10, r5)
                com.google.android.gms.common.api.internal.g3 r9 = new com.google.android.gms.common.api.internal.g3
                r9.<init>(r10, r4)
                r15.add(r9)
                com.google.android.gms.common.api.a$a r4 = r10.mo11819a()
                java.lang.Object r4 = com.google.android.gms.common.internal.C0917i.m1419j(r4)
                r19 = r4
                com.google.android.gms.common.api.a$a r19 = (com.google.android.gms.common.api.C0722a.C0723a) r19
                android.content.Context r5 = r1.f545i
                android.os.Looper r6 = r1.f550n
                r4 = r19
                r7 = r0
                r8 = r18
                r20 = r9
                r21 = r10
                r10 = r20
                com.google.android.gms.common.api.a$f r4 = r4.mo11823c(r5, r6, r7, r8, r9, r10)
                com.google.android.gms.common.api.a$c r5 = r21.mo11820b()
                r14.put(r5, r4)
                int r5 = r19.mo11828b()
                if (r5 != r2) goto L_0x0094
                if (r18 == 0) goto L_0x0092
                r17 = 1
                goto L_0x0094
            L_0x0092:
                r17 = 0
            L_0x0094:
                boolean r4 = r4.mo11829a()
                if (r4 == 0) goto L_0x0036
                if (r16 != 0) goto L_0x009f
                r16 = r21
                goto L_0x0036
            L_0x009f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r21.mo11822d()
                java.lang.String r3 = r16.mo11822d()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = " cannot be used with "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            L_0x00c1:
                if (r16 == 0) goto L_0x010f
                if (r17 != 0) goto L_0x00ef
                android.accounts.Account r3 = r1.f537a
                if (r3 != 0) goto L_0x00cb
                r3 = 1
                goto L_0x00cc
            L_0x00cb:
                r3 = 0
            L_0x00cc:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.mo11822d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                com.google.android.gms.common.internal.C0917i.m1425p(r3, r5, r4)
                java.util.Set r3 = r1.f538b
                java.util.Set r4 = r1.f539c
                boolean r3 = r3.equals(r4)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.mo11822d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                com.google.android.gms.common.internal.C0917i.m1425p(r3, r5, r4)
                goto L_0x010f
            L_0x00ef:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r16.mo11822d()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "With using "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L_0x010f:
                java.util.Collection r3 = r14.values()
                int r16 = com.google.android.gms.common.api.internal.C0852v0.m1115o(r3, r2)
                com.google.android.gms.common.api.internal.v0 r2 = new com.google.android.gms.common.api.internal.v0
                android.content.Context r5 = r1.f545i
                java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
                r6.<init>()
                android.os.Looper r7 = r1.f550n
                com.google.android.gms.common.a r9 = r1.f551o
                com.google.android.gms.common.api.a$a r10 = r1.f552p
                java.util.ArrayList r12 = r1.f553q
                java.util.ArrayList r13 = r1.f554r
                int r3 = r1.f548l
                r4 = r2
                r8 = r0
                r0 = r15
                r15 = r3
                r17 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.util.Set r3 = com.google.android.gms.common.api.C0736d.f536a
                monitor-enter(r3)
                java.util.Set r0 = com.google.android.gms.common.api.C0736d.f536a     // Catch:{ all -> 0x0154 }
                r0.add(r2)     // Catch:{ all -> 0x0154 }
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                int r0 = r1.f548l
                if (r0 < 0) goto L_0x0153
                com.google.android.gms.common.api.internal.h r0 = r1.f547k
                com.google.android.gms.common.api.internal.x2 r0 = com.google.android.gms.common.api.internal.C0862x2.m1161t(r0)
                int r3 = r1.f548l
                com.google.android.gms.common.api.d$c r4 = r1.f549m
                r0.mo12094u(r3, r2, r4)
            L_0x0153:
                return r2
            L_0x0154:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                goto L_0x0158
            L_0x0157:
                throw r0
            L_0x0158:
                goto L_0x0157
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0736d.C0737a.mo11873d():com.google.android.gms.common.api.d");
        }

        @NonNull
        @VisibleForTesting
        /* renamed from: e */
        public final C0904d mo11874e() {
            C3286a aVar = C3286a.f5300j;
            Map map = this.f546j;
            C0722a aVar2 = C3290e.f5314e;
            if (map.containsKey(aVar2)) {
                aVar = (C3286a) this.f546j.get(aVar2);
            }
            return new C0904d(this.f537a, this.f538b, this.f544h, this.f540d, this.f541e, this.f542f, this.f543g, aVar, false);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.d$b */
    public interface C0738b extends C0773f {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.d$c */
    public interface C0739c extends C0810m {
    }

    /* renamed from: d */
    public abstract void mo11860d();

    /* renamed from: e */
    public abstract void mo11861e();

    /* renamed from: f */
    public abstract void mo11862f(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr);

    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public <A extends C0722a.C0724b, R extends C0744h, T extends C0763d<R, A>> T mo11863g(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public <A extends C0722a.C0724b, T extends C0763d<? extends C0744h, A>> T mo11864h(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: i */
    public Looper mo11865i() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public abstract boolean mo11866j();

    /* renamed from: k */
    public abstract void mo11867k(@NonNull C0739c cVar);

    /* renamed from: l */
    public abstract void mo11868l(@NonNull C0739c cVar);

    /* renamed from: m */
    public void mo11869m(C0824o2 o2Var) {
        throw new UnsupportedOperationException();
    }
}

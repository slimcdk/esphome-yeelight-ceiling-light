package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import p011c.p012a.p019b.p028b.p037d.C0603a;

@KeepForSdk
@VisibleForTesting
/* renamed from: com.google.android.gms.common.internal.e */
public final class C1564e {

    /* renamed from: a */
    private final Account f3016a;

    /* renamed from: b */
    private final Set<Scope> f3017b;

    /* renamed from: c */
    private final Set<Scope> f3018c;

    /* renamed from: d */
    private final Map<C1382a<?>, C1566b> f3019d;

    /* renamed from: e */
    private final String f3020e;

    /* renamed from: f */
    private final String f3021f;

    /* renamed from: g */
    private final C0603a f3022g;

    /* renamed from: h */
    private final boolean f3023h;

    /* renamed from: i */
    private Integer f3024i;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.e$a */
    public static final class C1565a {

        /* renamed from: a */
        private Account f3025a;

        /* renamed from: b */
        private ArraySet<Scope> f3026b;

        /* renamed from: c */
        private Map<C1382a<?>, C1566b> f3027c;

        /* renamed from: d */
        private int f3028d = 0;

        /* renamed from: e */
        private View f3029e;

        /* renamed from: f */
        private String f3030f;

        /* renamed from: g */
        private String f3031g;

        /* renamed from: h */
        private C0603a f3032h = C0603a.f286i;

        /* renamed from: i */
        private boolean f3033i;

        /* renamed from: a */
        public final C1565a mo11203a(Collection<Scope> collection) {
            if (this.f3026b == null) {
                this.f3026b = new ArraySet<>();
            }
            this.f3026b.addAll(collection);
            return this;
        }

        @KeepForSdk
        /* renamed from: b */
        public final C1564e mo11204b() {
            return new C1564e(this.f3025a, this.f3026b, this.f3027c, this.f3028d, this.f3029e, this.f3030f, this.f3031g, this.f3032h, this.f3033i);
        }

        /* renamed from: c */
        public final C1565a mo11205c(Account account) {
            this.f3025a = account;
            return this;
        }

        /* renamed from: d */
        public final C1565a mo11206d(String str) {
            this.f3031g = str;
            return this;
        }

        @KeepForSdk
        /* renamed from: e */
        public final C1565a mo11207e(String str) {
            this.f3030f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.e$b */
    public static final class C1566b {

        /* renamed from: a */
        public final Set<Scope> f3034a;
    }

    public C1564e(Account account, Set<Scope> set, Map<C1382a<?>, C1566b> map, int i, View view, String str, String str2, C0603a aVar, boolean z) {
        this.f3016a = account;
        this.f3017b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f3019d = map == null ? Collections.EMPTY_MAP : map;
        this.f3020e = str;
        this.f3021f = str2;
        this.f3022g = aVar;
        this.f3023h = z;
        HashSet hashSet = new HashSet(this.f3017b);
        for (C1566b bVar : this.f3019d.values()) {
            hashSet.addAll(bVar.f3034a);
        }
        this.f3018c = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public final Account mo11192a() {
        return this.f3016a;
    }

    @KeepForSdk
    /* renamed from: b */
    public final Account mo11193b() {
        Account account = this.f3016a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @KeepForSdk
    /* renamed from: c */
    public final Set<Scope> mo11194c() {
        return this.f3018c;
    }

    @Nullable
    /* renamed from: d */
    public final Integer mo11195d() {
        return this.f3024i;
    }

    /* renamed from: e */
    public final Map<C1382a<?>, C1566b> mo11196e() {
        return this.f3019d;
    }

    @Nullable
    /* renamed from: f */
    public final String mo11197f() {
        return this.f3021f;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: g */
    public final String mo11198g() {
        return this.f3020e;
    }

    @KeepForSdk
    /* renamed from: h */
    public final Set<Scope> mo11199h() {
        return this.f3017b;
    }

    @Nullable
    /* renamed from: i */
    public final C0603a mo11200i() {
        return this.f3022g;
    }

    /* renamed from: j */
    public final boolean mo11201j() {
        return this.f3023h;
    }

    /* renamed from: k */
    public final void mo11202k(Integer num) {
        this.f3024i = num;
    }
}

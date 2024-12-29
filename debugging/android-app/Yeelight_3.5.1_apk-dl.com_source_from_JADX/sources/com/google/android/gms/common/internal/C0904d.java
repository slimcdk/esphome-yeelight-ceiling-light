package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import p053k0.C3286a;
import p109w.C3854n;

@KeepForSdk
@VisibleForTesting
/* renamed from: com.google.android.gms.common.internal.d */
public final class C0904d {
    @Nullable

    /* renamed from: a */
    private final Account f1003a;

    /* renamed from: b */
    private final Set f1004b;

    /* renamed from: c */
    private final Set f1005c;

    /* renamed from: d */
    private final Map f1006d;

    /* renamed from: e */
    private final String f1007e;

    /* renamed from: f */
    private final String f1008f;

    /* renamed from: g */
    private final C3286a f1009g;

    /* renamed from: h */
    private Integer f1010h;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class C0905a {
        @Nullable

        /* renamed from: a */
        private Account f1011a;

        /* renamed from: b */
        private ArraySet f1012b;

        /* renamed from: c */
        private String f1013c;

        /* renamed from: d */
        private String f1014d;

        /* renamed from: e */
        private C3286a f1015e = C3286a.f5300j;

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public C0904d mo12254a() {
            return new C0904d(this.f1011a, this.f1012b, (Map) null, 0, (View) null, this.f1013c, this.f1014d, this.f1015e, false);
        }

        @NonNull
        @KeepForSdk
        @CanIgnoreReturnValue
        /* renamed from: b */
        public C0905a mo12255b(@NonNull String str) {
            this.f1013c = str;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: c */
        public final C0905a mo12256c(@NonNull Collection collection) {
            if (this.f1012b == null) {
                this.f1012b = new ArraySet();
            }
            this.f1012b.addAll(collection);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: d */
        public final C0905a mo12257d(@Nullable Account account) {
            this.f1011a = account;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: e */
        public final C0905a mo12258e(@NonNull String str) {
            this.f1014d = str;
            return this;
        }
    }

    public C0904d(@Nullable Account account, @NonNull Set set, @NonNull Map map, int i, @Nullable View view, @NonNull String str, @NonNull String str2, @Nullable C3286a aVar, boolean z) {
        this.f1003a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f1004b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f1006d = map;
        this.f1007e = str;
        this.f1008f = str2;
        this.f1009g = aVar == null ? C3286a.f5300j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (C3854n nVar : map.values()) {
            hashSet.addAll(nVar.f6469a);
        }
        this.f1005c = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    @androidx.annotation.Nullable
    /* renamed from: a */
    public Account mo12244a() {
        return this.f1003a;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public Account mo12245b() {
        Account account = this.f1003a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public Set<Scope> mo12246c() {
        return this.f1005c;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public String mo12247d() {
        return this.f1007e;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public Set<Scope> mo12248e() {
        return this.f1004b;
    }

    @NonNull
    /* renamed from: f */
    public final C3286a mo12249f() {
        return this.f1009g;
    }

    @androidx.annotation.Nullable
    /* renamed from: g */
    public final Integer mo12250g() {
        return this.f1010h;
    }

    @androidx.annotation.Nullable
    /* renamed from: h */
    public final String mo12251h() {
        return this.f1008f;
    }

    @NonNull
    /* renamed from: i */
    public final Map mo12252i() {
        return this.f1006d;
    }

    /* renamed from: j */
    public final void mo12253j(@NonNull Integer num) {
        this.f1010h = num;
    }
}

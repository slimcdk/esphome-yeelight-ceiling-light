package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a.C0726d;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.internal.C0773f;
import com.google.android.gms.common.api.internal.C0810m;
import com.google.android.gms.common.internal.C0897c;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0911g;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C0722a<O extends C0726d> {

    /* renamed from: a */
    private final C0723a f518a;

    /* renamed from: b */
    private final C0731g f519b;

    /* renamed from: c */
    private final String f520c;

    @KeepForSdk
    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C0723a<T extends C0730f, O> extends C0729e<T, O> {
        @NonNull
        @KeepForSdk
        @Deprecated
        /* renamed from: c */
        public T mo11823c(@NonNull Context context, @NonNull Looper looper, @NonNull C0904d dVar, @NonNull O o, @NonNull C0736d.C0738b bVar, @NonNull C0736d.C0739c cVar) {
            return mo11824d(context, looper, dVar, o, bVar, cVar);
        }

        @NonNull
        @KeepForSdk
        /* renamed from: d */
        public T mo11824d(@NonNull Context context, @NonNull Looper looper, @NonNull C0904d dVar, @NonNull O o, @NonNull C0773f fVar, @NonNull C0810m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C0724b {
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C0725c<C extends C0724b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C0726d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C0727a extends C0726d {
            @NonNull
            /* renamed from: I */
            Account mo11825I();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C0728b extends C0726d {
            @Nullable
            /* renamed from: H */
            GoogleSignInAccount mo11826H();
        }
    }

    @KeepForSdk
    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C0729e<T extends C0724b, O> {
        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public List<Scope> mo11827a(@Nullable O o) {
            return Collections.emptyList();
        }

        @KeepForSdk
        /* renamed from: b */
        public int mo11828b() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C0730f extends C0724b {
        @KeepForSdk
        /* renamed from: a */
        boolean mo11829a();

        @NonNull
        @KeepForSdk
        /* renamed from: b */
        Set<Scope> mo11830b();

        @KeepForSdk
        /* renamed from: c */
        void mo11831c(@Nullable C0911g gVar, @Nullable Set<Scope> set);

        @KeepForSdk
        /* renamed from: d */
        boolean mo11832d();

        @KeepForSdk
        void disconnect();

        @KeepForSdk
        void disconnect(@NonNull String str);

        @NonNull
        @KeepForSdk
        /* renamed from: e */
        String mo11835e();

        @KeepForSdk
        /* renamed from: f */
        void mo11836f(@NonNull C0897c.C0900c cVar);

        @KeepForSdk
        /* renamed from: g */
        void mo11837g(@NonNull C0897c.C0902e eVar);

        @KeepForSdk
        /* renamed from: h */
        void mo11838h(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr);

        @KeepForSdk
        /* renamed from: i */
        boolean mo11839i();

        @KeepForSdk
        boolean isConnected();

        @KeepForSdk
        /* renamed from: k */
        int mo11841k();

        @NonNull
        @KeepForSdk
        /* renamed from: l */
        Feature[] mo11842l();

        @KeepForSdk
        @Nullable
        /* renamed from: o */
        String mo11843o();

        @NonNull
        @KeepForSdk
        /* renamed from: p */
        Intent mo11844p();

        @KeepForSdk
        /* renamed from: q */
        boolean mo11845q();
    }

    @KeepForSdk
    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C0731g<C extends C0730f> extends C0725c<C> {
    }

    @KeepForSdk
    public <C extends C0730f> C0722a(@NonNull String str, @NonNull C0723a<C, O> aVar, @NonNull C0731g<C> gVar) {
        C0917i.m1420k(aVar, "Cannot construct an Api with a null ClientBuilder");
        C0917i.m1420k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f520c = str;
        this.f518a = aVar;
        this.f519b = gVar;
    }

    @NonNull
    /* renamed from: a */
    public final C0723a mo11819a() {
        return this.f518a;
    }

    @NonNull
    /* renamed from: b */
    public final C0725c mo11820b() {
        return this.f519b;
    }

    @NonNull
    /* renamed from: c */
    public final C0729e mo11821c() {
        return this.f518a;
    }

    @NonNull
    /* renamed from: d */
    public final String mo11822d() {
        return this.f520c;
    }
}

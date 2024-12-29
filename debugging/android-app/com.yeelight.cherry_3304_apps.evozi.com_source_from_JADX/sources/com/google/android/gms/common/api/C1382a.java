package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1382a.C1386d;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.internal.C1550d;
import com.google.android.gms.common.internal.C1564e;
import com.google.android.gms.common.internal.C1584m;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C1382a<O extends C1386d> {

    /* renamed from: a */
    private final C1383a<?, O> f2552a;

    /* renamed from: b */
    private final C1391g<?> f2553b;

    /* renamed from: c */
    private final String f2554c;

    @KeepForSdk
    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C1383a<T extends C1390f, O> extends C1389e<T, O> {
        @KeepForSdk
        /* renamed from: c */
        public abstract T mo8629c(Context context, Looper looper, C1564e eVar, O o, C1399f.C1401b bVar, C1399f.C1402c cVar);
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C1384b {
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C1385c<C extends C1384b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C1386d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C1387a extends C1386d {
            /* renamed from: j */
            Account mo10786j();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C1388b extends C1386d {
            /* renamed from: I */
            GoogleSignInAccount mo10787I();
        }
    }

    @KeepForSdk
    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C1389e<T extends C1384b, O> {
        @KeepForSdk
        /* renamed from: a */
        public List<Scope> mo10788a(O o) {
            return Collections.emptyList();
        }

        @KeepForSdk
        /* renamed from: b */
        public int mo10789b() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C1390f extends C1384b {
        @KeepForSdk
        /* renamed from: b */
        void mo10790b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        @KeepForSdk
        /* renamed from: c */
        boolean mo10791c();

        @KeepForSdk
        /* renamed from: d */
        void mo10792d(C1584m mVar, Set<Scope> set);

        @KeepForSdk
        void disconnect();

        @KeepForSdk
        /* renamed from: e */
        boolean mo10794e();

        @KeepForSdk
        /* renamed from: f */
        String mo10795f();

        @KeepForSdk
        /* renamed from: h */
        void mo10796h(C1550d.C1553c cVar);

        @KeepForSdk
        boolean isConnected();

        @KeepForSdk
        /* renamed from: j */
        void mo10798j(C1550d.C1555e eVar);

        @KeepForSdk
        /* renamed from: m */
        boolean mo10799m();

        @KeepForSdk
        /* renamed from: n */
        int mo10800n();

        @KeepForSdk
        /* renamed from: p */
        Feature[] mo10801p();

        @KeepForSdk
        /* renamed from: q */
        Intent mo10802q();

        @KeepForSdk
        /* renamed from: r */
        boolean mo10803r();

        @KeepForSdk
        @Nullable
        /* renamed from: s */
        IBinder mo10804s();
    }

    @KeepForSdk
    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C1391g<C extends C1390f> extends C1385c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface C1392h<T extends IInterface> extends C1384b {
        /* renamed from: i */
        void mo10805i(int i, T t);

        /* renamed from: k */
        String mo10806k();

        /* renamed from: l */
        T mo10807l(IBinder iBinder);

        /* renamed from: t */
        String mo10808t();
    }

    public <C extends C1390f> C1382a(String str, C1383a<C, O> aVar, C1391g<C> gVar) {
        C1609u.m4476l(aVar, "Cannot construct an Api with a null ClientBuilder");
        C1609u.m4476l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f2554c = str;
        this.f2552a = aVar;
        this.f2553b = gVar;
    }

    /* renamed from: a */
    public final C1385c<?> mo10782a() {
        C1391g<?> gVar = this.f2553b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: b */
    public final String mo10783b() {
        return this.f2554c;
    }

    /* renamed from: c */
    public final C1389e<?, O> mo10784c() {
        return this.f2552a;
    }

    /* renamed from: d */
    public final C1383a<?, O> mo10785d() {
        C1609u.m4479o(this.f2552a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f2552a;
    }
}

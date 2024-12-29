package p114x0;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.annotations.DeferredApi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p002a1.C0004a;
import p002a1.C0005b;
import p002a1.C0006c;
import p077o1.C3500a;
import p077o1.C3502b;
import p106v0.C3730a;
import p118y0.C3916f;
import p121z0.C3923a;
import p121z0.C3925c;
import p121z0.C3926d;
import p121z0.C3927e;
import p121z0.C3928f;

/* renamed from: x0.d */
public class C3898d {

    /* renamed from: a */
    private final C3500a<C3730a> f6533a;

    /* renamed from: b */
    private volatile C3923a f6534b;

    /* renamed from: c */
    private volatile C0005b f6535c;
    @GuardedBy("this")

    /* renamed from: d */
    private final List<C0004a> f6536d;

    public C3898d(C3500a<C3730a> aVar) {
        this(aVar, new C0006c(), new C3928f());
    }

    public C3898d(C3500a<C3730a> aVar, @NonNull C0005b bVar, @NonNull C3923a aVar2) {
        this.f6533a = aVar;
        this.f6535c = bVar;
        this.f6536d = new ArrayList();
        this.f6534b = aVar2;
        m11134f();
    }

    /* renamed from: f */
    private void m11134f() {
        this.f6533a.mo24334a(new C11961b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m11135g(String str, Bundle bundle) {
        this.f6534b.mo26422a(str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m11136h(C0004a aVar) {
        synchronized (this) {
            if (this.f6535c instanceof C0006c) {
                this.f6536d.add(aVar);
            }
            this.f6535c.mo5a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m11137i(C3502b bVar) {
        C3916f.m11190f().mo26399b("AnalyticsConnector now available.");
        C3730a aVar = (C3730a) bVar.get();
        C3927e eVar = new C3927e(aVar);
        C3899e eVar2 = new C3899e();
        if (m11138j(aVar, eVar2) != null) {
            C3916f.m11190f().mo26399b("Registered Firebase Analytics listener.");
            C3926d dVar = new C3926d();
            C3925c cVar = new C3925c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (C0004a a : this.f6536d) {
                    dVar.mo5a(a);
                }
                eVar2.mo26382d(dVar);
                eVar2.mo26383e(cVar);
                this.f6535c = dVar;
                this.f6534b = cVar;
            }
            return;
        }
        C3916f.m11190f().mo26407k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    @DeferredApi
    /* renamed from: j */
    private static C3730a.C3731a m11138j(@NonNull C3730a aVar, @NonNull C3899e eVar) {
        C3730a.C3731a b = aVar.mo26156b("clx", eVar);
        if (b == null) {
            C3916f.m11190f().mo26399b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            b = aVar.mo26156b("crash", eVar);
            if (b != null) {
                C3916f.m11190f().mo26407k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return b;
    }

    /* renamed from: d */
    public C3923a mo26380d() {
        return new C11962c(this);
    }

    /* renamed from: e */
    public C0005b mo26381e() {
        return new C11960a(this);
    }
}

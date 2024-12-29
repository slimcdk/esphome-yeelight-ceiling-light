package p076o0;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.api.internal.C0826p;
import com.google.android.gms.tasks.C1872a;
import com.google.android.gms.wearable.CapabilityClient;

/* renamed from: o0.b */
final /* synthetic */ class C3413b implements C0826p {

    /* renamed from: a */
    private final CapabilityClient.C1898a f5548a;

    /* renamed from: b */
    private final C0793j f5549b;

    /* renamed from: c */
    private final IntentFilter[] f5550c;

    C3413b(CapabilityClient.C1898a aVar, C0793j jVar, IntentFilter[] intentFilterArr) {
        this.f5548a = aVar;
        this.f5549b = jVar;
        this.f5550c = intentFilterArr;
    }

    public final void accept(Object obj, Object obj2) {
        ((C3432f2) obj).mo24259q0(new C3487v1((C1872a) obj2), this.f5548a, this.f5549b, this.f5550c);
    }
}

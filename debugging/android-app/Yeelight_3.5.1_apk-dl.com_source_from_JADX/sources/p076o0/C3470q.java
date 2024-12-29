package p076o0;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.api.internal.C0826p;
import com.google.android.gms.tasks.C1872a;
import com.google.android.gms.wearable.DataClient;

/* renamed from: o0.q */
final /* synthetic */ class C3470q implements C0826p {

    /* renamed from: a */
    private final DataClient.C1900a f5580a;

    /* renamed from: b */
    private final C0793j f5581b;

    /* renamed from: c */
    private final IntentFilter[] f5582c;

    C3470q(DataClient.C1900a aVar, C0793j jVar, IntentFilter[] intentFilterArr) {
        this.f5580a = aVar;
        this.f5581b = jVar;
        this.f5582c = intentFilterArr;
    }

    public final void accept(Object obj, Object obj2) {
        ((C3432f2) obj).mo24257o0(new C3487v1((C1872a) obj2), this.f5580a, this.f5581b, this.f5582c);
    }
}

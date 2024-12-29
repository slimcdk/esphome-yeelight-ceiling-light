package p076o0;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.api.internal.C0826p;
import com.google.android.gms.tasks.C1872a;
import com.google.android.gms.wearable.MessageClient;

/* renamed from: o0.a1 */
final /* synthetic */ class C3411a1 implements C0826p {

    /* renamed from: a */
    private final MessageClient.C1901a f5545a;

    /* renamed from: b */
    private final C0793j f5546b;

    /* renamed from: c */
    private final IntentFilter[] f5547c;

    C3411a1(MessageClient.C1901a aVar, C0793j jVar, IntentFilter[] intentFilterArr) {
        this.f5545a = aVar;
        this.f5546b = jVar;
        this.f5547c = intentFilterArr;
    }

    public final void accept(Object obj, Object obj2) {
        ((C3432f2) obj).mo24258p0(new C3487v1((C1872a) obj2), this.f5545a, this.f5546b, this.f5547c);
    }
}

package p109w;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C0788i;

/* renamed from: w.p */
final class C3856p extends C3857q {

    /* renamed from: a */
    final /* synthetic */ Intent f6473a;

    /* renamed from: b */
    final /* synthetic */ C0788i f6474b;

    C3856p(Intent intent, C0788i iVar, int i) {
        this.f6473a = intent;
        this.f6474b = iVar;
    }

    /* renamed from: a */
    public final void mo26326a() {
        Intent intent = this.f6473a;
        if (intent != null) {
            this.f6474b.startActivityForResult(intent, 2);
        }
    }
}

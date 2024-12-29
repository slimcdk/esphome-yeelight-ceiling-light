package p109w;

import android.app.Activity;
import android.content.Intent;

/* renamed from: w.o */
final class C3855o extends C3857q {

    /* renamed from: a */
    final /* synthetic */ Intent f6470a;

    /* renamed from: b */
    final /* synthetic */ Activity f6471b;

    /* renamed from: c */
    final /* synthetic */ int f6472c;

    C3855o(Intent intent, Activity activity, int i) {
        this.f6470a = intent;
        this.f6471b = activity;
        this.f6472c = i;
    }

    /* renamed from: a */
    public final void mo26326a() {
        Intent intent = this.f6470a;
        if (intent != null) {
            this.f6471b.startActivityForResult(intent, this.f6472c);
        }
    }
}

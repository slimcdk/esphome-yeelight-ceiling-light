package p109w;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C0877b;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: w.s */
public final class C3859s {

    /* renamed from: a */
    private final SparseIntArray f6475a = new SparseIntArray();

    /* renamed from: b */
    private C0877b f6476b;

    public C3859s(@NonNull C0877b bVar) {
        C0917i.m1419j(bVar);
        this.f6476b = bVar;
    }

    /* renamed from: a */
    public final int mo26328a(Context context, int i) {
        return this.f6475a.get(i, -1);
    }

    /* renamed from: b */
    public final int mo26329b(@NonNull Context context, @NonNull C0722a.C0730f fVar) {
        C0917i.m1419j(context);
        C0917i.m1419j(fVar);
        int i = 0;
        if (!fVar.mo11839i()) {
            return 0;
        }
        int k = fVar.mo11841k();
        int a = mo26328a(context, k);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f6475a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f6475a.keyAt(i2);
                if (keyAt > k && this.f6475a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            a = i == -1 ? this.f6476b.mo11774j(context, k) : i;
            this.f6475a.put(k, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo26330c() {
        this.f6475a.clear();
    }
}

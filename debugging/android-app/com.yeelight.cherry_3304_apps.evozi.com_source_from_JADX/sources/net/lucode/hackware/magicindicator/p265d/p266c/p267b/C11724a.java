package net.lucode.hackware.magicindicator.p265d.p266c.p267b;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;

/* renamed from: net.lucode.hackware.magicindicator.d.c.b.a */
public abstract class C11724a {

    /* renamed from: a */
    private final DataSetObservable f23081a = new DataSetObservable();

    /* renamed from: a */
    public abstract int mo26444a();

    /* renamed from: b */
    public abstract C11726c mo26445b(Context context);

    /* renamed from: c */
    public abstract C11727d mo26446c(Context context, int i);

    /* renamed from: d */
    public float mo36847d(Context context, int i) {
        return 1.0f;
    }

    /* renamed from: e */
    public final void mo36848e() {
        this.f23081a.notifyChanged();
    }

    /* renamed from: f */
    public final void mo36849f(DataSetObserver dataSetObserver) {
        this.f23081a.registerObserver(dataSetObserver);
    }

    /* renamed from: g */
    public final void mo36850g(DataSetObserver dataSetObserver) {
        this.f23081a.unregisterObserver(dataSetObserver);
    }
}

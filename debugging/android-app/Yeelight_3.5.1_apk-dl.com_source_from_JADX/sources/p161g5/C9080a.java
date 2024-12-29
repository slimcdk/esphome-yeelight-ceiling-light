package p161g5;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;

/* renamed from: g5.a */
public abstract class C9080a {

    /* renamed from: a */
    private final DataSetObservable f16687a = new DataSetObservable();

    /* renamed from: a */
    public abstract int mo30471a();

    /* renamed from: b */
    public abstract C9082c mo30472b(Context context);

    /* renamed from: c */
    public abstract C9083d mo30473c(Context context, int i);

    /* renamed from: d */
    public float mo37033d(Context context, int i) {
        return 1.0f;
    }

    /* renamed from: e */
    public final void mo37034e() {
        this.f16687a.notifyChanged();
    }

    /* renamed from: f */
    public final void mo37035f(DataSetObserver dataSetObserver) {
        this.f16687a.registerObserver(dataSetObserver);
    }

    /* renamed from: g */
    public final void mo37036g(DataSetObserver dataSetObserver) {
        this.f16687a.unregisterObserver(dataSetObserver);
    }
}

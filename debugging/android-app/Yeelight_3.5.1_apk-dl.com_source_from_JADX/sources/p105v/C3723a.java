package p105v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* renamed from: v.a */
public abstract class C3723a<T> implements C3724b<T> {
    @KeepForSdk
    @Nullable

    /* renamed from: a */
    protected final DataHolder f6251a;

    @KeepForSdk
    protected C3723a(@Nullable DataHolder dataHolder) {
        this.f6251a = dataHolder;
    }

    public final void close() {
        release();
    }

    @NonNull
    public Iterator<T> iterator() {
        return new C3725c(this);
    }

    public void release() {
        DataHolder dataHolder = this.f6251a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}

package androidx.core.view;

import android.content.ClipData;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.view.a */
public final /* synthetic */ class C0293a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ java.util.function.Predicate f146a;

    public /* synthetic */ C0293a(java.util.function.Predicate predicate) {
        this.f146a = predicate;
    }

    public final boolean test(Object obj) {
        return this.f146a.test((ClipData.Item) obj);
    }
}

package androidx.core.text.util;

import androidx.core.text.util.LinkifyCompat;
import java.util.Comparator;

/* renamed from: androidx.core.text.util.a */
public final /* synthetic */ class C0281a implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C0281a f145a = new C0281a();

    private /* synthetic */ C0281a() {
    }

    public final int compare(Object obj, Object obj2) {
        return LinkifyCompat.lambda$static$0((LinkifyCompat.LinkSpec) obj, (LinkifyCompat.LinkSpec) obj2);
    }
}

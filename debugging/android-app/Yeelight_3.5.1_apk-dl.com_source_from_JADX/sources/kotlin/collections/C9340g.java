package kotlin.collections;

import androidx.appcompat.widget.ActivityChooserView;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.C9422o;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
/* renamed from: kotlin.collections.g */
public final class C9340g<E> extends C9336e<E> {
    @NotNull

    /* renamed from: a */
    public static final C9341a f17262a = new C9341a((C9422o) null);
    @NotNull

    /* renamed from: b */
    private static final Object[] f17263b = new Object[0];

    /* renamed from: kotlin.collections.g$a */
    public static final class C9341a {
        private C9341a() {
        }

        public /* synthetic */ C9341a(C9422o oVar) {
            this();
        }

        /* renamed from: a */
        public final int mo38189a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 <= 0) {
                return i3;
            }
            if (i2 > 2147483639) {
                return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            return 2147483639;
        }
    }
}

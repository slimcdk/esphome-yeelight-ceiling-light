package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.random.b */
public final class C9449b extends C9448a {
    @NotNull

    /* renamed from: a */
    private final C9450a f17330a = new C9450a();

    /* renamed from: kotlin.random.b$a */
    public static final class C9450a extends ThreadLocal<Random> {
        C9450a() {
        }

        /* access modifiers changed from: protected */
        @NotNull
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @NotNull
    public Random getImpl() {
        Object obj = this.f17330a.get();
        C9424q.m22995d(obj, "implStorage.get()");
        return (Random) obj;
    }
}

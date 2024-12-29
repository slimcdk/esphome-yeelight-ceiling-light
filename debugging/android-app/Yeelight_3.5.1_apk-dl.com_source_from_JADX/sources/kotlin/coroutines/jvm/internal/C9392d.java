package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C9424q;
import org.apache.commons.p194io.IOUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.coroutines.jvm.internal.d */
public final class C9392d {
    /* renamed from: a */
    private static final void m22942a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final DebugMetadata m22943b(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    /* renamed from: c */
    private static final int m22944c(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @SinceKotlin(version = "1.3")
    @Nullable
    @JvmName(name = "getStackTraceElement")
    /* renamed from: d */
    public static final StackTraceElement m22945d(@NotNull BaseContinuationImpl baseContinuationImpl) {
        String str;
        C9424q.m22996e(baseContinuationImpl, "<this>");
        DebugMetadata b = m22943b(baseContinuationImpl);
        if (b == null) {
            return null;
        }
        m22942a(1, b.mo23973v());
        int c = m22944c(baseContinuationImpl);
        int i = c < 0 ? -1 : b.mo23969l()[c];
        String b2 = C9394f.f17274a.mo38236b(baseContinuationImpl);
        if (b2 == null) {
            str = b.mo23966c();
        } else {
            str = b2 + IOUtils.DIR_SEPARATOR_UNIX + b.mo23966c();
        }
        return new StackTraceElement(str, b.mo23970m(), b.mo23967f(), i);
    }
}

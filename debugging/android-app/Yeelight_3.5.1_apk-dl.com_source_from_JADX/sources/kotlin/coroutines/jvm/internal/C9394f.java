package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.coroutines.jvm.internal.f */
final class C9394f {
    @NotNull

    /* renamed from: a */
    public static final C9394f f17274a = new C9394f();
    @NotNull

    /* renamed from: b */
    private static final C9395a f17275b = new C9395a((Method) null, (Method) null, (Method) null);
    @Nullable

    /* renamed from: c */
    private static C9395a f17276c;

    /* renamed from: kotlin.coroutines.jvm.internal.f$a */
    private static final class C9395a {
        @Nullable
        @JvmField

        /* renamed from: a */
        public final Method f17277a;
        @Nullable
        @JvmField

        /* renamed from: b */
        public final Method f17278b;
        @Nullable
        @JvmField

        /* renamed from: c */
        public final Method f17279c;

        public C9395a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.f17277a = method;
            this.f17278b = method2;
            this.f17279c = method3;
        }
    }

    private C9394f() {
    }

    /* renamed from: a */
    private final C9395a m22949a(BaseContinuationImpl baseContinuationImpl) {
        try {
            C9395a aVar = new C9395a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f17276c = aVar;
            return aVar;
        } catch (Exception unused) {
            C9395a aVar2 = f17275b;
            f17276c = aVar2;
            return aVar2;
        }
    }

    @Nullable
    /* renamed from: b */
    public final String mo38236b(@NotNull BaseContinuationImpl baseContinuationImpl) {
        C9424q.m22996e(baseContinuationImpl, "continuation");
        C9395a aVar = f17276c;
        if (aVar == null) {
            aVar = m22949a(baseContinuationImpl);
        }
        if (aVar == f17275b) {
            return null;
        }
        Method method = aVar.f17277a;
        Object invoke = method != null ? method.invoke(baseContinuationImpl.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f17278b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f17279c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}

package p173j;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p173j.C11573c;

/* renamed from: j.j */
class C4470j {

    /* renamed from: a */
    private static final C4470j f8054a = m13164c();

    /* renamed from: j.j$a */
    static class C4471a extends C4470j {

        /* renamed from: j.j$a$a */
        static class C4472a implements Executor {

            /* renamed from: a */
            private final Handler f8055a = new Handler(Looper.getMainLooper());

            C4472a() {
            }

            public void execute(Runnable runnable) {
                this.f8055a.post(runnable);
            }
        }

        C4471a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C11573c.C4447a mo24548a(@Nullable Executor executor) {
            if (executor != null) {
                return new C11578g(executor);
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public Executor mo24549b() {
            return new C4472a();
        }
    }

    @IgnoreJRERequirement
    /* renamed from: j.j$b */
    static class C4473b extends C4470j {
        C4473b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Object mo24550e(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo24551f(Method method) {
            return method.isDefault();
        }
    }

    C4470j() {
    }

    /* renamed from: c */
    private static C4470j m13164c() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C4471a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C4473b();
        } catch (ClassNotFoundException unused2) {
            return new C4470j();
        }
    }

    /* renamed from: d */
    static C4470j m13165d() {
        return f8054a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11573c.C4447a mo24548a(@Nullable Executor executor) {
        return executor != null ? new C11578g(executor) : C11576f.f22994a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public Executor mo24549b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: e */
    public Object mo24550e(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo24551f(Method method) {
        return false;
    }
}

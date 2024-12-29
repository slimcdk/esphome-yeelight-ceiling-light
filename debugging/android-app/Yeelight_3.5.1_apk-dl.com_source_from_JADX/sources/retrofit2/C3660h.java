package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.C10318b;

/* renamed from: retrofit2.h */
class C3660h {

    /* renamed from: a */
    private static final C3660h f6114a = m10429c();

    /* renamed from: retrofit2.h$a */
    static class C3661a extends C3660h {

        /* renamed from: retrofit2.h$a$a */
        static class C3662a implements Executor {

            /* renamed from: a */
            private final Handler f6115a = new Handler(Looper.getMainLooper());

            C3662a() {
            }

            public void execute(Runnable runnable) {
                this.f6115a.post(runnable);
            }
        }

        C3661a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10318b.C3637a mo26002a(@Nullable Executor executor) {
            if (executor != null) {
                return new C10322e(executor);
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public Executor mo26003b() {
            return new C3662a();
        }
    }

    @IgnoreJRERequirement
    /* renamed from: retrofit2.h$b */
    static class C3663b extends C3660h {
        C3663b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Object mo26004e(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo26005f(Method method) {
            return method.isDefault();
        }
    }

    C3660h() {
    }

    /* renamed from: c */
    private static C3660h m10429c() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C3661a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C3663b();
        } catch (ClassNotFoundException unused2) {
            return new C3660h();
        }
    }

    /* renamed from: d */
    static C3660h m10430d() {
        return f6114a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10318b.C3637a mo26002a(@Nullable Executor executor) {
        return executor != null ? new C10322e(executor) : C10320d.f19387a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public Executor mo26003b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: e */
    public Object mo26004e(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo26005f(Method method) {
        return false;
    }
}

package p173i7;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p173i7.C9136d;

/* renamed from: i7.m */
class C9153m {

    /* renamed from: a */
    private static final C9153m f16931a = m21993b();

    /* renamed from: i7.m$a */
    static class C9154a extends C9153m {

        /* renamed from: i7.m$a$a */
        static class C9155a implements Executor {

            /* renamed from: a */
            private final Handler f16932a = new Handler(Looper.getMainLooper());

            C9155a() {
            }

            public void execute(Runnable runnable) {
                this.f16932a.post(runnable);
            }
        }

        C9154a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C9136d.C9137a mo37233a(Executor executor) {
            if (executor == null) {
                executor = new C9155a();
            }
            return new C9142g(executor);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: i7.m$b */
    static class C9156b extends C9153m {
        C9156b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Object mo37234d(Method method, Class<?> cls, Object obj, Object... objArr) {
            return MethodHandles.lookup().in(cls).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo37235e(Method method) {
            return method.isDefault();
        }
    }

    C9153m() {
    }

    /* renamed from: b */
    private static C9153m m21993b() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C9154a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C9156b();
        } catch (ClassNotFoundException unused2) {
            return new C9153m();
        }
    }

    /* renamed from: c */
    static C9153m m21994c() {
        return f16931a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9136d.C9137a mo37233a(Executor executor) {
        return executor != null ? new C9142g(executor) : C9140f.f16902b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo37234d(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo37235e(Method method) {
        return false;
    }
}

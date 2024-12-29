package p262i;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p262i.C11525d;

/* renamed from: i.m */
class C11542m {

    /* renamed from: a */
    private static final C11542m f22919a = m30285b();

    /* renamed from: i.m$a */
    static class C11543a extends C11542m {

        /* renamed from: i.m$a$a */
        static class C11544a implements Executor {

            /* renamed from: a */
            private final Handler f22920a = new Handler(Looper.getMainLooper());

            C11544a() {
            }

            public void execute(Runnable runnable) {
                this.f22920a.post(runnable);
            }
        }

        C11543a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C11525d.C11526a mo36457a(Executor executor) {
            if (executor == null) {
                executor = new C11544a();
            }
            return new C11531g(executor);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: i.m$b */
    static class C11545b extends C11542m {
        C11545b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Object mo36458d(Method method, Class<?> cls, Object obj, Object... objArr) {
            return MethodHandles.lookup().in(cls).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo36459e(Method method) {
            return method.isDefault();
        }
    }

    C11542m() {
    }

    /* renamed from: b */
    private static C11542m m30285b() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C11543a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C11545b();
        } catch (ClassNotFoundException unused2) {
            return new C11542m();
        }
    }

    /* renamed from: c */
    static C11542m m30286c() {
        return f22919a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11525d.C11526a mo36457a(Executor executor) {
        return executor != null ? new C11531g(executor) : C11529f.f22890b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo36458d(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo36459e(Method method) {
        return false;
    }
}

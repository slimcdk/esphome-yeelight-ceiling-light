package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.C9454b;
import kotlin.reflect.C9457e;
import kotlin.reflect.C9474o;
import kotlin.reflect.KVisibility;

public abstract class CallableReference implements C9454b, Serializable {
    @SinceKotlin(version = "1.1")
    public static final Object NO_RECEIVER = NoReceiver.INSTANCE;
    @SinceKotlin(version = "1.4")
    private final boolean isTopLevel;
    @SinceKotlin(version = "1.4")
    private final String name;
    @SinceKotlin(version = "1.4")
    private final Class owner;
    @SinceKotlin(version = "1.1")
    protected final Object receiver;
    private transient C9454b reflected;
    @SinceKotlin(version = "1.4")
    private final String signature;

    @SinceKotlin(version = "1.2")
    private static class NoReceiver implements Serializable {
        /* access modifiers changed from: private */
        public static final NoReceiver INSTANCE = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @SinceKotlin(version = "1.1")
    protected CallableReference(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    @SinceKotlin(version = "1.4")
    protected CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @SinceKotlin(version = "1.1")
    public C9454b compute() {
        C9454b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C9454b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract C9454b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @SinceKotlin(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C9457e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C9427t.m23014c(cls) : C9427t.m23013b(cls);
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    @SinceKotlin(version = "1.1")
    public C9454b getReflected() {
        C9454b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public C9474o getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @SinceKotlin(version = "1.1")
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @SinceKotlin(version = "1.1")
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @SinceKotlin(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @SinceKotlin(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @SinceKotlin(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @SinceKotlin(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}

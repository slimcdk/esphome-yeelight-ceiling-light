package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9454b;
import kotlin.reflect.C9458f;

public class FunctionReference extends CallableReference implements C9423p, C9458f {
    private final int arity;
    @SinceKotlin(version = "1.4")
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    @SinceKotlin(version = "1.1")
    public FunctionReference(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @SinceKotlin(version = "1.4")
    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    /* access modifiers changed from: protected */
    @SinceKotlin(version = "1.1")
    public C9454b computeReflected() {
        return C9427t.m23012a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && C9424q.m22992a(getBoundReceiver(), functionReference.getBoundReceiver()) && C9424q.m22992a(getOwner(), functionReference.getOwner());
        } else if (obj instanceof C9458f) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    /* access modifiers changed from: protected */
    @SinceKotlin(version = "1.1")
    public C9458f getReflected() {
        return (C9458f) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @SinceKotlin(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @SinceKotlin(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @SinceKotlin(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @SinceKotlin(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @SinceKotlin(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C9454b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}

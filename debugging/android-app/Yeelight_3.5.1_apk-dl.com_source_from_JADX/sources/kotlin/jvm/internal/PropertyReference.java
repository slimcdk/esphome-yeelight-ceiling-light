package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9454b;
import kotlin.reflect.C9466k;
import org.jetbrains.annotations.NotNull;

public abstract class PropertyReference extends CallableReference implements C9466k {
    public PropertyReference() {
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference(Object obj) {
        super(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @SinceKotlin(version = "1.4")
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && C9424q.m22992a(getBoundReceiver(), propertyReference.getBoundReceiver());
        } else if (obj instanceof C9466k) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @NotNull
    public abstract /* synthetic */ C9466k.C9467a<V> getGetter();

    /* access modifiers changed from: protected */
    @SinceKotlin(version = "1.1")
    public C9466k getReflected() {
        return (C9466k) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @SinceKotlin(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @SinceKotlin(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        C9454b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}

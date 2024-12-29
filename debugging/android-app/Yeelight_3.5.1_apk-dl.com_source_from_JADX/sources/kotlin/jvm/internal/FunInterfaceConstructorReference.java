package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9458f;

@SinceKotlin(version = "1.7")
public class FunInterfaceConstructorReference extends FunctionReference {
    private final Class funInterface;

    public FunInterfaceConstructorReference(Class cls) {
        super(1);
        this.funInterface = cls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunInterfaceConstructorReference)) {
            return false;
        }
        return this.funInterface.equals(((FunInterfaceConstructorReference) obj).funInterface);
    }

    /* access modifiers changed from: protected */
    public C9458f getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    public int hashCode() {
        return this.funInterface.hashCode();
    }

    public String toString() {
        return "fun interface " + this.funInterface.getName();
    }
}

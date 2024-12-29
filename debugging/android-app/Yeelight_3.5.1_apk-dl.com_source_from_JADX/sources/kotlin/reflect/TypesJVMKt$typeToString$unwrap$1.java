package kotlin.reflect;

import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p223w3.C11571p0;
import p233y4.C12060l;

/* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements C12060l<Class<?>, Class<?>> {
    public static final TypesJVMKt$typeToString$unwrap$1 INSTANCE = new TypesJVMKt$typeToString$unwrap$1();

    TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    public final Class<?> invoke(@NotNull Class<?> cls) {
        C9424q.m22996e(cls, C11571p0.f21272C);
        return cls.getComponentType();
    }
}

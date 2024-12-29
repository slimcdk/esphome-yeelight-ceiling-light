package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p223w3.C11571p0;
import p233y4.C12060l;

final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements C12060l<Type, String> {
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();

    ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @NotNull
    public final String invoke(@NotNull Type type) {
        C9424q.m22996e(type, C11571p0.f21272C);
        return TypesJVMKt.m23076b(type);
    }
}

package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9455c;
import kotlin.reflect.C9457e;

public class FunctionReferenceImpl extends FunctionReference {
    @SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    @SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, C9457e eVar, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((C9418l) eVar).mo38325a(), str, str2, (eVar instanceof C9455c) ^ true ? 1 : 0);
    }
}

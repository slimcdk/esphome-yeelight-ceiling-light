package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9455c;
import kotlin.reflect.C9457e;

public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    @SinceKotlin(version = "1.4")
    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(C9457e eVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((C9418l) eVar).mo38325a(), str, str2, (eVar instanceof C9455c) ^ true ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}

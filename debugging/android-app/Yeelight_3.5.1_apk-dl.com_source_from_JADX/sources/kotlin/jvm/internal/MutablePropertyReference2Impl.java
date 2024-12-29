package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9455c;
import kotlin.reflect.C9457e;

public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    @SinceKotlin(version = "1.4")
    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    public MutablePropertyReference2Impl(C9457e eVar, String str, String str2) {
        super(((C9418l) eVar).mo38325a(), str, str2, (eVar instanceof C9455c) ^ true ? 1 : 0);
    }

    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    public void set(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }
}

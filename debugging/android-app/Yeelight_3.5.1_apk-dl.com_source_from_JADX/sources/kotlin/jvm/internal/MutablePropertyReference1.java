package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9454b;
import kotlin.reflect.C9462i;
import kotlin.reflect.C9470m;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements C9462i {
    public MutablePropertyReference1() {
    }

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public C9454b computeReflected() {
        return C9427t.m23016e(this);
    }

    public abstract /* synthetic */ V get(T t);

    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((C9462i) getReflected()).getDelegate(obj);
    }

    public C9470m.C9471a getGetter() {
        return ((C9462i) getReflected()).getGetter();
    }

    public C9462i.C9463a getSetter() {
        return ((C9462i) getReflected()).getSetter();
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public abstract /* synthetic */ void set(T t, V v);
}

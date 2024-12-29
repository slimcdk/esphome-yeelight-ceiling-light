package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9454b;
import kotlin.reflect.C9460h;
import kotlin.reflect.C9468l;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements C9460h {
    public MutablePropertyReference0() {
    }

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public C9454b computeReflected() {
        return C9427t.m23015d(this);
    }

    public abstract /* synthetic */ V get();

    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((C9460h) getReflected()).getDelegate();
    }

    public C9468l.C9469a getGetter() {
        return ((C9460h) getReflected()).getGetter();
    }

    public C9460h.C9461a getSetter() {
        return ((C9460h) getReflected()).getSetter();
    }

    public Object invoke() {
        return get();
    }

    public abstract /* synthetic */ void set(V v);
}

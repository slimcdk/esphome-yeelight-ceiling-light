package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9454b;
import kotlin.reflect.C9468l;

public abstract class PropertyReference0 extends PropertyReference implements C9468l {
    public PropertyReference0() {
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public C9454b computeReflected() {
        return C9427t.m23018g(this);
    }

    public abstract /* synthetic */ V get();

    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((C9468l) getReflected()).getDelegate();
    }

    public C9468l.C9469a getGetter() {
        return ((C9468l) getReflected()).getGetter();
    }

    public Object invoke() {
        return get();
    }
}

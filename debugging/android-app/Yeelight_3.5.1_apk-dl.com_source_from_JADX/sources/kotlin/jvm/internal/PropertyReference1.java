package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9454b;
import kotlin.reflect.C9470m;

public abstract class PropertyReference1 extends PropertyReference implements C9470m {
    public PropertyReference1() {
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference1(Object obj) {
        super(obj);
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public C9454b computeReflected() {
        return C9427t.m23019h(this);
    }

    public abstract /* synthetic */ V get(T t);

    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((C9470m) getReflected()).getDelegate(obj);
    }

    public C9470m.C9471a getGetter() {
        return ((C9470m) getReflected()).getGetter();
    }

    public Object invoke(Object obj) {
        return get(obj);
    }
}

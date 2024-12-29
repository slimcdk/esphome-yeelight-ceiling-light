package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9454b;
import kotlin.reflect.C9472n;

public abstract class PropertyReference2 extends PropertyReference implements C9472n {
    public PropertyReference2() {
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public C9454b computeReflected() {
        return C9427t.m23020i(this);
    }

    public abstract /* synthetic */ V get(D d, E e);

    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((C9472n) getReflected()).getDelegate(obj, obj2);
    }

    public C9472n.C9473a getGetter() {
        return ((C9472n) getReflected()).getGetter();
    }

    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }
}

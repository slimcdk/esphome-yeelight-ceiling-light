package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9454b;
import kotlin.reflect.C9464j;
import kotlin.reflect.C9472n;

public abstract class MutablePropertyReference2 extends MutablePropertyReference implements C9464j {
    public MutablePropertyReference2() {
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public C9454b computeReflected() {
        return C9427t.m23017f(this);
    }

    public abstract /* synthetic */ V get(D d, E e);

    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((C9464j) getReflected()).getDelegate(obj, obj2);
    }

    public C9472n.C9473a getGetter() {
        return ((C9464j) getReflected()).getGetter();
    }

    public C9464j.C9465a getSetter() {
        return ((C9464j) getReflected()).getSetter();
    }

    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public abstract /* synthetic */ void set(D d, E e, V v);
}

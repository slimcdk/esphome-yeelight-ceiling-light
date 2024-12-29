package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9459g;
import kotlin.reflect.C9466k;
import org.jetbrains.annotations.NotNull;

public abstract class MutablePropertyReference extends PropertyReference {
    public MutablePropertyReference() {
    }

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @NotNull
    public abstract /* synthetic */ C9466k.C9467a<V> getGetter();

    @NotNull
    public abstract /* synthetic */ C9459g<V> getSetter();
}

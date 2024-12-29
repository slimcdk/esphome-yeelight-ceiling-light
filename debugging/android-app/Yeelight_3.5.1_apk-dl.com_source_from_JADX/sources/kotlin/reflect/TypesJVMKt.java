package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.jvm.internal.C9424q;
import kotlin.sequences.C9482c;

public final class TypesJVMKt {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m23076b(Type type) {
        String str;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            C9482c c = SequencesKt__SequencesKt.m23079c(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
            str = ((Class) C9490j.m23101f(c)).getName() + C9514q.m23141d("[]", C9490j.m23100e(c));
        } else {
            str = cls.getName();
        }
        C9424q.m22995d(str, "{\n        if (type.isArr…   } else type.name\n    }");
        return str;
    }
}

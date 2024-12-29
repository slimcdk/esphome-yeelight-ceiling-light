package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.C9455c;
import kotlin.reflect.C9457e;
import kotlin.reflect.C9458f;
import kotlin.reflect.C9460h;
import kotlin.reflect.C9462i;
import kotlin.reflect.C9464j;
import kotlin.reflect.C9468l;
import kotlin.reflect.C9470m;
import kotlin.reflect.C9472n;

/* renamed from: kotlin.jvm.internal.u */
public class C9428u {
    /* renamed from: a */
    public C9458f mo38332a(FunctionReference functionReference) {
        return functionReference;
    }

    /* renamed from: b */
    public C9455c mo38333b(Class cls) {
        return new C9419m(cls);
    }

    /* renamed from: c */
    public C9457e mo38334c(Class cls, String str) {
        return new C9426s(cls, str);
    }

    /* renamed from: d */
    public C9460h mo38335d(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* renamed from: e */
    public C9462i mo38336e(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* renamed from: f */
    public C9464j mo38337f(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    /* renamed from: g */
    public C9468l mo38338g(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* renamed from: h */
    public C9470m mo38339h(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* renamed from: i */
    public C9472n mo38340i(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    @SinceKotlin(version = "1.3")
    /* renamed from: j */
    public String mo38341j(C9423p pVar) {
        String obj = pVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    @SinceKotlin(version = "1.1")
    /* renamed from: k */
    public String mo38342k(Lambda lambda) {
        return mo38341j(lambda);
    }
}

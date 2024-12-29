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

/* renamed from: kotlin.jvm.internal.t */
public class C9427t {

    /* renamed from: a */
    private static final C9428u f17311a;

    /* renamed from: b */
    private static final C9455c[] f17312b = new C9455c[0];

    static {
        C9428u uVar = null;
        try {
            uVar = (C9428u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new C9428u();
        }
        f17311a = uVar;
    }

    /* renamed from: a */
    public static C9458f m23012a(FunctionReference functionReference) {
        return f17311a.mo38332a(functionReference);
    }

    /* renamed from: b */
    public static C9455c m23013b(Class cls) {
        return f17311a.mo38333b(cls);
    }

    @SinceKotlin(version = "1.4")
    /* renamed from: c */
    public static C9457e m23014c(Class cls) {
        return f17311a.mo38334c(cls, "");
    }

    /* renamed from: d */
    public static C9460h m23015d(MutablePropertyReference0 mutablePropertyReference0) {
        return f17311a.mo38335d(mutablePropertyReference0);
    }

    /* renamed from: e */
    public static C9462i m23016e(MutablePropertyReference1 mutablePropertyReference1) {
        return f17311a.mo38336e(mutablePropertyReference1);
    }

    /* renamed from: f */
    public static C9464j m23017f(MutablePropertyReference2 mutablePropertyReference2) {
        return f17311a.mo38337f(mutablePropertyReference2);
    }

    /* renamed from: g */
    public static C9468l m23018g(PropertyReference0 propertyReference0) {
        return f17311a.mo38338g(propertyReference0);
    }

    /* renamed from: h */
    public static C9470m m23019h(PropertyReference1 propertyReference1) {
        return f17311a.mo38339h(propertyReference1);
    }

    /* renamed from: i */
    public static C9472n m23020i(PropertyReference2 propertyReference2) {
        return f17311a.mo38340i(propertyReference2);
    }

    @SinceKotlin(version = "1.3")
    /* renamed from: j */
    public static String m23021j(C9423p pVar) {
        return f17311a.mo38341j(pVar);
    }

    @SinceKotlin(version = "1.1")
    /* renamed from: k */
    public static String m23022k(Lambda lambda) {
        return f17311a.mo38342k(lambda);
    }
}

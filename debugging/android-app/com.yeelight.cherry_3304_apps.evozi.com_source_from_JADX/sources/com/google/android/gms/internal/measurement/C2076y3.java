package com.google.android.gms.internal.measurement;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.measurement.C1889m4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y3 */
public class C2076y3 {

    /* renamed from: b */
    private static volatile C2076y3 f3824b;

    /* renamed from: c */
    private static volatile C2076y3 f3825c;

    /* renamed from: d */
    private static final C2076y3 f3826d = new C2076y3(true);

    /* renamed from: a */
    private final Map<C2077a, C1889m4.C1895f<?, ?>> f3827a;

    /* renamed from: com.google.android.gms.internal.measurement.y3$a */
    static final class C2077a {

        /* renamed from: a */
        private final Object f3828a;

        /* renamed from: b */
        private final int f3829b;

        C2077a(Object obj, int i) {
            this.f3828a = obj;
            this.f3829b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C2077a)) {
                return false;
            }
            C2077a aVar = (C2077a) obj;
            return this.f3828a == aVar.f3828a && this.f3829b == aVar.f3829b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f3828a) * SupportMenu.USER_MASK) + this.f3829b;
        }
    }

    C2076y3() {
        this.f3827a = new HashMap();
    }

    private C2076y3(boolean z) {
        this.f3827a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C2076y3 m6600a() {
        C2076y3 y3Var = f3824b;
        if (y3Var == null) {
            synchronized (C2076y3.class) {
                y3Var = f3824b;
                if (y3Var == null) {
                    y3Var = f3826d;
                    f3824b = y3Var;
                }
            }
        }
        return y3Var;
    }

    /* renamed from: c */
    public static C2076y3 m6601c() {
        Class<C2076y3> cls = C2076y3.class;
        C2076y3 y3Var = f3825c;
        if (y3Var != null) {
            return y3Var;
        }
        synchronized (cls) {
            C2076y3 y3Var2 = f3825c;
            if (y3Var2 != null) {
                return y3Var2;
            }
            C2076y3 b = C1856k4.m5307b(cls);
            f3825c = b;
            return b;
        }
    }

    /* renamed from: b */
    public final <ContainingType extends C2062x5> C1889m4.C1895f<ContainingType, ?> mo12323b(ContainingType containingtype, int i) {
        return this.f3827a.get(new C2077a(containingtype, i));
    }
}

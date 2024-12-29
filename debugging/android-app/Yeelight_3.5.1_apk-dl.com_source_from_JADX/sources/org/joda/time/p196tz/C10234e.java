package org.joda.time.p196tz;

/* renamed from: org.joda.time.tz.e */
public class C10234e {

    /* renamed from: a */
    static ThreadLocal<Boolean> f19026a = new C10235a();

    /* renamed from: org.joda.time.tz.e$a */
    static class C10235a extends ThreadLocal<Boolean> {
        C10235a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static boolean m25739a() {
        return f19026a.get().booleanValue();
    }
}

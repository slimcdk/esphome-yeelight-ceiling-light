package p154d.p198a;

import java.util.EventObject;

/* renamed from: d.a.c */
public abstract class C10612c extends EventObject implements Cloneable {
    public C10612c(Object obj) {
        super(obj);
    }

    /* renamed from: a */
    public C10612c clone() {
        try {
            return (C10612c) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public abstract C10607a mo33460b();

    /* renamed from: c */
    public abstract C10613d mo33461c();

    /* renamed from: d */
    public abstract String mo33463d();

    /* renamed from: e */
    public abstract String mo33464e();
}

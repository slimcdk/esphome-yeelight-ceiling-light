package p011c.p012a.p046d;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p011c.p012a.p046d.p047x.C0713e;
import p011c.p012a.p046d.p047x.C0725j;
import p011c.p012a.p046d.p047x.p048n.p049o.C0804a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.a */
final class C0653a extends C0688v<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f374a;

    /* renamed from: b */
    private final List<DateFormat> f375b = new ArrayList();

    public C0653a(Class<? extends Date> cls, int i, int i2) {
        m597g(cls);
        this.f374a = cls;
        this.f375b.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f375b.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C0713e.m759e()) {
            this.f375b.add(C0725j.m780c(i, i2));
        }
    }

    C0653a(Class<? extends Date> cls, String str) {
        m597g(cls);
        this.f374a = cls;
        this.f375b.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f375b.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: e */
    private Date m596e(String str) {
        synchronized (this.f375b) {
            for (DateFormat parse : this.f375b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date c = C0804a.m1023c(str, new ParsePosition(0));
                return c;
            } catch (ParseException e) {
                throw new C0684t(str, e);
            }
        }
    }

    /* renamed from: g */
    private static Class<? extends Date> m597g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* renamed from: f */
    public Date mo8694b(C0809a aVar) {
        if (aVar.mo8861V() == C0811b.NULL) {
            aVar.mo8859Q();
            return null;
        }
        Date e = m596e(aVar.mo8860S());
        Class<? extends Date> cls = this.f374a;
        if (cls == Date.class) {
            return e;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(e.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(e.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: h */
    public void mo8695d(C0812c cVar, Date date) {
        if (date == null) {
            cVar.mo8874D();
            return;
        }
        synchronized (this.f375b) {
            cVar.mo8878X(this.f375b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.f375b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}

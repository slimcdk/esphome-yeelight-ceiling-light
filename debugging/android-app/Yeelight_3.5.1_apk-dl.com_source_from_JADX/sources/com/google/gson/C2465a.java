package com.google.gson;

import com.google.gson.internal.C2514d;
import com.google.gson.internal.C2517g;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p111w1.C3893a;
import p122z1.C3929a;

/* renamed from: com.google.gson.a */
final class C2465a extends C2534q<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f4163a;

    /* renamed from: b */
    private final List<DateFormat> f4164b;

    public C2465a(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f4164b = arrayList;
        this.f4163a = m6654g(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C2514d.m6788e()) {
            arrayList.add(C2517g.m6794c(i, i2));
        }
    }

    C2465a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f4164b = arrayList;
        this.f4163a = m6654g(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: e */
    private Date m6653e(String str) {
        synchronized (this.f4164b) {
            for (DateFormat parse : this.f4164b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date c = C3893a.m11091c(str, new ParsePosition(0));
                return c;
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    /* renamed from: g */
    private static Class<? extends Date> m6654g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* renamed from: f */
    public Date mo19209b(C3929a aVar) {
        if (aVar.mo26169N() == JsonToken.NULL) {
            aVar.mo26167G();
            return null;
        }
        Date e = m6653e(aVar.mo26168I());
        Class<? extends Date> cls = this.f4163a;
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
    public void mo19210d(C2537a aVar, Date date) {
        if (date == null) {
            aVar.mo19434s();
            return;
        }
        synchronized (this.f4164b) {
            aVar.mo19422T(this.f4164b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.f4164b.get(0);
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

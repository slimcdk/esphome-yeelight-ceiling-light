package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C2514d;
import com.google.gson.internal.C2517g;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p111w1.C3893a;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.c */
public final class C3741c extends C2534q<Date> {

    /* renamed from: b */
    public static final C2536r f6270b = new C3742a();

    /* renamed from: a */
    private final List<DateFormat> f6271a;

    /* renamed from: v1.c$a */
    static class C3742a implements C2536r {
        C3742a() {
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            if (aVar.mo26409c() == Date.class) {
                return new C3741c();
            }
            return null;
        }
    }

    public C3741c() {
        ArrayList arrayList = new ArrayList();
        this.f6271a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C2514d.m6788e()) {
            arrayList.add(C2517g.m6794c(2, 2));
        }
    }

    /* renamed from: e */
    private synchronized Date m10639e(String str) {
        for (DateFormat parse : this.f6271a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C3893a.m11091c(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    /* renamed from: f */
    public Date mo19209b(C3929a aVar) {
        if (aVar.mo26169N() != JsonToken.NULL) {
            return m10639e(aVar.mo26168I());
        }
        aVar.mo26167G();
        return null;
    }

    /* renamed from: g */
    public synchronized void mo19210d(C2537a aVar, Date date) {
        if (date == null) {
            aVar.mo19434s();
        } else {
            aVar.mo19422T(this.f6271a.get(0).format(date));
        }
    }
}

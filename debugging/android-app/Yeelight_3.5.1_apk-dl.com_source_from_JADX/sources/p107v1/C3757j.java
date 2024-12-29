package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.j */
public final class C3757j extends C2534q<Date> {

    /* renamed from: b */
    public static final C2536r f6308b = new C3758a();

    /* renamed from: a */
    private final DateFormat f6309a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: v1.j$a */
    static class C3758a implements C2536r {
        C3758a() {
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            if (aVar.mo26409c() == Date.class) {
                return new C3757j();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Date mo19209b(C3929a aVar) {
        if (aVar.mo26169N() == JsonToken.NULL) {
            aVar.mo26167G();
            return null;
        }
        try {
            return new Date(this.f6309a.parse(aVar.mo26168I()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* renamed from: f */
    public synchronized void mo19210d(C2537a aVar, Date date) {
        aVar.mo19422T(date == null ? null : this.f6309a.format(date));
    }
}

package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.k */
public final class C3759k extends C2534q<Time> {

    /* renamed from: b */
    public static final C2536r f6310b = new C3760a();

    /* renamed from: a */
    private final DateFormat f6311a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: v1.k$a */
    static class C3760a implements C2536r {
        C3760a() {
        }

        /* renamed from: a */
        public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
            if (aVar.mo26409c() == Time.class) {
                return new C3759k();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Time mo19209b(C3929a aVar) {
        if (aVar.mo26169N() == JsonToken.NULL) {
            aVar.mo26167G();
            return null;
        }
        try {
            return new Time(this.f6311a.parse(aVar.mo26168I()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* renamed from: f */
    public synchronized void mo19210d(C2537a aVar, Time time) {
        aVar.mo19422T(time == null ? null : this.f6311a.format(time));
    }
}

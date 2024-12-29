package p011c.p012a.p046d.p047x.p048n;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0684t;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.C0690w;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.n.k */
public final class C0757k extends C0688v<Time> {

    /* renamed from: b */
    public static final C0690w f533b = new C0758a();

    /* renamed from: a */
    private final DateFormat f534a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: c.a.d.x.n.k$a */
    static class C0758a implements C0690w {
        C0758a() {
        }

        /* renamed from: a */
        public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
            if (aVar.mo8967c() == Time.class) {
                return new C0757k();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Time mo8694b(C0809a aVar) {
        if (aVar.mo8861V() == C0811b.NULL) {
            aVar.mo8859Q();
            return null;
        }
        try {
            return new Time(this.f534a.parse(aVar.mo8860S()).getTime());
        } catch (ParseException e) {
            throw new C0684t((Throwable) e);
        }
    }

    /* renamed from: f */
    public synchronized void mo8695d(C0812c cVar, Time time) {
        cVar.mo8878X(time == null ? null : this.f534a.format(time));
    }
}

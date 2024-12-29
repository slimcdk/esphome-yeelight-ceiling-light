package p011c.p012a.p046d.p047x.p048n;

import java.sql.Date;
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

/* renamed from: c.a.d.x.n.j */
public final class C0755j extends C0688v<Date> {

    /* renamed from: b */
    public static final C0690w f531b = new C0756a();

    /* renamed from: a */
    private final DateFormat f532a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: c.a.d.x.n.j$a */
    static class C0756a implements C0690w {
        C0756a() {
        }

        /* renamed from: a */
        public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
            if (aVar.mo8967c() == Date.class) {
                return new C0755j();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Date mo8694b(C0809a aVar) {
        if (aVar.mo8861V() == C0811b.NULL) {
            aVar.mo8859Q();
            return null;
        }
        try {
            return new Date(this.f532a.parse(aVar.mo8860S()).getTime());
        } catch (ParseException e) {
            throw new C0684t((Throwable) e);
        }
    }

    /* renamed from: f */
    public synchronized void mo8695d(C0812c cVar, Date date) {
        cVar.mo8878X(date == null ? null : this.f532a.format(date));
    }
}

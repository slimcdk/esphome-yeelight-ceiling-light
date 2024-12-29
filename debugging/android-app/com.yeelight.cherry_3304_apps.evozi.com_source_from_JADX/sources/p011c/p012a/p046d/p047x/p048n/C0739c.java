package p011c.p012a.p046d.p047x.p048n;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0684t;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.C0690w;
import p011c.p012a.p046d.p047x.C0713e;
import p011c.p012a.p046d.p047x.C0725j;
import p011c.p012a.p046d.p047x.p048n.p049o.C0804a;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.n.c */
public final class C0739c extends C0688v<Date> {

    /* renamed from: b */
    public static final C0690w f493b = new C0740a();

    /* renamed from: a */
    private final List<DateFormat> f494a;

    /* renamed from: c.a.d.x.n.c$a */
    static class C0740a implements C0690w {
        C0740a() {
        }

        /* renamed from: a */
        public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
            if (aVar.mo8967c() == Date.class) {
                return new C0739c();
            }
            return null;
        }
    }

    public C0739c() {
        ArrayList arrayList = new ArrayList();
        this.f494a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f494a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C0713e.m759e()) {
            this.f494a.add(C0725j.m780c(2, 2));
        }
    }

    /* renamed from: e */
    private synchronized Date m802e(String str) {
        for (DateFormat parse : this.f494a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C0804a.m1023c(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new C0684t(str, e);
        }
    }

    /* renamed from: f */
    public Date mo8694b(C0809a aVar) {
        if (aVar.mo8861V() != C0811b.NULL) {
            return m802e(aVar.mo8860S());
        }
        aVar.mo8859Q();
        return null;
    }

    /* renamed from: g */
    public synchronized void mo8695d(C0812c cVar, Date date) {
        if (date == null) {
            cVar.mo8874D();
        } else {
            cVar.mo8878X(this.f494a.get(0).format(date));
        }
    }
}

package p164h.p165b.p166a.p170k.p171d;

import com.miot.common.device.parser.xml.DddTag;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.xmlpull.v1.XmlPullParser;
import p164h.p165b.p166a.p170k.p172e.C4444e;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p243r.p246m.C11275a;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p251v.C11355d;
import p164h.p257c.p261c.C11518d;

@Alternative
/* renamed from: h.b.a.k.d.l */
public class C4439l extends C4438h {

    /* renamed from: b */
    private static Logger f8010b = Logger.getLogger(C4444e.class.getName());

    /* renamed from: b */
    public void mo24468b(C11275a aVar) {
        Logger logger = f8010b;
        logger.fine("Reading body of: " + aVar);
        if (f8010b.isLoggable(Level.FINER)) {
            f8010b.finer("===================================== GENA BODY BEGIN ============================================");
            f8010b.finer(aVar.mo35771e() != null ? aVar.mo35771e().toString() : null);
            f8010b.finer("-===================================== GENA BODY END ============================================");
        }
        String d = mo24470d(aVar);
        try {
            mo24480k(C11518d.m30248b(d), aVar);
        } catch (Exception e) {
            throw new C11221k("Can't transform message payload: " + e.getMessage(), e, d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo24480k(XmlPullParser xmlPullParser, C11275a aVar) {
        C11336p[] i = aVar.mo35828z().mo35988i();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2 && xmlPullParser.getName().equals(DddTag.PL_PROPERTY)) {
                mo24481l(xmlPullParser, aVar, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo24481l(XmlPullParser xmlPullParser, C11275a aVar, C11336p[] pVarArr) {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                int length = pVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C11336p pVar = pVarArr[i];
                    if (pVar.mo35994b().equals(name)) {
                        Logger logger = f8010b;
                        logger.fine("Reading state variable value: " + name);
                        aVar.mo35824A().add(new C11355d(pVar, xmlPullParser.nextText()));
                        break;
                    }
                    i++;
                }
            }
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getName().equals(DddTag.PL_PROPERTY)) {
                return;
            }
        }
    }
}

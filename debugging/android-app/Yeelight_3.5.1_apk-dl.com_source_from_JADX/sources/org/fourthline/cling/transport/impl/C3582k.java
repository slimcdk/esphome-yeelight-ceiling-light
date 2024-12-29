package org.fourthline.cling.transport.impl;

import com.miot.common.device.parser.xml.DddTag;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.meta.C10071f;
import org.seamless.xml.C10258d;
import org.xmlpull.v1.XmlPullParser;
import p148d7.C8955e;
import p210s6.C10373a;
import p226w6.C11959d;

@Alternative
/* renamed from: org.fourthline.cling.transport.impl.k */
public class C3582k extends C10130g {

    /* renamed from: b */
    private static Logger f5980b = Logger.getLogger(C8955e.class.getName());

    /* renamed from: b */
    public void mo24983b(C10373a aVar) {
        Logger logger = f5980b;
        logger.fine("Reading body of: " + aVar);
        if (f5980b.isLoggable(Level.FINER)) {
            f5980b.finer("===================================== GENA BODY BEGIN ============================================");
            f5980b.finer(aVar.mo40398e() != null ? aVar.mo40398e().toString() : null);
            f5980b.finer("-===================================== GENA BODY END ============================================");
        }
        String d = mo40744d(aVar);
        try {
            mo24984k(C10258d.m25792b(d), aVar);
        } catch (Exception e) {
            throw new UnsupportedDataException("Can't transform message payload: " + e.getMessage(), e, d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo24984k(XmlPullParser xmlPullParser, C10373a aVar) {
        C10071f[] i = aVar.mo41967z().mo40536i();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2 && xmlPullParser.getName().equals(DddTag.PL_PROPERTY)) {
                mo24985l(xmlPullParser, aVar, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo24985l(XmlPullParser xmlPullParser, C10373a aVar, C10071f[] fVarArr) {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                int length = fVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C10071f fVar = fVarArr[i];
                    if (fVar.mo40543b().equals(name)) {
                        Logger logger = f5980b;
                        logger.fine("Reading state variable value: " + name);
                        aVar.mo41963A().add(new C11959d(fVar, xmlPullParser.nextText()));
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

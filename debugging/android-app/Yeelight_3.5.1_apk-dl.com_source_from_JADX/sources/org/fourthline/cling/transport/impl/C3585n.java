package org.fourthline.cling.transport.impl;

import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.seamless.xml.C10258d;
import p148d7.C8958h;
import p193o6.C9792d;
import p204q6.C10286b;
import p204q6.C10287c;

@Alternative
/* renamed from: org.fourthline.cling.transport.impl.n */
public class C3585n extends C3583l {

    /* renamed from: c */
    private static Logger f5983c = Logger.getLogger(C8958h.class.getName());

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo24998N(C9792d dVar, UnsupportedDataException unsupportedDataException, UnsupportedDataException unsupportedDataException2) {
        throw unsupportedDataException;
    }

    /* renamed from: c */
    public void mo24995c(C10287c cVar, C9792d dVar) {
        try {
            super.mo24995c(cVar, dVar);
        } catch (UnsupportedDataException e) {
            if (cVar.mo41803a()) {
                f5983c.warning("Trying to recover from invalid SOAP XML response: " + e);
                String c = C10258d.m25793c(mo40776i(cVar));
                if (c.endsWith("</s:Envelop")) {
                    c = c + "e>";
                }
                try {
                    cVar.mo41804b(c);
                    super.mo24995c(cVar, dVar);
                } catch (UnsupportedDataException e2) {
                    mo24998N(dVar, e, e2);
                }
            } else {
                throw e;
            }
        }
    }

    /* renamed from: d */
    public void mo24996d(C10286b bVar, C9792d dVar) {
        try {
            super.mo24996d(bVar, dVar);
        } catch (UnsupportedDataException e) {
            if (bVar.mo41803a()) {
                Logger logger = f5983c;
                logger.warning("Trying to recover from invalid SOAP XML request: " + e);
                try {
                    bVar.mo41804b(C10258d.m25793c(mo40776i(bVar)));
                    super.mo24996d(bVar, dVar);
                } catch (UnsupportedDataException e2) {
                    mo24998N(dVar, e, e2);
                }
            } else {
                throw e;
            }
        }
    }
}

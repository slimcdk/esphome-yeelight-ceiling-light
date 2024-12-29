package org.fourthline.cling.transport.impl;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.C10025m;
import org.fourthline.cling.model.UnsupportedDataException;
import org.seamless.xml.C10258d;
import p148d7.C8955e;
import p210s6.C10373a;

@Alternative
/* renamed from: org.fourthline.cling.transport.impl.m */
public class C3584m extends C3582k {

    /* renamed from: c */
    private static Logger f5982c = Logger.getLogger(C8955e.class.getName());

    /* renamed from: b */
    public void mo24983b(C10373a aVar) {
        try {
            super.mo24983b(aVar);
        } catch (UnsupportedDataException e) {
            if (aVar.mo40395a()) {
                Logger logger = f5982c;
                logger.warning("Trying to recover from invalid GENA XML event: " + e);
                aVar.mo41963A().clear();
                try {
                    aVar.mo40396b(mo24997m(C10258d.m25793c(mo40744d(aVar))));
                    super.mo24983b(aVar);
                } catch (UnsupportedDataException unused) {
                    if (!aVar.mo41963A().isEmpty()) {
                        f5982c.warning("Partial read of GENA event properties (probably due to truncated XML)");
                        return;
                    }
                    throw e;
                }
            } else {
                throw e;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo24997m(String str) {
        Matcher matcher = Pattern.compile("<LastChange>(.*)</LastChange>", 32).matcher(str);
        if (!matcher.find() || matcher.groupCount() != 1) {
            return str;
        }
        String group = matcher.group(1);
        if (C10258d.m25794d(group)) {
            return str;
        }
        String trim = group.trim();
        String j = trim.charAt(0) == '<' ? C10025m.m24859j(trim) : trim;
        if (j.equals(trim)) {
            return str;
        }
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?><e:propertyset xmlns:e=\"urn:schemas-upnp-org:event-1-0\"><e:property><LastChange>" + j + "</LastChange>" + "</e:property>" + "</e:propertyset>";
    }
}

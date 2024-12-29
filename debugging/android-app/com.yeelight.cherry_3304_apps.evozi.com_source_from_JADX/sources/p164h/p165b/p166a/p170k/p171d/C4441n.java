package p164h.p165b.p166a.p170k.p171d;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.enterprise.inject.Alternative;
import p164h.p165b.p166a.p170k.p172e.C4444e;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.C11225o;
import p164h.p165b.p166a.p240h.p243r.p246m.C11275a;
import p164h.p257c.p261c.C11518d;

@Alternative
/* renamed from: h.b.a.k.d.n */
public class C4441n extends C4439l {

    /* renamed from: c */
    private static Logger f8012c = Logger.getLogger(C4444e.class.getName());

    /* renamed from: b */
    public void mo24468b(C11275a aVar) {
        try {
            super.mo24468b(aVar);
        } catch (C11221k e) {
            if (aVar.mo35768a()) {
                Logger logger = f8012c;
                logger.warning("Trying to recover from invalid GENA XML event: " + e);
                aVar.mo35824A().clear();
                try {
                    aVar.mo35769b(mo24493m(C11518d.m30249c(mo24470d(aVar))));
                    super.mo24468b(aVar);
                } catch (C11221k unused) {
                    if (!aVar.mo35824A().isEmpty()) {
                        f8012c.warning("Partial read of GENA event properties (probably due to truncated XML)");
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
    public String mo24493m(String str) {
        Matcher matcher = Pattern.compile("<LastChange>(.*)</LastChange>", 32).matcher(str);
        if (!matcher.find() || matcher.groupCount() != 1) {
            return str;
        }
        String group = matcher.group(1);
        if (C11518d.m30250d(group)) {
            return str;
        }
        String trim = group.trim();
        String j = trim.charAt(0) == '<' ? C11225o.m29323j(trim) : trim;
        if (j.equals(trim)) {
            return str;
        }
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?><e:propertyset xmlns:e=\"urn:schemas-upnp-org:event-1-0\"><e:property><LastChange>" + j + "</LastChange>" + "</e:property>" + "</e:propertyset>";
    }
}

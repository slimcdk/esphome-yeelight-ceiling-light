package p164h.p165b.p166a.p170k.p171d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.xmlpull.v1.XmlPullParser;
import p164h.p165b.p166a.p170k.p172e.C4445j;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p241p.C11228b;
import p164h.p165b.p166a.p240h.p241p.C11230d;
import p164h.p165b.p166a.p240h.p241p.C11232f;
import p164h.p165b.p166a.p240h.p243r.p244k.C11255b;
import p164h.p165b.p166a.p240h.p243r.p244k.C11256c;
import p164h.p165b.p166a.p240h.p248s.C11321b;
import p164h.p165b.p166a.p240h.p252w.C11386n;
import p164h.p257c.p261c.C11518d;

@Alternative
/* renamed from: h.b.a.k.d.m */
public class C4440m extends C4443p {

    /* renamed from: b */
    protected static Logger f8011b = Logger.getLogger(C4445j.class.getName());

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public String mo24482E(Map<String, String> map, C11321b bVar) {
        for (Map.Entry next : map.entrySet()) {
            if (bVar.mo35871g((String) next.getKey())) {
                return (String) next.getValue();
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public Map<String, String> mo24483F(XmlPullParser xmlPullParser, C11321b[] bVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C11321b bVar : bVarArr) {
            arrayList.add(bVar.mo35869e().toUpperCase(Locale.ROOT));
            for (String upperCase : Arrays.asList(bVar.mo35866b())) {
                arrayList.add(upperCase.toUpperCase(Locale.ROOT));
            }
        }
        HashMap hashMap = new HashMap();
        String name = xmlPullParser.getName();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2 && arrayList.contains(xmlPullParser.getName().toUpperCase(Locale.ROOT))) {
                hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals(name))) {
            }
        }
        if (hashMap.size() >= bVarArr.length) {
            return hashMap;
        }
        throw new C11230d(C11386n.ARGUMENT_VALUE_INVALID, "Invalid number of input or output arguments in XML message, expected " + bVarArr.length + " but found " + hashMap.size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo24484G(XmlPullParser xmlPullParser, C11232f fVar) {
        fVar.mo35712m(mo24486I(xmlPullParser, fVar.mo35700a().mo35855c()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo24485H(XmlPullParser xmlPullParser, C11232f fVar) {
        fVar.mo35714o(mo24486I(xmlPullParser, fVar.mo35700a().mo35858f()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public C11228b[] mo24486I(XmlPullParser xmlPullParser, C11321b[] bVarArr) {
        Map<String, String> F = mo24483F(xmlPullParser, bVarArr);
        C11228b[] bVarArr2 = new C11228b[bVarArr.length];
        int i = 0;
        while (i < bVarArr.length) {
            C11321b bVar = bVarArr[i];
            String E = mo24482E(F, bVar);
            if (E != null) {
                Logger logger = f8011b;
                logger.fine("Reading action argument: " + bVar.mo35869e());
                bVarArr2[i] = mo24503f(bVar, E);
                i++;
            } else {
                C11386n nVar = C11386n.ARGUMENT_VALUE_INVALID;
                throw new C11230d(nVar, "Could not find argument '" + bVar.mo35869e() + "' node");
            }
        }
        return bVarArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo24487J(XmlPullParser xmlPullParser) {
        C11518d.m30251e(xmlPullParser, "Body");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo24488K(XmlPullParser xmlPullParser, C11255b bVar, C11232f fVar) {
        C11518d.m30251e(xmlPullParser, fVar.mo35700a().mo35856d());
        mo24484G(xmlPullParser, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo24489L(XmlPullParser xmlPullParser, C11232f fVar) {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("Fault")) {
                    fVar.mo35709j(mo24490M(xmlPullParser));
                    return;
                }
                String name = xmlPullParser.getName();
                if (name.equals(fVar.mo35700a().mo35856d() + "Response")) {
                    mo24485H(xmlPullParser, fVar);
                    return;
                }
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals("Body"))) {
                C11386n nVar = C11386n.ACTION_FAILED;
            }
        }
        C11386n nVar2 = C11386n.ACTION_FAILED;
        throw new C11230d(nVar2, String.format("Action SOAP response do not contain %s element", new Object[]{fVar.mo35700a().mo35856d() + "Response"}));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[SYNTHETIC, Splitter:B:16:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p164h.p165b.p166a.p240h.p241p.C11230d mo24490M(org.xmlpull.v1.XmlPullParser r7) {
        /*
            r6 = this;
            java.lang.String r0 = "UPnPError"
            p164h.p257c.p261c.C11518d.m30251e(r7, r0)
            r1 = 0
            r2 = r1
        L_0x0007:
            int r3 = r7.next()
            r4 = 2
            if (r3 != r4) goto L_0x002b
            java.lang.String r4 = r7.getName()
            java.lang.String r5 = "errorCode"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x001f
            java.lang.String r1 = r7.nextText()
            goto L_0x002b
        L_0x001f:
            java.lang.String r5 = "errorDescription"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x002b
            java.lang.String r2 = r7.nextText()
        L_0x002b:
            r4 = 1
            if (r3 == r4) goto L_0x003b
            r4 = 3
            if (r3 != r4) goto L_0x0007
            java.lang.String r3 = r7.getName()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0007
        L_0x003b:
            if (r1 == 0) goto L_0x009c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0094 }
            int r7 = r7.intValue()     // Catch:{ NumberFormatException -> 0x0094 }
            h.b.a.h.w.n r0 = p164h.p165b.p166a.p240h.p252w.C11386n.m29846a(r7)     // Catch:{ NumberFormatException -> 0x0094 }
            java.lang.String r1 = " - "
            java.lang.String r3 = "Reading fault element: "
            if (r0 == 0) goto L_0x0074
            java.util.logging.Logger r7 = f8011b     // Catch:{ NumberFormatException -> 0x0094 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0094 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x0094 }
            int r3 = r0.mo36107b()     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r1)     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r2)     // Catch:{ NumberFormatException -> 0x0094 }
            java.lang.String r1 = r4.toString()     // Catch:{ NumberFormatException -> 0x0094 }
            r7.fine(r1)     // Catch:{ NumberFormatException -> 0x0094 }
            h.b.a.h.p.d r7 = new h.b.a.h.p.d     // Catch:{ NumberFormatException -> 0x0094 }
            r1 = 0
            r7.<init>((p164h.p165b.p166a.p240h.p252w.C11386n) r0, (java.lang.String) r2, (boolean) r1)     // Catch:{ NumberFormatException -> 0x0094 }
            return r7
        L_0x0074:
            java.util.logging.Logger r0 = f8011b     // Catch:{ NumberFormatException -> 0x0094 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0094 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r7)     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r1)     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r2)     // Catch:{ NumberFormatException -> 0x0094 }
            java.lang.String r1 = r4.toString()     // Catch:{ NumberFormatException -> 0x0094 }
            r0.fine(r1)     // Catch:{ NumberFormatException -> 0x0094 }
            h.b.a.h.p.d r0 = new h.b.a.h.p.d     // Catch:{ NumberFormatException -> 0x0094 }
            r0.<init>((int) r7, (java.lang.String) r2)     // Catch:{ NumberFormatException -> 0x0094 }
            return r0
        L_0x0094:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Error code was not a number"
            r7.<init>(r0)
            throw r7
        L_0x009c:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Received fault element but no error code"
            r7.<init>(r0)
            goto L_0x00a5
        L_0x00a4:
            throw r7
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p170k.p171d.C4440m.mo24490M(org.xmlpull.v1.XmlPullParser):h.b.a.h.p.d");
    }

    /* renamed from: a */
    public void mo24491a(C11256c cVar, C11232f fVar) {
        String i = mo24507i(cVar);
        try {
            XmlPullParser b = C11518d.m30248b(i);
            mo24487J(b);
            mo24489L(b, fVar);
        } catch (Exception e) {
            throw new C11221k("Can't transform message payload: " + e, e, i);
        }
    }

    /* renamed from: b */
    public void mo24492b(C11255b bVar, C11232f fVar) {
        String i = mo24507i(bVar);
        try {
            mo24488K(C11518d.m30248b(i), bVar, fVar);
        } catch (Exception e) {
            throw new C11221k("Can't transform message payload: " + e, e, i);
        }
    }
}

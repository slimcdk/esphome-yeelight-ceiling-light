package org.fourthline.cling.transport.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.ErrorCode;
import org.seamless.xml.C10258d;
import org.xmlpull.v1.XmlPullParser;
import p148d7.C8958h;
import p193o6.C9790b;
import p193o6.C9792d;
import p204q6.C10286b;
import p204q6.C10287c;

@Alternative
/* renamed from: org.fourthline.cling.transport.impl.l */
public class C3583l extends C10136o {

    /* renamed from: b */
    protected static Logger f5981b = Logger.getLogger(C8958h.class.getName());

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public String mo24986E(Map<String, String> map, ActionArgument actionArgument) {
        for (Map.Entry next : map.entrySet()) {
            if (actionArgument.mo40466g((String) next.getKey())) {
                return (String) next.getValue();
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public Map<String, String> mo24987F(XmlPullParser xmlPullParser, ActionArgument[] actionArgumentArr) {
        ArrayList arrayList = new ArrayList();
        for (ActionArgument actionArgument : actionArgumentArr) {
            arrayList.add(actionArgument.mo40464e().toUpperCase(Locale.ROOT));
            for (String upperCase : Arrays.asList(actionArgument.mo40461b())) {
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
        if (hashMap.size() >= actionArgumentArr.length) {
            return hashMap;
        }
        throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Invalid number of input or output arguments in XML message, expected " + actionArgumentArr.length + " but found " + hashMap.size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo24988G(XmlPullParser xmlPullParser, C9792d dVar) {
        dVar.mo38979m(mo24990I(xmlPullParser, dVar.mo38967a().mo40473c()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo24989H(XmlPullParser xmlPullParser, C9792d dVar) {
        dVar.mo38981o(mo24990I(xmlPullParser, dVar.mo38967a().mo40476f()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public C9790b[] mo24990I(XmlPullParser xmlPullParser, ActionArgument[] actionArgumentArr) {
        Map<String, String> F = mo24987F(xmlPullParser, actionArgumentArr);
        C9790b[] bVarArr = new C9790b[actionArgumentArr.length];
        int i = 0;
        while (i < actionArgumentArr.length) {
            ActionArgument actionArgument = actionArgumentArr[i];
            String E = mo24986E(F, actionArgument);
            if (E != null) {
                Logger logger = f5981b;
                logger.fine("Reading action argument: " + actionArgument.mo40464e());
                bVarArr[i] = mo40772f(actionArgument, E);
                i++;
            } else {
                ErrorCode errorCode = ErrorCode.ARGUMENT_VALUE_INVALID;
                throw new ActionException(errorCode, "Could not find argument '" + actionArgument.mo40464e() + "' node");
            }
        }
        return bVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo24991J(XmlPullParser xmlPullParser) {
        C10258d.m25795e(xmlPullParser, "Body");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo24992K(XmlPullParser xmlPullParser, C10286b bVar, C9792d dVar) {
        C10258d.m25795e(xmlPullParser, dVar.mo38967a().mo40474d());
        mo24988G(xmlPullParser, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo24993L(XmlPullParser xmlPullParser, C9792d dVar) {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("Fault")) {
                    dVar.mo38976j(mo24994M(xmlPullParser));
                    return;
                }
                String name = xmlPullParser.getName();
                if (name.equals(dVar.mo38967a().mo40474d() + "Response")) {
                    mo24989H(xmlPullParser, dVar);
                    return;
                }
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals("Body"))) {
                ErrorCode errorCode = ErrorCode.ACTION_FAILED;
            }
        }
        ErrorCode errorCode2 = ErrorCode.ACTION_FAILED;
        throw new ActionException(errorCode2, String.format("Action SOAP response do not contain %s element", new Object[]{dVar.mo38967a().mo40474d() + "Response"}));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[SYNTHETIC, Splitter:B:16:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.fourthline.cling.model.action.ActionException mo24994M(org.xmlpull.v1.XmlPullParser r7) {
        /*
            r6 = this;
            java.lang.String r0 = "UPnPError"
            org.seamless.xml.C10258d.m25795e(r7, r0)
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
            org.fourthline.cling.model.types.ErrorCode r0 = org.fourthline.cling.model.types.ErrorCode.getByCode(r7)     // Catch:{ NumberFormatException -> 0x0094 }
            java.lang.String r1 = " - "
            java.lang.String r3 = "Reading fault element: "
            if (r0 == 0) goto L_0x0074
            java.util.logging.Logger r7 = f5981b     // Catch:{ NumberFormatException -> 0x0094 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0094 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x0094 }
            int r3 = r0.getCode()     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r1)     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r2)     // Catch:{ NumberFormatException -> 0x0094 }
            java.lang.String r1 = r4.toString()     // Catch:{ NumberFormatException -> 0x0094 }
            r7.fine(r1)     // Catch:{ NumberFormatException -> 0x0094 }
            org.fourthline.cling.model.action.ActionException r7 = new org.fourthline.cling.model.action.ActionException     // Catch:{ NumberFormatException -> 0x0094 }
            r1 = 0
            r7.<init>((org.fourthline.cling.model.types.ErrorCode) r0, (java.lang.String) r2, (boolean) r1)     // Catch:{ NumberFormatException -> 0x0094 }
            return r7
        L_0x0074:
            java.util.logging.Logger r0 = f5981b     // Catch:{ NumberFormatException -> 0x0094 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0094 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r7)     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r1)     // Catch:{ NumberFormatException -> 0x0094 }
            r4.append(r2)     // Catch:{ NumberFormatException -> 0x0094 }
            java.lang.String r1 = r4.toString()     // Catch:{ NumberFormatException -> 0x0094 }
            r0.fine(r1)     // Catch:{ NumberFormatException -> 0x0094 }
            org.fourthline.cling.model.action.ActionException r0 = new org.fourthline.cling.model.action.ActionException     // Catch:{ NumberFormatException -> 0x0094 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.fourthline.cling.transport.impl.C3583l.mo24994M(org.xmlpull.v1.XmlPullParser):org.fourthline.cling.model.action.ActionException");
    }

    /* renamed from: c */
    public void mo24995c(C10287c cVar, C9792d dVar) {
        String i = mo40776i(cVar);
        try {
            XmlPullParser b = C10258d.m25792b(i);
            mo24991J(b);
            mo24993L(b, dVar);
        } catch (Exception e) {
            throw new UnsupportedDataException("Can't transform message payload: " + e, e, i);
        }
    }

    /* renamed from: d */
    public void mo24996d(C10286b bVar, C9792d dVar) {
        String i = mo40776i(bVar);
        try {
            mo24992K(C10258d.m25792b(i), bVar, dVar);
        } catch (Exception e) {
            throw new UnsupportedDataException("Can't transform message payload: " + e, e, i);
        }
    }
}

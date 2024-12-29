package com.xiaomi.push.service;

import com.xiaomi.push.C4697gg;
import com.xiaomi.push.C4710gp;
import com.xiaomi.push.C4711gq;
import com.xiaomi.push.C4715gu;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.xiaomi.push.service.e */
public class C4908e implements C4710gp {
    /* renamed from: a */
    public static C4697gg m15738a(XmlPullParser xmlPullParser) {
        ArrayList arrayList;
        String str;
        String[] strArr;
        String[] strArr2;
        if (xmlPullParser.getEventType() != 2) {
            return null;
        }
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        if (xmlPullParser.getAttributeCount() > 0) {
            String[] strArr3 = new String[xmlPullParser.getAttributeCount()];
            String[] strArr4 = new String[xmlPullParser.getAttributeCount()];
            for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                strArr3[i] = xmlPullParser.getAttributeName(i);
                strArr4[i] = C4715gu.m14464b(xmlPullParser.getAttributeValue(i));
            }
            strArr2 = strArr3;
            str = null;
            arrayList = null;
            strArr = strArr4;
        } else {
            strArr2 = null;
            strArr = null;
            str = null;
            arrayList = null;
        }
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                return new C4697gg(name, namespace, strArr2, strArr, str, arrayList);
            }
            if (next == 4) {
                str = xmlPullParser.getText().trim();
            } else if (next == 2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C4697gg a = m15738a(xmlPullParser);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo25971a() {
        C4711gq.mo25234a().mo25235a("all", "xm:chat", this);
    }

    /* renamed from: b */
    public C4697gg mo25972b(XmlPullParser xmlPullParser) {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && eventType != 2) {
            eventType = xmlPullParser.next();
        }
        if (eventType == 2) {
            return m15738a(xmlPullParser);
        }
        return null;
    }
}

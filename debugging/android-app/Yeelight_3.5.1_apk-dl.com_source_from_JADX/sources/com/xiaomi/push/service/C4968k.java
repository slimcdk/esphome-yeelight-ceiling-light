package com.xiaomi.push.service;

import com.xiaomi.push.C4727gk;
import com.xiaomi.push.C4740gt;
import com.xiaomi.push.C4741gu;
import com.xiaomi.push.C4745gy;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.xiaomi.push.service.k */
public class C4968k implements C4740gt {
    /* renamed from: a */
    public static C4727gk m15570a(XmlPullParser xmlPullParser) {
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
                strArr4[i] = C4745gy.m14118b(xmlPullParser.getAttributeValue(i));
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
                return new C4727gk(name, namespace, strArr2, strArr, str, arrayList);
            }
            if (next == 4) {
                str = xmlPullParser.getText().trim();
            } else if (next == 2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C4727gk a = m15570a(xmlPullParser);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo30054a() {
        C4741gu.mo29271a().mo29272a("all", "xm:chat", this);
    }

    /* renamed from: b */
    public C4727gk mo30055b(XmlPullParser xmlPullParser) {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && eventType != 2) {
            eventType = xmlPullParser.next();
        }
        if (eventType == 2) {
            return m15570a(xmlPullParser);
        }
        return null;
    }
}

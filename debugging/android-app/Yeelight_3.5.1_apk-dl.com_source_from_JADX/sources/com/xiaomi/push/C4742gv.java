package com.xiaomi.push;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.miot.api.Constants;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4728gl;
import com.xiaomi.push.C4733gp;
import com.xiaomi.push.C4737gr;
import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.C4923bp;
import com.xiaomi.push.service.C4968k;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p223w3.C11641s;

/* renamed from: com.xiaomi.push.gv */
public class C4742gv {

    /* renamed from: a */
    private static XmlPullParser f8369a;

    /* renamed from: a */
    public static C4727gk m14103a(String str, String str2, XmlPullParser xmlPullParser) {
        Object a = C4741gu.mo29271a().mo29270a("all", "xm:chat");
        if (a == null || !(a instanceof C4968k)) {
            return null;
        }
        return ((C4968k) a).mo30055b(xmlPullParser);
    }

    /* renamed from: a */
    public static C4728gl m14104a(XmlPullParser xmlPullParser, C4711fw fwVar) {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", TypedValues.TransitionType.S_TO);
        String attributeValue3 = xmlPullParser.getAttributeValue("", TypedValues.TransitionType.S_FROM);
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        C4728gl.C4729a a = C4728gl.C4729a.m14038a(xmlPullParser.getAttributeValue("", "type"));
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            hashMap.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        C4728gl glVar = null;
        C4737gr grVar = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
                    grVar = m14105a(xmlPullParser);
                } else {
                    glVar = new C4728gl();
                    glVar.mo29249a(m14103a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (glVar == null) {
            if (C4728gl.C4729a.f8282a == a || C4728gl.C4729a.f8283b == a) {
                C4743gw gwVar = new C4743gw();
                gwVar.mo29253k(attributeValue);
                gwVar.mo29257m(attributeValue3);
                gwVar.mo29259n(attributeValue2);
                gwVar.mo29224a(C4728gl.C4729a.f8285d);
                gwVar.mo29255l(attributeValue4);
                gwVar.mo29250a(new C4737gr(C4737gr.C4738a.f8345e));
                fwVar.mo29173a((C4731gn) gwVar);
                C4408b.m12483d("iq usage error. send packet in packet parser.");
                return null;
            }
            glVar = new C4744gx();
        }
        glVar.mo29253k(attributeValue);
        glVar.mo29257m(attributeValue2);
        glVar.mo29255l(attributeValue4);
        glVar.mo29259n(attributeValue3);
        glVar.mo29224a(a);
        glVar.mo29250a(grVar);
        glVar.mo29225a((Map<String, String>) hashMap);
        return glVar;
    }

    /* renamed from: a */
    public static C4731gn m14105a(XmlPullParser xmlPullParser) {
        String str;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        boolean z = false;
        String str2 = null;
        if (TimerCodec.ENABLE.equals(xmlPullParser2.getAttributeValue("", C11641s.f21397C))) {
            String attributeValue = xmlPullParser2.getAttributeValue("", "chid");
            String attributeValue2 = xmlPullParser2.getAttributeValue("", "id");
            String attributeValue3 = xmlPullParser2.getAttributeValue("", TypedValues.TransitionType.S_FROM);
            String attributeValue4 = xmlPullParser2.getAttributeValue("", TypedValues.TransitionType.S_TO);
            String attributeValue5 = xmlPullParser2.getAttributeValue("", "type");
            C4906bg.C4908b a = C4906bg.mo30005a().mo30006a(attributeValue, attributeValue4);
            if (a == null) {
                a = C4906bg.mo30005a().mo30006a(attributeValue, attributeValue3);
            }
            if (a != null) {
                C4731gn gnVar = null;
                while (!z) {
                    int next = xmlPullParser.next();
                    if (next == 2) {
                        if (!C11641s.f21397C.equals(xmlPullParser.getName())) {
                            throw new C4724gh("error while receiving a encrypted message with wrong format");
                        } else if (xmlPullParser.next() == 4) {
                            String text = xmlPullParser.getText();
                            if ("5".equals(attributeValue) || "6".equals(attributeValue)) {
                                C4730gm gmVar = new C4730gm();
                                gmVar.mo29255l(attributeValue);
                                gmVar.mo29232b(true);
                                gmVar.mo29259n(attributeValue3);
                                gmVar.mo29257m(attributeValue4);
                                gmVar.mo29253k(attributeValue2);
                                gmVar.mo29241f(attributeValue5);
                                C4727gk gkVar = new C4727gk(C11641s.f21397C, (String) null, (String[]) null, (String[]) null);
                                gkVar.mo29217a(text);
                                gmVar.mo29249a(gkVar);
                                return gmVar;
                            }
                            m14110a(C4923bp.m15451a(C4923bp.m15450a(a.f9548h, attributeValue2), text));
                            f8369a.next();
                            gnVar = m14105a(f8369a);
                        } else {
                            throw new C4724gh("error while receiving a encrypted message with wrong format");
                        }
                    } else if (next == 3 && xmlPullParser.getName().equals(Constants.EXTRA_PUSH_MESSAGE)) {
                        z = true;
                    }
                }
                if (gnVar != null) {
                    return gnVar;
                }
                throw new C4724gh("error while receiving a encrypted message with wrong format");
            }
            throw new C4724gh("the channel id is wrong while receiving a encrypted message");
        }
        C4730gm gmVar2 = new C4730gm();
        String attributeValue6 = xmlPullParser2.getAttributeValue("", "id");
        if (attributeValue6 == null) {
            attributeValue6 = "ID_NOT_AVAILABLE";
        }
        gmVar2.mo29253k(attributeValue6);
        gmVar2.mo29257m(xmlPullParser2.getAttributeValue("", TypedValues.TransitionType.S_TO));
        gmVar2.mo29259n(xmlPullParser2.getAttributeValue("", TypedValues.TransitionType.S_FROM));
        gmVar2.mo29255l(xmlPullParser2.getAttributeValue("", "chid"));
        gmVar2.mo29228a(xmlPullParser2.getAttributeValue("", "appid"));
        try {
            str = xmlPullParser2.getAttributeValue("", "transient");
        } catch (Exception unused) {
            str = null;
        }
        try {
            String attributeValue7 = xmlPullParser2.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue7)) {
                gmVar2.mo29231b(attributeValue7);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue8 = xmlPullParser2.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                gmVar2.mo29234c(attributeValue8);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue9 = xmlPullParser2.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                gmVar2.mo29236d(attributeValue9);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue10 = xmlPullParser2.getAttributeValue("", NotificationCompat.CATEGORY_STATUS);
            if (!TextUtils.isEmpty(attributeValue10)) {
                gmVar2.mo29238e(attributeValue10);
            }
        } catch (Exception unused5) {
        }
        gmVar2.mo29230a(!TextUtils.isEmpty(str) && str.equalsIgnoreCase("true"));
        gmVar2.mo29241f(xmlPullParser2.getAttributeValue("", "type"));
        String b = m14111b(xmlPullParser);
        if (b == null || "".equals(b.trim())) {
            C4731gn.m14062q();
        } else {
            gmVar2.mo29248j(b);
        }
        while (!z) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    m14111b(xmlPullParser);
                    gmVar2.mo29243g(m14105a(xmlPullParser));
                } else if (name.equals("body")) {
                    String attributeValue11 = xmlPullParser2.getAttributeValue("", "encode");
                    String a2 = m14105a(xmlPullParser);
                    if (!TextUtils.isEmpty(attributeValue11)) {
                        gmVar2.mo29229a(a2, attributeValue11);
                    } else {
                        gmVar2.mo29245h(a2);
                    }
                } else if (name.equals("thread")) {
                    if (str2 == null) {
                        str2 = xmlPullParser.nextText();
                    }
                } else if (name.equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
                    gmVar2.mo29250a(m14105a(xmlPullParser));
                } else {
                    gmVar2.mo29249a(m14103a(name, namespace, xmlPullParser2));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals(Constants.EXTRA_PUSH_MESSAGE)) {
                z = true;
            }
        }
        gmVar2.mo29247i(str2);
        return gmVar2;
    }

    /* renamed from: a */
    public static C4733gp m14106a(XmlPullParser xmlPullParser) {
        C4733gp.C4735b bVar = C4733gp.C4735b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVar = C4733gp.C4735b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                PrintStream printStream = System.err;
                printStream.println("Found invalid presence type " + attributeValue);
            }
        }
        C4733gp gpVar = new C4733gp(bVar);
        gpVar.mo29257m(xmlPullParser.getAttributeValue("", TypedValues.TransitionType.S_TO));
        gpVar.mo29259n(xmlPullParser.getAttributeValue("", TypedValues.TransitionType.S_FROM));
        gpVar.mo29255l(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        gpVar.mo29253k(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals(NotificationCompat.CATEGORY_STATUS)) {
                    gpVar.mo29228a(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        gpVar.mo29263a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        gpVar.mo29263a(0);
                    }
                } else if (name.equals("show")) {
                    String nextText = xmlPullParser.nextText();
                    try {
                        gpVar.mo29264a(C4733gp.C4734a.valueOf(nextText));
                    } catch (IllegalArgumentException unused4) {
                        PrintStream printStream2 = System.err;
                        printStream2.println("Found invalid presence mode " + nextText);
                    }
                } else if (name.equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
                    gpVar.mo29250a(m14105a(xmlPullParser));
                } else {
                    gpVar.mo29249a(m14103a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return gpVar;
    }

    /* renamed from: a */
    public static C4736gq m14107a(XmlPullParser xmlPullParser) {
        C4736gq gqVar = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                gqVar = new C4736gq(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
                z = true;
            }
        }
        return gqVar;
    }

    /* renamed from: a */
    public static C4737gr m14108a(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        String str = "-1";
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("code")) {
                str = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i).equals("type")) {
                str3 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i).equals("reason")) {
                str2 = xmlPullParser.getAttributeValue("", "reason");
            }
        }
        String str4 = null;
        String str5 = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    str5 = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str4 = name;
                    } else {
                        arrayList.add(m14103a(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
                    z = true;
                }
            } else if (next == 4) {
                str5 = xmlPullParser.getText();
            }
        }
        return new C4737gr(Integer.parseInt(str), str3 == null ? "cancel" : str3, str2, str4, str5, arrayList);
    }

    /* renamed from: a */
    private static String m14109a(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String str = "";
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    /* renamed from: a */
    private static void m14110a(byte[] bArr) {
        if (f8369a == null) {
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f8369a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }
        f8369a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    /* renamed from: b */
    private static String m14111b(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}

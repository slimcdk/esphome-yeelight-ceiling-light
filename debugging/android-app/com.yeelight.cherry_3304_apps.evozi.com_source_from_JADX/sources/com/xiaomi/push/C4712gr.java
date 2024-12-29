package com.xiaomi.push;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.miot.api.Constants;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4698gh;
import com.xiaomi.push.C4703gl;
import com.xiaomi.push.C4707gn;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.C4877ay;
import com.xiaomi.push.service.C4908e;
import com.yeelight.yeelib.p150c.p183m.C7230s;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.xiaomi.push.gr */
public class C4712gr {

    /* renamed from: a */
    private static XmlPullParser f8904a;

    /* renamed from: a */
    public static C4697gg m14449a(String str, String str2, XmlPullParser xmlPullParser) {
        Object a = C4711gq.mo25234a().mo25233a("all", "xm:chat");
        if (a == null || !(a instanceof C4908e)) {
            return null;
        }
        return ((C4908e) a).mo25972b(xmlPullParser);
    }

    /* renamed from: a */
    public static C4698gh m14450a(XmlPullParser xmlPullParser, C4680fs fsVar) {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        C4698gh.C4699a a = C4698gh.C4699a.m14384a(xmlPullParser.getAttributeValue("", "type"));
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            hashMap.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        C4698gh ghVar = null;
        C4707gn gnVar = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
                    gnVar = m14451a(xmlPullParser);
                } else {
                    ghVar = new C4698gh();
                    ghVar.mo25212a(m14449a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (ghVar == null) {
            if (C4698gh.C4699a.f8817a == a || C4698gh.C4699a.f8818b == a) {
                C4713gs gsVar = new C4713gs();
                gsVar.mo25216k(attributeValue);
                gsVar.mo25220m(attributeValue3);
                gsVar.mo25222n(attributeValue2);
                gsVar.mo25187a(C4698gh.C4699a.f8820d);
                gsVar.mo25218l(attributeValue4);
                gsVar.mo25213a(new C4707gn(C4707gn.C4708a.f8880e));
                fsVar.mo25137a((C4701gj) gsVar);
                C3989b.m10681d("iq usage error. send packet in packet parser.");
                return null;
            }
            ghVar = new C4714gt();
        }
        ghVar.mo25216k(attributeValue);
        ghVar.mo25220m(attributeValue2);
        ghVar.mo25218l(attributeValue4);
        ghVar.mo25222n(attributeValue3);
        ghVar.mo25187a(a);
        ghVar.mo25213a(gnVar);
        ghVar.mo25188a((Map<String, String>) hashMap);
        return ghVar;
    }

    /* renamed from: a */
    public static C4701gj m14451a(XmlPullParser xmlPullParser) {
        String str;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        boolean z = false;
        String str2 = null;
        if (TimerCodec.ENABLE.equals(xmlPullParser2.getAttributeValue("", C7230s.f14753G))) {
            String attributeValue = xmlPullParser2.getAttributeValue("", "chid");
            String attributeValue2 = xmlPullParser2.getAttributeValue("", "id");
            String attributeValue3 = xmlPullParser2.getAttributeValue("", "from");
            String attributeValue4 = xmlPullParser2.getAttributeValue("", "to");
            String attributeValue5 = xmlPullParser2.getAttributeValue("", "type");
            C4860ap.C4862b a = C4860ap.mo25920a().mo25921a(attributeValue, attributeValue4);
            if (a == null) {
                a = C4860ap.mo25920a().mo25921a(attributeValue, attributeValue3);
            }
            if (a != null) {
                C4701gj gjVar = null;
                while (!z) {
                    int next = xmlPullParser.next();
                    if (next == 2) {
                        if (!C7230s.f14753G.equals(xmlPullParser.getName())) {
                            throw new C4694gd("error while receiving a encrypted message with wrong format");
                        } else if (xmlPullParser.next() == 4) {
                            String text = xmlPullParser.getText();
                            if ("5".equals(attributeValue) || "6".equals(attributeValue)) {
                                C4700gi giVar = new C4700gi();
                                giVar.mo25218l(attributeValue);
                                giVar.mo25195b(true);
                                giVar.mo25222n(attributeValue3);
                                giVar.mo25220m(attributeValue4);
                                giVar.mo25216k(attributeValue2);
                                giVar.mo25204f(attributeValue5);
                                C4697gg ggVar = new C4697gg(C7230s.f14753G, (String) null, (String[]) null, (String[]) null);
                                ggVar.mo25181a(text);
                                giVar.mo25212a(ggVar);
                                return giVar;
                            }
                            m14456a(C4877ay.m15653a(C4877ay.m15652a(a.f9999h, attributeValue2), text));
                            f8904a.next();
                            gjVar = m14451a(f8904a);
                        } else {
                            throw new C4694gd("error while receiving a encrypted message with wrong format");
                        }
                    } else if (next == 3 && xmlPullParser.getName().equals(Constants.EXTRA_PUSH_MESSAGE)) {
                        z = true;
                    }
                }
                if (gjVar != null) {
                    return gjVar;
                }
                throw new C4694gd("error while receiving a encrypted message with wrong format");
            }
            throw new C4694gd("the channel id is wrong while receiving a encrypted message");
        }
        C4700gi giVar2 = new C4700gi();
        String attributeValue6 = xmlPullParser2.getAttributeValue("", "id");
        if (attributeValue6 == null) {
            attributeValue6 = "ID_NOT_AVAILABLE";
        }
        giVar2.mo25216k(attributeValue6);
        giVar2.mo25220m(xmlPullParser2.getAttributeValue("", "to"));
        giVar2.mo25222n(xmlPullParser2.getAttributeValue("", "from"));
        giVar2.mo25218l(xmlPullParser2.getAttributeValue("", "chid"));
        giVar2.mo25191a(xmlPullParser2.getAttributeValue("", "appid"));
        try {
            str = xmlPullParser2.getAttributeValue("", "transient");
        } catch (Exception unused) {
            str = null;
        }
        try {
            String attributeValue7 = xmlPullParser2.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue7)) {
                giVar2.mo25194b(attributeValue7);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue8 = xmlPullParser2.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                giVar2.mo25197c(attributeValue8);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue9 = xmlPullParser2.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                giVar2.mo25199d(attributeValue9);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue10 = xmlPullParser2.getAttributeValue("", NotificationCompat.CATEGORY_STATUS);
            if (!TextUtils.isEmpty(attributeValue10)) {
                giVar2.mo25201e(attributeValue10);
            }
        } catch (Exception unused5) {
        }
        giVar2.mo25193a(!TextUtils.isEmpty(str) && str.equalsIgnoreCase("true"));
        giVar2.mo25204f(xmlPullParser2.getAttributeValue("", "type"));
        String b = m14457b(xmlPullParser);
        if (b == null || "".equals(b.trim())) {
            C4701gj.m14408q();
        } else {
            giVar2.mo25211j(b);
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
                    String b2 = m14457b(xmlPullParser);
                    giVar2.mo25206g(m14451a(xmlPullParser));
                } else if (name.equals("body")) {
                    String attributeValue11 = xmlPullParser2.getAttributeValue("", "encode");
                    String a2 = m14451a(xmlPullParser);
                    if (!TextUtils.isEmpty(attributeValue11)) {
                        giVar2.mo25192a(a2, attributeValue11);
                    } else {
                        giVar2.mo25208h(a2);
                    }
                } else if (name.equals("thread")) {
                    if (str2 == null) {
                        str2 = xmlPullParser.nextText();
                    }
                } else if (name.equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
                    giVar2.mo25213a(m14451a(xmlPullParser));
                } else {
                    giVar2.mo25212a(m14449a(name, namespace, xmlPullParser2));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals(Constants.EXTRA_PUSH_MESSAGE)) {
                z = true;
            }
        }
        giVar2.mo25210i(str2);
        return giVar2;
    }

    /* renamed from: a */
    public static C4703gl m14452a(XmlPullParser xmlPullParser) {
        C4703gl.C4705b bVar = C4703gl.C4705b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVar = C4703gl.C4705b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                PrintStream printStream = System.err;
                printStream.println("Found invalid presence type " + attributeValue);
            }
        }
        C4703gl glVar = new C4703gl(bVar);
        glVar.mo25220m(xmlPullParser.getAttributeValue("", "to"));
        glVar.mo25222n(xmlPullParser.getAttributeValue("", "from"));
        glVar.mo25218l(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        glVar.mo25216k(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals(NotificationCompat.CATEGORY_STATUS)) {
                    glVar.mo25191a(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        glVar.mo25226a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        glVar.mo25226a(0);
                    }
                } else if (name.equals("show")) {
                    String nextText = xmlPullParser.nextText();
                    try {
                        glVar.mo25227a(C4703gl.C4704a.valueOf(nextText));
                    } catch (IllegalArgumentException unused4) {
                        PrintStream printStream2 = System.err;
                        printStream2.println("Found invalid presence mode " + nextText);
                    }
                } else if (name.equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
                    glVar.mo25213a(m14451a(xmlPullParser));
                } else {
                    glVar.mo25212a(m14449a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return glVar;
    }

    /* renamed from: a */
    public static C4706gm m14453a(XmlPullParser xmlPullParser) {
        C4706gm gmVar = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                gmVar = new C4706gm(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
                z = true;
            }
        }
        return gmVar;
    }

    /* renamed from: a */
    public static C4707gn m14454a(XmlPullParser xmlPullParser) {
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
                        arrayList.add(m14449a(name, namespace, xmlPullParser));
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
        return new C4707gn(Integer.parseInt(str), str3 == null ? "cancel" : str3, str2, str4, str5, arrayList);
    }

    /* renamed from: a */
    private static String m14455a(XmlPullParser xmlPullParser) {
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
    private static void m14456a(byte[] bArr) {
        if (f8904a == null) {
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f8904a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }
        f8904a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    /* renamed from: b */
    private static String m14457b(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}

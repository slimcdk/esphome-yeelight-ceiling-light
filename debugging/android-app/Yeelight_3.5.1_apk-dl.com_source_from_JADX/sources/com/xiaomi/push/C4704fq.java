package com.xiaomi.push;

import com.miot.api.Constants;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.xiaomi.push.fq */
public class C4704fq {

    /* renamed from: a */
    private XmlPullParser f8199a;

    C4704fq() {
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.f8199a = newPullParser;
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4731gn mo29169a(byte[] bArr, C4711fw fwVar) {
        String str;
        String str2;
        this.f8199a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f8199a.next();
        int eventType = this.f8199a.getEventType();
        String name = this.f8199a.getName();
        if (eventType != 2) {
            return null;
        }
        if (name.equals(Constants.EXTRA_PUSH_MESSAGE)) {
            return C4742gv.m14105a(this.f8199a);
        }
        if (name.equals("iq")) {
            return C4742gv.m14104a(this.f8199a, fwVar);
        }
        if (name.equals("presence")) {
            return C4742gv.m14105a(this.f8199a);
        }
        if (this.f8199a.getName().equals("stream")) {
            return null;
        }
        if (!this.f8199a.getName().equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
            if (this.f8199a.getName().equals("warning")) {
                this.f8199a.next();
                str2 = this.f8199a.getName();
                str = "multi-login";
            } else {
                str2 = this.f8199a.getName();
                str = "bind";
            }
            str2.equals(str);
            return null;
        }
        throw new C4724gh(C4742gv.m14105a(this.f8199a));
    }
}

package com.xiaomi.push;

import com.miot.api.Constants;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.xiaomi.push.fo */
public class C4676fo {

    /* renamed from: a */
    private XmlPullParser f8743a;

    C4676fo() {
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.f8743a = newPullParser;
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4701gj mo25133a(byte[] bArr, C4680fs fsVar) {
        this.f8743a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f8743a.next();
        int eventType = this.f8743a.getEventType();
        String name = this.f8743a.getName();
        if (eventType != 2) {
            return null;
        }
        if (name.equals(Constants.EXTRA_PUSH_MESSAGE)) {
            return C4712gr.m14451a(this.f8743a);
        }
        if (name.equals("iq")) {
            return C4712gr.m14450a(this.f8743a, fsVar);
        }
        if (name.equals("presence")) {
            return C4712gr.m14451a(this.f8743a);
        }
        if (this.f8743a.getName().equals("stream")) {
            return null;
        }
        if (this.f8743a.getName().equals(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2)) {
            throw new C4694gd(C4712gr.m14451a(this.f8743a));
        } else if (this.f8743a.getName().equals("warning")) {
            this.f8743a.next();
            boolean equals = this.f8743a.getName().equals("multi-login");
            return null;
        } else {
            this.f8743a.getName().equals("bind");
            return null;
        }
    }
}

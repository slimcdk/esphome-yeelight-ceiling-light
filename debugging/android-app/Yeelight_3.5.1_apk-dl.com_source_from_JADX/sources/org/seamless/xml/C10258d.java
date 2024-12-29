package org.seamless.xml;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: org.seamless.xml.d */
public class C10258d {

    /* renamed from: a */
    private static final Logger f19317a = Logger.getLogger(C10258d.class.getName());

    /* renamed from: b */
    static XmlPullParserFactory f19318b;

    static {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            f19318b = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            Logger logger = f19317a;
            logger.severe("cannot create XmlPullParserFactory instance: " + e);
        }
    }

    /* renamed from: a */
    public static XmlPullParser m25791a() {
        XmlPullParserFactory xmlPullParserFactory = f19318b;
        if (xmlPullParserFactory != null) {
            return xmlPullParserFactory.newPullParser();
        }
        throw new XmlPullParserException("no XML Pull parser factory");
    }

    /* renamed from: b */
    public static XmlPullParser m25792b(String str) {
        XmlPullParser a = m25791a();
        try {
            a.setInput(new ByteArrayInputStream(str.getBytes("UTF-8")), "UTF-8");
            return a;
        } catch (UnsupportedEncodingException unused) {
            throw new XmlPullParserException("UTF-8: unsupported encoding");
        }
    }

    /* renamed from: c */
    public static String m25793c(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '&') {
                String substring = str.substring(i, Math.min(i + 10, str.length()));
                if (!substring.startsWith("&#") && !substring.startsWith("&lt;") && !substring.startsWith("&gt;") && !substring.startsWith("&amp;") && !substring.startsWith("&apos;") && !substring.startsWith("&quot;")) {
                    sb.append("&amp;");
                    z = true;
                }
            }
            sb.append(charAt);
        }
        if (z) {
            f19317a.warning("fixed badly encoded entities in XML");
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m25794d(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: e */
    public static void m25795e(XmlPullParser xmlPullParser, String str) {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                throw new IOException(String.format("tag '%s' not found", new Object[]{str}));
            } else if (next == 2 && xmlPullParser.getName().equals(str)) {
                return;
            }
        }
    }
}

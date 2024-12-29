package p164h.p257c.p261c;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: h.c.c.d */
public class C11518d {

    /* renamed from: a */
    private static final Logger f22887a = Logger.getLogger(C11518d.class.getName());

    /* renamed from: b */
    static XmlPullParserFactory f22888b;

    static {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            f22888b = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            Logger logger = f22887a;
            logger.severe("cannot create XmlPullParserFactory instance: " + e);
        }
    }

    /* renamed from: a */
    public static XmlPullParser m30247a() {
        XmlPullParserFactory xmlPullParserFactory = f22888b;
        if (xmlPullParserFactory != null) {
            return xmlPullParserFactory.newPullParser();
        }
        throw new XmlPullParserException("no XML Pull parser factory");
    }

    /* renamed from: b */
    public static XmlPullParser m30248b(String str) {
        XmlPullParser a = m30247a();
        try {
            a.setInput(new ByteArrayInputStream(str.getBytes("UTF-8")), "UTF-8");
            return a;
        } catch (UnsupportedEncodingException unused) {
            throw new XmlPullParserException("UTF-8: unsupported encoding");
        }
    }

    /* renamed from: c */
    public static String m30249c(String str) {
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
            f22887a.warning("fixed badly encoded entities in XML");
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m30250d(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: e */
    public static void m30251e(XmlPullParser xmlPullParser, String str) {
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

package com.xiaomi.push;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.xiaomi.push.gc */
public final class C4719gc {

    /* renamed from: a */
    private static int f8248a = 5000;

    /* renamed from: a */
    private static Vector<String> f8249a = new Vector<>();

    /* renamed from: b */
    private static int f8250b = 330000;

    /* renamed from: c */
    private static int f8251c = 600000;

    /* renamed from: d */
    private static int f8252d = 330000;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|34|35|36|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00a6 */
    static {
        /*
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            f8249a = r0
            java.lang.ClassLoader[] r0 = m13990a()     // Catch:{ Exception -> 0x00ab }
            int r1 = r0.length     // Catch:{ Exception -> 0x00ab }
            r2 = 0
        L_0x000d:
            if (r2 >= r1) goto L_0x00af
            r3 = r0[r2]     // Catch:{ Exception -> 0x00ab }
            java.lang.String r4 = "META-INF/smack-config.xml"
            java.util.Enumeration r3 = r3.getResources(r4)     // Catch:{ Exception -> 0x00ab }
        L_0x0017:
            boolean r4 = r3.hasMoreElements()     // Catch:{ Exception -> 0x00ab }
            if (r4 == 0) goto L_0x00a7
            java.lang.Object r4 = r3.nextElement()     // Catch:{ Exception -> 0x00ab }
            java.net.URL r4 = (java.net.URL) r4     // Catch:{ Exception -> 0x00ab }
            r5 = 0
            java.io.InputStream r5 = r4.openStream()     // Catch:{ Exception -> 0x009e }
            org.xmlpull.v1.XmlPullParserFactory r4 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x009e }
            org.xmlpull.v1.XmlPullParser r4 = r4.newPullParser()     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r7 = 1
            r4.setFeature(r6, r7)     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = "UTF-8"
            r4.setInput(r5, r6)     // Catch:{ Exception -> 0x009e }
            int r6 = r4.getEventType()     // Catch:{ Exception -> 0x009e }
        L_0x003f:
            r8 = 2
            if (r6 != r8) goto L_0x0091
            java.lang.String r6 = r4.getName()     // Catch:{ Exception -> 0x009e }
            java.lang.String r8 = "className"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x0052
            m13993a(r4)     // Catch:{ Exception -> 0x009e }
            goto L_0x0091
        L_0x0052:
            java.lang.String r6 = r4.getName()     // Catch:{ Exception -> 0x009e }
            java.lang.String r8 = "packetReplyTimeout"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x0067
            int r6 = f8248a     // Catch:{ Exception -> 0x009e }
            int r6 = m13991a(r4, r6)     // Catch:{ Exception -> 0x009e }
            f8248a = r6     // Catch:{ Exception -> 0x009e }
            goto L_0x0091
        L_0x0067:
            java.lang.String r6 = r4.getName()     // Catch:{ Exception -> 0x009e }
            java.lang.String r8 = "keepAliveInterval"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x007c
            int r6 = f8250b     // Catch:{ Exception -> 0x009e }
            int r6 = m13991a(r4, r6)     // Catch:{ Exception -> 0x009e }
            f8250b = r6     // Catch:{ Exception -> 0x009e }
            goto L_0x0091
        L_0x007c:
            java.lang.String r6 = r4.getName()     // Catch:{ Exception -> 0x009e }
            java.lang.String r8 = "mechName"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x0091
            java.util.Vector<java.lang.String> r6 = f8249a     // Catch:{ Exception -> 0x009e }
            java.lang.String r8 = r4.nextText()     // Catch:{ Exception -> 0x009e }
            r6.add(r8)     // Catch:{ Exception -> 0x009e }
        L_0x0091:
            int r6 = r4.next()     // Catch:{ Exception -> 0x009e }
            if (r6 != r7) goto L_0x003f
        L_0x0097:
            r5.close()     // Catch:{ Exception -> 0x0017 }
            goto L_0x0017
        L_0x009c:
            r0 = move-exception
            goto L_0x00a3
        L_0x009e:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x009c }
            goto L_0x0097
        L_0x00a3:
            r5.close()     // Catch:{ Exception -> 0x00a6 }
        L_0x00a6:
            throw r0     // Catch:{ Exception -> 0x00ab }
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x00ab:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4719gc.<clinit>():void");
    }

    private C4719gc() {
    }

    /* renamed from: a */
    public static int m13990a() {
        return f8250b;
    }

    /* renamed from: a */
    private static int m13991a(XmlPullParser xmlPullParser, int i) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    /* renamed from: a */
    public static String m13992a() {
        return "3.1.0";
    }

    /* renamed from: a */
    private static void m13993a(XmlPullParser xmlPullParser) {
        String nextText = xmlPullParser.nextText();
        try {
            Class.forName(nextText);
        } catch (ClassNotFoundException unused) {
            PrintStream printStream = System.err;
            printStream.println("Error! A startup class specified in smack-config.xml could not be loaded: " + nextText);
        }
    }

    /* renamed from: a */
    private static ClassLoader[] m13994a() {
        ClassLoader[] classLoaderArr = {C4719gc.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* renamed from: b */
    public static int m13995b() {
        return f8251c;
    }
}

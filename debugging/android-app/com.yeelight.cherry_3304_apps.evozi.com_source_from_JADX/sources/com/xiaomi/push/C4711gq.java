package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.xiaomi.push.gq */
public class C4711gq {

    /* renamed from: a */
    private static C4711gq f8901a;

    /* renamed from: a */
    private Map<String, Object> f8902a = new ConcurrentHashMap();

    /* renamed from: b */
    private Map<String, Object> f8903b = new ConcurrentHashMap();

    private C4711gq() {
        mo25234a();
    }

    /* renamed from: a */
    public static synchronized C4711gq mo25234a() {
        C4711gq gqVar;
        synchronized (C4711gq.class) {
            if (f8901a == null) {
                f8901a = new C4711gq();
            }
            gqVar = f8901a;
        }
        return gqVar;
    }

    /* renamed from: a */
    private String mo25233a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(str);
        sb.append("/>");
        if (str != null) {
            sb.append("<");
            sb.append(str2);
            sb.append("/>");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private ClassLoader[] m14445a() {
        ClassLoader[] classLoaderArr = {C4711gq.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* renamed from: a */
    public Object m14446a(String str, String str2) {
        return this.f8902a.get(mo25233a(str, str2));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00ff */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f6 A[SYNTHETIC, Splitter:B:44:0x00f6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m14447a() {
        /*
            r10 = this;
            java.lang.ClassLoader[] r0 = r10.mo25234a()     // Catch:{ Exception -> 0x0104 }
            int r1 = r0.length     // Catch:{ Exception -> 0x0104 }
            r2 = 0
        L_0x0006:
            if (r2 >= r1) goto L_0x0108
            r3 = r0[r2]     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = "META-INF/smack.providers"
            java.util.Enumeration r3 = r3.getResources(r4)     // Catch:{ Exception -> 0x0104 }
        L_0x0010:
            boolean r4 = r3.hasMoreElements()     // Catch:{ Exception -> 0x0104 }
            if (r4 == 0) goto L_0x0100
            java.lang.Object r4 = r3.nextElement()     // Catch:{ Exception -> 0x0104 }
            java.net.URL r4 = (java.net.URL) r4     // Catch:{ Exception -> 0x0104 }
            r5 = 0
            java.io.InputStream r5 = r4.openStream()     // Catch:{ all -> 0x00fb }
            org.xmlpull.v1.XmlPullParserFactory r4 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ all -> 0x00fb }
            org.xmlpull.v1.XmlPullParser r4 = r4.newPullParser()     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r7 = 1
            r4.setFeature(r6, r7)     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = "UTF-8"
            r4.setInput(r5, r6)     // Catch:{ all -> 0x00fb }
            int r6 = r4.getEventType()     // Catch:{ all -> 0x00fb }
        L_0x0038:
            r8 = 2
            if (r6 != r8) goto L_0x00f0
            java.lang.String r6 = r4.getName()     // Catch:{ all -> 0x00fb }
            java.lang.String r8 = "iqProvider"
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x00fb }
            if (r6 == 0) goto L_0x0097
            r4.next()     // Catch:{ all -> 0x00fb }
            r4.next()     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = r4.nextText()     // Catch:{ all -> 0x00fb }
            r4.next()     // Catch:{ all -> 0x00fb }
            r4.next()     // Catch:{ all -> 0x00fb }
            java.lang.String r8 = r4.nextText()     // Catch:{ all -> 0x00fb }
            r4.next()     // Catch:{ all -> 0x00fb }
            r4.next()     // Catch:{ all -> 0x00fb }
            java.lang.String r9 = r4.nextText()     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = r10.mo25233a((java.lang.String) r6, (java.lang.String) r8)     // Catch:{ all -> 0x00fb }
            java.util.Map<java.lang.String, java.lang.Object> r8 = r10.f8903b     // Catch:{ all -> 0x00fb }
            boolean r8 = r8.containsKey(r6)     // Catch:{ all -> 0x00fb }
            if (r8 != 0) goto L_0x00f0
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class<com.xiaomi.push.go> r9 = com.xiaomi.push.C4709go.class
            boolean r9 = r9.isAssignableFrom(r8)     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r9 == 0) goto L_0x0087
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f8903b     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Object r8 = r8.newInstance()     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0083:
            r9.put(r6, r8)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00f0
        L_0x0087:
            java.lang.Class<com.xiaomi.push.gh> r9 = com.xiaomi.push.C4698gh.class
            boolean r9 = r9.isAssignableFrom(r8)     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r9 == 0) goto L_0x00f0
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f8903b     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0083
        L_0x0092:
            r6 = move-exception
        L_0x0093:
            r6.printStackTrace()     // Catch:{ all -> 0x00fb }
            goto L_0x00f0
        L_0x0097:
            java.lang.String r6 = r4.getName()     // Catch:{ all -> 0x00fb }
            java.lang.String r8 = "extensionProvider"
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x00fb }
            if (r6 == 0) goto L_0x00f0
            r4.next()     // Catch:{ all -> 0x00fb }
            r4.next()     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = r4.nextText()     // Catch:{ all -> 0x00fb }
            r4.next()     // Catch:{ all -> 0x00fb }
            r4.next()     // Catch:{ all -> 0x00fb }
            java.lang.String r8 = r4.nextText()     // Catch:{ all -> 0x00fb }
            r4.next()     // Catch:{ all -> 0x00fb }
            r4.next()     // Catch:{ all -> 0x00fb }
            java.lang.String r9 = r4.nextText()     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = r10.mo25233a((java.lang.String) r6, (java.lang.String) r8)     // Catch:{ all -> 0x00fb }
            java.util.Map<java.lang.String, java.lang.Object> r8 = r10.f8902a     // Catch:{ all -> 0x00fb }
            boolean r8 = r8.containsKey(r6)     // Catch:{ all -> 0x00fb }
            if (r8 != 0) goto L_0x00f0
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x00ee }
            java.lang.Class<com.xiaomi.push.gp> r9 = com.xiaomi.push.C4710gp.class
            boolean r9 = r9.isAssignableFrom(r8)     // Catch:{ ClassNotFoundException -> 0x00ee }
            if (r9 == 0) goto L_0x00e3
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f8902a     // Catch:{ ClassNotFoundException -> 0x00ee }
            java.lang.Object r8 = r8.newInstance()     // Catch:{ ClassNotFoundException -> 0x00ee }
        L_0x00df:
            r9.put(r6, r8)     // Catch:{ ClassNotFoundException -> 0x00ee }
            goto L_0x00f0
        L_0x00e3:
            java.lang.Class<com.xiaomi.push.gk> r9 = com.xiaomi.push.C4702gk.class
            boolean r9 = r9.isAssignableFrom(r8)     // Catch:{ ClassNotFoundException -> 0x00ee }
            if (r9 == 0) goto L_0x00f0
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f8902a     // Catch:{ ClassNotFoundException -> 0x00ee }
            goto L_0x00df
        L_0x00ee:
            r6 = move-exception
            goto L_0x0093
        L_0x00f0:
            int r6 = r4.next()     // Catch:{ all -> 0x00fb }
            if (r6 != r7) goto L_0x0038
            r5.close()     // Catch:{ Exception -> 0x0010 }
            goto L_0x0010
        L_0x00fb:
            r0 = move-exception
            r5.close()     // Catch:{ Exception -> 0x00ff }
        L_0x00ff:
            throw r0     // Catch:{ Exception -> 0x0104 }
        L_0x0100:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0104:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4711gq.m14447a():void");
    }

    /* renamed from: a */
    public void mo25235a(String str, String str2, Object obj) {
        if ((obj instanceof C4710gp) || (obj instanceof Class)) {
            this.f8902a.put(mo25233a(str, str2), obj);
            return;
        }
        throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
    }
}

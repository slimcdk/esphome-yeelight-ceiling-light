package org.fourthline.cling.model.message.header;

import com.google.android.gms.stats.CodePackage;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

public abstract class UpnpHeader<T> {

    /* renamed from: b */
    private static final Logger f18533b = Logger.getLogger(UpnpHeader.class.getName());

    /* renamed from: a */
    private T f18534a;

    public enum Type {
        USN("USN", C10042d0.class, C10045f.class, C10062w.class, r5),
        NT("NT", r4, r3, r2, r1, r0, r5, C10054o.class),
        NTS("NTS", C10055p.class),
        HOST("HOST", C10048i.class),
        SERVER("SERVER", C10060u.class),
        LOCATION(CodePackage.LOCATION, C10050k.class),
        MAX_AGE("CACHE-CONTROL", C10053n.class),
        USER_AGENT("USER-AGENT", C10044e0.class),
        CONTENT_TYPE("CONTENT-TYPE", C10041d.class),
        MAN("MAN", C10051l.class),
        MX("MX", C10052m.class),
        ST("ST", C10059t.class, r4, r3, r2, r1, r0, r5),
        EXT("EXT", C10046g.class),
        SOAPACTION("SOAPACTION", C10063x.class),
        TIMEOUT("TIMEOUT", C10065z.class),
        CALLBACK("CALLBACK", C10037b.class),
        SID("SID", C10064y.class),
        SEQ("SEQ", C10047h.class),
        RANGE("RANGE", C10057r.class),
        CONTENT_RANGE("CONTENT-RANGE", C10039c.class),
        PRAGMA("PRAGMA", C10056q.class),
        EXT_IFACE_MAC("X-CLING-IFACE-MAC", C10049j.class),
        EXT_AV_CLIENT_INFO("X-AV-CLIENT-INFO", C10035a.class);
        
        private static Map<String, Type> byName;
        private Class<? extends UpnpHeader>[] headerTypes;
        private String httpName;

        static {
            byName = new HashMap<String, Type>() {
                {
                    for (Type type : Type.values()) {
                        put(type.getHttpName(), type);
                    }
                }
            };
        }

        @SafeVarargs
        private Type(String str, Class<? extends UpnpHeader>... clsArr) {
            this.httpName = str;
            this.headerTypes = clsArr;
        }

        public static Type getByHttpName(String str) {
            if (str == null) {
                return null;
            }
            return byName.get(str.toUpperCase(Locale.ROOT));
        }

        public Class<? extends UpnpHeader>[] getHeaderTypes() {
            return this.headerTypes;
        }

        public String getHttpName() {
            return this.httpName;
        }

        public boolean isValidHeaderType(Class<? extends UpnpHeader> cls) {
            for (Class isAssignableFrom : getHeaderTypes()) {
                if (isAssignableFrom.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        f18533b.finest("Invalid header value for tested type: " + r3.getSimpleName() + " - " + r2.getMessage());
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070 A[ExcHandler: InvalidHeaderException (r2v3 'e' org.fourthline.cling.model.message.header.InvalidHeaderException A[CUSTOM_DECLARE]), Splitter:B:5:0x0012] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.fourthline.cling.model.message.header.UpnpHeader m24914c(org.fourthline.cling.model.message.header.UpnpHeader.Type r7, java.lang.String r8) {
        /*
            r0 = 0
            r1 = 0
            r2 = r0
        L_0x0003:
            java.lang.Class[] r3 = r7.getHeaderTypes()
            int r3 = r3.length
            if (r1 >= r3) goto L_0x009c
            if (r2 != 0) goto L_0x009c
            java.lang.Class[] r3 = r7.getHeaderTypes()
            r3 = r3[r1]
            java.util.logging.Logger r4 = f18533b     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            r5.<init>()     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            java.lang.String r6 = "Trying to parse '"
            r5.append(r6)     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            r5.append(r7)     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            java.lang.String r6 = "' with class: "
            r5.append(r6)     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            java.lang.String r6 = r3.getSimpleName()     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            r5.append(r6)     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            java.lang.String r5 = r5.toString()     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            r4.finest(r5)     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            java.lang.Object r4 = r3.newInstance()     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            org.fourthline.cling.model.message.header.UpnpHeader r4 = (org.fourthline.cling.model.message.header.UpnpHeader) r4     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0042 }
            if (r8 == 0) goto L_0x006e
            r4.mo40450d(r8)     // Catch:{ InvalidHeaderException -> 0x0070, Exception -> 0x0040 }
            goto L_0x006e
        L_0x0040:
            r2 = move-exception
            goto L_0x0045
        L_0x0042:
            r3 = move-exception
            r4 = r2
            r2 = r3
        L_0x0045:
            java.util.logging.Logger r3 = f18533b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Error instantiating header of type '"
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = "' with value: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r3.severe(r5)
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE
            java.lang.Throwable r2 = org.seamless.util.C10243a.m25753a(r2)
            java.lang.String r6 = "Exception root cause: "
            r3.log(r5, r6, r2)
        L_0x006e:
            r2 = r4
            goto L_0x0098
        L_0x0070:
            r2 = move-exception
            java.util.logging.Logger r4 = f18533b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Invalid header value for tested type: "
            r5.append(r6)
            java.lang.String r3 = r3.getSimpleName()
            r5.append(r3)
            java.lang.String r3 = " - "
            r5.append(r3)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.finest(r2)
            r2 = r0
        L_0x0098:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fourthline.cling.model.message.header.UpnpHeader.m24914c(org.fourthline.cling.model.message.header.UpnpHeader$Type, java.lang.String):org.fourthline.cling.model.message.header.UpnpHeader");
    }

    /* renamed from: a */
    public abstract String mo40448a();

    /* renamed from: b */
    public T mo40449b() {
        return this.f18534a;
    }

    /* renamed from: d */
    public abstract void mo40450d(String str);

    /* renamed from: e */
    public void mo40451e(T t) {
        this.f18534a = t;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") '" + mo40449b() + "'";
    }
}

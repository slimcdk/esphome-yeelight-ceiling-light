package p094s0;

import com.google.code.microlog4android.Level;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import p098t0.C3696d;

/* renamed from: s0.b */
public class C3682b implements C3681a {

    /* renamed from: a */
    private String f6205a = "%r %c{1} [%P] %m %T";

    /* renamed from: b */
    private C3696d[] f6206b;

    /* renamed from: c */
    private boolean f6207c = false;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: t0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: t0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: t0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: t0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: t0.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10524c(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.length()
            java.util.Vector r1 = new java.util.Vector
            r2 = 20
            r1.<init>(r2)
            r2 = 0
        L_0x000c:
            r3 = 1
            if (r2 >= r0) goto L_0x00ce
            char r4 = r8.charAt(r2)
            java.lang.String r5 = "%"
            r6 = 37
            if (r4 != r6) goto L_0x00ac
            int r2 = r2 + 1
            char r4 = r8.charAt(r2)
            if (r4 == r6) goto L_0x00a0
            r5 = 80
            if (r4 == r5) goto L_0x009a
            r5 = 84
            if (r4 == r5) goto L_0x0094
            r5 = 105(0x69, float:1.47E-43)
            if (r4 == r5) goto L_0x008e
            r5 = 109(0x6d, float:1.53E-43)
            if (r4 == r5) goto L_0x0088
            r5 = 114(0x72, float:1.6E-43)
            if (r4 == r5) goto L_0x0082
            r5 = 116(0x74, float:1.63E-43)
            if (r4 == r5) goto L_0x007c
            r5 = 99
            if (r4 == r5) goto L_0x0065
            r5 = 100
            if (r4 == r5) goto L_0x004f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unrecognized conversion character "
            r5.append(r6)
            r5.append(r4)
            goto L_0x00a9
        L_0x004f:
            t0.c r4 = new t0.c
            r4.<init>()
            java.lang.String r5 = r7.mo26091b(r8, r2)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x0078
            r4.mo26106b(r5)
        L_0x0061:
            int r2 = r2 + r6
            int r2 = r2 + 2
            goto L_0x0078
        L_0x0065:
            t0.a r4 = new t0.a
            r4.<init>()
            java.lang.String r5 = r7.mo26091b(r8, r2)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x0078
            r4.mo26105b(r5)
            goto L_0x0061
        L_0x0078:
            r1.addElement(r4)
            goto L_0x00a9
        L_0x007c:
            t0.h r4 = new t0.h
            r4.<init>()
            goto L_0x0078
        L_0x0082:
            t0.j r4 = new t0.j
            r4.<init>()
            goto L_0x0078
        L_0x0088:
            t0.e r4 = new t0.e
            r4.<init>()
            goto L_0x0078
        L_0x008e:
            t0.b r4 = new t0.b
            r4.<init>()
            goto L_0x0078
        L_0x0094:
            t0.i r4 = new t0.i
            r4.<init>()
            goto L_0x0078
        L_0x009a:
            t0.g r4 = new t0.g
            r4.<init>()
            goto L_0x0078
        L_0x00a0:
            t0.f r4 = new t0.f
            r4.<init>()
            r4.mo26110b(r5)
            goto L_0x0078
        L_0x00a9:
            int r2 = r2 + r3
            goto L_0x000c
        L_0x00ac:
            int r3 = r8.indexOf(r5, r2)
            r4 = -1
            if (r3 == r4) goto L_0x00b8
            java.lang.String r3 = r8.substring(r2, r3)
            goto L_0x00bc
        L_0x00b8:
            java.lang.String r3 = r8.substring(r2, r0)
        L_0x00bc:
            t0.f r4 = new t0.f
            r4.<init>()
            r4.mo26110b(r3)
            r1.addElement(r4)
            int r3 = r3.length()
            int r2 = r2 + r3
            goto L_0x000c
        L_0x00ce:
            int r8 = r1.size()
            t0.d[] r8 = new p098t0.C3696d[r8]
            r7.f6206b = r8
            r1.copyInto(r8)
            r7.f6207c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p094s0.C3682b.m10524c(java.lang.String):void");
    }

    /* renamed from: a */
    public String mo26090a(String str, String str2, long j, Level level, Object obj, Throwable th) {
        String str3;
        if (!this.f6207c && (str3 = this.f6205a) != null) {
            m10524c(str3);
        }
        StringBuffer stringBuffer = new StringBuffer(64);
        C3696d[] dVarArr = this.f6206b;
        if (dVarArr != null) {
            int length = dVarArr.length;
            for (int i = 0; i < length; i++) {
                C3696d dVar = this.f6206b[i];
                if (dVar != null) {
                    stringBuffer.append(dVar.mo26104a(str, str2, j, level, obj, th));
                }
            }
        }
        return stringBuffer.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo26091b(String str, int i) {
        int indexOf = str.indexOf(123, i);
        int indexOf2 = str.indexOf(SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT, i);
        return (indexOf <= 0 || indexOf2 <= indexOf) ? "" : str.substring(indexOf + 1, indexOf2);
    }
}

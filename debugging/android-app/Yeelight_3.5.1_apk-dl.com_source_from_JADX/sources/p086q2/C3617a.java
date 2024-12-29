package p086q2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.LocalServerSocket;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: q2.a */
public class C3617a {

    /* renamed from: c */
    public static int f6019c;

    /* renamed from: d */
    private static final String[] f6020d;

    /* renamed from: a */
    private final Context f6021a;

    /* renamed from: b */
    private LocalServerSocket f6022b;

    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ab  */
    static {
        /*
            r0 = 44
            java.lang.String[] r0 = new java.lang.String[r0]
            r9 = 8
            r10 = 7
            r11 = 6
            r12 = 4
            java.lang.String r13 = "PF,"
            r14 = 31
            r15 = 35
            r1 = 3
            r2 = 2
            r16 = 5
            java.lang.String r17 = "WV\"s>"
            r18 = 0
            java.lang.String r19 = "pf\fL8LB4"
            r3 = 1
            r20 = -1
            r21 = r17
            r22 = 0
        L_0x0020:
            char[] r4 = r21.toCharArray()
            int r5 = r4.length
            r6 = r5
            r23 = r22
            r7 = 0
            if (r5 > r3) goto L_0x0031
            r5 = r4
            r22 = r20
            r4 = r0
            goto L_0x0291
        L_0x0031:
            r5 = r4
            r22 = r20
            r4 = r0
        L_0x0035:
            if (r6 > r7) goto L_0x0291
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            java.lang.String r5 = r6.intern()
            switch(r22) {
                case 0: goto L_0x0286;
                case 1: goto L_0x027b;
                case 2: goto L_0x026e;
                case 3: goto L_0x0261;
                case 4: goto L_0x0254;
                case 5: goto L_0x0247;
                case 6: goto L_0x023a;
                case 7: goto L_0x022d;
                case 8: goto L_0x0220;
                case 9: goto L_0x0215;
                case 10: goto L_0x0208;
                case 11: goto L_0x01fd;
                case 12: goto L_0x01f2;
                case 13: goto L_0x01e5;
                case 14: goto L_0x01da;
                case 15: goto L_0x01cd;
                case 16: goto L_0x01be;
                case 17: goto L_0x01af;
                case 18: goto L_0x01a0;
                case 19: goto L_0x0191;
                case 20: goto L_0x0182;
                case 21: goto L_0x0173;
                case 22: goto L_0x0164;
                case 23: goto L_0x0155;
                case 24: goto L_0x0146;
                case 25: goto L_0x0137;
                case 26: goto L_0x0128;
                case 27: goto L_0x011b;
                case 28: goto L_0x010e;
                case 29: goto L_0x00ff;
                case 30: goto L_0x00f2;
                case 31: goto L_0x00e3;
                case 32: goto L_0x00d4;
                case 33: goto L_0x00c5;
                case 34: goto L_0x00b8;
                case 35: goto L_0x00a9;
                case 36: goto L_0x009a;
                case 37: goto L_0x008c;
                case 38: goto L_0x007e;
                case 39: goto L_0x0070;
                case 40: goto L_0x0062;
                case 41: goto L_0x0054;
                case 42: goto L_0x004f;
                default: goto L_0x0043;
            }
        L_0x0043:
            r0[r23] = r5
            java.lang.String r0 = "RB%m\""
            r21 = r0
            r0 = r4
            r20 = 0
            r22 = 1
            goto L_0x0020
        L_0x004f:
            r0[r23] = r5
            f6020d = r4
            return
        L_0x0054:
            r0[r23] = r5
            r22 = 43
            r0 = 42
            java.lang.String r5 = "GV4~9BD%"
            r0 = r4
            r21 = r5
            r20 = 42
            goto L_0x0020
        L_0x0062:
            r0[r23] = r5
            r22 = 42
            r0 = 41
            java.lang.String r5 = "GV4~9BD%l"
            r0 = r4
            r21 = r5
            r20 = 41
            goto L_0x0020
        L_0x0070:
            r0[r23] = r5
            r22 = 41
            r0 = 40
            java.lang.String r5 = "\u001fR2m4Q\t||:VD%!g\u0002l\u0003[\u001awv\u001bJ5QR#p<M^:z?\u0003E%n.FD4B\u0006\u001d\u000bo|:VD%!g\fR2m4Q\t"
            r0 = r4
            r21 = r5
            r20 = 40
            goto L_0x0020
        L_0x007e:
            r0[r23] = r5
            r22 = 40
            r0 = 39
            java.lang.String r5 = "PB#|>PD"
            r0 = r4
            r21 = r5
            r20 = 39
            goto L_0x0020
        L_0x008c:
            r0[r23] = r5
            r22 = 39
            r0 = 38
            java.lang.String r5 = "@X,j6MD"
            r0 = r4
            r21 = r5
            r20 = 38
            goto L_0x0020
        L_0x009a:
            r0[r23] = r5
            r22 = 38
            r0 = 37
            java.lang.String r5 = "se\u0001X\u0016b\u00174~9OR\u001fv5EXh"
            r0 = r4
            r21 = r5
            r20 = 37
            goto L_0x0020
        L_0x00a9:
            r0[r23] = r5
            r22 = 37
            r0 = 36
            java.lang.String r5 = "@X,j6M"
            r0 = r4
            r21 = r5
            r20 = 36
            goto L_0x0020
        L_0x00b8:
            r0[r23] = r5
            r22 = 36
            java.lang.String r0 = "MV-z"
            r21 = r0
            r0 = r4
            r20 = 35
            goto L_0x0020
        L_0x00c5:
            r0[r23] = r5
            r0 = 34
            java.lang.String r5 = "WN0z"
            r0 = r4
            r21 = r5
            r20 = 34
            r22 = 35
            goto L_0x0020
        L_0x00d4:
            r0[r23] = r5
            r22 = 34
            r0 = 33
            java.lang.String r5 = "S\\"
            r0 = r4
            r21 = r5
            r20 = 33
            goto L_0x0020
        L_0x00e3:
            r0[r23] = r5
            r22 = 33
            r0 = 32
            java.lang.String r5 = "MX4q.O["
            r0 = r4
            r21 = r5
            r20 = 32
            goto L_0x0020
        L_0x00f2:
            r0[r23] = r5
            r22 = 32
            java.lang.String r0 = "FE2p)"
            r21 = r0
            r0 = r4
            r20 = 31
            goto L_0x0020
        L_0x00ff:
            r0[r23] = r5
            r0 = 30
            java.lang.String r5 = "@V5l>"
            r0 = r4
            r21 = r5
            r20 = 30
            r22 = 31
            goto L_0x0020
        L_0x010e:
            r0[r23] = r5
            r22 = 30
            r0 = 29
            r0 = r4
            r21 = r17
            r20 = 29
            goto L_0x0020
        L_0x011b:
            r0[r23] = r5
            r22 = 29
            r0 = 28
            r0 = r4
            r21 = r17
            r20 = 28
            goto L_0x0020
        L_0x0128:
            r0[r23] = r5
            r22 = 28
            r0 = 27
            java.lang.String r5 = "pr\fZ\u0018w\u0017.~6F\u0017\u0006M\u0014n\u00173n7JC%@6BD4z)\u0003`\bZ\tf\u00174f+F\n"
            r0 = r4
            r21 = r5
            r20 = 27
            goto L_0x0020
        L_0x0137:
            r0[r23] = r5
            r22 = 27
            r0 = 26
            java.lang.String r5 = "WV\"s>P"
            r0 = r4
            r21 = r5
            r20 = 26
            goto L_0x0020
        L_0x0146:
            r0[r23] = r5
            r22 = 26
            r0 = 25
            java.lang.String r5 = "UV,j>"
            r0 = r4
            r21 = r5
            r20 = 25
            goto L_0x0020
        L_0x0155:
            r0[r23] = r5
            r22 = 25
            r0 = 24
            java.lang.String r5 = "QX7"
            r0 = r4
            r21 = r5
            r20 = 24
            goto L_0x0020
        L_0x0164:
            r0[r23] = r5
            r22 = 24
            r0 = 23
            java.lang.String r5 = "QX7l"
            r0 = r4
            r21 = r5
            r20 = 23
            goto L_0x0020
        L_0x0173:
            r0[r23] = r5
            r22 = 23
            r0 = 22
            java.lang.String r5 = "@X,j6MD"
            r0 = r4
            r21 = r5
            r20 = 22
            goto L_0x0020
        L_0x0182:
            r0[r23] = r5
            r22 = 22
            r0 = 21
            java.lang.String r5 = "MV-z"
            r0 = r4
            r21 = r5
            r20 = 21
            goto L_0x0020
        L_0x0191:
            r0[r23] = r5
            r22 = 21
            r0 = 20
            java.lang.String r5 = "WN0z"
            r0 = r4
            r21 = r5
            r20 = 20
            goto L_0x0020
        L_0x01a0:
            r0[r23] = r5
            r22 = 20
            r0 = 19
            java.lang.String r5 = "RB%m\"\u000eE%l.OC"
            r0 = r4
            r21 = r5
            r20 = 19
            goto L_0x0020
        L_0x01af:
            r0[r23] = r5
            r22 = 19
            r0 = 18
            java.lang.String r5 = "@X,j6M"
            r0 = r4
            r21 = r5
            r20 = 18
            goto L_0x0020
        L_0x01be:
            r0[r23] = r5
            r22 = 18
            r0 = 17
            java.lang.String r5 = "vc\u00062c"
            r0 = r4
            r21 = r5
            r20 = 17
            goto L_0x0020
        L_0x01cd:
            r0[r23] = r5
            r22 = 17
            java.lang.String r0 = "eV)s>G\u00174p{PC!m/\u0003d\u0011S\b@X5k{pR2i>Q\u00177v/K\u0017.~6F\u0017g:j\u0007Dg1"
            r21 = r0
            r0 = r4
            r20 = 16
            goto L_0x0020
        L_0x01da:
            r0[r23] = r5
            r0 = r4
            r21 = r19
            r20 = 15
            r22 = 16
            goto L_0x0020
        L_0x01e5:
            r0[r23] = r5
            java.lang.String r0 = "pC!m/JY'?\br{\u0013|4VC`L>QA%m{T^4w{MV-z{\u0004\u0012q;(\u0004"
            r21 = r0
            r0 = r4
            r20 = 14
            r22 = 15
            goto L_0x0020
        L_0x01f2:
            r0[r23] = r5
            r0 = r4
            r21 = r19
            r20 = 13
            r22 = 14
            goto L_0x0020
        L_0x01fd:
            r0[r23] = r5
            r0 = r4
            r21 = r19
            r20 = 12
            r22 = 13
            goto L_0x0020
        L_0x0208:
            r0[r23] = r5
            java.lang.String r0 = "@X-12GR3|4VCnl*O^4zu"
            r21 = r0
            r0 = r4
            r20 = 11
            r22 = 12
            goto L_0x0020
        L_0x0215:
            r0[r23] = r5
            r0 = r4
            r21 = r19
            r20 = 10
            r22 = 11
            goto L_0x0020
        L_0x0220:
            r0[r23] = r5
            java.lang.String r0 = "eV4~7\u0003R2m4Q\u00173k:QC)q<\u0003D%m-FE"
            r21 = r0
            r0 = r4
            r20 = 9
            r22 = 10
            goto L_0x0020
        L_0x022d:
            r0[r23] = r5
            java.lang.String r0 = "GU"
            r21 = r0
            r0 = r4
            r20 = 8
            r22 = 9
            goto L_0x0020
        L_0x023a:
            r0[r23] = r5
            java.lang.String r0 = "VG$~/F\u001a2z(V[4"
            r21 = r0
            r0 = r4
            r20 = 7
            r22 = 8
            goto L_0x0020
        L_0x0247:
            r0[r23] = r5
            java.lang.String r0 = "\u001fR2m4Q\t||:VD%!g\u0002l\u0003[\u001awv\u001bJ5FO0z8WR$?>QE/m\u0006~\t|08BB3ze\u001f\u0018%m)LE~"
            r21 = r0
            r0 = r4
            r20 = 6
            r22 = 7
            goto L_0x0020
        L_0x0254:
            r0[r23] = r5
            java.lang.String r0 = "JS"
            r21 = r0
            r0 = r4
            r20 = 5
            r22 = 6
            goto L_0x0020
        L_0x0261:
            r0[r23] = r5
            java.lang.String r0 = "QR1j>PC"
            r21 = r0
            r0 = r4
            r20 = 4
            r22 = 5
            goto L_0x0020
        L_0x026e:
            r0[r23] = r5
            java.lang.String r0 = "QR3o4MD%"
            r21 = r0
            r0 = r4
            r20 = 3
            r22 = 4
            goto L_0x0020
        L_0x027b:
            r0[r23] = r5
            r0 = r4
            r21 = r13
            r20 = 2
            r22 = 3
            goto L_0x0020
        L_0x0286:
            r0[r23] = r5
            r0 = r4
            r21 = r13
            r20 = 1
            r22 = 2
            goto L_0x0020
        L_0x0291:
            r24 = r7
        L_0x0293:
            char r25 = r5[r7]
            int r8 = r24 % 5
            if (r8 == 0) goto L_0x02ab
            if (r8 == r3) goto L_0x02a8
            if (r8 == r2) goto L_0x02a5
            if (r8 == r1) goto L_0x02a2
            r8 = 91
            goto L_0x02ad
        L_0x02a2:
            r8 = 31
            goto L_0x02ad
        L_0x02a5:
            r8 = 64
            goto L_0x02ad
        L_0x02a8:
            r8 = 55
            goto L_0x02ad
        L_0x02ab:
            r8 = 35
        L_0x02ad:
            r8 = r25 ^ r8
            char r8 = (char) r8
            r5[r7] = r8
            int r24 = r24 + 1
            if (r6 != 0) goto L_0x02b8
            r7 = r6
            goto L_0x0293
        L_0x02b8:
            r7 = r24
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3617a.<clinit>():void");
    }

    private C3617a(@NonNull Context context, @NonNull String str) {
        this.f6021a = context;
        StringBuilder sb = new StringBuilder();
        String[] strArr = f6020d;
        sb.append(strArr[12]);
        sb.append(str);
        String sb2 = sb.toString();
        try {
            this.f6022b = new LocalServerSocket(sb2);
            String str2 = strArr[16];
            int i = 4;
            if (C3619c.f6023c == 0) {
                if (Log.isLoggable(str2, 4)) {
                    str2 = strArr[15];
                    i = 1;
                }
                m10286l();
            }
            try {
                Object[] objArr = new Object[i];
                objArr[0] = sb2;
                String.format(str2, objArr);
                String str3 = strArr[13];
            } catch (IOException unused) {
                String[] strArr2 = f6020d;
                String.format(strArr2[17], new Object[]{str});
                String str4 = strArr2[14];
            }
            m10286l();
        } catch (IOException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        }
    }

    @NonNull
    /* renamed from: A */
    private static Element m10273A() {
        Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element createElement = newDocument.createElement(f6020d[4]);
        newDocument.appendChild(createElement);
        return createElement;
    }

    @NonNull
    /* renamed from: B */
    private String m10274B() {
        return f6020d[41];
    }

    /* renamed from: a */
    private SQLiteStatement m10275a(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull String str, @Nullable Node node) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        if (node != null) {
            m10287m(compileStatement, node);
        }
        return compileStatement;
    }

    /* renamed from: b */
    static LocalServerSocket m10276b(C3617a aVar) {
        return aVar.f6022b;
    }

    /* renamed from: c */
    static LocalServerSocket m10277c(C3617a aVar, LocalServerSocket localServerSocket) {
        aVar.f6022b = localServerSocket;
        return localServerSocket;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0114, code lost:
        if (r0 == 0) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x011a, code lost:
        return m10292r(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x011b, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x011c, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x011d, code lost:
        if (r0 == 0) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r0 != 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        if (r0 != 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0091, code lost:
        if (r11.getLength() >= 4) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a1, code lost:
        if (r0 != 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cb, code lost:
        if (r11.getLength() >= 4) goto L_0x00d2;
     */
    @androidx.annotation.NonNull
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10278d(int r10, @androidx.annotation.NonNull org.w3c.dom.Element r11) {
        /*
            r9 = this;
            int r0 = p086q2.C3619c.f6023c
            org.w3c.dom.NodeList r11 = r11.getChildNodes()
            java.lang.String r1 = r9.m10284j(r11)
            if (r1 == 0) goto L_0x011f
            r2 = 4
            r3 = 0
            r4 = 0
            r5 = 3
            r6 = 2
            switch(r10) {
                case 1: goto L_0x00f1;
                case 2: goto L_0x0116;
                case 3: goto L_0x0016;
                case 4: goto L_0x003c;
                case 5: goto L_0x0069;
                case 6: goto L_0x00a3;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x011d
        L_0x0016:
            org.w3c.dom.Node r7 = r11.item(r6)
            java.lang.String[] r8 = f6020d     // Catch:{ TransformerException -> 0x00ed }
            r4 = r8[r4]     // Catch:{ TransformerException -> 0x00ed }
            if (r0 != 0) goto L_0x002e
            java.lang.String r8 = r7.getNodeName()     // Catch:{ TransformerException -> 0x00ed }
            boolean r4 = r4.equals(r8)     // Catch:{ TransformerException -> 0x00ed }
            if (r4 == 0) goto L_0x011d
            java.lang.String r4 = r9.m10283i(r7)     // Catch:{ TransformerException -> 0x00ef }
        L_0x002e:
            if (r0 != 0) goto L_0x00ec
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = r9.m10280f(r1, r4)     // Catch:{ TransformerException -> 0x0038 }
            goto L_0x00ec
        L_0x0038:
            r10 = move-exception
            throw r10
        L_0x003a:
            if (r0 == 0) goto L_0x011d
        L_0x003c:
            org.w3c.dom.Node r4 = r11.item(r6)
            java.lang.String[] r7 = f6020d     // Catch:{ TransformerException -> 0x00e8 }
            r8 = 1
            r7 = r7[r8]     // Catch:{ TransformerException -> 0x00e8 }
            if (r0 != 0) goto L_0x0055
            java.lang.String r8 = r4.getNodeName()     // Catch:{ TransformerException -> 0x00e8 }
            boolean r7 = r7.equals(r8)     // Catch:{ TransformerException -> 0x00e8 }
            if (r7 == 0) goto L_0x011d
            java.lang.String r7 = r9.m10283i(r4)     // Catch:{ TransformerException -> 0x00ea }
        L_0x0055:
            if (r0 != 0) goto L_0x0059
            if (r7 == 0) goto L_0x0067
        L_0x0059:
            if (r0 != 0) goto L_0x00e7
            boolean r4 = r7.isEmpty()     // Catch:{ TransformerException -> 0x00e3 }
            if (r4 != 0) goto L_0x0067
            java.lang.String r7 = r9.m10293s(r1, r7)     // Catch:{ TransformerException -> 0x00e5 }
            goto L_0x00e7
        L_0x0067:
            if (r0 == 0) goto L_0x011d
        L_0x0069:
            org.w3c.dom.Node r4 = r11.item(r6)
            java.lang.String[] r7 = f6020d     // Catch:{ TransformerException -> 0x00df }
            r7 = r7[r5]     // Catch:{ TransformerException -> 0x00df }
            if (r0 != 0) goto L_0x0081
            java.lang.String r8 = r4.getNodeName()     // Catch:{ TransformerException -> 0x00df }
            boolean r7 = r7.equals(r8)     // Catch:{ TransformerException -> 0x00df }
            if (r7 == 0) goto L_0x011d
            java.lang.String r7 = r9.m10283i(r4)     // Catch:{ TransformerException -> 0x00e1 }
        L_0x0081:
            if (r0 != 0) goto L_0x0085
            if (r7 == 0) goto L_0x00a1
        L_0x0085:
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x00a1
            if (r0 != 0) goto L_0x0098
            int r10 = r11.getLength()     // Catch:{ TransformerException -> 0x0094 }
            if (r10 < r2) goto L_0x009c
            goto L_0x0098
        L_0x0094:
            r10 = move-exception
            throw r10     // Catch:{ TransformerException -> 0x0096 }
        L_0x0096:
            r10 = move-exception
            throw r10
        L_0x0098:
            org.w3c.dom.Node r3 = r11.item(r5)
        L_0x009c:
            java.lang.String r10 = r9.m10281g(r1, r7, r3)
            return r10
        L_0x00a1:
            if (r0 == 0) goto L_0x011d
        L_0x00a3:
            org.w3c.dom.Node r4 = r11.item(r6)
            java.lang.String[] r7 = f6020d     // Catch:{ TransformerException -> 0x00db }
            r6 = r7[r6]     // Catch:{ TransformerException -> 0x00db }
            if (r0 != 0) goto L_0x00bb
            java.lang.String r7 = r4.getNodeName()     // Catch:{ TransformerException -> 0x00db }
            boolean r6 = r6.equals(r7)     // Catch:{ TransformerException -> 0x00db }
            if (r6 == 0) goto L_0x011d
            java.lang.String r6 = r9.m10283i(r4)     // Catch:{ TransformerException -> 0x00dd }
        L_0x00bb:
            if (r0 != 0) goto L_0x00bf
            if (r6 == 0) goto L_0x011d
        L_0x00bf:
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L_0x011d
            if (r0 != 0) goto L_0x00d2
            int r10 = r11.getLength()     // Catch:{ TransformerException -> 0x00ce }
            if (r10 < r2) goto L_0x00d6
            goto L_0x00d2
        L_0x00ce:
            r10 = move-exception
            throw r10     // Catch:{ TransformerException -> 0x00d0 }
        L_0x00d0:
            r10 = move-exception
            throw r10
        L_0x00d2:
            org.w3c.dom.Node r3 = r11.item(r5)
        L_0x00d6:
            java.lang.String r10 = r9.m10294t(r1, r6, r3)
            return r10
        L_0x00db:
            r10 = move-exception
            throw r10     // Catch:{ TransformerException -> 0x00dd }
        L_0x00dd:
            r10 = move-exception
            throw r10
        L_0x00df:
            r10 = move-exception
            throw r10     // Catch:{ TransformerException -> 0x00e1 }
        L_0x00e1:
            r10 = move-exception
            throw r10
        L_0x00e3:
            r10 = move-exception
            throw r10     // Catch:{ TransformerException -> 0x00e5 }
        L_0x00e5:
            r10 = move-exception
            throw r10
        L_0x00e7:
            return r7
        L_0x00e8:
            r10 = move-exception
            throw r10     // Catch:{ TransformerException -> 0x00ea }
        L_0x00ea:
            r10 = move-exception
            throw r10
        L_0x00ec:
            return r4
        L_0x00ed:
            r10 = move-exception
            throw r10     // Catch:{ TransformerException -> 0x00ef }
        L_0x00ef:
            r10 = move-exception
            throw r10
        L_0x00f1:
            android.content.Context r11 = r9.f6021a
            java.lang.String[] r11 = r11.databaseList()
            int r2 = r11.length
        L_0x00f8:
            if (r4 >= r2) goto L_0x0114
            r3 = r11[r4]
            if (r0 != 0) goto L_0x0112
            if (r0 != 0) goto L_0x0126
            boolean r3 = r3.equals(r1)     // Catch:{ TransformerException -> 0x010e }
            if (r3 == 0) goto L_0x010b
            java.lang.String r10 = r9.m10291q()     // Catch:{ TransformerException -> 0x0110 }
            return r10
        L_0x010b:
            int r4 = r4 + 1
            goto L_0x0112
        L_0x010e:
            r10 = move-exception
            throw r10     // Catch:{ TransformerException -> 0x0110 }
        L_0x0110:
            r10 = move-exception
            throw r10
        L_0x0112:
            if (r0 == 0) goto L_0x00f8
        L_0x0114:
            if (r0 == 0) goto L_0x011d
        L_0x0116:
            java.lang.String r10 = r9.m10292r(r1)     // Catch:{ TransformerException -> 0x011b }
            return r10
        L_0x011b:
            r10 = move-exception
            throw r10
        L_0x011d:
            if (r0 == 0) goto L_0x0122
        L_0x011f:
            r11 = 7
            if (r10 == r11) goto L_0x0127
        L_0x0122:
            java.lang.String r3 = r9.m10274B()
        L_0x0126:
            return r3
        L_0x0127:
            java.lang.String r10 = r9.m10299y()     // Catch:{ TransformerException -> 0x012c }
            return r10
        L_0x012c:
            r10 = move-exception
            goto L_0x012f
        L_0x012e:
            throw r10
        L_0x012f:
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3617a.m10278d(int, org.w3c.dom.Element):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:33|34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0 = f6020d[7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        m10290p(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        m10290p(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007e */
    @androidx.annotation.NonNull
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10279e(@androidx.annotation.NonNull java.lang.String r8) {
        /*
            r7 = this;
            int r0 = p086q2.C3619c.f6023c
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r8)
            r8 = 1
            r2 = 0
            javax.xml.parsers.DocumentBuilderFactory r3 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch:{ all -> 0x006d }
            javax.xml.parsers.DocumentBuilder r3 = r3.newDocumentBuilder()     // Catch:{ all -> 0x006d }
            org.xml.sax.InputSource r4 = new org.xml.sax.InputSource     // Catch:{ all -> 0x006d }
            r4.<init>(r1)     // Catch:{ all -> 0x006d }
            org.w3c.dom.Document r3 = r3.parse(r4)     // Catch:{ all -> 0x006d }
            org.w3c.dom.Element r3 = r3.getDocumentElement()     // Catch:{ all -> 0x006d }
            java.lang.String[] r4 = f6020d     // Catch:{ all -> 0x006b }
            r5 = 5
            r5 = r4[r5]     // Catch:{ all -> 0x006b }
            java.lang.String r6 = r3.getNodeName()     // Catch:{ all -> 0x006b }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x005e
            if (r5 == 0) goto L_0x005f
            org.w3c.dom.NodeList r5 = r3.getChildNodes()     // Catch:{ all -> 0x006d }
            org.w3c.dom.Node r5 = r5.item(r2)     // Catch:{ all -> 0x006d }
            r6 = 6
            r4 = r4[r6]     // Catch:{ all -> 0x005c }
            java.lang.String r6 = r5.getNodeName()     // Catch:{ all -> 0x005c }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x005a
            if (r4 == 0) goto L_0x005f
            java.lang.String r0 = r5.getTextContent()     // Catch:{ all -> 0x006d }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r7.m10278d(r0, r3)     // Catch:{ all -> 0x006d }
            java.io.Closeable[] r8 = new java.io.Closeable[r8]
            r8[r2] = r1
            m10290p(r8)
            return r0
        L_0x005a:
            r8 = r4
            goto L_0x005f
        L_0x005c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006d }
        L_0x005e:
            r8 = r5
        L_0x005f:
            java.io.Closeable[] r8 = new java.io.Closeable[r8]
            r8[r2] = r1
            m10290p(r8)
            java.lang.String r8 = r7.m10274B()
            return r8
        L_0x006b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r7.m10300z(r0)     // Catch:{ all -> 0x007e }
            java.io.Closeable[] r8 = new java.io.Closeable[r8]
            r8[r2] = r1
            m10290p(r8)
            return r0
        L_0x007e:
            java.lang.String[] r0 = f6020d     // Catch:{ all -> 0x008b }
            r3 = 7
            r0 = r0[r3]     // Catch:{ all -> 0x008b }
            java.io.Closeable[] r8 = new java.io.Closeable[r8]
            r8[r2] = r1
            m10290p(r8)
            return r0
        L_0x008b:
            r0 = move-exception
            java.io.Closeable[] r8 = new java.io.Closeable[r8]
            r8[r2] = r1
            m10290p(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3617a.m10279e(java.lang.String):java.lang.String");
    }

    @NonNull
    /* renamed from: f */
    private String m10280f(@NonNull String str, @NonNull String str2) {
        Element A = m10273A();
        Document ownerDocument = A.getOwnerDocument();
        m10288n(str, str2, A);
        return m10282h(ownerDocument);
    }

    /* JADX INFO: finally extract failed */
    @NonNull
    /* renamed from: g */
    private String m10281g(@NonNull String str, @NonNull String str2, @Nullable Node node) {
        Element A = m10273A();
        Document ownerDocument = A.getOwnerDocument();
        SQLiteDatabase v = m10296v(str);
        try {
            m10289o(A, m10275a(v, str2, node).executeInsert());
            v.close();
            return m10282h(ownerDocument);
        } catch (Throwable th) {
            v.close();
            throw th;
        }
    }

    @NonNull
    /* renamed from: h */
    private String m10282h(@NonNull Document document) {
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        StringWriter stringWriter = new StringWriter();
        newTransformer.transform(new DOMSource(document), new StreamResult(stringWriter));
        return stringWriter.toString();
    }

    @Nullable
    /* renamed from: i */
    private String m10283i(@NonNull Node node) {
        Node firstChild = node.getFirstChild();
        if (C3619c.f6023c != 0 || (firstChild instanceof CDATASection)) {
            return ((CDATASection) firstChild).getTextContent();
        }
        return null;
    }

    @Nullable
    /* renamed from: j */
    private String m10284j(@NonNull NodeList nodeList) {
        int i = C3619c.f6023c;
        Node item = nodeList.item(1);
        if (item == null) {
            return null;
        }
        String str = f6020d[9];
        if (i == 0) {
            if (!str.equals(item.getNodeName())) {
                return null;
            }
            str = m10283i(item);
        }
        if (i == 0 && str == null) {
            return null;
        }
        return str;
    }

    /* renamed from: k */
    static String m10285k(C3617a aVar, String str) {
        return aVar.m10279e(str);
    }

    /* renamed from: l */
    private void m10286l() {
        try {
            new Thread(new C3620d(this, (C3618b) null)).start();
        } catch (Throwable unused) {
            String[] strArr = f6020d;
            String str = strArr[11];
            String str2 = strArr[10];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r4 != 4) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10287m(@androidx.annotation.NonNull android.database.sqlite.SQLiteStatement r9, @androidx.annotation.NonNull org.w3c.dom.Node r10) {
        /*
            r8 = this;
            int r0 = p086q2.C3619c.f6023c
            org.w3c.dom.NodeList r10 = r10.getChildNodes()
            int r1 = r10.getLength()
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0069
            org.w3c.dom.Node r4 = r10.item(r3)
            org.w3c.dom.NodeList r4 = r4.getChildNodes()
            org.w3c.dom.Node r5 = r4.item(r2)
            java.lang.String r5 = r8.m10283i(r5)
            if (r0 != 0) goto L_0x0024
            if (r5 != 0) goto L_0x0024
            java.lang.String r5 = ""
        L_0x0024:
            r6 = 1
            org.w3c.dom.Node r4 = r4.item(r6)
            java.lang.String r4 = r4.getTextContent()
            int r4 = java.lang.Integer.parseInt(r4)
            int r3 = r3 + 1
            if (r0 != 0) goto L_0x0043
            if (r4 == 0) goto L_0x0040
            if (r4 == r6) goto L_0x004e
            r6 = 2
            if (r4 == r6) goto L_0x0045
            r6 = 4
            if (r4 == r6) goto L_0x0057
            goto L_0x0064
        L_0x0040:
            r9.bindNull(r3)
        L_0x0043:
            if (r0 == 0) goto L_0x0067
        L_0x0045:
            double r6 = java.lang.Double.parseDouble(r5)
            r9.bindDouble(r3, r6)
            if (r0 == 0) goto L_0x0067
        L_0x004e:
            long r6 = java.lang.Long.parseLong(r5)
            r9.bindLong(r3, r6)
            if (r0 == 0) goto L_0x0067
        L_0x0057:
            java.nio.charset.Charset r4 = r8.m10297w()
            byte[] r4 = r5.getBytes(r4)
            r9.bindBlob(r3, r4)
            if (r0 == 0) goto L_0x0067
        L_0x0064:
            r9.bindString(r3, r5)
        L_0x0067:
            if (r0 == 0) goto L_0x000c
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3617a.m10287m(android.database.sqlite.SQLiteStatement, org.w3c.dom.Node):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8.close();
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10288n(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.NonNull java.lang.String r8, @androidx.annotation.NonNull org.w3c.dom.Element r9) {
        /*
            r6 = this;
            int r0 = p086q2.C3619c.f6023c
            org.w3c.dom.Document r1 = r9.getOwnerDocument()
            java.lang.String[] r2 = f6020d
            r3 = 39
            r3 = r2[r3]
            org.w3c.dom.Element r3 = r1.createElement(r3)
            r9.appendChild(r3)
            android.database.sqlite.SQLiteDatabase r7 = r6.m10296v(r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r9.<init>()     // Catch:{ all -> 0x00b3 }
            r4 = 38
            r2 = r2[r4]     // Catch:{ all -> 0x00b3 }
            r9.append(r2)     // Catch:{ all -> 0x00b3 }
            r9.append(r8)     // Catch:{ all -> 0x00b3 }
            java.lang.String r8 = ")"
            r9.append(r8)     // Catch:{ all -> 0x00b3 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00b3 }
            r9 = 0
            android.database.Cursor r8 = r7.rawQuery(r8, r9)     // Catch:{ all -> 0x00b3 }
        L_0x0034:
            boolean r9 = r8.moveToNext()     // Catch:{ all -> 0x00ae }
            if (r9 == 0) goto L_0x00a7
            java.lang.String[] r9 = f6020d     // Catch:{ all -> 0x00ae }
            r2 = 37
            r2 = r9[r2]     // Catch:{ all -> 0x00ae }
            org.w3c.dom.Element r2 = r1.createElement(r2)     // Catch:{ all -> 0x00ae }
            r3.appendChild(r2)     // Catch:{ all -> 0x00ae }
            r4 = 36
            r4 = r9[r4]     // Catch:{ all -> 0x00ae }
            org.w3c.dom.Element r4 = r1.createElement(r4)     // Catch:{ all -> 0x00ae }
            r2.appendChild(r4)     // Catch:{ all -> 0x00ae }
            r5 = 1
            java.lang.String r5 = r8.getString(r5)     // Catch:{ all -> 0x00ae }
            org.w3c.dom.CDATASection r5 = r1.createCDATASection(r5)     // Catch:{ all -> 0x00ae }
            r4.appendChild(r5)     // Catch:{ all -> 0x00ae }
            r4 = 35
            r4 = r9[r4]     // Catch:{ all -> 0x00ae }
            org.w3c.dom.Element r4 = r1.createElement(r4)     // Catch:{ all -> 0x00ae }
            r2.appendChild(r4)     // Catch:{ all -> 0x00ae }
            r5 = 2
            java.lang.String r5 = r8.getString(r5)     // Catch:{ all -> 0x00ae }
            org.w3c.dom.CDATASection r5 = r1.createCDATASection(r5)     // Catch:{ all -> 0x00ae }
            r4.appendChild(r5)     // Catch:{ all -> 0x00ae }
            r4 = 33
            r4 = r9[r4]     // Catch:{ all -> 0x00ae }
            org.w3c.dom.Element r4 = r1.createElement(r4)     // Catch:{ all -> 0x00ae }
            r2.appendChild(r4)     // Catch:{ all -> 0x00ae }
            r5 = 3
            java.lang.String r5 = r8.getString(r5)     // Catch:{ all -> 0x00ae }
            org.w3c.dom.Text r5 = r1.createTextNode(r5)     // Catch:{ all -> 0x00ae }
            r4.appendChild(r5)     // Catch:{ all -> 0x00ae }
            r4 = 34
            r9 = r9[r4]     // Catch:{ all -> 0x00ae }
            org.w3c.dom.Element r9 = r1.createElement(r9)     // Catch:{ all -> 0x00ae }
            r2.appendChild(r9)     // Catch:{ all -> 0x00ae }
            r2 = 5
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x00ae }
            org.w3c.dom.Text r2 = r1.createTextNode(r2)     // Catch:{ all -> 0x00ae }
            r9.appendChild(r2)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00aa
            if (r0 == 0) goto L_0x0034
        L_0x00a7:
            r8.close()     // Catch:{ all -> 0x00b3 }
        L_0x00aa:
            r7.close()
            return
        L_0x00ae:
            r9 = move-exception
            r8.close()     // Catch:{ all -> 0x00b3 }
            throw r9     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r8 = move-exception
            r7.close()
            goto L_0x00b9
        L_0x00b8:
            throw r8
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3617a.m10288n(java.lang.String, java.lang.String, org.w3c.dom.Element):void");
    }

    /* renamed from: o */
    private void m10289o(Element element, long j) {
        Document ownerDocument = element.getOwnerDocument();
        Element createElement = ownerDocument.createElement(f6020d[8]);
        element.appendChild(createElement);
        createElement.appendChild(ownerDocument.createTextNode(String.valueOf(j)));
    }

    /* renamed from: p */
    private static void m10290p(@NonNull Closeable... closeableArr) {
        int i = C3619c.f6023c;
        int length = closeableArr.length;
        int i2 = 0;
        while (i2 < length) {
            Closeable closeable = closeableArr[i2];
            if (i == 0) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
                i2++;
                continue;
            }
            if (i != 0) {
                return;
            }
        }
    }

    @NonNull
    /* renamed from: q */
    private String m10291q() {
        Element A = m10273A();
        Document ownerDocument = A.getOwnerDocument();
        A.appendChild(ownerDocument.createElement(f6020d[40]));
        return m10282h(ownerDocument);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    @androidx.annotation.NonNull
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10292r(@androidx.annotation.NonNull java.lang.String r9) {
        /*
            r8 = this;
            int r0 = p086q2.C3619c.f6023c
            org.w3c.dom.Element r1 = m10273A()
            org.w3c.dom.Document r2 = r1.getOwnerDocument()
            java.lang.String[] r3 = f6020d
            r4 = 27
            r4 = r3[r4]
            org.w3c.dom.Element r4 = r2.createElement(r4)
            r1.appendChild(r4)
            android.database.sqlite.SQLiteDatabase r9 = r8.m10296v(r9)
            r1 = 28
            r1 = r3[r1]     // Catch:{ all -> 0x0062 }
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x0062 }
            r6 = 30
            r3 = r3[r6]     // Catch:{ all -> 0x0062 }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x0062 }
            android.database.Cursor r1 = r9.rawQuery(r1, r5)     // Catch:{ all -> 0x0062 }
        L_0x002d:
            boolean r3 = r1.moveToNext()     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = r1.getString(r6)     // Catch:{ all -> 0x005d }
            java.lang.String[] r5 = f6020d     // Catch:{ all -> 0x005d }
            r7 = 29
            r5 = r5[r7]     // Catch:{ all -> 0x005d }
            org.w3c.dom.Element r5 = r2.createElement(r5)     // Catch:{ all -> 0x005d }
            r4.appendChild(r5)     // Catch:{ ParserConfigurationException -> 0x0050 }
            org.w3c.dom.CDATASection r3 = r2.createCDATASection(r3)     // Catch:{ ParserConfigurationException -> 0x0050 }
            r5.appendChild(r3)     // Catch:{ ParserConfigurationException -> 0x0050 }
            if (r0 != 0) goto L_0x0055
            if (r0 == 0) goto L_0x002d
            goto L_0x0052
        L_0x0050:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005d }
        L_0x0052:
            r1.close()     // Catch:{ all -> 0x0062 }
        L_0x0055:
            r9.close()
            java.lang.String r9 = r8.m10282h(r2)
            return r9
        L_0x005d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            r9.close()
            goto L_0x0068
        L_0x0067:
            throw r0
        L_0x0068:
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3617a.m10292r(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        r10 = r2.createElement(f6020d[24]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (r12 != 4) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        if (r0 != 0) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        r15 = r5.getString(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e4 A[EDGE_INSN: B:63:0x00e4->B:43:0x00e4 ?: BREAK  , SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10293s(@androidx.annotation.NonNull java.lang.String r17, @androidx.annotation.NonNull java.lang.String r18) {
        /*
            r16 = this;
            int r0 = p086q2.C3619c.f6023c
            org.w3c.dom.Element r1 = m10273A()
            org.w3c.dom.Document r2 = r1.getOwnerDocument()
            java.lang.String[] r3 = f6020d
            r4 = 20
            r4 = r3[r4]
            org.w3c.dom.Element r4 = r2.createElement(r4)
            r1.appendChild(r4)
            r1 = 23
            r1 = r3[r1]
            org.w3c.dom.Element r1 = r2.createElement(r1)
            r4.appendChild(r1)
            android.database.sqlite.SQLiteDatabase r3 = r16.m10296v(r17)
            r5 = 0
            r6 = r18
            android.database.Cursor r5 = r3.rawQuery(r6, r5)     // Catch:{ all -> 0x00fc }
            java.lang.String[] r6 = r5.getColumnNames()     // Catch:{ all -> 0x00fc }
            int r7 = r5.getColumnCount()     // Catch:{ all -> 0x00fc }
            r9 = 0
        L_0x0036:
            if (r9 >= r7) goto L_0x0057
            java.lang.String[] r10 = f6020d     // Catch:{ all -> 0x00fc }
            r11 = 22
            r10 = r10[r11]     // Catch:{ all -> 0x00fc }
            org.w3c.dom.Element r10 = r2.createElement(r10)     // Catch:{ all -> 0x00fc }
            r1.appendChild(r10)     // Catch:{ all -> 0x00fc }
            r11 = r6[r9]     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x0061
            org.w3c.dom.CDATASection r11 = r2.createCDATASection(r11)     // Catch:{ ParserConfigurationException -> 0x0055 }
            r10.appendChild(r11)     // Catch:{ ParserConfigurationException -> 0x0055 }
            int r9 = r9 + 1
            if (r0 == 0) goto L_0x0036
            goto L_0x0057
        L_0x0055:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x0057:
            java.lang.String[] r1 = f6020d     // Catch:{ all -> 0x00fc }
            r6 = 24
            r1 = r1[r6]     // Catch:{ all -> 0x00fc }
            org.w3c.dom.Element r10 = r2.createElement(r1)     // Catch:{ all -> 0x00fc }
        L_0x0061:
            r4.appendChild(r10)     // Catch:{ all -> 0x00fc }
        L_0x0064:
            boolean r1 = r5.moveToNext()     // Catch:{ all -> 0x00f3 }
        L_0x0068:
            if (r1 == 0) goto L_0x00e6
            java.lang.String[] r1 = f6020d     // Catch:{ all -> 0x00f3 }
            r4 = 25
            r1 = r1[r4]     // Catch:{ all -> 0x00f3 }
            org.w3c.dom.Element r1 = r2.createElement(r1)     // Catch:{ all -> 0x00f3 }
            r10.appendChild(r1)     // Catch:{ all -> 0x00f3 }
            if (r0 != 0) goto L_0x00e9
            r4 = 0
        L_0x007a:
            if (r4 >= r7) goto L_0x00e4
            java.lang.String[] r6 = f6020d     // Catch:{ all -> 0x00f3 }
            r9 = 19
            r9 = r6[r9]     // Catch:{ all -> 0x00f3 }
            org.w3c.dom.Element r9 = r2.createElement(r9)     // Catch:{ all -> 0x00f3 }
            r1.appendChild(r9)     // Catch:{ all -> 0x00f3 }
            r11 = 26
            r11 = r6[r11]     // Catch:{ all -> 0x00f3 }
            org.w3c.dom.Element r11 = r2.createElement(r11)     // Catch:{ all -> 0x00f3 }
            r9.appendChild(r11)     // Catch:{ all -> 0x00f3 }
            int r12 = r5.getType(r4)     // Catch:{ all -> 0x00f3 }
            if (r0 != 0) goto L_0x00e2
            java.lang.String r13 = ""
            if (r12 == 0) goto L_0x00a2
            r14 = 4
            if (r12 == r14) goto L_0x00a4
            goto L_0x00b3
        L_0x00a2:
            if (r0 == 0) goto L_0x00b8
        L_0x00a4:
            byte[] r14 = r5.getBlob(r4)     // Catch:{ all -> 0x00f3 }
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x00f3 }
            java.nio.charset.Charset r8 = r16.m10297w()     // Catch:{ all -> 0x00f3 }
            r15.<init>(r14, r8)     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00b9
        L_0x00b3:
            java.lang.String r15 = r5.getString(r4)     // Catch:{ all -> 0x00f3 }
            goto L_0x00b9
        L_0x00b8:
            r15 = r13
        L_0x00b9:
            if (r0 != 0) goto L_0x00be
            if (r15 != 0) goto L_0x00c0
            goto L_0x00bf
        L_0x00be:
            r13 = r15
        L_0x00bf:
            r15 = r13
        L_0x00c0:
            org.w3c.dom.CDATASection r8 = r2.createCDATASection(r15)     // Catch:{ all -> 0x00f3 }
            r11.appendChild(r8)     // Catch:{ all -> 0x00f3 }
            r8 = 21
            r6 = r6[r8]     // Catch:{ all -> 0x00f3 }
            org.w3c.dom.Element r6 = r2.createElement(r6)     // Catch:{ all -> 0x00f3 }
            r9.appendChild(r6)     // Catch:{ all -> 0x00f3 }
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00f3 }
            org.w3c.dom.Text r8 = r2.createTextNode(r8)     // Catch:{ all -> 0x00f3 }
            r6.appendChild(r8)     // Catch:{ all -> 0x00f3 }
            int r4 = r4 + 1
            if (r0 == 0) goto L_0x007a
            goto L_0x00e4
        L_0x00e2:
            r1 = r12
            goto L_0x0068
        L_0x00e4:
            if (r0 == 0) goto L_0x0064
        L_0x00e6:
            r5.close()     // Catch:{ all -> 0x00fc }
        L_0x00e9:
            r3.close()
            r1 = r16
            java.lang.String r0 = r1.m10282h(r2)
            return r0
        L_0x00f3:
            r0 = move-exception
            r1 = r16
            r5.close()     // Catch:{ all -> 0x00fa }
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fc:
            r0 = move-exception
            r1 = r16
        L_0x00ff:
            r3.close()
            goto L_0x0104
        L_0x0103:
            throw r0
        L_0x0104:
            goto L_0x0103
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3617a.m10293s(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: finally extract failed */
    @NonNull
    /* renamed from: t */
    private String m10294t(@NonNull String str, @NonNull String str2, @Nullable Node node) {
        Element A = m10273A();
        Document ownerDocument = A.getOwnerDocument();
        SQLiteDatabase v = m10296v(str);
        try {
            m10289o(A, (long) m10275a(v, str2, node).executeUpdateDelete());
            v.close();
            return m10282h(ownerDocument);
        } catch (Throwable th) {
            v.close();
            throw th;
        }
    }

    /* renamed from: u */
    static void m10295u(Closeable[] closeableArr) {
        m10290p(closeableArr);
    }

    @NonNull
    /* renamed from: v */
    private SQLiteDatabase m10296v(@NonNull String str) {
        return SQLiteDatabase.openDatabase(this.f6021a.getDatabasePath(str).getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 0);
    }

    @NonNull
    /* renamed from: w */
    private Charset m10297w() {
        return Charset.forName(f6020d[18]);
    }

    /* renamed from: x */
    public static void m10298x(@NonNull Context context, @NonNull String str) {
        int i = C3619c.f6023c;
        new C3617a(context, str);
        if (f6019c != 0) {
            C3619c.f6023c = i + 1;
        }
    }

    @NonNull
    /* renamed from: y */
    private String m10299y() {
        int i = C3619c.f6023c;
        Element A = m10273A();
        Document ownerDocument = A.getOwnerDocument();
        Element createElement = ownerDocument.createElement(f6020d[42]);
        A.appendChild(createElement);
        String[] databaseList = this.f6021a.databaseList();
        int length = databaseList.length;
        int i2 = 0;
        while (i2 < length) {
            String str = databaseList[i2];
            if (i == 0) {
                Element createElement2 = ownerDocument.createElement(f6020d[43]);
                createElement.appendChild(createElement2);
                createElement2.appendChild(ownerDocument.createCDATASection(str));
                i2++;
                if (i != 0) {
                    break;
                }
            } else {
                return str;
            }
        }
        return m10282h(ownerDocument);
    }

    @NonNull
    /* renamed from: z */
    private String m10300z(@NonNull String str) {
        Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        String[] strArr = f6020d;
        Element createElement = newDocument.createElement(strArr[32]);
        newDocument.appendChild(createElement);
        Element createElement2 = newDocument.createElement(strArr[31]);
        createElement.appendChild(createElement2);
        createElement2.appendChild(newDocument.createCDATASection(str));
        return m10282h(newDocument);
    }
}

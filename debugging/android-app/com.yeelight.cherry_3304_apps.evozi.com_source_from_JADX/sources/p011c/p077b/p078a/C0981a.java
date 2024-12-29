package p011c.p077b.p078a;

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

/* renamed from: c.b.a.a */
public class C0981a {

    /* renamed from: c */
    public static int f1176c;

    /* renamed from: d */
    private static final String[] f1177d;

    /* renamed from: a */
    private final Context f1178a;

    /* renamed from: b */
    private LocalServerSocket f1179b;

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
            f1177d = r4
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
        throw new UnsupportedOperationException("Method not decompiled: p011c.p077b.p078a.C0981a.<clinit>():void");
    }

    private C0981a(@NonNull Context context, @NonNull String str) {
        this.f1178a = context;
        String str2 = f1177d[12] + str;
        try {
            this.f1179b = new LocalServerSocket(str2);
            String str3 = f1177d[16];
            int i = 4;
            if (C0983c.f1180c == 0) {
                if (Log.isLoggable(str3, 4)) {
                    str3 = f1177d[15];
                    i = 1;
                }
                m1873l();
            }
            try {
                Object[] objArr = new Object[i];
                objArr[0] = str2;
                String.format(str3, objArr);
                String str4 = f1177d[13];
            } catch (IOException unused) {
                String.format(f1177d[17], new Object[]{str});
                String str5 = f1177d[14];
            }
            m1873l();
        } catch (IOException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        }
    }

    @NonNull
    /* renamed from: A */
    private static Element m1860A() {
        Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element createElement = newDocument.createElement(f1177d[4]);
        newDocument.appendChild(createElement);
        return createElement;
    }

    @NonNull
    /* renamed from: B */
    private String m1861B() {
        return f1177d[41];
    }

    /* renamed from: a */
    private SQLiteStatement m1862a(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull String str, @Nullable Node node) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        if (node != null) {
            m1874m(compileStatement, node);
        }
        return compileStatement;
    }

    /* renamed from: b */
    static LocalServerSocket m1863b(C0981a aVar) {
        return aVar.f1179b;
    }

    /* renamed from: c */
    static LocalServerSocket m1864c(C0981a aVar, LocalServerSocket localServerSocket) {
        aVar.f1179b = localServerSocket;
        return localServerSocket;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0114, code lost:
        if (r0 == 0) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x011a, code lost:
        return m1879r(r1);
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
    private java.lang.String m1865d(int r10, @androidx.annotation.NonNull org.w3c.dom.Element r11) {
        /*
            r9 = this;
            int r0 = p011c.p077b.p078a.C0983c.f1180c
            org.w3c.dom.NodeList r11 = r11.getChildNodes()
            java.lang.String r1 = r9.m1872k(r11)
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
            java.lang.String[] r8 = f1177d     // Catch:{ TransformerException -> 0x00ed }
            r4 = r8[r4]     // Catch:{ TransformerException -> 0x00ed }
            if (r0 != 0) goto L_0x002e
            java.lang.String r8 = r7.getNodeName()     // Catch:{ TransformerException -> 0x00ed }
            boolean r4 = r4.equals(r8)     // Catch:{ TransformerException -> 0x00ed }
            if (r4 == 0) goto L_0x011d
            java.lang.String r4 = r9.m1871j(r7)     // Catch:{ TransformerException -> 0x00ef }
        L_0x002e:
            if (r0 != 0) goto L_0x00ec
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = r9.m1868g(r1, r4)     // Catch:{ TransformerException -> 0x0038 }
            goto L_0x00ec
        L_0x0038:
            r10 = move-exception
            throw r10
        L_0x003a:
            if (r0 == 0) goto L_0x011d
        L_0x003c:
            org.w3c.dom.Node r4 = r11.item(r6)
            java.lang.String[] r7 = f1177d     // Catch:{ TransformerException -> 0x00e8 }
            r8 = 1
            r7 = r7[r8]     // Catch:{ TransformerException -> 0x00e8 }
            if (r0 != 0) goto L_0x0055
            java.lang.String r8 = r4.getNodeName()     // Catch:{ TransformerException -> 0x00e8 }
            boolean r7 = r7.equals(r8)     // Catch:{ TransformerException -> 0x00e8 }
            if (r7 == 0) goto L_0x011d
            java.lang.String r7 = r9.m1871j(r4)     // Catch:{ TransformerException -> 0x00ea }
        L_0x0055:
            if (r0 != 0) goto L_0x0059
            if (r7 == 0) goto L_0x0067
        L_0x0059:
            if (r0 != 0) goto L_0x00e7
            boolean r4 = r7.isEmpty()     // Catch:{ TransformerException -> 0x00e3 }
            if (r4 != 0) goto L_0x0067
            java.lang.String r7 = r9.m1880s(r1, r7)     // Catch:{ TransformerException -> 0x00e5 }
            goto L_0x00e7
        L_0x0067:
            if (r0 == 0) goto L_0x011d
        L_0x0069:
            org.w3c.dom.Node r4 = r11.item(r6)
            java.lang.String[] r7 = f1177d     // Catch:{ TransformerException -> 0x00df }
            r7 = r7[r5]     // Catch:{ TransformerException -> 0x00df }
            if (r0 != 0) goto L_0x0081
            java.lang.String r8 = r4.getNodeName()     // Catch:{ TransformerException -> 0x00df }
            boolean r7 = r7.equals(r8)     // Catch:{ TransformerException -> 0x00df }
            if (r7 == 0) goto L_0x011d
            java.lang.String r7 = r9.m1871j(r4)     // Catch:{ TransformerException -> 0x00e1 }
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
            java.lang.String r10 = r9.m1869h(r1, r7, r3)
            return r10
        L_0x00a1:
            if (r0 == 0) goto L_0x011d
        L_0x00a3:
            org.w3c.dom.Node r4 = r11.item(r6)
            java.lang.String[] r7 = f1177d     // Catch:{ TransformerException -> 0x00db }
            r6 = r7[r6]     // Catch:{ TransformerException -> 0x00db }
            if (r0 != 0) goto L_0x00bb
            java.lang.String r7 = r4.getNodeName()     // Catch:{ TransformerException -> 0x00db }
            boolean r6 = r6.equals(r7)     // Catch:{ TransformerException -> 0x00db }
            if (r6 == 0) goto L_0x011d
            java.lang.String r6 = r9.m1871j(r4)     // Catch:{ TransformerException -> 0x00dd }
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
            java.lang.String r10 = r9.m1881t(r1, r6, r3)
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
            android.content.Context r11 = r9.f1178a
            java.lang.String[] r11 = r11.databaseList()
            int r2 = r11.length
        L_0x00f8:
            if (r4 >= r2) goto L_0x0114
            r3 = r11[r4]
            if (r0 != 0) goto L_0x0112
            if (r0 != 0) goto L_0x0126
            boolean r3 = r3.equals(r1)     // Catch:{ TransformerException -> 0x010e }
            if (r3 == 0) goto L_0x010b
            java.lang.String r10 = r9.m1878q()     // Catch:{ TransformerException -> 0x0110 }
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
            java.lang.String r10 = r9.m1879r(r1)     // Catch:{ TransformerException -> 0x011b }
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
            java.lang.String r3 = r9.m1861B()
        L_0x0126:
            return r3
        L_0x0127:
            java.lang.String r10 = r9.m1886y()     // Catch:{ TransformerException -> 0x012c }
            return r10
        L_0x012c:
            r10 = move-exception
            goto L_0x012f
        L_0x012e:
            throw r10
        L_0x012f:
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p077b.p078a.C0981a.m1865d(int, org.w3c.dom.Element):java.lang.String");
    }

    /* renamed from: e */
    static String m1866e(C0981a aVar, String str) {
        return aVar.m1867f(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = f1177d[7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        m1877p(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        m1877p(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0080 */
    @androidx.annotation.NonNull
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m1867f(@androidx.annotation.NonNull java.lang.String r8) {
        /*
            r7 = this;
            int r0 = p011c.p077b.p078a.C0983c.f1180c
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r8)
            r8 = 1
            r2 = 0
            javax.xml.parsers.DocumentBuilderFactory r3 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch:{ all -> 0x006f }
            javax.xml.parsers.DocumentBuilder r3 = r3.newDocumentBuilder()     // Catch:{ all -> 0x006f }
            org.xml.sax.InputSource r4 = new org.xml.sax.InputSource     // Catch:{ all -> 0x006f }
            r4.<init>(r1)     // Catch:{ all -> 0x006f }
            org.w3c.dom.Document r3 = r3.parse(r4)     // Catch:{ all -> 0x006f }
            org.w3c.dom.Element r3 = r3.getDocumentElement()     // Catch:{ all -> 0x006f }
            java.lang.String[] r4 = f1177d     // Catch:{ all -> 0x006d }
            r5 = 5
            r4 = r4[r5]     // Catch:{ all -> 0x006d }
            java.lang.String r5 = r3.getNodeName()     // Catch:{ all -> 0x006d }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x0060
            if (r4 == 0) goto L_0x0061
            org.w3c.dom.NodeList r4 = r3.getChildNodes()     // Catch:{ all -> 0x006f }
            org.w3c.dom.Node r4 = r4.item(r2)     // Catch:{ all -> 0x006f }
            java.lang.String[] r5 = f1177d     // Catch:{ all -> 0x005e }
            r6 = 6
            r5 = r5[r6]     // Catch:{ all -> 0x005e }
            java.lang.String r6 = r4.getNodeName()     // Catch:{ all -> 0x005e }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x005c
            if (r5 == 0) goto L_0x0061
            java.lang.String r0 = r4.getTextContent()     // Catch:{ all -> 0x006f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r7.m1865d(r0, r3)     // Catch:{ all -> 0x006f }
            java.io.Closeable[] r8 = new java.io.Closeable[r8]
            r8[r2] = r1
            m1877p(r8)
            return r0
        L_0x005c:
            r8 = r5
            goto L_0x0061
        L_0x005e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006f }
        L_0x0060:
            r8 = r4
        L_0x0061:
            java.io.Closeable[] r8 = new java.io.Closeable[r8]
            r8[r2] = r1
            m1877p(r8)
            java.lang.String r8 = r7.m1861B()
            return r8
        L_0x006d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r7.m1887z(r0)     // Catch:{ all -> 0x0080 }
            java.io.Closeable[] r8 = new java.io.Closeable[r8]
            r8[r2] = r1
            m1877p(r8)
            return r0
        L_0x0080:
            java.lang.String[] r0 = f1177d     // Catch:{ all -> 0x008d }
            r3 = 7
            r0 = r0[r3]     // Catch:{ all -> 0x008d }
            java.io.Closeable[] r8 = new java.io.Closeable[r8]
            r8[r2] = r1
            m1877p(r8)
            return r0
        L_0x008d:
            r0 = move-exception
            java.io.Closeable[] r8 = new java.io.Closeable[r8]
            r8[r2] = r1
            m1877p(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p077b.p078a.C0981a.m1867f(java.lang.String):java.lang.String");
    }

    @NonNull
    /* renamed from: g */
    private String m1868g(@NonNull String str, @NonNull String str2) {
        Element A = m1860A();
        Document ownerDocument = A.getOwnerDocument();
        m1875n(str, str2, A);
        return m1870i(ownerDocument);
    }

    /* JADX INFO: finally extract failed */
    @NonNull
    /* renamed from: h */
    private String m1869h(@NonNull String str, @NonNull String str2, @Nullable Node node) {
        Element A = m1860A();
        Document ownerDocument = A.getOwnerDocument();
        SQLiteDatabase v = m1883v(str);
        try {
            m1876o(A, m1862a(v, str2, node).executeInsert());
            v.close();
            return m1870i(ownerDocument);
        } catch (Throwable th) {
            v.close();
            throw th;
        }
    }

    @NonNull
    /* renamed from: i */
    private String m1870i(@NonNull Document document) {
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        StringWriter stringWriter = new StringWriter();
        newTransformer.transform(new DOMSource(document), new StreamResult(stringWriter));
        return stringWriter.toString();
    }

    @Nullable
    /* renamed from: j */
    private String m1871j(@NonNull Node node) {
        Node firstChild = node.getFirstChild();
        if (C0983c.f1180c != 0 || (firstChild instanceof CDATASection)) {
            return ((CDATASection) firstChild).getTextContent();
        }
        return null;
    }

    @Nullable
    /* renamed from: k */
    private String m1872k(@NonNull NodeList nodeList) {
        int i = C0983c.f1180c;
        Node item = nodeList.item(1);
        if (item == null) {
            return null;
        }
        String str = f1177d[9];
        if (i == 0) {
            if (!str.equals(item.getNodeName())) {
                return null;
            }
            str = m1871j(item);
        }
        if (i == 0 && str == null) {
            return null;
        }
        return str;
    }

    /* renamed from: l */
    private void m1873l() {
        try {
            new Thread(new C0984d(this, (C0982b) null)).start();
        } catch (Throwable unused) {
            String[] strArr = f1177d;
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
    private void m1874m(@androidx.annotation.NonNull android.database.sqlite.SQLiteStatement r9, @androidx.annotation.NonNull org.w3c.dom.Node r10) {
        /*
            r8 = this;
            int r0 = p011c.p077b.p078a.C0983c.f1180c
            org.w3c.dom.NodeList r10 = r10.getChildNodes()
            int r1 = r10.getLength()
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0069
            org.w3c.dom.Node r4 = r10.item(r3)
            org.w3c.dom.NodeList r4 = r4.getChildNodes()
            org.w3c.dom.Node r5 = r4.item(r2)
            java.lang.String r5 = r8.m1871j(r5)
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
            java.nio.charset.Charset r4 = r8.m1884w()
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
        throw new UnsupportedOperationException("Method not decompiled: p011c.p077b.p078a.C0981a.m1874m(android.database.sqlite.SQLiteStatement, org.w3c.dom.Node):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r7.close();
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1875n(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.NonNull org.w3c.dom.Element r8) {
        /*
            r5 = this;
            int r0 = p011c.p077b.p078a.C0983c.f1180c
            org.w3c.dom.Document r1 = r8.getOwnerDocument()
            java.lang.String[] r2 = f1177d
            r3 = 39
            r2 = r2[r3]
            org.w3c.dom.Element r2 = r1.createElement(r2)
            r8.appendChild(r2)
            android.database.sqlite.SQLiteDatabase r6 = r5.m1883v(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r8.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String[] r3 = f1177d     // Catch:{ all -> 0x00bd }
            r4 = 38
            r3 = r3[r4]     // Catch:{ all -> 0x00bd }
            r8.append(r3)     // Catch:{ all -> 0x00bd }
            r8.append(r7)     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = ")"
            r8.append(r7)     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x00bd }
            r8 = 0
            android.database.Cursor r7 = r6.rawQuery(r7, r8)     // Catch:{ all -> 0x00bd }
        L_0x0036:
            boolean r8 = r7.moveToNext()     // Catch:{ all -> 0x00b8 }
            if (r8 == 0) goto L_0x00b1
            java.lang.String[] r8 = f1177d     // Catch:{ all -> 0x00b8 }
            r3 = 37
            r8 = r8[r3]     // Catch:{ all -> 0x00b8 }
            org.w3c.dom.Element r8 = r1.createElement(r8)     // Catch:{ all -> 0x00b8 }
            r2.appendChild(r8)     // Catch:{ all -> 0x00b8 }
            java.lang.String[] r3 = f1177d     // Catch:{ all -> 0x00b8 }
            r4 = 36
            r3 = r3[r4]     // Catch:{ all -> 0x00b8 }
            org.w3c.dom.Element r3 = r1.createElement(r3)     // Catch:{ all -> 0x00b8 }
            r8.appendChild(r3)     // Catch:{ all -> 0x00b8 }
            r4 = 1
            java.lang.String r4 = r7.getString(r4)     // Catch:{ all -> 0x00b8 }
            org.w3c.dom.CDATASection r4 = r1.createCDATASection(r4)     // Catch:{ all -> 0x00b8 }
            r3.appendChild(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String[] r3 = f1177d     // Catch:{ all -> 0x00b8 }
            r4 = 35
            r3 = r3[r4]     // Catch:{ all -> 0x00b8 }
            org.w3c.dom.Element r3 = r1.createElement(r3)     // Catch:{ all -> 0x00b8 }
            r8.appendChild(r3)     // Catch:{ all -> 0x00b8 }
            r4 = 2
            java.lang.String r4 = r7.getString(r4)     // Catch:{ all -> 0x00b8 }
            org.w3c.dom.CDATASection r4 = r1.createCDATASection(r4)     // Catch:{ all -> 0x00b8 }
            r3.appendChild(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String[] r3 = f1177d     // Catch:{ all -> 0x00b8 }
            r4 = 33
            r3 = r3[r4]     // Catch:{ all -> 0x00b8 }
            org.w3c.dom.Element r3 = r1.createElement(r3)     // Catch:{ all -> 0x00b8 }
            r8.appendChild(r3)     // Catch:{ all -> 0x00b8 }
            r4 = 3
            java.lang.String r4 = r7.getString(r4)     // Catch:{ all -> 0x00b8 }
            org.w3c.dom.Text r4 = r1.createTextNode(r4)     // Catch:{ all -> 0x00b8 }
            r3.appendChild(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String[] r3 = f1177d     // Catch:{ all -> 0x00b8 }
            r4 = 34
            r3 = r3[r4]     // Catch:{ all -> 0x00b8 }
            org.w3c.dom.Element r3 = r1.createElement(r3)     // Catch:{ all -> 0x00b8 }
            r8.appendChild(r3)     // Catch:{ all -> 0x00b8 }
            r8 = 5
            java.lang.String r8 = r7.getString(r8)     // Catch:{ all -> 0x00b8 }
            org.w3c.dom.Text r8 = r1.createTextNode(r8)     // Catch:{ all -> 0x00b8 }
            r3.appendChild(r8)     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x00b4
            if (r0 == 0) goto L_0x0036
        L_0x00b1:
            r7.close()     // Catch:{ all -> 0x00bd }
        L_0x00b4:
            r6.close()
            return
        L_0x00b8:
            r8 = move-exception
            r7.close()     // Catch:{ all -> 0x00bd }
            throw r8     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r7 = move-exception
            r6.close()
            goto L_0x00c3
        L_0x00c2:
            throw r7
        L_0x00c3:
            goto L_0x00c2
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p077b.p078a.C0981a.m1875n(java.lang.String, java.lang.String, org.w3c.dom.Element):void");
    }

    /* renamed from: o */
    private void m1876o(Element element, long j) {
        Document ownerDocument = element.getOwnerDocument();
        Element createElement = ownerDocument.createElement(f1177d[8]);
        element.appendChild(createElement);
        createElement.appendChild(ownerDocument.createTextNode(String.valueOf(j)));
    }

    /* renamed from: p */
    private static void m1877p(@NonNull Closeable... closeableArr) {
        int i = C0983c.f1180c;
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
    private String m1878q() {
        Element A = m1860A();
        Document ownerDocument = A.getOwnerDocument();
        A.appendChild(ownerDocument.createElement(f1177d[40]));
        return m1870i(ownerDocument);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    @androidx.annotation.NonNull
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m1879r(@androidx.annotation.NonNull java.lang.String r9) {
        /*
            r8 = this;
            int r0 = p011c.p077b.p078a.C0983c.f1180c
            org.w3c.dom.Element r1 = m1860A()
            org.w3c.dom.Document r2 = r1.getOwnerDocument()
            java.lang.String[] r3 = f1177d
            r4 = 27
            r3 = r3[r4]
            org.w3c.dom.Element r3 = r2.createElement(r3)
            r1.appendChild(r3)
            android.database.sqlite.SQLiteDatabase r9 = r8.m1883v(r9)
            java.lang.String[] r1 = f1177d     // Catch:{ all -> 0x0066 }
            r4 = 28
            r1 = r1[r4]     // Catch:{ all -> 0x0066 }
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0066 }
            java.lang.String[] r5 = f1177d     // Catch:{ all -> 0x0066 }
            r6 = 30
            r5 = r5[r6]     // Catch:{ all -> 0x0066 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0066 }
            android.database.Cursor r1 = r9.rawQuery(r1, r4)     // Catch:{ all -> 0x0066 }
        L_0x0031:
            boolean r4 = r1.moveToNext()     // Catch:{ all -> 0x0061 }
            if (r4 == 0) goto L_0x0056
            java.lang.String r4 = r1.getString(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String[] r5 = f1177d     // Catch:{ all -> 0x0061 }
            r7 = 29
            r5 = r5[r7]     // Catch:{ all -> 0x0061 }
            org.w3c.dom.Element r5 = r2.createElement(r5)     // Catch:{ all -> 0x0061 }
            r3.appendChild(r5)     // Catch:{ ParserConfigurationException -> 0x0054 }
            org.w3c.dom.CDATASection r4 = r2.createCDATASection(r4)     // Catch:{ ParserConfigurationException -> 0x0054 }
            r5.appendChild(r4)     // Catch:{ ParserConfigurationException -> 0x0054 }
            if (r0 != 0) goto L_0x0059
            if (r0 == 0) goto L_0x0031
            goto L_0x0056
        L_0x0054:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0056:
            r1.close()     // Catch:{ all -> 0x0066 }
        L_0x0059:
            r9.close()
            java.lang.String r9 = r8.m1870i(r2)
            return r9
        L_0x0061:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            r9.close()
            goto L_0x006c
        L_0x006b:
            throw r0
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p077b.p078a.C0981a.m1879r(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r10 = r2.createElement(f1177d[24]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        if (r11 != 4) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        if (r0 != 0) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        r14 = r5.getString(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb A[EDGE_INSN: B:63:0x00eb->B:43:0x00eb ?: BREAK  , SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m1880s(@androidx.annotation.NonNull java.lang.String r17, @androidx.annotation.NonNull java.lang.String r18) {
        /*
            r16 = this;
            int r0 = p011c.p077b.p078a.C0983c.f1180c
            org.w3c.dom.Element r1 = m1860A()
            org.w3c.dom.Document r2 = r1.getOwnerDocument()
            java.lang.String[] r3 = f1177d
            r4 = 20
            r3 = r3[r4]
            org.w3c.dom.Element r3 = r2.createElement(r3)
            r1.appendChild(r3)
            java.lang.String[] r1 = f1177d
            r4 = 23
            r1 = r1[r4]
            org.w3c.dom.Element r1 = r2.createElement(r1)
            r3.appendChild(r1)
            android.database.sqlite.SQLiteDatabase r4 = r16.m1883v(r17)
            r5 = 0
            r6 = r18
            android.database.Cursor r5 = r4.rawQuery(r6, r5)     // Catch:{ all -> 0x0103 }
            java.lang.String[] r6 = r5.getColumnNames()     // Catch:{ all -> 0x0103 }
            int r7 = r5.getColumnCount()     // Catch:{ all -> 0x0103 }
            r8 = 0
            r9 = 0
        L_0x0039:
            if (r9 >= r7) goto L_0x005a
            java.lang.String[] r10 = f1177d     // Catch:{ all -> 0x0103 }
            r11 = 22
            r10 = r10[r11]     // Catch:{ all -> 0x0103 }
            org.w3c.dom.Element r10 = r2.createElement(r10)     // Catch:{ all -> 0x0103 }
            r1.appendChild(r10)     // Catch:{ all -> 0x0103 }
            r11 = r6[r9]     // Catch:{ all -> 0x0103 }
            if (r0 != 0) goto L_0x0064
            org.w3c.dom.CDATASection r11 = r2.createCDATASection(r11)     // Catch:{ ParserConfigurationException -> 0x0058 }
            r10.appendChild(r11)     // Catch:{ ParserConfigurationException -> 0x0058 }
            int r9 = r9 + 1
            if (r0 == 0) goto L_0x0039
            goto L_0x005a
        L_0x0058:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x005a:
            java.lang.String[] r1 = f1177d     // Catch:{ all -> 0x0103 }
            r6 = 24
            r1 = r1[r6]     // Catch:{ all -> 0x0103 }
            org.w3c.dom.Element r10 = r2.createElement(r1)     // Catch:{ all -> 0x0103 }
        L_0x0064:
            r3.appendChild(r10)     // Catch:{ all -> 0x0103 }
        L_0x0067:
            boolean r1 = r5.moveToNext()     // Catch:{ all -> 0x00fa }
        L_0x006b:
            if (r1 == 0) goto L_0x00ed
            java.lang.String[] r1 = f1177d     // Catch:{ all -> 0x00fa }
            r3 = 25
            r1 = r1[r3]     // Catch:{ all -> 0x00fa }
            org.w3c.dom.Element r1 = r2.createElement(r1)     // Catch:{ all -> 0x00fa }
            r10.appendChild(r1)     // Catch:{ all -> 0x00fa }
            if (r0 != 0) goto L_0x00f0
            r3 = 0
        L_0x007d:
            if (r3 >= r7) goto L_0x00eb
            java.lang.String[] r6 = f1177d     // Catch:{ all -> 0x00fa }
            r9 = 19
            r6 = r6[r9]     // Catch:{ all -> 0x00fa }
            org.w3c.dom.Element r6 = r2.createElement(r6)     // Catch:{ all -> 0x00fa }
            r1.appendChild(r6)     // Catch:{ all -> 0x00fa }
            java.lang.String[] r9 = f1177d     // Catch:{ all -> 0x00fa }
            r11 = 26
            r9 = r9[r11]     // Catch:{ all -> 0x00fa }
            org.w3c.dom.Element r9 = r2.createElement(r9)     // Catch:{ all -> 0x00fa }
            r6.appendChild(r9)     // Catch:{ all -> 0x00fa }
            int r11 = r5.getType(r3)     // Catch:{ all -> 0x00fa }
            if (r0 != 0) goto L_0x00e9
            java.lang.String r12 = ""
            if (r11 == 0) goto L_0x00a7
            r13 = 4
            if (r11 == r13) goto L_0x00a9
            goto L_0x00b8
        L_0x00a7:
            if (r0 == 0) goto L_0x00bd
        L_0x00a9:
            byte[] r13 = r5.getBlob(r3)     // Catch:{ all -> 0x00fa }
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x00fa }
            java.nio.charset.Charset r15 = r16.m1884w()     // Catch:{ all -> 0x00fa }
            r14.<init>(r13, r15)     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00be
        L_0x00b8:
            java.lang.String r14 = r5.getString(r3)     // Catch:{ all -> 0x00fa }
            goto L_0x00be
        L_0x00bd:
            r14 = r12
        L_0x00be:
            if (r0 != 0) goto L_0x00c3
            if (r14 != 0) goto L_0x00c5
            goto L_0x00c4
        L_0x00c3:
            r12 = r14
        L_0x00c4:
            r14 = r12
        L_0x00c5:
            org.w3c.dom.CDATASection r12 = r2.createCDATASection(r14)     // Catch:{ all -> 0x00fa }
            r9.appendChild(r12)     // Catch:{ all -> 0x00fa }
            java.lang.String[] r9 = f1177d     // Catch:{ all -> 0x00fa }
            r12 = 21
            r9 = r9[r12]     // Catch:{ all -> 0x00fa }
            org.w3c.dom.Element r9 = r2.createElement(r9)     // Catch:{ all -> 0x00fa }
            r6.appendChild(r9)     // Catch:{ all -> 0x00fa }
            java.lang.String r6 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00fa }
            org.w3c.dom.Text r6 = r2.createTextNode(r6)     // Catch:{ all -> 0x00fa }
            r9.appendChild(r6)     // Catch:{ all -> 0x00fa }
            int r3 = r3 + 1
            if (r0 == 0) goto L_0x007d
            goto L_0x00eb
        L_0x00e9:
            r1 = r11
            goto L_0x006b
        L_0x00eb:
            if (r0 == 0) goto L_0x0067
        L_0x00ed:
            r5.close()     // Catch:{ all -> 0x0103 }
        L_0x00f0:
            r4.close()
            r1 = r16
            java.lang.String r0 = r1.m1870i(r2)
            return r0
        L_0x00fa:
            r0 = move-exception
            r1 = r16
            r5.close()     // Catch:{ all -> 0x0101 }
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r0 = move-exception
            goto L_0x0106
        L_0x0103:
            r0 = move-exception
            r1 = r16
        L_0x0106:
            r4.close()
            goto L_0x010b
        L_0x010a:
            throw r0
        L_0x010b:
            goto L_0x010a
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p077b.p078a.C0981a.m1880s(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: finally extract failed */
    @NonNull
    /* renamed from: t */
    private String m1881t(@NonNull String str, @NonNull String str2, @Nullable Node node) {
        Element A = m1860A();
        Document ownerDocument = A.getOwnerDocument();
        SQLiteDatabase v = m1883v(str);
        try {
            m1876o(A, (long) m1862a(v, str2, node).executeUpdateDelete());
            v.close();
            return m1870i(ownerDocument);
        } catch (Throwable th) {
            v.close();
            throw th;
        }
    }

    /* renamed from: u */
    static void m1882u(Closeable[] closeableArr) {
        m1877p(closeableArr);
    }

    @NonNull
    /* renamed from: v */
    private SQLiteDatabase m1883v(@NonNull String str) {
        return SQLiteDatabase.openDatabase(this.f1178a.getDatabasePath(str).getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 0);
    }

    @NonNull
    /* renamed from: w */
    private Charset m1884w() {
        return Charset.forName(f1177d[18]);
    }

    /* renamed from: x */
    public static void m1885x(@NonNull Context context, @NonNull String str) {
        int i = C0983c.f1180c;
        new C0981a(context, str);
        if (f1176c != 0) {
            C0983c.f1180c = i + 1;
        }
    }

    @NonNull
    /* renamed from: y */
    private String m1886y() {
        int i = C0983c.f1180c;
        Element A = m1860A();
        Document ownerDocument = A.getOwnerDocument();
        Element createElement = ownerDocument.createElement(f1177d[42]);
        A.appendChild(createElement);
        String[] databaseList = this.f1178a.databaseList();
        int length = databaseList.length;
        int i2 = 0;
        while (i2 < length) {
            String str = databaseList[i2];
            if (i == 0) {
                Element createElement2 = ownerDocument.createElement(f1177d[43]);
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
        return m1870i(ownerDocument);
    }

    @NonNull
    /* renamed from: z */
    private String m1887z(@NonNull String str) {
        Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element createElement = newDocument.createElement(f1177d[32]);
        newDocument.appendChild(createElement);
        Element createElement2 = newDocument.createElement(f1177d[31]);
        createElement.appendChild(createElement2);
        createElement2.appendChild(newDocument.createCDATASection(str));
        return m1870i(newDocument);
    }
}

package org.eclipse.jetty.servlet;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.UnavailableException;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import javax.servlet.http.HttpServlet;
import org.eclipse.jetty.http.C9892f;
import org.eclipse.jetty.http.C9895h;
import org.eclipse.jetty.http.C9907j;
import org.eclipse.jetty.http.C9908k;
import org.eclipse.jetty.http.C9916r;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.server.handler.C9943d;
import org.eclipse.jetty.util.C9985i;
import org.eclipse.jetty.util.C9993l;
import org.eclipse.jetty.util.C9997p;
import p131b6.C4002a;
import p152e6.C9001b;
import p152e6.C9003c;
import p157f6.C9038b;
import p157f6.C9042e;
import p157f6.C9043f;
import p208s4.C10359k;
import p223w3.C11671t;
import p223w3.C11864y;
import p225w5.C11940d;
import p225w5.C11946h;
import p225w5.C11954n;
import p239z5.C12151b;
import p239z5.C12170f;
import p239z5.C12178l;
import p239z5.C12180n;
import p239z5.C12183p;
import p239z5.C12186q;

public class DefaultServlet extends HttpServlet implements C9043f {
    private static final C9003c LOG = C9001b.m21450a(DefaultServlet.class);
    private static final long serialVersionUID = 4930458713846881193L;
    private boolean _acceptRanges = true;
    private C12183p _cache;
    private C11946h _cacheControl;
    private C9943d _contextHandler;
    private ServletHolder _defaultHolder;
    private boolean _dirAllowed = true;
    private boolean _gzip = true;
    private C9916r _mimeTypes;
    private boolean _pathInfoOnly = false;
    private boolean _redirectWelcome = false;
    private String _relativeResourceBase;
    private C9042e _resourceBase;
    private C10359k _servletContext;
    private C9968d _servletHandler;
    private C9042e _stylesheet;
    private boolean _useFileMappedBuffer = false;
    private boolean _welcomeExactServlets = false;
    private boolean _welcomeServlets = false;
    private String[] _welcomes;

    private boolean getInitBoolean(String str, boolean z) {
        String initParameter = getInitParameter(str);
        return (initParameter == null || initParameter.length() == 0) ? z : initParameter.startsWith(C11671t.f21438C) || initParameter.startsWith("T") || initParameter.startsWith(C11864y.f21710C) || initParameter.startsWith("Y") || initParameter.startsWith(TimerCodec.ENABLE);
    }

    private int getInitInt(String str, int i) {
        String initParameter = getInitParameter(str);
        if (initParameter == null) {
            initParameter = getInitParameter(str);
        }
        return (initParameter == null || initParameter.length() <= 0) ? i : Integer.parseInt(initParameter);
    }

    private String getWelcomeFile(String str) {
        PathMap.C9886a g1;
        String str2 = null;
        if (this._welcomes == null) {
            return null;
        }
        int i = 0;
        while (true) {
            String[] strArr = this._welcomes;
            if (i >= strArr.length) {
                return str2;
            }
            String a = C9997p.m24723a(str, strArr[i]);
            C9042e resource = getResource(a);
            if (resource != null && resource.mo36919c()) {
                return this._welcomes[i];
            }
            if ((this._welcomeServlets || this._welcomeExactServlets) && str2 == null && (g1 = this._servletHandler.mo40091g1(a)) != null && g1.getValue() != this._defaultHolder && (this._welcomeServlets || (this._welcomeExactServlets && g1.getKey().equals(a)))) {
                str2 = a;
            }
            i++;
        }
    }

    private boolean hasDefinedRange(Enumeration<String> enumeration) {
        return enumeration != null && enumeration.hasMoreElements();
    }

    public void destroy() {
        C12183p pVar = this._cache;
        if (pVar != null) {
            pVar.mo43131f();
        }
        super.destroy();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: org.eclipse.jetty.http.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: z5.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: org.eclipse.jetty.http.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: org.eclipse.jetty.http.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v36, resolved type: org.eclipse.jetty.http.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: org.eclipse.jetty.http.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v39, resolved type: org.eclipse.jetty.http.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: org.eclipse.jetty.http.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: org.eclipse.jetty.http.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v41, resolved type: org.eclipse.jetty.http.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: f6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v43, resolved type: f6.e} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [org.eclipse.jetty.http.f] */
    /* JADX WARNING: type inference failed for: r4v2, types: [f6.e] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (hasDefinedRange(r7) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
        if (r13 != false) goto L_0x00cc;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02ca A[Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02db A[SYNTHETIC, Splitter:B:177:0x02db] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0304 A[Catch:{ all -> 0x0319 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094 A[SYNTHETIC, Splitter:B:34:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e0 A[Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e4 A[Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010a A[Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0138 A[Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doGet(javax.servlet.http.C9277a r17, javax.servlet.http.C9279c r18) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r9 = r18
            java.lang.String r1 = "javax.servlet.include.request_uri"
            java.lang.Object r1 = r0.mo40040a(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4 = 0
            if (r1 == 0) goto L_0x003c
            boolean r5 = r1.booleanValue()
            if (r5 == 0) goto L_0x003c
            java.lang.String r5 = "javax.servlet.include.servlet_path"
            java.lang.Object r5 = r0.mo40040a(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "javax.servlet.include.path_info"
            java.lang.Object r6 = r0.mo40040a(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r5 != 0) goto L_0x003a
            java.lang.String r5 = r17.mo37771s()
            java.lang.String r6 = r17.mo37763g()
        L_0x003a:
            r7 = r4
            goto L_0x005a
        L_0x003c:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r5 = r8._pathInfoOnly
            if (r5 == 0) goto L_0x0045
            java.lang.String r5 = "/"
            goto L_0x0049
        L_0x0045:
            java.lang.String r5 = r17.mo37771s()
        L_0x0049:
            java.lang.String r6 = r17.mo37763g()
            java.lang.String r7 = "Range"
            java.util.Enumeration r7 = r0.mo37766k(r7)
            boolean r10 = r8.hasDefinedRange(r7)
            if (r10 != 0) goto L_0x005a
            goto L_0x003a
        L_0x005a:
            java.lang.String r5 = org.eclipse.jetty.util.C9997p.m24723a(r5, r6)
            if (r6 != 0) goto L_0x0064
            java.lang.String r6 = r17.mo37771s()
        L_0x0064:
            java.lang.String r10 = "/"
            boolean r6 = r6.endsWith(r10)
            boolean r10 = r1.booleanValue()
            if (r10 != 0) goto L_0x0091
            boolean r10 = r8._gzip
            if (r10 == 0) goto L_0x0091
            if (r7 != 0) goto L_0x0091
            if (r6 != 0) goto L_0x0091
            java.lang.String r10 = "Vary"
            java.lang.String r11 = "Accept-Encoding"
            r9.mo37781o(r10, r11)
            java.lang.String r10 = "Accept-Encoding"
            java.lang.String r10 = r0.mo37770r(r10)
            if (r10 == 0) goto L_0x0091
            java.lang.String r11 = "gzip"
            int r10 = r10.indexOf(r11)
            if (r10 < 0) goto L_0x0091
            r10 = 1
            goto L_0x0092
        L_0x0091:
            r10 = 0
        L_0x0092:
            if (r10 == 0) goto L_0x00e0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00dc, all -> 0x00d8 }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x00dc, all -> 0x00d8 }
            r11.append(r5)     // Catch:{ IllegalArgumentException -> 0x00dc, all -> 0x00d8 }
            java.lang.String r12 = ".gz"
            r11.append(r12)     // Catch:{ IllegalArgumentException -> 0x00dc, all -> 0x00d8 }
            java.lang.String r11 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x00dc, all -> 0x00d8 }
            z5.p r12 = r8._cache     // Catch:{ IllegalArgumentException -> 0x00dc, all -> 0x00d8 }
            if (r12 != 0) goto L_0x00af
            f6.e r11 = r8.getResource(r11)     // Catch:{ IllegalArgumentException -> 0x00dc, all -> 0x00d8 }
            r12 = r4
            goto L_0x00be
        L_0x00af:
            org.eclipse.jetty.http.f r11 = r12.mo43136l(r11)     // Catch:{ IllegalArgumentException -> 0x00dc, all -> 0x00d8 }
            if (r11 != 0) goto L_0x00b7
            r12 = r4
            goto L_0x00bb
        L_0x00b7:
            f6.e r12 = r11.mo39763g()     // Catch:{ IllegalArgumentException -> 0x00d4, all -> 0x00ce }
        L_0x00bb:
            r15 = r12
            r12 = r11
            r11 = r15
        L_0x00be:
            if (r11 == 0) goto L_0x00cc
            boolean r13 = r11.mo36919c()     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            if (r13 == 0) goto L_0x00cc
            boolean r13 = r11.mo36922j()     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            if (r13 == 0) goto L_0x00e2
        L_0x00cc:
            r10 = 0
            goto L_0x00e2
        L_0x00ce:
            r0 = move-exception
            r15 = r11
            r11 = r4
            r4 = r15
            goto L_0x031d
        L_0x00d4:
            r0 = move-exception
            r12 = r11
            goto L_0x02f7
        L_0x00d8:
            r0 = move-exception
            r11 = r4
            goto L_0x031d
        L_0x00dc:
            r0 = move-exception
            r12 = r4
            goto L_0x02f7
        L_0x00e0:
            r11 = r4
            r12 = r11
        L_0x00e2:
            if (r10 != 0) goto L_0x0101
            z5.p r13 = r8._cache     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            if (r13 != 0) goto L_0x00ee
            f6.e r4 = r8.getResource(r5)     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
        L_0x00ec:
            r11 = r4
            goto L_0x0101
        L_0x00ee:
            org.eclipse.jetty.http.f r12 = r13.mo43136l(r5)     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            if (r12 != 0) goto L_0x00f5
            goto L_0x00ec
        L_0x00f5:
            f6.e r4 = r12.mo39763g()     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            goto L_0x00ec
        L_0x00fa:
            r0 = move-exception
        L_0x00fb:
            r4 = r12
            goto L_0x031d
        L_0x00fe:
            r0 = move-exception
            goto L_0x02f6
        L_0x0101:
            r4 = r12
            e6.c r12 = LOG     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            boolean r13 = r12.mo36846a()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r13 == 0) goto L_0x0136
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r13.<init>()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r14 = "uri="
            r13.append(r14)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r14 = r17.mo37774w()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r13.append(r14)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r14 = " resource="
            r13.append(r14)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r13.append(r11)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r4 == 0) goto L_0x0128
            java.lang.String r14 = " content"
            goto L_0x012a
        L_0x0128:
            java.lang.String r14 = ""
        L_0x012a:
            r13.append(r14)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r13 = r13.toString()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r12.mo36850e(r13, r14)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
        L_0x0136:
            if (r11 == 0) goto L_0x02c4
            boolean r13 = r11.mo36919c()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r13 != 0) goto L_0x0140
            goto L_0x02c4
        L_0x0140:
            boolean r13 = r11.mo36922j()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r13 != 0) goto L_0x01dc
            if (r6 == 0) goto L_0x0192
            org.eclipse.jetty.server.handler.d r6 = r8._contextHandler     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            boolean r6 = r6.mo39955y1()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r6 == 0) goto L_0x0192
            int r6 = r5.length()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r6 <= r2) goto L_0x0192
            java.lang.String r0 = r17.mo37773u()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            int r1 = r5.length()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            int r1 = r1 - r2
            java.lang.String r1 = r5.substring(r3, r1)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r0 == 0) goto L_0x017f
            int r2 = r0.length()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r2 == 0) goto L_0x017f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r2.append(r1)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r1 = "?"
            r2.append(r1)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r1 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
        L_0x017f:
            s4.k r0 = r8._servletContext     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r0 = r0.mo39961e()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r0 = org.eclipse.jetty.util.C9997p.m24723a(r0, r1)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r0 = r9.mo37779l(r0)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
        L_0x018d:
            r9.mo37783q(r0)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            goto L_0x02cf
        L_0x0192:
            if (r4 != 0) goto L_0x01a9
            org.eclipse.jetty.http.f$a r2 = new org.eclipse.jetty.http.f$a     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            org.eclipse.jetty.http.r r3 = r8._mimeTypes     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r6 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            w5.d r3 = r3.mo39860b(r6)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            int r6 = r18.mo39907e()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r2.<init>(r11, r3, r6)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r12 = r2
            goto L_0x01aa
        L_0x01a9:
            r12 = r4
        L_0x01aa:
            boolean r2 = r1.booleanValue()     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            if (r2 != 0) goto L_0x01b6
            boolean r2 = r8.passConditionalHeaders(r0, r9, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            if (r2 == 0) goto L_0x01d9
        L_0x01b6:
            if (r10 == 0) goto L_0x01ca
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r9.mo37781o(r2, r3)     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            s4.k r2 = r8._servletContext     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            java.lang.String r2 = r2.mo39958b(r5)     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            if (r2 == 0) goto L_0x01ca
            r9.mo39906c(r2)     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
        L_0x01ca:
            boolean r4 = r1.booleanValue()     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r11
            r6 = r12
            r1.sendData(r2, r3, r4, r5, r6, r7)     // Catch:{ IllegalArgumentException -> 0x00fe, all -> 0x00fa }
        L_0x01d9:
            r4 = r12
            goto L_0x02cf
        L_0x01dc:
            if (r6 == 0) goto L_0x0287
            int r6 = r5.length()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r6 != r2) goto L_0x01ee
            java.lang.String r6 = "org.eclipse.jetty.server.nullPathInfo"
            java.lang.Object r6 = r0.mo40040a(r6)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r6 == 0) goto L_0x01ee
            goto L_0x0287
        L_0x01ee:
            java.lang.String r6 = r8.getWelcomeFile(r5)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r6 == 0) goto L_0x025f
            java.lang.String r5 = "welcome={}"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r2[r3] = r6     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r12.mo36850e(r5, r2)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            boolean r2 = r8._redirectWelcome     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r2 == 0) goto L_0x0244
            r9.mo37798n(r3)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r0 = r17.mo37773u()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r0 == 0) goto L_0x0234
            int r1 = r0.length()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r1 == 0) goto L_0x0234
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            s4.k r2 = r8._servletContext     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r2 = r2.mo39961e()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r2 = org.eclipse.jetty.util.C9997p.m24723a(r2, r6)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r2 = "?"
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r0 = r9.mo37779l(r0)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            goto L_0x018d
        L_0x0234:
            s4.k r0 = r8._servletContext     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r0 = r0.mo39961e()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r0 = org.eclipse.jetty.util.C9997p.m24723a(r0, r6)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r0 = r9.mo37779l(r0)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            goto L_0x018d
        L_0x0244:
            s4.h r2 = r0.mo41949i(r6)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r2 == 0) goto L_0x02cf
            boolean r1 = r1.booleanValue()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r1 == 0) goto L_0x0255
            r2.mo41941b(r0, r9)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            goto L_0x02cf
        L_0x0255:
            java.lang.String r1 = "org.eclipse.jetty.server.welcome"
            r0.mo41944b(r1, r6)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r2.mo41940a(r0, r9)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            goto L_0x02cf
        L_0x025f:
            org.eclipse.jetty.http.f$a r2 = new org.eclipse.jetty.http.f$a     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            org.eclipse.jetty.http.r r3 = r8._mimeTypes     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r6 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            w5.d r3 = r3.mo39860b(r6)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r2.<init>(r11, r3)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            boolean r1 = r1.booleanValue()     // Catch:{ IllegalArgumentException -> 0x0283, all -> 0x027f }
            if (r1 != 0) goto L_0x027a
            boolean r1 = r8.passConditionalHeaders(r0, r9, r11, r2)     // Catch:{ IllegalArgumentException -> 0x0283, all -> 0x027f }
            if (r1 == 0) goto L_0x027d
        L_0x027a:
            r8.sendDirectory(r0, r9, r11, r5)     // Catch:{ IllegalArgumentException -> 0x0283, all -> 0x027f }
        L_0x027d:
            r4 = r2
            goto L_0x02cf
        L_0x027f:
            r0 = move-exception
            r4 = r2
            goto L_0x031d
        L_0x0283:
            r0 = move-exception
            r12 = r2
            goto L_0x02f6
        L_0x0287:
            java.lang.StringBuffer r1 = r17.mo37768n()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r2 = ";"
            int r2 = r1.lastIndexOf(r2)     // Catch:{ all -> 0x02c1 }
            r5 = 47
            if (r2 >= 0) goto L_0x029a
            r1.append(r5)     // Catch:{ all -> 0x02c1 }
            goto L_0x029d
        L_0x029a:
            r1.insert(r2, r5)     // Catch:{ all -> 0x02c1 }
        L_0x029d:
            java.lang.String r0 = r17.mo37773u()     // Catch:{ all -> 0x02c1 }
            if (r0 == 0) goto L_0x02b1
            int r2 = r0.length()     // Catch:{ all -> 0x02c1 }
            if (r2 == 0) goto L_0x02b1
            r2 = 63
            r1.append(r2)     // Catch:{ all -> 0x02c1 }
            r1.append(r0)     // Catch:{ all -> 0x02c1 }
        L_0x02b1:
            r9.mo37798n(r3)     // Catch:{ all -> 0x02c1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02c1 }
            java.lang.String r0 = r9.mo37779l(r0)     // Catch:{ all -> 0x02c1 }
            r9.mo37783q(r0)     // Catch:{ all -> 0x02c1 }
            monitor-exit(r1)     // Catch:{ all -> 0x02c1 }
            goto L_0x02cf
        L_0x02c1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02c1 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
        L_0x02c4:
            boolean r0 = r1.booleanValue()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            if (r0 != 0) goto L_0x02db
            r0 = 404(0x194, float:5.66E-43)
            r9.mo37778k(r0)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
        L_0x02cf:
            if (r4 == 0) goto L_0x02d5
            r4.release()
            goto L_0x0318
        L_0x02d5:
            if (r11 == 0) goto L_0x0318
            r11.mo36931r()
            goto L_0x0318
        L_0x02db:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r2 = "!"
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r1.append(r5)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02f4, all -> 0x02f2 }
        L_0x02f2:
            r0 = move-exception
            goto L_0x031d
        L_0x02f4:
            r0 = move-exception
            r12 = r4
        L_0x02f6:
            r4 = r11
        L_0x02f7:
            e6.c r1 = LOG     // Catch:{ all -> 0x0319 }
            java.lang.String r2 = "EXCEPTION "
            r1.mo36852g(r2, r0)     // Catch:{ all -> 0x0319 }
            boolean r1 = r18.mo39908g()     // Catch:{ all -> 0x0319 }
            if (r1 != 0) goto L_0x030d
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0319 }
            r9.mo37776d(r1, r0)     // Catch:{ all -> 0x0319 }
        L_0x030d:
            if (r12 == 0) goto L_0x0313
            r12.release()
            goto L_0x0318
        L_0x0313:
            if (r4 == 0) goto L_0x0318
            r4.mo36931r()
        L_0x0318:
            return
        L_0x0319:
            r0 = move-exception
            r11 = r4
            goto L_0x00fb
        L_0x031d:
            if (r4 != 0) goto L_0x0325
            if (r11 == 0) goto L_0x0328
            r11.mo36931r()
            goto L_0x0328
        L_0x0325:
            r4.release()
        L_0x0328:
            goto L_0x032a
        L_0x0329:
            throw r0
        L_0x032a:
            goto L_0x0329
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.DefaultServlet.doGet(javax.servlet.http.a, javax.servlet.http.c):void");
    }

    /* access modifiers changed from: protected */
    public void doOptions(C9277a aVar, C9279c cVar) {
        cVar.mo37781o("Allow", "GET,HEAD,POST,OPTIONS");
    }

    /* access modifiers changed from: protected */
    public void doPost(C9277a aVar, C9279c cVar) {
        doGet(aVar, cVar);
    }

    /* access modifiers changed from: protected */
    public void doTrace(C9277a aVar, C9279c cVar) {
        cVar.mo37778k(405);
    }

    public String getInitParameter(String str) {
        C10359k servletContext = getServletContext();
        String initParameter = servletContext.getInitParameter("org.eclipse.jetty.servlet.Default." + str);
        return initParameter == null ? super.getInitParameter(str) : initParameter;
    }

    public C9042e getResource(String str) {
        String str2 = this._relativeResourceBase;
        if (str2 != null) {
            str = C9997p.m24723a(str2, str);
        }
        C9042e eVar = null;
        try {
            C9042e eVar2 = this._resourceBase;
            eVar = eVar2 != null ? eVar2.mo36927a(str) : this._contextHandler.mo39926B1(this._servletContext.getResource(str));
            C9003c cVar = LOG;
            if (cVar.mo36846a()) {
                cVar.mo36850e("Resource " + str + "=" + eVar, new Object[0]);
            }
        } catch (IOException e) {
            LOG.mo36849d(e);
        }
        return ((eVar == null || !eVar.mo36919c()) && str.endsWith("/jetty-dir.css")) ? this._stylesheet : eVar;
    }

    public void init() {
        C10359k servletContext = getServletContext();
        this._servletContext = servletContext;
        C9943d initContextHandler = initContextHandler(servletContext);
        this._contextHandler = initContextHandler;
        this._mimeTypes = initContextHandler.mo39949t1();
        String[] x1 = this._contextHandler.mo39954x1();
        this._welcomes = x1;
        if (x1 == null) {
            this._welcomes = new String[]{"index.html", "index.jsp"};
        }
        this._acceptRanges = getInitBoolean("acceptRanges", this._acceptRanges);
        this._dirAllowed = getInitBoolean("dirAllowed", this._dirAllowed);
        this._redirectWelcome = getInitBoolean("redirectWelcome", this._redirectWelcome);
        this._gzip = getInitBoolean("gzip", this._gzip);
        this._pathInfoOnly = getInitBoolean("pathInfoOnly", this._pathInfoOnly);
        if ("exact".equals(getInitParameter("welcomeServlets"))) {
            this._welcomeExactServlets = true;
            this._welcomeServlets = false;
        } else {
            this._welcomeServlets = getInitBoolean("welcomeServlets", this._welcomeServlets);
        }
        if (getInitParameter(Constants.EXTRA_KEY_ALIASES) != null) {
            this._contextHandler.mo39928D1(getInitBoolean(Constants.EXTRA_KEY_ALIASES, false));
        }
        boolean y1 = this._contextHandler.mo39955y1();
        if (y1 || C9038b.m21590w()) {
            if (y1) {
                this._servletContext.log("Aliases are enabled");
            }
            this._useFileMappedBuffer = getInitBoolean("useFileMappedBuffer", this._useFileMappedBuffer);
            this._relativeResourceBase = getInitParameter("relativeResourceBase");
            String initParameter = getInitParameter("resourceBase");
            if (initParameter != null) {
                if (this._relativeResourceBase == null) {
                    try {
                        this._resourceBase = this._contextHandler.mo39925A1(initParameter);
                    } catch (Exception e) {
                        LOG.mo36852g("EXCEPTION ", e);
                        throw new UnavailableException(e.toString());
                    }
                } else {
                    throw new UnavailableException("resourceBase & relativeResourceBase");
                }
            }
            String initParameter2 = getInitParameter("stylesheet");
            if (initParameter2 != null) {
                try {
                    C9042e n = C9042e.m21617n(initParameter2);
                    this._stylesheet = n;
                    if (!n.mo36919c()) {
                        LOG.mo36847b("!" + initParameter2, new Object[0]);
                        this._stylesheet = null;
                    }
                } catch (Exception e2) {
                    C9003c cVar = LOG;
                    cVar.mo36847b(e2.toString(), new Object[0]);
                    cVar.mo36848c(e2);
                }
            }
            if (this._stylesheet == null) {
                this._stylesheet = C9042e.m21619p(getClass().getResource("/jetty-dir.css"));
            }
            String initParameter3 = getInitParameter("cacheControl");
            if (initParameter3 != null) {
                this._cacheControl = new C11946h(initParameter3);
            }
            String initParameter4 = getInitParameter("resourceCache");
            int initInt = getInitInt("maxCacheSize", -2);
            int initInt2 = getInitInt("maxCachedFileSize", -2);
            int initInt3 = getInitInt("maxCachedFiles", -2);
            if (initParameter4 != null) {
                if (!(initInt == -1 && initInt2 == -2 && initInt3 == -2)) {
                    LOG.mo36850e("ignoring resource cache configuration, using resourceCache attribute", new Object[0]);
                }
                if (this._relativeResourceBase == null && this._resourceBase == null) {
                    C12183p pVar = (C12183p) this._servletContext.mo39957a(initParameter4);
                    this._cache = pVar;
                    LOG.mo36850e("Cache {}={}", initParameter4, pVar);
                } else {
                    throw new UnavailableException("resourceCache specified with resource bases");
                }
            }
            try {
                if (this._cache == null && initInt3 > 0) {
                    C12183p pVar2 = new C12183p((C12183p) null, this, this._mimeTypes, this._useFileMappedBuffer);
                    this._cache = pVar2;
                    if (initInt > 0) {
                        pVar2.mo43137m(initInt);
                    }
                    if (initInt2 >= -1) {
                        this._cache.mo43138n(initInt2);
                    }
                    if (initInt3 >= -1) {
                        this._cache.mo43139o(initInt3);
                    }
                }
                C9968d dVar = (C9968d) this._contextHandler.mo39923Q0(C9968d.class);
                this._servletHandler = dVar;
                for (ServletHolder servletHolder : dVar.mo40095j1()) {
                    if (servletHolder.mo40046V0() == this) {
                        this._defaultHolder = servletHolder;
                    }
                }
                C9003c cVar2 = LOG;
                if (cVar2.mo36846a()) {
                    cVar2.mo36850e("resource base = " + this._resourceBase, new Object[0]);
                }
            } catch (Exception e3) {
                LOG.mo36852g("EXCEPTION ", e3);
                throw new UnavailableException(e3.toString());
            }
        } else {
            throw new IllegalStateException("Alias checking disabled");
        }
    }

    /* access modifiers changed from: protected */
    public C9943d initContextHandler(C10359k kVar) {
        C9943d.C9945b m1;
        if (C9943d.m24416m1() != null) {
            m1 = C9943d.m24416m1();
        } else if (kVar instanceof C9943d.C9945b) {
            m1 = (C9943d.C9945b) kVar;
        } else {
            throw new IllegalArgumentException("The servletContext " + kVar + " " + kVar.getClass().getName() + " is not " + C9943d.C9945b.class.getName());
        }
        return m1.mo39960d();
    }

    /* access modifiers changed from: protected */
    public boolean passConditionalHeaders(C9277a aVar, C9279c cVar, C9042e eVar, C9892f fVar) {
        C11940d lastModified;
        C9277a aVar2 = aVar;
        C9279c cVar2 = cVar;
        try {
            if (!aVar.mo37767l().equals("HEAD")) {
                String r = aVar2.mo37770r("If-Modified-Since");
                if (r != null) {
                    C12186q z = C12186q.m31860z(cVar);
                    if (fVar == null || (lastModified = fVar.getLastModified()) == null || !r.equals(lastModified.toString())) {
                        long t = aVar2.mo37772t("If-Modified-Since");
                        if (t != -1 && eVar.mo36923k() / 1000 <= t / 1000) {
                            z.mo43153F(true);
                            z.mo37782p(304);
                            z.mo43162u();
                            return false;
                        }
                    } else {
                        z.mo43153F(true);
                        z.mo37782p(304);
                        z.mo43162u();
                        return false;
                    }
                }
                long t2 = aVar2.mo37772t("If-Unmodified-Since");
                if (t2 != -1 && eVar.mo36923k() / 1000 > t2 / 1000) {
                    cVar2.mo37778k(412);
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            if (!cVar.mo39908g()) {
                cVar2.mo37776d(400, e.getMessage());
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void sendData(C9277a aVar, C9279c cVar, boolean z, C9042e eVar, C9892f fVar, Enumeration enumeration) {
        boolean z2;
        long j;
        boolean z3;
        OutputStream outputStream;
        C9042e eVar2;
        OutputStream outputStream2;
        long j2;
        long j3;
        C9279c cVar2 = cVar;
        C9892f fVar2 = fVar;
        Enumeration enumeration2 = enumeration;
        if (fVar2 == null) {
            j = eVar.mo36924l();
            z2 = false;
        } else {
            C12170f n = C12151b.m31593o().mo42987n();
            z2 = (n instanceof C4002a) && ((C4002a) n).mo26590a();
            j = fVar.mo39766h();
        }
        try {
            outputStream = cVar.mo37797h();
            z3 = outputStream instanceof C12178l ? ((C12178l) outputStream).mo43049d() : C12151b.m31593o().mo42988p().mo39732s();
        } catch (IllegalStateException unused) {
            outputStream = new C11954n(cVar.mo37796f());
            z3 = true;
        }
        long j4 = -1;
        if (enumeration2 == null || !enumeration.hasMoreElements() || j < 0) {
            if (!z) {
                if (fVar2 == null || z3 || !(outputStream instanceof C12178l)) {
                    if (!z3) {
                        j4 = j;
                    }
                    writeHeaders(cVar2, fVar2, j4);
                    C11940d e = fVar2 == null ? null : fVar.mo39761e();
                    if (e != null) {
                        e.mo42433l(outputStream);
                        return;
                    }
                } else if (cVar2 instanceof C12186q) {
                    writeOptionHeaders(((C12186q) cVar2).mo43165x());
                    ((C12151b.C12153b) outputStream).mo43002i(fVar2);
                    return;
                } else {
                    C11940d f = z2 ? fVar.mo39762f() : fVar.mo39761e();
                    writeHeaders(cVar2, fVar2, j);
                    if (f != null) {
                        ((C12151b.C12153b) outputStream).mo43002i(f);
                        return;
                    }
                }
            }
            eVar.mo36939t(outputStream, 0, j);
            return;
        }
        List d = C12180n.m31738d(enumeration2, j);
        if (d == null || d.size() == 0) {
            writeHeaders(cVar2, fVar2, j);
            cVar2.mo37782p(TypedValues.CycleType.TYPE_PATH_ROTATE);
            cVar2.mo37781o("Content-Range", C12180n.m31739e(j));
            eVar2 = eVar;
            outputStream2 = outputStream;
            j2 = 0;
            j3 = j;
        } else if (d.size() == 1) {
            C12180n nVar = (C12180n) d.get(0);
            long c = nVar.mo43062c(j);
            writeHeaders(cVar2, fVar2, c);
            cVar2.mo37782p(206);
            cVar2.mo37781o("Content-Range", nVar.mo43063f(j));
            eVar2 = eVar;
            outputStream2 = outputStream;
            j2 = nVar.mo43060a(j);
            j3 = c;
        } else {
            writeHeaders(cVar2, fVar2, -1);
            String obj = fVar.getContentType().toString();
            C9993l lVar = new C9993l(outputStream);
            cVar2.mo37782p(206);
            cVar2.mo39906c((aVar.mo37770r("Request-Range") != null ? "multipart/x-byteranges; boundary=" : "multipart/byteranges; boundary=") + lVar.mo40264a());
            InputStream f2 = eVar.mo36921f();
            String[] strArr = new String[d.size()];
            int i = 0;
            int i2 = 0;
            while (i < d.size()) {
                C12180n nVar2 = (C12180n) d.get(i);
                strArr[i] = nVar2.mo43063f(j);
                i2 = (int) (((long) i2) + ((long) ((i > 0 ? 2 : 0) + 2 + lVar.mo40264a().length() + 2 + 12 + 2 + obj.length() + 2 + 13 + 2 + strArr[i].length() + 2 + 2)) + (nVar2.mo43061b(j) - nVar2.mo43060a(j)) + 1);
                i++;
            }
            cVar2.mo37798n(i2 + lVar.mo40264a().length() + 4 + 2 + 2);
            long j5 = 0;
            for (int i3 = 0; i3 < d.size(); i3++) {
                C12180n nVar3 = (C12180n) d.get(i3);
                lVar.mo40265c(obj, new String[]{"Content-Range: " + strArr[i3]});
                long a = nVar3.mo43060a(j);
                long c2 = nVar3.mo43062c(j);
                if (f2 != null) {
                    if (a < j5) {
                        f2.close();
                        f2 = eVar.mo36921f();
                        j5 = 0;
                    }
                    if (j5 < a) {
                        f2.skip(a - j5);
                    } else {
                        a = j5;
                    }
                    C9985i.m24689d(f2, lVar, c2);
                    j5 = a + c2;
                } else {
                    eVar.mo36939t(lVar, a, c2);
                }
            }
            if (f2 != null) {
                f2.close();
            }
            lVar.close();
            return;
        }
        eVar2.mo36939t(outputStream2, j2, j3);
    }

    /* access modifiers changed from: protected */
    public void sendDirectory(C9277a aVar, C9279c cVar, C9042e eVar, String str) {
        if (!this._dirAllowed) {
            cVar.mo37778k(TypedValues.CycleType.TYPE_ALPHA);
            return;
        }
        String a = C9997p.m24723a(aVar.mo37774w(), MiotCloudImpl.COOKIE_PATH);
        if (this._resourceBase == null) {
            this._contextHandler.mo39939i1();
        }
        boolean z = true;
        if (str.length() <= 1) {
            z = false;
        }
        String g = eVar.mo36936g(a, z);
        if (g == null) {
            cVar.mo37776d(TypedValues.CycleType.TYPE_ALPHA, "No directory");
            return;
        }
        byte[] bytes = g.getBytes("UTF-8");
        cVar.mo39906c("text/html; charset=UTF-8");
        cVar.mo37798n(bytes.length);
        cVar.mo37797h().write(bytes);
    }

    /* access modifiers changed from: protected */
    public void writeHeaders(C9279c cVar, C9892f fVar, long j) {
        if (fVar.getContentType() != null && cVar.getContentType() == null) {
            cVar.mo39906c(fVar.getContentType().toString());
        }
        if (cVar instanceof C12186q) {
            C12186q qVar = (C12186q) cVar;
            C9895h x = qVar.mo43165x();
            if (fVar.getLastModified() != null) {
                x.mo39780D(C9908k.f18092l, fVar.getLastModified());
            } else if (fVar.mo39763g() != null) {
                long k = fVar.mo39763g().mo36923k();
                if (k != -1) {
                    x.mo39782F(C9908k.f18092l, k);
                }
            }
            if (j != -1) {
                qVar.mo43156I(j);
            }
            writeOptionHeaders(x);
            return;
        }
        long k2 = fVar.mo39763g().mo36923k();
        if (k2 >= 0) {
            cVar.mo37775a("Last-Modified", k2);
        }
        if (j != -1) {
            if (j < 2147483647L) {
                cVar.mo37798n((int) j);
            } else {
                cVar.mo37781o("Content-Length", Long.toString(j));
            }
        }
        writeOptionHeaders(cVar);
    }

    /* access modifiers changed from: protected */
    public void writeOptionHeaders(C9279c cVar) {
        if (this._acceptRanges) {
            cVar.mo37781o("Accept-Ranges", "bytes");
        }
        C11946h hVar = this._cacheControl;
        if (hVar != null) {
            cVar.mo37781o("Cache-Control", hVar.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void writeOptionHeaders(C9895h hVar) {
        if (this._acceptRanges) {
            hVar.mo39780D(C9908k.f18094n, C9907j.f18083g);
        }
        C11946h hVar2 = this._cacheControl;
        if (hVar2 != null) {
            hVar.mo39780D(C9908k.f18088h, hVar2);
        }
    }
}

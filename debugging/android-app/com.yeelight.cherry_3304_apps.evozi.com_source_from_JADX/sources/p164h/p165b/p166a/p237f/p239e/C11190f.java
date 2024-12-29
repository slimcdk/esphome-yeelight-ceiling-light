package p164h.p165b.p166a.p237f.p239e;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.SAXParseException;
import p164h.p165b.p166a.p240h.C11223m;
import p164h.p165b.p166a.p240h.p248s.C11323c;
import p164h.p257c.p261c.C11513b;

/* renamed from: h.b.a.f.e.f */
public class C11190f extends C11192h {

    /* renamed from: b */
    private static Logger f22256b = Logger.getLogger(C11190f.class.getName());

    /* renamed from: s */
    private String m29137s(String str) {
        int indexOf = str.indexOf("<?xml");
        return indexOf == -1 ? str : str.substring(indexOf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e A[SYNTHETIC, Splitter:B:19:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e A[SYNTHETIC, Splitter:B:30:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf A[SYNTHETIC, Splitter:B:38:0x00bf] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <D extends p164h.p165b.p166a.p240h.p248s.C11323c> D mo35549a(D r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0007
            java.lang.String r10 = r10.trim()     // Catch:{ d -> 0x000f }
        L_0x0007:
            h.b.a.h.s.c r9 = super.mo35549a(r9, r10)     // Catch:{ d -> 0x000f }
            return r9
        L_0x000c:
            r9 = move-exception
            goto L_0x00e7
        L_0x000f:
            r1 = move-exception
            java.util.logging.Logger r2 = f22256b     // Catch:{ m -> 0x000c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ m -> 0x000c }
            r3.<init>()     // Catch:{ m -> 0x000c }
            java.lang.String r4 = "Regular parsing failed: "
            r3.append(r4)     // Catch:{ m -> 0x000c }
            java.lang.Throwable r4 = p164h.p257c.p259b.C11495a.m30173a(r1)     // Catch:{ m -> 0x000c }
            java.lang.String r4 = r4.getMessage()     // Catch:{ m -> 0x000c }
            r3.append(r4)     // Catch:{ m -> 0x000c }
            java.lang.String r3 = r3.toString()     // Catch:{ m -> 0x000c }
            r2.warning(r3)     // Catch:{ m -> 0x000c }
            java.lang.String r2 = r8.m29137s(r10)     // Catch:{ m -> 0x000c }
            if (r2 == 0) goto L_0x0058
            h.b.a.h.s.c r9 = super.mo35549a(r9, r2)     // Catch:{ d -> 0x0039 }
            return r9
        L_0x0039:
            r2 = move-exception
            java.util.logging.Logger r3 = f22256b     // Catch:{ m -> 0x000c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ m -> 0x000c }
            r4.<init>()     // Catch:{ m -> 0x000c }
            java.lang.String r5 = "Removing leading garbage didn't work: "
            r4.append(r5)     // Catch:{ m -> 0x000c }
            java.lang.Throwable r2 = p164h.p257c.p259b.C11495a.m30173a(r2)     // Catch:{ m -> 0x000c }
            java.lang.String r2 = r2.getMessage()     // Catch:{ m -> 0x000c }
            r4.append(r2)     // Catch:{ m -> 0x000c }
            java.lang.String r2 = r4.toString()     // Catch:{ m -> 0x000c }
            r3.warning(r2)     // Catch:{ m -> 0x000c }
        L_0x0058:
            java.lang.String r2 = r8.mo35551t(r10, r1)     // Catch:{ m -> 0x000c }
            if (r2 == 0) goto L_0x0082
            h.b.a.h.s.c r9 = super.mo35549a(r9, r2)     // Catch:{ d -> 0x0063 }
            return r9
        L_0x0063:
            r2 = move-exception
            java.util.logging.Logger r3 = f22256b     // Catch:{ m -> 0x000c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ m -> 0x000c }
            r4.<init>()     // Catch:{ m -> 0x000c }
            java.lang.String r5 = "Removing trailing garbage didn't work: "
            r4.append(r5)     // Catch:{ m -> 0x000c }
            java.lang.Throwable r2 = p164h.p257c.p259b.C11495a.m30173a(r2)     // Catch:{ m -> 0x000c }
            java.lang.String r2 = r2.getMessage()     // Catch:{ m -> 0x000c }
            r4.append(r2)     // Catch:{ m -> 0x000c }
            java.lang.String r2 = r4.toString()     // Catch:{ m -> 0x000c }
            r3.warning(r2)     // Catch:{ m -> 0x000c }
        L_0x0082:
            r2 = 0
            r3 = r10
            r4 = r1
        L_0x0085:
            r5 = 5
            if (r2 >= r5) goto L_0x00b5
            java.lang.String r3 = r8.mo35552u(r3, r4)     // Catch:{ m -> 0x000c }
            if (r3 == 0) goto L_0x00b5
            h.b.a.h.s.c r9 = super.mo35549a(r9, r3)     // Catch:{ d -> 0x0093 }
            return r9
        L_0x0093:
            r4 = move-exception
            java.util.logging.Logger r5 = f22256b     // Catch:{ m -> 0x000c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ m -> 0x000c }
            r6.<init>()     // Catch:{ m -> 0x000c }
            java.lang.String r7 = "Fixing namespace prefix didn't work: "
            r6.append(r7)     // Catch:{ m -> 0x000c }
            java.lang.Throwable r7 = p164h.p257c.p259b.C11495a.m30173a(r4)     // Catch:{ m -> 0x000c }
            java.lang.String r7 = r7.getMessage()     // Catch:{ m -> 0x000c }
            r6.append(r7)     // Catch:{ m -> 0x000c }
            java.lang.String r6 = r6.toString()     // Catch:{ m -> 0x000c }
            r5.warning(r6)     // Catch:{ m -> 0x000c }
            int r2 = r2 + 1
            goto L_0x0085
        L_0x00b5:
            java.lang.String r2 = p164h.p257c.p261c.C11518d.m30249c(r10)     // Catch:{ m -> 0x000c }
            boolean r3 = r2.equals(r10)     // Catch:{ m -> 0x000c }
            if (r3 != 0) goto L_0x00e3
            h.b.a.h.s.c r9 = super.mo35549a(r9, r2)     // Catch:{ d -> 0x00c4 }
            return r9
        L_0x00c4:
            r9 = move-exception
            java.util.logging.Logger r2 = f22256b     // Catch:{ m -> 0x000c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ m -> 0x000c }
            r3.<init>()     // Catch:{ m -> 0x000c }
            java.lang.String r4 = "Fixing XML entities didn't work: "
            r3.append(r4)     // Catch:{ m -> 0x000c }
            java.lang.Throwable r9 = p164h.p257c.p259b.C11495a.m30173a(r9)     // Catch:{ m -> 0x000c }
            java.lang.String r9 = r9.getMessage()     // Catch:{ m -> 0x000c }
            r3.append(r9)     // Catch:{ m -> 0x000c }
            java.lang.String r9 = r3.toString()     // Catch:{ m -> 0x000c }
            r2.warning(r9)     // Catch:{ m -> 0x000c }
        L_0x00e3:
            r8.mo35553v(r10, r1)     // Catch:{ m -> 0x000c }
            throw r0
        L_0x00e7:
            r8.mo35554w(r10, r0, r9)
            goto L_0x00ec
        L_0x00eb:
            throw r0
        L_0x00ec:
            goto L_0x00eb
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p237f.p239e.C11190f.mo35549a(h.b.a.h.s.c, java.lang.String):h.b.a.h.s.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo35551t(String str, C11188d dVar) {
        int indexOf = str.indexOf("</root>");
        if (indexOf == -1) {
            f22256b.warning("No closing </root> element in descriptor");
            return null;
        } else if (str.length() == indexOf + 7) {
            return null;
        } else {
            f22256b.warning("Detected garbage characters after <root> node, removing");
            return str.substring(0, indexOf) + "</root>";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo35552u(String str, C11188d dVar) {
        String message;
        Logger logger;
        String str2;
        Throwable cause = dVar.getCause();
        if ((!(cause instanceof SAXParseException) && !(cause instanceof C11513b)) || (message = cause.getMessage()) == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("The prefix \"(.*)\" for element").matcher(message);
        if (!matcher.find() || matcher.groupCount() != 1) {
            matcher = Pattern.compile("undefined prefix: ([^ ]*)").matcher(message);
            if (!matcher.find() || matcher.groupCount() != 1) {
                return null;
            }
        }
        String group = matcher.group(1);
        Logger logger2 = f22256b;
        logger2.warning("Fixing missing namespace declaration for: " + group);
        Matcher matcher2 = Pattern.compile("<root([^>]*)").matcher(str);
        if (!matcher2.find() || matcher2.groupCount() != 1) {
            logger = f22256b;
            str2 = "Could not find <root> element attributes";
        } else {
            String group2 = matcher2.group(1);
            Logger logger3 = f22256b;
            logger3.fine("Preserving existing <root> element attributes/namespace declarations: " + matcher2.group(0));
            Matcher matcher3 = Pattern.compile("<root[^>]*>(.*)</root>", 32).matcher(str);
            if (!matcher3.find() || matcher3.groupCount() != 1) {
                logger = f22256b;
                str2 = "Could not extract body of <root> element";
            } else {
                String group3 = matcher3.group(1);
                return "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><root " + String.format(Locale.ROOT, "xmlns:%s=\"urn:schemas-dlna-org:device-1-0\"", new Object[]{group}) + group2 + ">" + group3 + "</root>";
            }
        }
        logger.fine(str2);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo35553v(String str, C11188d dVar) {
        throw dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public <D extends C11323c> D mo35554w(String str, D d, C11223m mVar) {
        throw mVar;
    }
}

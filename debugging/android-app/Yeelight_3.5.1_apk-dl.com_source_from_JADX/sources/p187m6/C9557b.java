package p187m6;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.C10067b;
import org.seamless.xml.ParserException;
import org.xml.sax.SAXParseException;

/* renamed from: m6.b */
public class C9557b extends C9559d {

    /* renamed from: b */
    private static Logger f17456b = Logger.getLogger(C9557b.class.getName());

    /* renamed from: s */
    private String m23258s(String str) {
        int indexOf = str.indexOf("<?xml");
        return indexOf == -1 ? str : str.substring(indexOf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d A[SYNTHETIC, Splitter:B:18:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d A[SYNTHETIC, Splitter:B:29:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be A[SYNTHETIC, Splitter:B:37:0x00be] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <D extends org.fourthline.cling.model.meta.C10067b> D mo38534a(D r8, java.lang.String r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x0006
            java.lang.String r9 = r9.trim()     // Catch:{ DescriptorBindingException -> 0x000e }
        L_0x0006:
            org.fourthline.cling.model.meta.b r8 = super.mo38534a(r8, r9)     // Catch:{ DescriptorBindingException -> 0x000e }
            return r8
        L_0x000b:
            r8 = move-exception
            goto L_0x00e6
        L_0x000e:
            r0 = move-exception
            java.util.logging.Logger r1 = f17456b     // Catch:{ ValidationException -> 0x000b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ValidationException -> 0x000b }
            r2.<init>()     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r3 = "Regular parsing failed: "
            r2.append(r3)     // Catch:{ ValidationException -> 0x000b }
            java.lang.Throwable r3 = org.seamless.util.C10243a.m25753a(r0)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r3 = r3.getMessage()     // Catch:{ ValidationException -> 0x000b }
            r2.append(r3)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r2 = r2.toString()     // Catch:{ ValidationException -> 0x000b }
            r1.warning(r2)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r1 = r7.m23258s(r9)     // Catch:{ ValidationException -> 0x000b }
            if (r1 == 0) goto L_0x0057
            org.fourthline.cling.model.meta.b r8 = super.mo38534a(r8, r1)     // Catch:{ DescriptorBindingException -> 0x0038 }
            return r8
        L_0x0038:
            r1 = move-exception
            java.util.logging.Logger r2 = f17456b     // Catch:{ ValidationException -> 0x000b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ValidationException -> 0x000b }
            r3.<init>()     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r4 = "Removing leading garbage didn't work: "
            r3.append(r4)     // Catch:{ ValidationException -> 0x000b }
            java.lang.Throwable r1 = org.seamless.util.C10243a.m25753a(r1)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r1 = r1.getMessage()     // Catch:{ ValidationException -> 0x000b }
            r3.append(r1)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r1 = r3.toString()     // Catch:{ ValidationException -> 0x000b }
            r2.warning(r1)     // Catch:{ ValidationException -> 0x000b }
        L_0x0057:
            java.lang.String r1 = r7.mo38536t(r9, r0)     // Catch:{ ValidationException -> 0x000b }
            if (r1 == 0) goto L_0x0081
            org.fourthline.cling.model.meta.b r8 = super.mo38534a(r8, r1)     // Catch:{ DescriptorBindingException -> 0x0062 }
            return r8
        L_0x0062:
            r1 = move-exception
            java.util.logging.Logger r2 = f17456b     // Catch:{ ValidationException -> 0x000b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ValidationException -> 0x000b }
            r3.<init>()     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r4 = "Removing trailing garbage didn't work: "
            r3.append(r4)     // Catch:{ ValidationException -> 0x000b }
            java.lang.Throwable r1 = org.seamless.util.C10243a.m25753a(r1)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r1 = r1.getMessage()     // Catch:{ ValidationException -> 0x000b }
            r3.append(r1)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r1 = r3.toString()     // Catch:{ ValidationException -> 0x000b }
            r2.warning(r1)     // Catch:{ ValidationException -> 0x000b }
        L_0x0081:
            r1 = 0
            r2 = r9
            r3 = r0
        L_0x0084:
            r4 = 5
            if (r1 >= r4) goto L_0x00b4
            java.lang.String r2 = r7.mo38537u(r2, r3)     // Catch:{ ValidationException -> 0x000b }
            if (r2 == 0) goto L_0x00b4
            org.fourthline.cling.model.meta.b r8 = super.mo38534a(r8, r2)     // Catch:{ DescriptorBindingException -> 0x0092 }
            return r8
        L_0x0092:
            r3 = move-exception
            java.util.logging.Logger r4 = f17456b     // Catch:{ ValidationException -> 0x000b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ValidationException -> 0x000b }
            r5.<init>()     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r6 = "Fixing namespace prefix didn't work: "
            r5.append(r6)     // Catch:{ ValidationException -> 0x000b }
            java.lang.Throwable r6 = org.seamless.util.C10243a.m25753a(r3)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r6 = r6.getMessage()     // Catch:{ ValidationException -> 0x000b }
            r5.append(r6)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r5 = r5.toString()     // Catch:{ ValidationException -> 0x000b }
            r4.warning(r5)     // Catch:{ ValidationException -> 0x000b }
            int r1 = r1 + 1
            goto L_0x0084
        L_0x00b4:
            java.lang.String r1 = org.seamless.xml.C10258d.m25793c(r9)     // Catch:{ ValidationException -> 0x000b }
            boolean r2 = r1.equals(r9)     // Catch:{ ValidationException -> 0x000b }
            if (r2 != 0) goto L_0x00e2
            org.fourthline.cling.model.meta.b r8 = super.mo38534a(r8, r1)     // Catch:{ DescriptorBindingException -> 0x00c3 }
            return r8
        L_0x00c3:
            r8 = move-exception
            java.util.logging.Logger r1 = f17456b     // Catch:{ ValidationException -> 0x000b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ValidationException -> 0x000b }
            r2.<init>()     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r3 = "Fixing XML entities didn't work: "
            r2.append(r3)     // Catch:{ ValidationException -> 0x000b }
            java.lang.Throwable r8 = org.seamless.util.C10243a.m25753a(r8)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r8 = r8.getMessage()     // Catch:{ ValidationException -> 0x000b }
            r2.append(r8)     // Catch:{ ValidationException -> 0x000b }
            java.lang.String r8 = r2.toString()     // Catch:{ ValidationException -> 0x000b }
            r1.warning(r8)     // Catch:{ ValidationException -> 0x000b }
        L_0x00e2:
            r7.mo38538v(r9, r0)     // Catch:{ ValidationException -> 0x000b }
            goto L_0x00ee
        L_0x00e6:
            r0 = 0
            org.fourthline.cling.model.meta.b r8 = r7.mo38539w(r9, r0, r8)
            if (r8 == 0) goto L_0x00ee
            return r8
        L_0x00ee:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "No device produced, did you swallow exceptions in your subclass?"
            r8.<init>(r9)
            goto L_0x00f7
        L_0x00f6:
            throw r8
        L_0x00f7:
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: p187m6.C9557b.mo38534a(org.fourthline.cling.model.meta.b, java.lang.String):org.fourthline.cling.model.meta.b");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo38536t(String str, DescriptorBindingException descriptorBindingException) {
        int indexOf = str.indexOf("</root>");
        if (indexOf == -1) {
            f17456b.warning("No closing </root> element in descriptor");
            return null;
        } else if (str.length() == indexOf + 7) {
            return null;
        } else {
            f17456b.warning("Detected garbage characters after <root> node, removing");
            return str.substring(0, indexOf) + "</root>";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo38537u(String str, DescriptorBindingException descriptorBindingException) {
        String message;
        Logger logger;
        String str2;
        Throwable cause = descriptorBindingException.getCause();
        if ((!(cause instanceof SAXParseException) && !(cause instanceof ParserException)) || (message = cause.getMessage()) == null) {
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
        Logger logger2 = f17456b;
        logger2.warning("Fixing missing namespace declaration for: " + group);
        Matcher matcher2 = Pattern.compile("<root([^>]*)").matcher(str);
        if (!matcher2.find() || matcher2.groupCount() != 1) {
            logger = f17456b;
            str2 = "Could not find <root> element attributes";
        } else {
            String group2 = matcher2.group(1);
            Logger logger3 = f17456b;
            logger3.fine("Preserving existing <root> element attributes/namespace declarations: " + matcher2.group(0));
            Matcher matcher3 = Pattern.compile("<root[^>]*>(.*)</root>", 32).matcher(str);
            if (!matcher3.find() || matcher3.groupCount() != 1) {
                logger = f17456b;
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
    public void mo38538v(String str, DescriptorBindingException descriptorBindingException) {
        throw descriptorBindingException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public <D extends C10067b> D mo38539w(String str, D d, ValidationException validationException) {
        throw validationException;
    }
}

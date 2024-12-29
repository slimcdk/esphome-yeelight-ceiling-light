package org.eclipse.jetty.util.security;

import java.util.Arrays;
import org.eclipse.jetty.util.security.Credential;
import p152e6.C9001b;
import p152e6.C9003c;

public class Password extends Credential {
    private static final C9003c LOG = C9001b.m21450a(Password.class);
    public static final String __OBFUSCATE = "OBF:";
    private static final long serialVersionUID = 5062906681431569445L;
    private String _pw;

    public Password(String str) {
        while (true) {
            this._pw = str;
            String str2 = this._pw;
            if (str2 != null && str2.startsWith(__OBFUSCATE)) {
                str = deobfuscate(this._pw);
            } else {
                return;
            }
        }
    }

    public static String deobfuscate(String str) {
        if (str.startsWith(__OBFUSCATE)) {
            str = str.substring(4);
        }
        byte[] bArr = new byte[(str.length() / 2)];
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 4;
            int parseInt = Integer.parseInt(str.substring(i, i3), 36);
            bArr[i2] = (byte) ((((parseInt / 256) + (parseInt % 256)) - 254) / 2);
            i = i3;
            i2++;
        }
        return new String(bArr, 0, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r4.length() != 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.eclipse.jetty.util.security.Password getPassword(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r4 = java.lang.System.getProperty(r3, r4)
            if (r4 == 0) goto L_0x000f
            int r0 = r4.length()
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r5 = r4
            goto L_0x0062
        L_0x000f:
            java.io.PrintStream r0 = java.lang.System.out     // Catch:{ IOException -> 0x0052 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052 }
            r1.<init>()     // Catch:{ IOException -> 0x0052 }
            r1.append(r3)     // Catch:{ IOException -> 0x0052 }
            if (r5 == 0) goto L_0x0024
            int r3 = r5.length()     // Catch:{ IOException -> 0x0052 }
            if (r3 <= 0) goto L_0x0024
            java.lang.String r3 = " [dft]"
            goto L_0x0026
        L_0x0024:
            java.lang.String r3 = ""
        L_0x0026:
            r1.append(r3)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r3 = " : "
            r1.append(r3)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r3 = r1.toString()     // Catch:{ IOException -> 0x0052 }
            r0.print(r3)     // Catch:{ IOException -> 0x0052 }
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ IOException -> 0x0052 }
            r3.flush()     // Catch:{ IOException -> 0x0052 }
            r3 = 512(0x200, float:7.175E-43)
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x0052 }
            java.io.InputStream r0 = java.lang.System.in     // Catch:{ IOException -> 0x0052 }
            int r0 = r0.read(r3)     // Catch:{ IOException -> 0x0052 }
            if (r0 <= 0) goto L_0x005a
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0052 }
            r2 = 0
            r1.<init>(r3, r2, r0)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r3 = r1.trim()     // Catch:{ IOException -> 0x0052 }
            r4 = r3
            goto L_0x005a
        L_0x0052:
            r3 = move-exception
            e6.c r0 = LOG
            java.lang.String r1 = "EXCEPTION "
            r0.mo36852g(r1, r3)
        L_0x005a:
            if (r4 == 0) goto L_0x0062
            int r3 = r4.length()
            if (r3 != 0) goto L_0x000d
        L_0x0062:
            org.eclipse.jetty.util.security.Password r3 = new org.eclipse.jetty.util.security.Password
            r3.<init>(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.security.Password.getPassword(java.lang.String, java.lang.String, java.lang.String):org.eclipse.jetty.util.security.Password");
    }

    public static void main(String[] strArr) {
        char c = 1;
        if (!(strArr.length == 1 || strArr.length == 2)) {
            System.err.println("Usage - java org.eclipse.jetty.security.Password [<user>] <password>");
            System.err.println("If the password is ?, the user will be prompted for the password");
            System.exit(1);
        }
        if (strArr.length == 1) {
            c = 0;
        }
        String str = strArr[c];
        Password password = new Password(str);
        System.err.println(password.toString());
        System.err.println(obfuscate(password.toString()));
        System.err.println(Credential.MD5.digest(str));
        if (strArr.length == 2) {
            System.err.println(Credential.Crypt.crypt(strArr[0], password.toString()));
        }
    }

    public static String obfuscate(String str) {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = str.getBytes();
        sb.append(__OBFUSCATE);
        int i = 0;
        while (i < bytes.length) {
            byte b = bytes[i];
            i++;
            byte b2 = bytes[str.length() - i];
            int i2 = b + Byte.MAX_VALUE;
            String num = Integer.toString(((i2 + b2) * 256) + (i2 - b2), 36);
            int length = num.length();
            if (length == 1) {
                sb.append('0');
            } else if (length != 2) {
                if (length != 3) {
                    sb.append(num);
                }
                sb.append('0');
                sb.append(num);
            }
            sb.append('0');
            sb.append('0');
            sb.append(num);
        }
        return sb.toString();
    }

    public boolean check(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Password) {
            return obj.equals(this._pw);
        }
        if (obj instanceof String) {
            return obj.equals(this._pw);
        }
        if (obj instanceof char[]) {
            return Arrays.equals(this._pw.toCharArray(), (char[]) obj);
        }
        if (obj instanceof Credential) {
            return ((Credential) obj).check(this._pw);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Password) {
            String str = ((Password) obj)._pw;
            String str2 = this._pw;
            if (str != str2) {
                return str2 != null && str2.equals(str);
            }
            return true;
        } else if (obj instanceof String) {
            return obj.equals(this._pw);
        } else {
            return false;
        }
    }

    public int hashCode() {
        String str = this._pw;
        return str == null ? super.hashCode() : str.hashCode();
    }

    public String toStarString() {
        return "*****************************************************".substring(0, this._pw.length());
    }

    public String toString() {
        return this._pw;
    }
}

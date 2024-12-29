package com.miot.service.connection.bluetooth;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.miot.service.common.crypto.rc4coder.Coder;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.List;

public class XMStringUtils {

    static class MyOnGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
        int maxLine;
        String textValue;
        TextView textView;

        public MyOnGlobalLayoutListener(TextView textView2, String str, int i) {
            this.textView = textView2;
            this.textValue = str;
            this.maxLine = i;
        }

        public void onGlobalLayout() {
            this.textView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (this.textView.getLineCount() > this.maxLine) {
                int lineEnd = this.textView.getLayout().getLineEnd(this.maxLine - 1);
                this.textView.setText(this.textValue.subSequence(0, lineEnd - 3) + "...");
            }
        }
    }

    public static boolean contains(String str, String str2) {
        int i = 0;
        int i2 = 0;
        while (i < str2.length() && i2 < str.length()) {
            if (str2.charAt(i) == str.charAt(i2)) {
                i++;
            }
            i2++;
        }
        return i == str2.length();
    }

    public static byte[] getBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static String getHexString(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            str = str + Integer.toString((b & 255) + 256, 16).substring(1);
        }
        return str;
    }

    public static String getMd5Digest(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(getBytes(str));
            return String.format("%1$032X", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getNonNullString(String str) {
        return str != null ? str : "";
    }

    public static String getSHA1Digest(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(getBytes(str));
            return String.format("%1$040X", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getSHA1DigestInLowerCase(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(getBytes(str));
            return String.format("%1$040x", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getString(Context context, int i) {
        return context.getString(i);
    }

    public static String[] getStringArray(Context context, int i) {
        return context.getResources().getStringArray(i);
    }

    public static String getStringNotNull(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static int getStringUTF8Length(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    public static String getSubWord(String str, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            i2 = isAscii(str, i3) ? i2 + 1 : i2 + 2;
            if (i2 == i) {
                return str.substring(0, i3 + 1);
            }
            if (i2 > i) {
                return str.substring(0, i3);
            }
        }
        return str;
    }

    public static int getWordCount(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i = isAscii(str, i2) ? i + 1 : i + 2;
        }
        return i;
    }

    @Deprecated
    public static void handleTextViewEllipsize(TextView textView, String str, int i) {
        textView.setText(str);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new MyOnGlobalLayoutListener(textView, str, i));
    }

    public static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static boolean isAscii(int i) {
        return i >= 0 && i <= 255;
    }

    public static boolean isAscii(String str, int i) {
        return isAscii(Character.codePointAt(str, i));
    }

    public static String join(Collection<?> collection, char c) {
        if (collection == null) {
            return null;
        }
        return join(collection.iterator(), c);
    }

    public static String join(Collection<?> collection, String str) {
        if (collection == null) {
            return null;
        }
        return join(collection.iterator(), str);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[SYNTHETIC] */
    public static java.lang.String join(java.util.Iterator<?> r3, char r4) {
        /*
            if (r3 != 0) goto L_0x0004
            r3 = 0
            return r3
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x000d
            java.lang.String r3 = ""
            return r3
        L_0x000d:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x001c
            java.lang.String r3 = r0.toString()
            return r3
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 256(0x100, float:3.59E-43)
            r1.<init>(r2)
            if (r0 == 0) goto L_0x0028
        L_0x0025:
            r1.append(r0)
        L_0x0028:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0038
            r1.append(r4)
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L_0x0028
            goto L_0x0025
        L_0x0038:
            java.lang.String r3 = r1.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.connection.bluetooth.XMStringUtils.join(java.util.Iterator, char):java.lang.String");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[SYNTHETIC] */
    public static java.lang.String join(java.util.Iterator<?> r3, java.lang.String r4) {
        /*
            if (r3 != 0) goto L_0x0004
            r3 = 0
            return r3
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x000d
            java.lang.String r3 = ""
            return r3
        L_0x000d:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x001c
            java.lang.String r3 = r0.toString()
            return r3
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 256(0x100, float:3.59E-43)
            r1.<init>(r2)
            if (r0 == 0) goto L_0x0028
        L_0x0025:
            r1.append(r0)
        L_0x0028:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003a
            if (r4 == 0) goto L_0x0033
            r1.append(r4)
        L_0x0033:
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L_0x0028
            goto L_0x0025
        L_0x003a:
            java.lang.String r3 = r1.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.connection.bluetooth.XMStringUtils.join(java.util.Iterator, java.lang.String):java.lang.String");
    }

    public static String join(Object[] objArr) {
        return join(objArr, (String) null);
    }

    public static String join(Object[] objArr, char c) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, c, 0, objArr.length);
    }

    public static String join(Object[] objArr, char c, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i3 * ((objArr[i] == null ? 16 : objArr[i].toString().length()) + 1));
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                sb.append(c);
            }
            if (objArr[i4] != null) {
                sb.append(objArr[i4]);
            }
        }
        return sb.toString();
    }

    public static String join(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, str, 0, objArr.length);
    }

    public static String join(Object[] objArr, String str, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i3 * ((objArr[i] == null ? 16 : objArr[i].toString().length()) + str.length()));
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                sb.append(str);
            }
            if (objArr[i4] != null) {
                sb.append(objArr[i4]);
            }
        }
        return sb.toString();
    }

    public static int stringToInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int[] toIntArray(List<Integer> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    public static long[] toLongArray(List<Long> list) {
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = list.get(i).longValue();
        }
        return jArr;
    }

    public static String[] toStrArray(List<String> list) {
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        return strArr;
    }
}

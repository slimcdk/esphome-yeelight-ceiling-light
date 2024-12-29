package org.seamless.util;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;

public class URIUtil {

    /* renamed from: a */
    public static final BitSet f19031a = new BitSet() {
        {
            for (int i = 97; i <= 122; i++) {
                set(i);
            }
            for (int i2 = 65; i2 <= 90; i2++) {
                set(i2);
            }
            for (int i3 = 48; i3 <= 57; i3++) {
                set(i3);
            }
            set(33);
            set(36);
            set(38);
            set(39);
            set(40);
            set(41);
            set(42);
            set(43);
            set(44);
            set(59);
            set(61);
            set(45);
            set(46);
            set(95);
            set(SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE);
            set(58);
            set(64);
        }
    };

    /* renamed from: b */
    public static final BitSet f19032b = new BitSet() {
        {
            or(URIUtil.f19031a);
            clear(59);
        }
    };

    static {
        new BitSet() {
            {
                or(URIUtil.f19031a);
                clear(59);
                clear(61);
            }
        };
        new BitSet() {
            {
                or(URIUtil.f19031a);
                clear(59);
            }
        };
        new BitSet() {
            {
                or(URIUtil.f19031a);
                set(47);
                set(63);
                clear(61);
                clear(38);
                clear(43);
            }
        };
        new BitSet() {
            {
                or(URIUtil.f19031a);
                set(47);
                set(63);
            }
        };
    }

    /* renamed from: a */
    public static URI m25748a(URI uri, URI uri2) {
        if (uri == null && !uri2.isAbsolute()) {
            throw new IllegalArgumentException("Base URI is null and given URI is not absolute");
        } else if (uri == null && uri2.isAbsolute()) {
            return uri2;
        } else {
            if (uri.getPath().length() == 0) {
                try {
                    uri = new URI(uri.getScheme(), uri.getAuthority(), MiotCloudImpl.COOKIE_PATH, uri.getQuery(), uri.getFragment());
                } catch (Exception e) {
                    throw new IllegalArgumentException(e);
                }
            }
            return uri.resolve(uri2);
        }
    }

    /* renamed from: b */
    public static URL m25749b(URL url, URI uri) {
        if (url == null && !uri.isAbsolute()) {
            throw new IllegalArgumentException("Base URL is null and given URI is not absolute");
        } else if (url != null || !uri.isAbsolute()) {
            try {
                return m25748a(url.toURI(), uri).toURL();
            } catch (Exception e) {
                throw new IllegalArgumentException("Base URL is not an URI, or can't create absolute URI (null?), or absolute URI can not be converted to URL", e);
            }
        } else {
            try {
                return uri.toURL();
            } catch (Exception unused) {
                throw new IllegalArgumentException("Base URL was null and given URI can't be converted to URL");
            }
        }
    }

    /* renamed from: c */
    public static String m25750c(BitSet bitSet, String str, String str2) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length() * 3);
        try {
            for (char c : str.toCharArray()) {
                if (bitSet.get(c)) {
                    sb.append(c);
                } else {
                    byte[] bytes = String.valueOf(c).getBytes(str2);
                    int length = bytes.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(String.format("%%%1$02X", new Object[]{Integer.valueOf(bytes[i] & 255)}));
                    }
                }
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static String m25751d(String str) {
        return m25750c(f19032b, str, "UTF-8");
    }

    /* renamed from: e */
    public static URL m25752e(URI uri) {
        if (uri == null) {
            return null;
        }
        try {
            return uri.toURL();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

package org.eclipse.jetty.util.security;

import com.miot.service.common.crypto.rc4coder.Coder;
import java.io.Serializable;
import java.security.MessageDigest;
import org.eclipse.jetty.util.C9996o;
import p152e6.C9001b;
import p152e6.C9003c;

public abstract class Credential implements Serializable {
    /* access modifiers changed from: private */
    public static final C9003c LOG = C9001b.m21450a(Credential.class);
    private static final long serialVersionUID = -7760551052768181572L;

    public static class Crypt extends Credential {
        public static final String __TYPE = "CRYPT:";
        private static final long serialVersionUID = -2027792997664744210L;
        private final String _cooked;

        Crypt(String str) {
            this._cooked = str.startsWith(__TYPE) ? str.substring(6) : str;
        }

        public static String crypt(String str, String str2) {
            return __TYPE + C10002c.m24745a(str2, str);
        }

        public boolean check(Object obj) {
            if (obj instanceof char[]) {
                obj = new String((char[]) obj);
            }
            if (!(obj instanceof String) && !(obj instanceof Password)) {
                C9003c access$000 = Credential.LOG;
                access$000.mo36847b("Can't check " + obj.getClass() + " against CRYPT", new Object[0]);
            }
            String obj2 = obj.toString();
            String str = this._cooked;
            return str.equals(C10002c.m24745a(obj2, str));
        }
    }

    public static class MD5 extends Credential {
        public static final String __TYPE = "MD5:";
        private static MessageDigest __md = null;
        public static final Object __md5Lock = new Object();
        private static final long serialVersionUID = 5533846540822684240L;
        private final byte[] _digest;

        MD5(String str) {
            this._digest = C9996o.m24716c(str.startsWith(__TYPE) ? str.substring(4) : str, 16);
        }

        public static String digest(String str) {
            byte[] digest;
            try {
                synchronized (__md5Lock) {
                    if (__md == null) {
                        try {
                            __md = MessageDigest.getInstance(Coder.KEY_MD5);
                        } catch (Exception e) {
                            Credential.LOG.mo36856j(e);
                            return null;
                        }
                    }
                    __md.reset();
                    __md.update(str.getBytes("ISO-8859-1"));
                    digest = __md.digest();
                }
                return __TYPE + C9996o.m24722i(digest, 16);
            } catch (Exception e2) {
                Credential.LOG.mo36856j(e2);
                return null;
            }
        }

        public boolean check(Object obj) {
            byte[] digest;
            try {
                if (obj instanceof char[]) {
                    obj = new String((char[]) obj);
                }
                if (!(obj instanceof Password)) {
                    if (!(obj instanceof String)) {
                        if (obj instanceof MD5) {
                            MD5 md5 = (MD5) obj;
                            if (this._digest.length != md5._digest.length) {
                                return false;
                            }
                            int i = 0;
                            while (true) {
                                byte[] bArr = this._digest;
                                if (i >= bArr.length) {
                                    return true;
                                }
                                if (bArr[i] != md5._digest[i]) {
                                    return false;
                                }
                                i++;
                            }
                        } else if (obj instanceof Credential) {
                            return ((Credential) obj).check(this);
                        } else {
                            C9003c access$000 = Credential.LOG;
                            access$000.mo36847b("Can't check " + obj.getClass() + " against MD5", new Object[0]);
                            return false;
                        }
                    }
                }
                synchronized (__md5Lock) {
                    if (__md == null) {
                        __md = MessageDigest.getInstance(Coder.KEY_MD5);
                    }
                    __md.reset();
                    __md.update(obj.toString().getBytes("ISO-8859-1"));
                    digest = __md.digest();
                }
                if (digest != null) {
                    if (digest.length == this._digest.length) {
                        for (int i2 = 0; i2 < digest.length; i2++) {
                            if (digest[i2] != this._digest[i2]) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                Credential.LOG.mo36856j(e);
                return false;
            }
        }

        public byte[] getDigest() {
            return this._digest;
        }
    }

    public static Credential getCredential(String str) {
        return str.startsWith(Crypt.__TYPE) ? new Crypt(str) : str.startsWith(MD5.__TYPE) ? new MD5(str) : new Password(str);
    }

    public abstract boolean check(Object obj);
}

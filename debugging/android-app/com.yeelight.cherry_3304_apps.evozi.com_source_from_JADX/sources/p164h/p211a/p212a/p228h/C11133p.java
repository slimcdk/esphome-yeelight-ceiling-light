package p164h.p211a.p212a.p228h;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: h.a.a.h.p */
public class C11133p extends AbstractMap implements Externalizable {

    /* renamed from: a */
    protected int f22050a;

    /* renamed from: b */
    protected C11135b f22051b;

    /* renamed from: c */
    protected boolean f22052c;

    /* renamed from: d */
    protected C11136c f22053d;

    /* renamed from: e */
    protected Object f22054e;

    /* renamed from: f */
    protected HashSet f22055f;

    /* renamed from: g */
    protected Set f22056g;

    /* renamed from: h.a.a.h.p$b */
    private static class C11135b implements Map.Entry {

        /* renamed from: a */
        char[] f22057a;

        /* renamed from: b */
        char[] f22058b;

        /* renamed from: c */
        C11135b f22059c;

        /* renamed from: d */
        C11135b[] f22060d;

        /* renamed from: e */
        String f22061e;

        /* renamed from: f */
        Object f22062f;

        C11135b() {
        }

        C11135b(boolean z, String str, int i) {
            int length = str.length() - i;
            this.f22057a = new char[length];
            this.f22058b = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i + i2);
                this.f22057a[i2] = charAt;
                if (z) {
                    if (Character.isUpperCase(charAt)) {
                        charAt = Character.toLowerCase(charAt);
                    } else if (Character.isLowerCase(charAt)) {
                        charAt = Character.toUpperCase(charAt);
                    }
                    this.f22058b[i2] = charAt;
                }
            }
        }

        /* renamed from: b */
        private void m28916b(StringBuilder sb) {
            sb.append("{[");
            if (this.f22057a != null) {
                int i = 0;
                while (true) {
                    char[] cArr = this.f22057a;
                    if (i >= cArr.length) {
                        break;
                    }
                    sb.append(cArr[i]);
                    i++;
                }
            } else {
                sb.append('-');
            }
            sb.append(':');
            sb.append(this.f22061e);
            sb.append('=');
            sb.append(this.f22062f);
            sb.append(']');
            if (this.f22060d != null) {
                for (int i2 = 0; i2 < this.f22060d.length; i2++) {
                    sb.append('|');
                    C11135b[] bVarArr = this.f22060d;
                    if (bVarArr[i2] != null) {
                        bVarArr[i2].m28916b(sb);
                    } else {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    }
                }
            }
            sb.append('}');
            if (this.f22059c != null) {
                sb.append(",\n");
                this.f22059c.m28916b(sb);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C11135b mo35430a(C11133p pVar, int i) {
            C11135b bVar = new C11135b();
            char[] cArr = this.f22057a;
            int length = cArr.length - i;
            this.f22057a = new char[i];
            bVar.f22057a = new char[length];
            System.arraycopy(cArr, 0, this.f22057a, 0, i);
            System.arraycopy(cArr, i, bVar.f22057a, 0, length);
            char[] cArr2 = this.f22058b;
            if (cArr2 != null) {
                this.f22058b = new char[i];
                bVar.f22058b = new char[length];
                System.arraycopy(cArr2, 0, this.f22058b, 0, i);
                System.arraycopy(cArr2, i, bVar.f22058b, 0, length);
            }
            bVar.f22061e = this.f22061e;
            bVar.f22062f = this.f22062f;
            this.f22061e = null;
            this.f22062f = null;
            if (pVar.f22055f.remove(this)) {
                pVar.f22055f.add(bVar);
            }
            bVar.f22060d = this.f22060d;
            int i2 = pVar.f22050a;
            C11135b[] bVarArr = new C11135b[i2];
            this.f22060d = bVarArr;
            bVarArr[bVar.f22057a[0] % i2] = bVar;
            char[] cArr3 = bVar.f22058b;
            if (!(cArr3 == null || bVarArr[cArr3[0] % i2] == bVar)) {
                bVarArr[cArr3[0] % i2] = bVar;
            }
            return bVar;
        }

        public Object getKey() {
            return this.f22061e;
        }

        public Object getValue() {
            return this.f22062f;
        }

        public Object setValue(Object obj) {
            Object obj2 = this.f22062f;
            this.f22062f = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            m28916b(sb);
            return sb.toString();
        }
    }

    /* renamed from: h.a.a.h.p$c */
    private class C11136c implements Map.Entry {
        private C11136c() {
        }

        public Object getKey() {
            return null;
        }

        public Object getValue() {
            return C11133p.this.f22054e;
        }

        public Object setValue(Object obj) {
            C11133p pVar = C11133p.this;
            Object obj2 = pVar.f22054e;
            pVar.f22054e = obj;
            return obj2;
        }

        public String toString() {
            return "[:null=" + C11133p.this.f22054e + "]";
        }
    }

    public C11133p() {
        this.f22050a = 17;
        this.f22051b = new C11135b();
        this.f22052c = false;
        this.f22053d = null;
        this.f22054e = null;
        HashSet hashSet = new HashSet(3);
        this.f22055f = hashSet;
        this.f22056g = Collections.unmodifiableSet(hashSet);
    }

    public C11133p(boolean z) {
        this();
        this.f22052c = z;
    }

    /* renamed from: a */
    public Object mo35414a(String str) {
        if (str == null) {
            return this.f22054e;
        }
        Map.Entry c = mo35416c(str, 0, str.length());
        if (c == null) {
            return null;
        }
        return c.getValue();
    }

    /* renamed from: b */
    public Map.Entry mo35415b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return this.f22053d;
        }
        C11135b bVar = this.f22051b;
        int i3 = 0;
        int i4 = -1;
        while (i3 < i2) {
            char c = (char) bArr[i + i3];
            if (i4 == -1) {
                C11135b[] bVarArr = bVar.f22060d;
                C11135b bVar2 = bVarArr == null ? null : bVarArr[c % this.f22050a];
                if (bVar2 == null && i3 > 0) {
                    return bVar;
                }
                bVar = bVar2;
                i4 = 0;
            }
            while (bVar != null) {
                if (bVar.f22057a[i4] == c || (this.f22052c && bVar.f22058b[i4] == c)) {
                    i4++;
                    if (i4 == bVar.f22057a.length) {
                        i4 = -1;
                    }
                    i3++;
                } else if (i4 > 0) {
                    return null;
                } else {
                    bVar = bVar.f22059c;
                }
            }
            return null;
        }
        if (i4 > 0) {
            return null;
        }
        if (bVar == null || bVar.f22061e != null) {
            return bVar;
        }
        return null;
    }

    /* renamed from: c */
    public Map.Entry mo35416c(String str, int i, int i2) {
        if (str == null) {
            return this.f22053d;
        }
        C11135b bVar = this.f22051b;
        int i3 = 0;
        int i4 = -1;
        while (i3 < i2) {
            char charAt = str.charAt(i + i3);
            if (i4 == -1) {
                C11135b[] bVarArr = bVar.f22060d;
                bVar = bVarArr == null ? null : bVarArr[charAt % this.f22050a];
                i4 = 0;
            }
            while (bVar != null) {
                if (bVar.f22057a[i4] == charAt || (this.f22052c && bVar.f22058b[i4] == charAt)) {
                    i4++;
                    if (i4 == bVar.f22057a.length) {
                        i4 = -1;
                    }
                    i3++;
                } else if (i4 > 0) {
                    return null;
                } else {
                    bVar = bVar.f22059c;
                }
            }
            return null;
        }
        if (i4 > 0) {
            return null;
        }
        if (bVar == null || bVar.f22061e != null) {
            return bVar;
        }
        return null;
    }

    public void clear() {
        this.f22051b = new C11135b();
        this.f22053d = null;
        this.f22054e = null;
        this.f22055f.clear();
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return this.f22053d != null;
        }
        return mo35416c(obj.toString(), 0, obj == null ? 0 : obj.toString().length()) != null;
    }

    /* renamed from: d */
    public Object mo35419d(String str, Object obj) {
        if (str == null) {
            Object obj2 = this.f22054e;
            this.f22054e = obj;
            if (this.f22053d == null) {
                C11136c cVar = new C11136c();
                this.f22053d = cVar;
                this.f22055f.add(cVar);
            }
            return obj2;
        }
        C11135b bVar = this.f22051b;
        C11135b bVar2 = null;
        C11135b bVar3 = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            char charAt = str.charAt(i);
            if (i2 == -1) {
                C11135b[] bVarArr = bVar.f22060d;
                bVar2 = null;
                bVar3 = bVar;
                bVar = bVarArr == null ? null : bVarArr[charAt % this.f22050a];
                i2 = 0;
            }
            while (bVar != null) {
                if (bVar.f22057a[i2] == charAt || (this.f22052c && bVar.f22058b[i2] == charAt)) {
                    i2++;
                    if (i2 == bVar.f22057a.length) {
                        bVar2 = null;
                    } else {
                        bVar2 = null;
                        i++;
                    }
                } else if (i2 == 0) {
                    bVar2 = bVar;
                    bVar = bVar.f22059c;
                } else {
                    bVar.mo35430a(this, i2);
                    i--;
                }
                i2 = -1;
                i++;
            }
            bVar = new C11135b(this.f22052c, str, i);
            if (bVar2 != null) {
                bVar2.f22059c = bVar;
            } else if (bVar3 != null) {
                if (bVar3.f22060d == null) {
                    bVar3.f22060d = new C11135b[this.f22050a];
                }
                C11135b[] bVarArr2 = bVar3.f22060d;
                int i3 = this.f22050a;
                bVarArr2[charAt % i3] = bVar;
                char[] cArr = bVar.f22058b;
                int i4 = cArr[0] % i3;
                if (cArr != null && bVar.f22057a[0] % i3 != i4) {
                    if (bVarArr2[i4] == null) {
                        bVarArr2[i4] = bVar;
                    } else {
                        C11135b bVar4 = bVarArr2[i4];
                        while (true) {
                            C11135b bVar5 = bVar4.f22059c;
                            if (bVar5 == null) {
                                break;
                            }
                            bVar4 = bVar5;
                        }
                        bVar4.f22059c = bVar;
                    }
                }
            } else {
                this.f22051b = bVar;
            }
        }
        if (bVar == null) {
            return null;
        }
        if (i2 > 0) {
            bVar.mo35430a(this, i2);
        }
        Object obj3 = bVar.f22062f;
        bVar.f22061e = str;
        bVar.f22062f = obj;
        this.f22055f.add(bVar);
        return obj3;
    }

    /* renamed from: e */
    public Object mo35420e(String str) {
        if (str == null) {
            Object obj = this.f22054e;
            C11136c cVar = this.f22053d;
            if (cVar != null) {
                this.f22055f.remove(cVar);
                this.f22053d = null;
                this.f22054e = null;
            }
            return obj;
        }
        C11135b bVar = this.f22051b;
        int i = 0;
        int i2 = -1;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (i2 == -1) {
                C11135b[] bVarArr = bVar.f22060d;
                bVar = bVarArr == null ? null : bVarArr[charAt % this.f22050a];
                i2 = 0;
            }
            while (bVar != null) {
                if (bVar.f22057a[i2] == charAt || (this.f22052c && bVar.f22058b[i2] == charAt)) {
                    i2++;
                    if (i2 == bVar.f22057a.length) {
                        i2 = -1;
                    }
                    i++;
                } else if (i2 > 0) {
                    return null;
                } else {
                    bVar = bVar.f22059c;
                }
            }
            return null;
        }
        if (i2 > 0) {
            return null;
        }
        if (bVar != null && bVar.f22061e == null) {
            return null;
        }
        Object obj2 = bVar.f22062f;
        this.f22055f.remove(bVar);
        bVar.f22062f = null;
        bVar.f22061e = null;
        return obj2;
    }

    public Set entrySet() {
        return this.f22056g;
    }

    /* renamed from: f */
    public void mo35422f(boolean z) {
        if (this.f22051b.f22060d == null) {
            this.f22052c = z;
            return;
        }
        throw new IllegalStateException("Must be set before first put");
    }

    public Object get(Object obj) {
        if (obj == null) {
            return this.f22054e;
        }
        return mo35414a(obj instanceof String ? (String) obj : obj.toString());
    }

    public boolean isEmpty() {
        return this.f22055f.isEmpty();
    }

    public Object put(Object obj, Object obj2) {
        return mo35419d(obj == null ? null : obj.toString(), obj2);
    }

    public void readExternal(ObjectInput objectInput) {
        mo35422f(objectInput.readBoolean());
        putAll((HashMap) objectInput.readObject());
    }

    public Object remove(Object obj) {
        return mo35420e(obj == null ? null : obj.toString());
    }

    public int size() {
        return this.f22055f.size();
    }

    public void writeExternal(ObjectOutput objectOutput) {
        HashMap hashMap = new HashMap(this);
        objectOutput.writeBoolean(this.f22052c);
        objectOutput.writeObject(hashMap);
    }
}

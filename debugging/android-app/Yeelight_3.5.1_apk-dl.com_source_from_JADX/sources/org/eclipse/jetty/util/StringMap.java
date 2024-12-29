package org.eclipse.jetty.util;

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

public class StringMap extends AbstractMap implements Externalizable {
    public static final boolean CASE_INSENSTIVE = true;
    protected static final int __HASH_WIDTH = 17;
    protected HashSet _entrySet;
    protected boolean _ignoreCase;
    protected C9976c _nullEntry;
    protected Object _nullValue;
    protected C9975b _root;
    protected Set _umEntrySet;
    protected int _width;

    /* renamed from: org.eclipse.jetty.util.StringMap$b */
    private static class C9975b implements Map.Entry {

        /* renamed from: a */
        char[] f18365a;

        /* renamed from: b */
        char[] f18366b;

        /* renamed from: c */
        C9975b f18367c;

        /* renamed from: d */
        C9975b[] f18368d;

        /* renamed from: e */
        String f18369e;

        /* renamed from: f */
        Object f18370f;

        C9975b() {
        }

        C9975b(boolean z, String str, int i) {
            int length = str.length() - i;
            this.f18365a = new char[length];
            this.f18366b = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i + i2);
                this.f18365a[i2] = charAt;
                if (z) {
                    if (Character.isUpperCase(charAt)) {
                        charAt = Character.toLowerCase(charAt);
                    } else if (Character.isLowerCase(charAt)) {
                        charAt = Character.toUpperCase(charAt);
                    }
                    this.f18366b[i2] = charAt;
                }
            }
        }

        /* renamed from: b */
        private void m24647b(StringBuilder sb) {
            sb.append("{[");
            if (this.f18365a != null) {
                int i = 0;
                while (true) {
                    char[] cArr = this.f18365a;
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
            sb.append(this.f18369e);
            sb.append('=');
            sb.append(this.f18370f);
            sb.append(']');
            if (this.f18368d != null) {
                for (int i2 = 0; i2 < this.f18368d.length; i2++) {
                    sb.append('|');
                    C9975b[] bVarArr = this.f18368d;
                    if (bVarArr[i2] != null) {
                        bVarArr[i2].m24647b(sb);
                    } else {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    }
                }
            }
            sb.append('}');
            if (this.f18367c != null) {
                sb.append(",\n");
                this.f18367c.m24647b(sb);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C9975b mo40186a(StringMap stringMap, int i) {
            C9975b bVar = new C9975b();
            char[] cArr = this.f18365a;
            int length = cArr.length - i;
            this.f18365a = new char[i];
            bVar.f18365a = new char[length];
            System.arraycopy(cArr, 0, this.f18365a, 0, i);
            System.arraycopy(cArr, i, bVar.f18365a, 0, length);
            char[] cArr2 = this.f18366b;
            if (cArr2 != null) {
                this.f18366b = new char[i];
                bVar.f18366b = new char[length];
                System.arraycopy(cArr2, 0, this.f18366b, 0, i);
                System.arraycopy(cArr2, i, bVar.f18366b, 0, length);
            }
            bVar.f18369e = this.f18369e;
            bVar.f18370f = this.f18370f;
            this.f18369e = null;
            this.f18370f = null;
            if (stringMap._entrySet.remove(this)) {
                stringMap._entrySet.add(bVar);
            }
            bVar.f18368d = this.f18368d;
            int i2 = stringMap._width;
            C9975b[] bVarArr = new C9975b[i2];
            this.f18368d = bVarArr;
            bVarArr[bVar.f18365a[0] % i2] = bVar;
            char[] cArr3 = bVar.f18366b;
            if (!(cArr3 == null || bVarArr[cArr3[0] % i2] == bVar)) {
                bVarArr[cArr3[0] % i2] = bVar;
            }
            return bVar;
        }

        public Object getKey() {
            return this.f18369e;
        }

        public Object getValue() {
            return this.f18370f;
        }

        public Object setValue(Object obj) {
            Object obj2 = this.f18370f;
            this.f18370f = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            m24647b(sb);
            return sb.toString();
        }
    }

    /* renamed from: org.eclipse.jetty.util.StringMap$c */
    private class C9976c implements Map.Entry {
        private C9976c() {
        }

        public Object getKey() {
            return null;
        }

        public Object getValue() {
            return StringMap.this._nullValue;
        }

        public Object setValue(Object obj) {
            StringMap stringMap = StringMap.this;
            Object obj2 = stringMap._nullValue;
            stringMap._nullValue = obj;
            return obj2;
        }

        public String toString() {
            return "[:null=" + StringMap.this._nullValue + "]";
        }
    }

    public StringMap() {
        this._width = 17;
        this._root = new C9975b();
        this._ignoreCase = false;
        this._nullEntry = null;
        this._nullValue = null;
        HashSet hashSet = new HashSet(3);
        this._entrySet = hashSet;
        this._umEntrySet = Collections.unmodifiableSet(hashSet);
    }

    public StringMap(boolean z) {
        this();
        this._ignoreCase = z;
    }

    public StringMap(boolean z, int i) {
        this();
        this._ignoreCase = z;
        this._width = i;
    }

    public void clear() {
        this._root = new C9975b();
        this._nullEntry = null;
        this._nullValue = null;
        this._entrySet.clear();
    }

    public boolean containsKey(Object obj) {
        return obj == null ? this._nullEntry != null : getEntry(obj.toString(), 0, obj.toString().length()) != null;
    }

    public Set entrySet() {
        return this._umEntrySet;
    }

    public Object get(Object obj) {
        if (obj == null) {
            return this._nullValue;
        }
        return get(obj instanceof String ? (String) obj : obj.toString());
    }

    public Object get(String str) {
        if (str == null) {
            return this._nullValue;
        }
        Map.Entry entry = getEntry(str, 0, str.length());
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public Map.Entry getBestEntry(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return this._nullEntry;
        }
        C9975b bVar = this._root;
        int i3 = 0;
        int i4 = -1;
        while (i3 < i2) {
            char c = (char) bArr[i + i3];
            if (i4 == -1) {
                C9975b[] bVarArr = bVar.f18368d;
                C9975b bVar2 = bVarArr == null ? null : bVarArr[c % this._width];
                if (bVar2 == null && i3 > 0) {
                    return bVar;
                }
                bVar = bVar2;
                i4 = 0;
            }
            while (bVar != null) {
                char[] cArr = bVar.f18365a;
                if (cArr[i4] == c || (this._ignoreCase && bVar.f18366b[i4] == c)) {
                    i4++;
                    if (i4 == cArr.length) {
                        i4 = -1;
                    }
                    i3++;
                } else if (i4 > 0) {
                    return null;
                } else {
                    bVar = bVar.f18367c;
                }
            }
            return null;
        }
        if (i4 > 0) {
            return null;
        }
        if (bVar == null || bVar.f18369e != null) {
            return bVar;
        }
        return null;
    }

    public Map.Entry getEntry(String str, int i, int i2) {
        if (str == null) {
            return this._nullEntry;
        }
        C9975b bVar = this._root;
        int i3 = 0;
        int i4 = -1;
        while (i3 < i2) {
            char charAt = str.charAt(i + i3);
            if (i4 == -1) {
                C9975b[] bVarArr = bVar.f18368d;
                bVar = bVarArr == null ? null : bVarArr[charAt % this._width];
                i4 = 0;
            }
            while (bVar != null) {
                char[] cArr = bVar.f18365a;
                if (cArr[i4] == charAt || (this._ignoreCase && bVar.f18366b[i4] == charAt)) {
                    i4++;
                    if (i4 == cArr.length) {
                        i4 = -1;
                    }
                    i3++;
                } else if (i4 > 0) {
                    return null;
                } else {
                    bVar = bVar.f18367c;
                }
            }
            return null;
        }
        if (i4 > 0) {
            return null;
        }
        if (bVar == null || bVar.f18369e != null) {
            return bVar;
        }
        return null;
    }

    public Map.Entry getEntry(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return this._nullEntry;
        }
        C9975b bVar = this._root;
        int i3 = 0;
        int i4 = -1;
        while (i3 < i2) {
            char c = cArr[i + i3];
            if (i4 == -1) {
                C9975b[] bVarArr = bVar.f18368d;
                bVar = bVarArr == null ? null : bVarArr[c % this._width];
                i4 = 0;
            }
            while (bVar != null) {
                char[] cArr2 = bVar.f18365a;
                if (cArr2[i4] == c || (this._ignoreCase && bVar.f18366b[i4] == c)) {
                    i4++;
                    if (i4 == cArr2.length) {
                        i4 = -1;
                    }
                    i3++;
                } else if (i4 > 0) {
                    return null;
                } else {
                    bVar = bVar.f18367c;
                }
            }
            return null;
        }
        if (i4 > 0) {
            return null;
        }
        if (bVar == null || bVar.f18369e != null) {
            return bVar;
        }
        return null;
    }

    public int getWidth() {
        return this._width;
    }

    public boolean isEmpty() {
        return this._entrySet.isEmpty();
    }

    public boolean isIgnoreCase() {
        return this._ignoreCase;
    }

    public Object put(Object obj, Object obj2) {
        return put(obj == null ? null : obj.toString(), obj2);
    }

    public Object put(String str, Object obj) {
        if (str == null) {
            Object obj2 = this._nullValue;
            this._nullValue = obj;
            if (this._nullEntry == null) {
                C9976c cVar = new C9976c();
                this._nullEntry = cVar;
                this._entrySet.add(cVar);
            }
            return obj2;
        }
        C9975b bVar = this._root;
        C9975b bVar2 = null;
        C9975b bVar3 = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            char charAt = str.charAt(i);
            if (i2 == -1) {
                C9975b[] bVarArr = bVar.f18368d;
                bVar2 = null;
                bVar3 = bVar;
                bVar = bVarArr == null ? null : bVarArr[charAt % this._width];
                i2 = 0;
            }
            while (bVar != null) {
                char[] cArr = bVar.f18365a;
                if (cArr[i2] == charAt || (this._ignoreCase && bVar.f18366b[i2] == charAt)) {
                    i2++;
                    if (i2 == cArr.length) {
                        bVar2 = null;
                    } else {
                        bVar2 = null;
                        i++;
                    }
                } else if (i2 == 0) {
                    bVar2 = bVar;
                    bVar = bVar.f18367c;
                } else {
                    bVar.mo40186a(this, i2);
                    i--;
                }
                i2 = -1;
                i++;
            }
            bVar = new C9975b(this._ignoreCase, str, i);
            if (bVar2 != null) {
                bVar2.f18367c = bVar;
            } else if (bVar3 != null) {
                if (bVar3.f18368d == null) {
                    bVar3.f18368d = new C9975b[this._width];
                }
                C9975b[] bVarArr2 = bVar3.f18368d;
                int i3 = this._width;
                bVarArr2[charAt % i3] = bVar;
                char[] cArr2 = bVar.f18366b;
                int i4 = cArr2[0] % i3;
                if (cArr2 != null && bVar.f18365a[0] % i3 != i4) {
                    if (bVarArr2[i4] == null) {
                        bVarArr2[i4] = bVar;
                    } else {
                        C9975b bVar4 = bVarArr2[i4];
                        while (true) {
                            C9975b bVar5 = bVar4.f18367c;
                            if (bVar5 == null) {
                                break;
                            }
                            bVar4 = bVar5;
                        }
                        bVar4.f18367c = bVar;
                    }
                }
            } else {
                this._root = bVar;
            }
        }
        if (bVar == null) {
            return null;
        }
        if (i2 > 0) {
            bVar.mo40186a(this, i2);
        }
        Object obj3 = bVar.f18370f;
        bVar.f18369e = str;
        bVar.f18370f = obj;
        this._entrySet.add(bVar);
        return obj3;
    }

    public void readExternal(ObjectInput objectInput) {
        setIgnoreCase(objectInput.readBoolean());
        putAll((HashMap) objectInput.readObject());
    }

    public Object remove(Object obj) {
        return remove(obj == null ? null : obj.toString());
    }

    public Object remove(String str) {
        if (str == null) {
            Object obj = this._nullValue;
            C9976c cVar = this._nullEntry;
            if (cVar != null) {
                this._entrySet.remove(cVar);
                this._nullEntry = null;
                this._nullValue = null;
            }
            return obj;
        }
        C9975b bVar = this._root;
        int i = 0;
        int i2 = -1;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (i2 == -1) {
                C9975b[] bVarArr = bVar.f18368d;
                bVar = bVarArr == null ? null : bVarArr[charAt % this._width];
                i2 = 0;
            }
            while (bVar != null) {
                char[] cArr = bVar.f18365a;
                if (cArr[i2] == charAt || (this._ignoreCase && bVar.f18366b[i2] == charAt)) {
                    i2++;
                    if (i2 == cArr.length) {
                        i2 = -1;
                    }
                    i++;
                } else if (i2 > 0) {
                    return null;
                } else {
                    bVar = bVar.f18367c;
                }
            }
            return null;
        }
        if (i2 > 0) {
            return null;
        }
        if (bVar != null && bVar.f18369e == null) {
            return null;
        }
        Object obj2 = bVar.f18370f;
        this._entrySet.remove(bVar);
        bVar.f18370f = null;
        bVar.f18369e = null;
        return obj2;
    }

    public void setIgnoreCase(boolean z) {
        if (this._root.f18368d == null) {
            this._ignoreCase = z;
            return;
        }
        throw new IllegalStateException("Must be set before first put");
    }

    public void setWidth(int i) {
        this._width = i;
    }

    public int size() {
        return this._entrySet.size();
    }

    public void writeExternal(ObjectOutput objectOutput) {
        HashMap hashMap = new HashMap(this);
        objectOutput.writeBoolean(this._ignoreCase);
        objectOutput.writeObject(hashMap);
    }
}

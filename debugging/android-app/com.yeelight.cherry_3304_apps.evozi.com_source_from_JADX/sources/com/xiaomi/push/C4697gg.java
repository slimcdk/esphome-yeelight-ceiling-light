package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.xiaomi.push.gg */
public class C4697gg implements C4702gk {

    /* renamed from: a */
    private String f8809a;

    /* renamed from: a */
    private List<C4697gg> f8810a = null;

    /* renamed from: a */
    private String[] f8811a = null;

    /* renamed from: b */
    private String f8812b;

    /* renamed from: b */
    private String[] f8813b = null;

    /* renamed from: c */
    private String f8814c;

    public C4697gg(String str, String str2, String[] strArr, String[] strArr2) {
        this.f8809a = str;
        this.f8812b = str2;
        this.f8811a = strArr;
        this.f8813b = strArr2;
    }

    public C4697gg(String str, String str2, String[] strArr, String[] strArr2, String str3, List<C4697gg> list) {
        this.f8809a = str;
        this.f8812b = str2;
        this.f8811a = strArr;
        this.f8813b = strArr2;
        this.f8814c = str3;
        this.f8810a = list;
    }

    /* renamed from: a */
    public static C4697gg m14367a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> keySet = bundle2.keySet();
        String[] strArr = new String[keySet.size()];
        String[] strArr2 = new String[keySet.size()];
        int i = 0;
        for (String str : keySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            ArrayList arrayList2 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList2.add(m14367a((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C4697gg(string, string2, strArr, strArr2, string3, arrayList);
    }

    /* renamed from: a */
    public static Parcelable[] m14368a(List<C4697gg> list) {
        return m14369a((C4697gg[]) list.toArray(new C4697gg[list.size()]));
    }

    /* renamed from: a */
    public static Parcelable[] m14369a(C4697gg[] ggVarArr) {
        if (ggVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[ggVarArr.length];
        for (int i = 0; i < ggVarArr.length; i++) {
            parcelableArr[i] = ggVarArr[i].mo25180a();
        }
        return parcelableArr;
    }

    /* renamed from: a */
    public Bundle mo25180a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f8809a);
        bundle.putString("ext_ns", this.f8812b);
        bundle.putString("ext_text", this.f8814c);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f8811a;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f8811a;
                if (i >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i], this.f8813b[i]);
                i++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<C4697gg> list = this.f8810a;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", m14368a(this.f8810a));
        }
        return bundle;
    }

    /* renamed from: a */
    public Parcelable m14371a() {
        return mo25180a();
    }

    /* renamed from: a */
    public String m14372a() {
        return this.f8809a;
    }

    /* renamed from: a */
    public String mo25181a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if (this.f8811a == null) {
            return null;
        } else {
            int i = 0;
            while (true) {
                String[] strArr = this.f8811a;
                if (i >= strArr.length) {
                    return null;
                }
                if (str.equals(strArr[i])) {
                    return this.f8813b[i];
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public void m14374a(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = C4715gu.m14461a(str);
        }
        this.f8814c = str;
    }

    /* renamed from: b */
    public String mo25182b() {
        return this.f8812b;
    }

    /* renamed from: c */
    public String mo25183c() {
        return !TextUtils.isEmpty(this.f8814c) ? C4715gu.m14464b(this.f8814c) : this.f8814c;
    }

    /* renamed from: d */
    public String mo25184d() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.f8809a);
        if (!TextUtils.isEmpty(this.f8812b)) {
            sb.append(" ");
            sb.append("xmlns=");
            sb.append("\"");
            sb.append(this.f8812b);
            sb.append("\"");
        }
        String[] strArr = this.f8811a;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.f8811a.length; i++) {
                if (!TextUtils.isEmpty(this.f8813b[i])) {
                    sb.append(" ");
                    sb.append(this.f8811a[i]);
                    sb.append("=\"");
                    sb.append(C4715gu.m14461a(this.f8813b[i]));
                    sb.append("\"");
                }
            }
        }
        if (!TextUtils.isEmpty(this.f8814c)) {
            sb.append(">");
            sb.append(this.f8814c);
        } else {
            List<C4697gg> list = this.f8810a;
            if (list == null || list.size() <= 0) {
                sb.append("/>");
                return sb.toString();
            }
            sb.append(">");
            for (C4697gg d : this.f8810a) {
                sb.append(d.mo25184d());
            }
        }
        sb.append("</");
        sb.append(this.f8809a);
        sb.append(">");
        return sb.toString();
    }

    public String toString() {
        return mo25184d();
    }
}

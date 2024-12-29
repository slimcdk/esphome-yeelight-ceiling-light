package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.xiaomi.push.gk */
public class C4727gk implements C4732go {

    /* renamed from: a */
    private String f8274a;

    /* renamed from: a */
    private List<C4727gk> f8275a = null;

    /* renamed from: a */
    private String[] f8276a = null;

    /* renamed from: b */
    private String f8277b;

    /* renamed from: b */
    private String[] f8278b = null;

    /* renamed from: c */
    private String f8279c;

    public C4727gk(String str, String str2, String[] strArr, String[] strArr2) {
        this.f8274a = str;
        this.f8277b = str2;
        this.f8276a = strArr;
        this.f8278b = strArr2;
    }

    public C4727gk(String str, String str2, String[] strArr, String[] strArr2, String str3, List<C4727gk> list) {
        this.f8274a = str;
        this.f8277b = str2;
        this.f8276a = strArr;
        this.f8278b = strArr2;
        this.f8279c = str3;
        this.f8275a = list;
    }

    /* renamed from: a */
    public static C4727gk m14020a(Bundle bundle) {
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
                arrayList2.add(m14020a((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C4727gk(string, string2, strArr, strArr2, string3, arrayList);
    }

    /* renamed from: a */
    public static Parcelable[] m14021a(List<C4727gk> list) {
        return m14022a((C4727gk[]) list.toArray(new C4727gk[list.size()]));
    }

    /* renamed from: a */
    public static Parcelable[] m14022a(C4727gk[] gkVarArr) {
        if (gkVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[gkVarArr.length];
        for (int i = 0; i < gkVarArr.length; i++) {
            parcelableArr[i] = gkVarArr[i].mo29216a();
        }
        return parcelableArr;
    }

    /* renamed from: a */
    public Bundle mo29216a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f8274a);
        bundle.putString("ext_ns", this.f8277b);
        bundle.putString("ext_text", this.f8279c);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f8276a;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f8276a;
                if (i >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i], this.f8278b[i]);
                i++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<C4727gk> list = this.f8275a;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", m14021a(this.f8275a));
        }
        return bundle;
    }

    /* renamed from: a */
    public Parcelable m14024a() {
        return mo29216a();
    }

    /* renamed from: a */
    public String m14025a() {
        return this.f8274a;
    }

    /* renamed from: a */
    public String mo29217a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if (this.f8276a == null) {
            return null;
        } else {
            int i = 0;
            while (true) {
                String[] strArr = this.f8276a;
                if (i >= strArr.length) {
                    return null;
                }
                if (str.equals(strArr[i])) {
                    return this.f8278b[i];
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo29218a(C4727gk gkVar) {
        if (this.f8275a == null) {
            this.f8275a = new ArrayList();
        }
        if (!this.f8275a.contains(gkVar)) {
            this.f8275a.add(gkVar);
        }
    }

    /* renamed from: a */
    public void m14028a(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = C4745gy.m14115a(str);
        }
        this.f8279c = str;
    }

    /* renamed from: b */
    public String mo29219b() {
        return this.f8277b;
    }

    /* renamed from: c */
    public String mo29220c() {
        return !TextUtils.isEmpty(this.f8279c) ? C4745gy.m14118b(this.f8279c) : this.f8279c;
    }

    /* renamed from: d */
    public String mo29221d() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.f8274a);
        if (!TextUtils.isEmpty(this.f8277b)) {
            sb.append(" ");
            sb.append("xmlns=");
            sb.append("\"");
            sb.append(this.f8277b);
            sb.append("\"");
        }
        String[] strArr = this.f8276a;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.f8276a.length; i++) {
                if (!TextUtils.isEmpty(this.f8278b[i])) {
                    sb.append(" ");
                    sb.append(this.f8276a[i]);
                    sb.append("=\"");
                    sb.append(C4745gy.m14115a(this.f8278b[i]));
                    sb.append("\"");
                }
            }
        }
        if (!TextUtils.isEmpty(this.f8279c)) {
            sb.append(">");
            sb.append(this.f8279c);
        } else {
            List<C4727gk> list = this.f8275a;
            if (list == null || list.size() <= 0) {
                sb.append("/>");
                return sb.toString();
            }
            sb.append(">");
            for (C4727gk d : this.f8275a) {
                sb.append(d.mo29221d());
            }
        }
        sb.append("</");
        sb.append(this.f8274a);
        sb.append(">");
        return sb.toString();
    }

    public String toString() {
        return mo29221d();
    }
}

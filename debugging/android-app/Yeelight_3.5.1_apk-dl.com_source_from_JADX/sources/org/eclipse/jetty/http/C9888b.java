package org.eclipse.jetty.http;

import org.eclipse.jetty.util.C9995n;
import org.eclipse.jetty.util.C9996o;
import org.eclipse.jetty.util.C9997p;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;

/* renamed from: org.eclipse.jetty.http.b */
public class C9888b extends C9914p {

    /* renamed from: p */
    private final String f18009p;

    public C9888b(String str) {
        this.f18009p = str;
    }

    /* renamed from: b */
    public void mo39740b(MultiMap multiMap) {
        int i = this.f18136k;
        int i2 = this.f18137l;
        if (i != i2) {
            UrlEncoded.decodeTo(C9995n.m24712h(this.f18127b, i + 1, (i2 - i) - 1, this.f18009p), multiMap, this.f18009p);
        }
    }

    /* renamed from: c */
    public void mo39741c(MultiMap multiMap, String str) {
        int i = this.f18136k;
        int i2 = this.f18137l;
        if (i != i2) {
            if (str == null) {
                str = this.f18009p;
            }
            UrlEncoded.decodeTo(C9995n.m24712h(this.f18127b, i + 1, (i2 - i) - 1, str), multiMap, str);
        }
    }

    /* renamed from: d */
    public String mo39742d() {
        int i = this.f18134i;
        int i2 = this.f18138m;
        if (i == i2) {
            return null;
        }
        return C9995n.m24712h(this.f18127b, i, i2 - i, this.f18009p);
    }

    /* renamed from: e */
    public String mo39743e() {
        int i = this.f18134i;
        int i2 = this.f18135j;
        if (i == i2) {
            return null;
        }
        return C9997p.m24727e(this.f18127b, i, i2 - i);
    }

    /* renamed from: g */
    public String mo39744g() {
        int i = this.f18137l;
        int i2 = this.f18138m;
        if (i == i2) {
            return null;
        }
        return C9995n.m24712h(this.f18127b, i + 1, (i2 - i) - 1, this.f18009p);
    }

    /* renamed from: h */
    public String mo39745h() {
        int i = this.f18131f;
        int i2 = this.f18132g;
        if (i == i2) {
            return null;
        }
        return C9995n.m24712h(this.f18127b, i, i2 - i, this.f18009p);
    }

    /* renamed from: i */
    public String mo39746i() {
        int i = this.f18134i;
        int i2 = this.f18135j;
        if (i == i2) {
            return null;
        }
        return C9995n.m24712h(this.f18127b, i, i2 - i, this.f18009p);
    }

    /* renamed from: j */
    public String mo39747j() {
        int i = this.f18134i;
        int i2 = this.f18136k;
        if (i == i2) {
            return null;
        }
        return C9995n.m24712h(this.f18127b, i, i2 - i, this.f18009p);
    }

    /* renamed from: k */
    public int mo39748k() {
        int i = this.f18132g;
        int i2 = this.f18134i;
        if (i == i2) {
            return -1;
        }
        return C9996o.m24718e(this.f18127b, i + 1, (i2 - i) - 1, 10);
    }

    /* renamed from: l */
    public String mo39749l() {
        int i = this.f18136k;
        int i2 = this.f18137l;
        if (i == i2) {
            return null;
        }
        return C9995n.m24712h(this.f18127b, i + 1, (i2 - i) - 1, this.f18009p);
    }

    /* renamed from: n */
    public String mo39750n() {
        int i = this.f18129d;
        int i2 = this.f18130e;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 == 5) {
            byte[] bArr = this.f18127b;
            if (bArr[i] == 104 && bArr[i + 1] == 116 && bArr[i + 2] == 116 && bArr[i + 3] == 112) {
                return "http";
            }
        }
        if (i3 == 6) {
            byte[] bArr2 = this.f18127b;
            if (bArr2[i] == 104 && bArr2[i + 1] == 116 && bArr2[i + 2] == 116 && bArr2[i + 3] == 112 && bArr2[i + 4] == 115) {
                return "https";
            }
        }
        return C9995n.m24712h(this.f18127b, i, (i2 - i) - 1, this.f18009p);
    }

    /* renamed from: o */
    public boolean mo39751o() {
        return this.f18137l > this.f18136k;
    }

    public String toString() {
        if (this.f18128c == null) {
            byte[] bArr = this.f18127b;
            int i = this.f18129d;
            this.f18128c = C9995n.m24712h(bArr, i, this.f18138m - i, this.f18009p);
        }
        return this.f18128c;
    }
}

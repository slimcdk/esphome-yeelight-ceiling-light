package p164h.p165b.p166a.p240h;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import org.apache.commons.p271io.FilenameUtils;
import org.apache.commons.p271io.IOUtils;

/* renamed from: h.b.a.h.i */
public class C11219i {

    /* renamed from: a */
    private int f22302a = 1;

    /* renamed from: b */
    private int f22303b = 0;

    /* renamed from: c */
    private String f22304c = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");

    /* renamed from: d */
    private String f22305d = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");

    /* renamed from: e */
    private String f22306e = "Cling";

    /* renamed from: f */
    private String f22307f = "2.0";

    public C11219i() {
    }

    public C11219i(int i, int i2) {
        this.f22302a = i;
        this.f22303b = i2;
    }

    /* renamed from: a */
    public String mo35668a() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.f22304c.indexOf(32) != -1 ? this.f22304c.replace(' ', '_') : this.f22304c);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(this.f22305d.indexOf(32) != -1 ? this.f22305d.replace(' ', '_') : this.f22305d);
        sb.append(" UPnP/");
        sb.append(this.f22302a);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f22303b);
        sb.append(' ');
        sb.append(this.f22306e.indexOf(32) != -1 ? this.f22306e.replace(' ', '_') : this.f22306e);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(this.f22307f.indexOf(32) != -1 ? this.f22307f.replace(' ', '_') : this.f22307f);
        return sb.toString();
    }

    /* renamed from: b */
    public int mo35669b() {
        return this.f22302a;
    }

    /* renamed from: c */
    public int mo35670c() {
        return this.f22303b;
    }

    /* renamed from: d */
    public String mo35671d() {
        return this.f22304c;
    }

    /* renamed from: e */
    public String mo35672e() {
        return this.f22305d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11219i.class != obj.getClass()) {
            return false;
        }
        C11219i iVar = (C11219i) obj;
        return this.f22302a == iVar.f22302a && this.f22303b == iVar.f22303b && this.f22304c.equals(iVar.f22304c) && this.f22305d.equals(iVar.f22305d) && this.f22306e.equals(iVar.f22306e) && this.f22307f.equals(iVar.f22307f);
    }

    /* renamed from: f */
    public String mo35674f() {
        return this.f22306e;
    }

    /* renamed from: g */
    public String mo35675g() {
        return this.f22307f;
    }

    /* renamed from: h */
    public void mo35676h(int i) {
        this.f22303b = i;
    }

    public int hashCode() {
        return (((((((((this.f22302a * 31) + this.f22303b) * 31) + this.f22304c.hashCode()) * 31) + this.f22305d.hashCode()) * 31) + this.f22306e.hashCode()) * 31) + this.f22307f.hashCode();
    }

    /* renamed from: i */
    public void mo35678i(String str) {
        this.f22304c = str;
    }

    /* renamed from: j */
    public void mo35679j(String str) {
        this.f22305d = str;
    }

    /* renamed from: k */
    public void mo35680k(String str) {
        this.f22306e = str;
    }

    /* renamed from: l */
    public void mo35681l(String str) {
        this.f22307f = str;
    }

    public String toString() {
        return mo35671d() + MiotCloudImpl.COOKIE_PATH + mo35672e() + " UPnP/" + mo35669b() + "." + mo35670c() + " " + mo35674f() + MiotCloudImpl.COOKIE_PATH + mo35675g();
    }
}

package org.fourthline.cling.model;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;

/* renamed from: org.fourthline.cling.model.i */
public class C10021i {

    /* renamed from: a */
    private int f18500a = 1;

    /* renamed from: b */
    private int f18501b = 0;

    /* renamed from: c */
    private String f18502c = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");

    /* renamed from: d */
    private String f18503d = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");

    /* renamed from: e */
    private String f18504e = "Cling";

    /* renamed from: f */
    private String f18505f = "2.0";

    public C10021i() {
    }

    public C10021i(int i, int i2) {
        this.f18500a = i;
        this.f18501b = i2;
    }

    /* renamed from: a */
    public String mo40373a() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.f18502c.indexOf(32) != -1 ? this.f18502c.replace(' ', '_') : this.f18502c);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(this.f18503d.indexOf(32) != -1 ? this.f18503d.replace(' ', '_') : this.f18503d);
        sb.append(" UPnP/");
        sb.append(this.f18500a);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f18501b);
        sb.append(' ');
        sb.append(this.f18504e.indexOf(32) != -1 ? this.f18504e.replace(' ', '_') : this.f18504e);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(this.f18505f.indexOf(32) != -1 ? this.f18505f.replace(' ', '_') : this.f18505f);
        return sb.toString();
    }

    /* renamed from: b */
    public int mo40374b() {
        return this.f18500a;
    }

    /* renamed from: c */
    public int mo40375c() {
        return this.f18501b;
    }

    /* renamed from: d */
    public String mo40376d() {
        return this.f18502c;
    }

    /* renamed from: e */
    public String mo40377e() {
        return this.f18503d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10021i.class != obj.getClass()) {
            return false;
        }
        C10021i iVar = (C10021i) obj;
        return this.f18500a == iVar.f18500a && this.f18501b == iVar.f18501b && this.f18502c.equals(iVar.f18502c) && this.f18503d.equals(iVar.f18503d) && this.f18504e.equals(iVar.f18504e) && this.f18505f.equals(iVar.f18505f);
    }

    /* renamed from: f */
    public String mo40379f() {
        return this.f18504e;
    }

    /* renamed from: g */
    public String mo40380g() {
        return this.f18505f;
    }

    /* renamed from: h */
    public void mo40381h(int i) {
        this.f18501b = i;
    }

    public int hashCode() {
        return (((((((((this.f18500a * 31) + this.f18501b) * 31) + this.f18502c.hashCode()) * 31) + this.f18503d.hashCode()) * 31) + this.f18504e.hashCode()) * 31) + this.f18505f.hashCode();
    }

    /* renamed from: i */
    public void mo40383i(String str) {
        this.f18502c = str;
    }

    /* renamed from: j */
    public void mo40384j(String str) {
        this.f18503d = str;
    }

    /* renamed from: k */
    public void mo40385k(String str) {
        this.f18504e = str;
    }

    /* renamed from: l */
    public void mo40386l(String str) {
        this.f18505f = str;
    }

    public String toString() {
        return mo40376d() + MiotCloudImpl.COOKIE_PATH + mo40377e() + " UPnP/" + mo40374b() + "." + mo40375c() + " " + mo40379f() + MiotCloudImpl.COOKIE_PATH + mo40380g();
    }
}

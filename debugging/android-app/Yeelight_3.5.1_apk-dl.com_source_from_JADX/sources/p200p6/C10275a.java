package p200p6;

import java.util.LinkedHashMap;
import java.util.Map;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.types.C10076b0;
import p226w6.C11959d;

/* renamed from: p6.a */
public abstract class C10275a<S extends C10070e> {

    /* renamed from: a */
    protected S f19351a;

    /* renamed from: b */
    protected String f19352b;

    /* renamed from: c */
    protected int f19353c;

    /* renamed from: d */
    protected int f19354d;

    /* renamed from: e */
    protected C10076b0 f19355e;

    /* renamed from: f */
    protected Map<String, C11959d<S>> f19356f;

    protected C10275a(S s) {
        this.f19353c = 1800;
        this.f19356f = new LinkedHashMap();
        this.f19351a = s;
    }

    public C10275a(S s, int i) {
        this(s);
        this.f19353c = i;
    }

    /* renamed from: C */
    public synchronized Map<String, C11959d<S>> mo41764C() {
        return this.f19356f;
    }

    /* renamed from: I */
    public synchronized int mo41765I() {
        return this.f19353c;
    }

    /* renamed from: J */
    public synchronized S mo41766J() {
        return this.f19351a;
    }

    /* renamed from: K */
    public synchronized String mo41767K() {
        return this.f19352b;
    }

    /* renamed from: L */
    public synchronized void mo41768L(int i) {
        this.f19354d = i;
    }

    /* renamed from: M */
    public synchronized void mo41769M(String str) {
        this.f19352b = str;
    }

    /* renamed from: a */
    public abstract void mo38936a();

    /* renamed from: e */
    public abstract void mo38937e();

    /* renamed from: p */
    public synchronized int mo41770p() {
        return this.f19354d;
    }

    public String toString() {
        return "(GENASubscription, SID: " + mo41767K() + ", SEQUENCE: " + mo41772w() + ")";
    }

    /* renamed from: w */
    public synchronized C10076b0 mo41772w() {
        return this.f19355e;
    }
}

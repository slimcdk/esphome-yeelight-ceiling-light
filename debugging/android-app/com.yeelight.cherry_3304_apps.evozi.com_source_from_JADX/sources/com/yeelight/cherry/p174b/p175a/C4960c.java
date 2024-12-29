package com.yeelight.cherry.p174b.p175a;

import androidx.annotation.DrawableRes;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4239r;
import com.yeelight.yeelib.p153g.C9853v;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.b.a.c */
public class C4960c {

    /* renamed from: a */
    private String f10232a;

    /* renamed from: b */
    private List<C4198d> f10233b;
    @DrawableRes

    /* renamed from: c */
    private int f10234c;

    /* renamed from: a */
    public void mo26056a(C4198d dVar) {
        if (dVar != null) {
            if (this.f10232a == null) {
                this.f10233b = new ArrayList();
                this.f10232a = dVar.mo23395T();
                dVar.mo23397U();
                C9853v k = C4239r.m11807g().mo23578k(this.f10232a);
                if (k != null) {
                    this.f10234c = k.mo31833d();
                } else if (C4308b.f7482a) {
                    try {
                        throw new Exception("productCategory is null, model is " + this.f10232a);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f10233b.add(dVar);
        }
    }

    /* renamed from: b */
    public int mo26057b() {
        List<C4198d> list = this.f10233b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: c */
    public List<C4198d> mo26058c() {
        return this.f10233b;
    }

    /* renamed from: d */
    public int mo26059d() {
        return this.f10234c;
    }

    /* renamed from: e */
    public String mo26060e() {
        return this.f10232a;
    }
}

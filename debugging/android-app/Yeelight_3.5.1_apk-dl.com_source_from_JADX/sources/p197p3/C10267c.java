package p197p3;

import androidx.annotation.DrawableRes;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.models.C8325q;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: p3.c */
public class C10267c {

    /* renamed from: a */
    private String f19332a;

    /* renamed from: b */
    private List<C3010c> f19333b;
    @DrawableRes

    /* renamed from: c */
    private int f19334c;

    /* renamed from: a */
    public void mo41744a(C3010c cVar) {
        if (cVar != null) {
            if (this.f19332a == null) {
                this.f19333b = new ArrayList();
                this.f19332a = cVar.mo23208T();
                cVar.mo23210U();
                C8325q k = C3088r.m8117g().mo23471k(this.f19332a);
                if (k != null) {
                    this.f19334c = k.mo35410d();
                } else if (AppUtils.f4977a) {
                    try {
                        throw new Exception("productCategory is null, model is " + this.f19332a);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f19333b.add(cVar);
        }
    }

    /* renamed from: b */
    public int mo41745b() {
        List<C3010c> list = this.f19333b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: c */
    public List<C3010c> mo41746c() {
        return this.f19333b;
    }

    /* renamed from: d */
    public int mo41747d() {
        return this.f19334c;
    }

    /* renamed from: e */
    public String mo41748e() {
        return this.f19332a;
    }
}

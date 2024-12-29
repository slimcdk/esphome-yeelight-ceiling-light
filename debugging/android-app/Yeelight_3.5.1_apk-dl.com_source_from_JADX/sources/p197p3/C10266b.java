package p197p3;

import com.yeelight.yeelib.p142ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter;
import java.util.List;

/* renamed from: p3.b */
public class C10266b implements BaseExpandableRecyclerViewAdapter.C8749f<C10265a> {

    /* renamed from: a */
    private List<C10265a> f19329a;

    /* renamed from: b */
    private String f19330b;

    /* renamed from: c */
    private boolean f19331c;

    /* renamed from: a */
    public boolean mo36064a() {
        return false;
    }

    /* renamed from: b */
    public C10265a getChildAt(int i) {
        List<C10265a> list = this.f19329a;
        if (list == null || list.size() <= i) {
            return null;
        }
        return this.f19329a.get(i);
    }

    /* renamed from: c */
    public List<C10265a> mo41738c() {
        return this.f19329a;
    }

    /* renamed from: d */
    public String mo41739d() {
        return this.f19330b;
    }

    /* renamed from: e */
    public boolean mo41740e() {
        return this.f19331c;
    }

    /* renamed from: f */
    public void mo41741f(boolean z) {
        this.f19331c = z;
    }

    /* renamed from: g */
    public void mo41742g(List<C10265a> list) {
        this.f19329a = list;
    }

    public int getChildCount() {
        List<C10265a> list = this.f19329a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: h */
    public void mo41743h(String str) {
        this.f19330b = str;
    }
}

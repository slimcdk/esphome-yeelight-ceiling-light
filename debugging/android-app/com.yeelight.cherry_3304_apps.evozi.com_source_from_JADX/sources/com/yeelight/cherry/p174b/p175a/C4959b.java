package com.yeelight.cherry.p174b.p175a;

import com.yeelight.yeelib.p194ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter;
import java.util.List;

/* renamed from: com.yeelight.cherry.b.a.b */
public class C4959b implements BaseExpandableRecyclerViewAdapter.C10368f<C4958a> {

    /* renamed from: a */
    private List<C4958a> f10229a;

    /* renamed from: b */
    private String f10230b;

    /* renamed from: c */
    private boolean f10231c;

    /* renamed from: a */
    public boolean mo26046a() {
        return false;
    }

    /* renamed from: b */
    public C4958a getChildAt(int i) {
        List<C4958a> list = this.f10229a;
        if (list == null || list.size() <= i) {
            return null;
        }
        return this.f10229a.get(i);
    }

    /* renamed from: c */
    public List<C4958a> mo26048c() {
        return this.f10229a;
    }

    /* renamed from: d */
    public String mo26049d() {
        return this.f10230b;
    }

    /* renamed from: e */
    public boolean mo26050e() {
        return this.f10231c;
    }

    /* renamed from: f */
    public void mo26051f(boolean z) {
        this.f10231c = z;
    }

    /* renamed from: g */
    public void mo26052g(List<C4958a> list) {
        this.f10229a = list;
    }

    public int getChildCount() {
        List<C4958a> list = this.f10229a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: h */
    public void mo26055h(String str) {
        this.f10230b = str;
    }
}

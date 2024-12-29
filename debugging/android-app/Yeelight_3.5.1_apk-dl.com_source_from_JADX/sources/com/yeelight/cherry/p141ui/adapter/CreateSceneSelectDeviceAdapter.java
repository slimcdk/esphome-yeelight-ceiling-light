package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p145d4.C8937a;
import p197p3.C10265a;
import p197p3.C10266b;
import p207s3.C10337c;
import p223w3.C10916f1;
import p223w3.C11571p0;

/* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter */
public class CreateSceneSelectDeviceAdapter extends BaseExpandableRecyclerViewAdapter<C10266b, C10265a, C5871d, C5870c> {

    /* renamed from: h */
    private List<C10266b> f11720h;

    /* renamed from: i */
    private Context f11721i;

    /* renamed from: j */
    private final Set<String> f11722j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C5872e f11723k;

    /* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter$a */
    class C5868a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10266b f11724a;

        C5868a(C10266b bVar) {
            this.f11724a = bVar;
        }

        public void onClick(View view) {
            boolean e = this.f11724a.mo41740e();
            this.f11724a.mo41741f(!e);
            for (C10265a next : this.f11724a.mo41738c()) {
                next.mo41733c(!e);
                CreateSceneSelectDeviceAdapter createSceneSelectDeviceAdapter = CreateSceneSelectDeviceAdapter.this;
                if (e) {
                    createSceneSelectDeviceAdapter.mo31107C(next);
                } else {
                    createSceneSelectDeviceAdapter.mo31115t(next);
                }
            }
            if (CreateSceneSelectDeviceAdapter.this.f11723k != null) {
                CreateSceneSelectDeviceAdapter.this.f11723k.mo30355F();
            }
            CreateSceneSelectDeviceAdapter.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter$b */
    class C5869b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10265a f11726a;

        /* renamed from: b */
        final /* synthetic */ C10266b f11727b;

        C5869b(C10265a aVar, C10266b bVar) {
            this.f11726a = aVar;
            this.f11727b = bVar;
        }

        public void onClick(View view) {
            boolean b = this.f11726a.mo41732b();
            this.f11726a.mo41733c(!b);
            if (b) {
                CreateSceneSelectDeviceAdapter.this.mo31107C(this.f11726a);
            } else {
                CreateSceneSelectDeviceAdapter.this.mo31115t(this.f11726a);
            }
            List<C10265a> c = this.f11727b.mo41738c();
            int i = 0;
            for (C10265a b2 : c) {
                if (b2.mo41732b()) {
                    i++;
                }
            }
            if (i == c.size()) {
                this.f11727b.mo41741f(true);
            } else {
                this.f11727b.mo41741f(false);
            }
            if (CreateSceneSelectDeviceAdapter.this.f11723k != null) {
                CreateSceneSelectDeviceAdapter.this.f11723k.mo30355F();
            }
            CreateSceneSelectDeviceAdapter.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter$c */
    static class C5870c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f11729a;

        /* renamed from: b */
        ImageView f11730b;

        /* renamed from: c */
        CheckBox f11731c;

        /* renamed from: d */
        View f11732d;

        C5870c(View view) {
            super(view);
            this.f11732d = view;
            this.f11729a = (TextView) view.findViewById(2131296674);
            this.f11730b = (ImageView) view.findViewById(2131296661);
            this.f11731c = (CheckBox) view.findViewById(C12225R$id.device_check);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter$d */
    static class C5871d extends BaseExpandableRecyclerViewAdapter.BaseGroupViewHolder {

        /* renamed from: a */
        TextView f11733a;

        /* renamed from: b */
        CheckBox f11734b;

        /* renamed from: c */
        View f11735c;

        C5871d(View view) {
            super(view);
            this.f11735c = view;
            this.f11733a = (TextView) view.findViewById(C12225R$id.room_name);
            this.f11734b = (CheckBox) view.findViewById(C12225R$id.room_check_all);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo31124a(RecyclerView.Adapter adapter, boolean z) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter$e */
    public interface C5872e {
        /* renamed from: F */
        void mo30355F();
    }

    public CreateSceneSelectDeviceAdapter(Context context, C5872e eVar) {
        this.f11721i = context;
        this.f11720h = new ArrayList();
        this.f11723k = eVar;
    }

    /* renamed from: A */
    public C5870c mo31113o(ViewGroup viewGroup, int i) {
        return new C5870c(LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.list_item_create_scene_device, viewGroup, false));
    }

    /* renamed from: B */
    public C5871d mo31114p(ViewGroup viewGroup, int i) {
        return new C5871d(LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.list_item_create_scene_device_group, viewGroup, false));
    }

    /* renamed from: C */
    public boolean mo31107C(C10265a aVar) {
        return this.f11722j.remove(aVar.mo41731a().mo23185G());
    }

    /* renamed from: D */
    public void mo31108D(List<C8937a> list) {
        this.f11720h.clear();
        HashSet hashSet = new HashSet();
        C10266b bVar = new C10266b();
        bVar.mo41743h(this.f11721i.getResources().getString(2131755403));
        ArrayList arrayList = new ArrayList();
        for (C3012e next : YeelightDeviceManager.m7800o0().mo23321w0()) {
            if (!(next instanceof C6094f) && !(next instanceof C11571p0) && !(next instanceof C10916f1) && !(next instanceof C10337c)) {
                C10265a aVar = new C10265a();
                aVar.mo41734d(next);
                aVar.mo41733c(false);
                arrayList.add(aVar);
            }
        }
        bVar.mo41742g(arrayList);
        bVar.mo41741f(false);
        this.f11720h.add(bVar);
        hashSet.add(bVar);
        if (list != null) {
            for (C8937a next2 : list) {
                ArrayList arrayList2 = new ArrayList();
                for (C3012e next3 : YeelightDeviceManager.m7800o0().mo23312s0(next2.mo36722n())) {
                    if (!(next3 instanceof C6094f) && !(next3 instanceof C11571p0) && !(next3 instanceof C10916f1) && !(next3 instanceof C10337c)) {
                        C10265a aVar2 = new C10265a();
                        aVar2.mo41734d(next3);
                        aVar2.mo41733c(false);
                        arrayList.remove(aVar2);
                        arrayList2.add(aVar2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C10266b bVar2 = new C10266b();
                    bVar2.mo41743h(next2.mo36723o());
                    bVar2.mo41742g(arrayList2);
                    bVar2.mo41741f(false);
                    this.f11720h.add(bVar2);
                    hashSet.add(bVar2);
                }
            }
        }
        mo36058q(hashSet);
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public int mo31109f() {
        List<C10266b> list = this.f11720h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: t */
    public boolean mo31115t(C10265a aVar) {
        return this.f11722j.add(aVar.mo41731a().mo23185G());
    }

    /* renamed from: u */
    public void mo31116u() {
        this.f11722j.clear();
    }

    /* renamed from: v */
    public Set<String> mo31117v() {
        return this.f11722j;
    }

    /* renamed from: w */
    public C10266b mo31110h(int i) {
        List<C10266b> list = this.f11720h;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    /* renamed from: x */
    public List<C10266b> mo31119x() {
        return this.f11720h;
    }

    /* renamed from: y */
    public void mo31111k(C5870c cVar, C10266b bVar, C10265a aVar) {
        if (aVar != null) {
            cVar.f11729a.setText(aVar.mo41731a().mo23210U());
            cVar.f11730b.setImageResource(aVar.mo41731a().mo23116F());
            cVar.f11731c.setChecked(aVar.mo41732b());
            cVar.f11732d.setOnClickListener(new C5869b(aVar, bVar));
        }
    }

    /* renamed from: z */
    public void mo31112m(C5871d dVar, C10266b bVar, boolean z) {
        if (bVar != null) {
            dVar.f11733a.setText(bVar.mo41739d());
            dVar.f11734b.setChecked(bVar.mo41740e());
            dVar.f11735c.setOnClickListener(new C5868a(bVar));
        }
    }
}

package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p174b.p175a.C4958a;
import com.yeelight.cherry.p174b.p175a.C4959b;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6033g;
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p150c.p183m.C6418d1;
import com.yeelight.yeelib.p150c.p183m.C7130o0;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.adapter.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter */
public class CreateSceneSelectDeviceAdapter extends BaseExpandableRecyclerViewAdapter<C4959b, C4958a, C5808d, C5807c> {

    /* renamed from: h */
    private List<C4959b> f12120h;

    /* renamed from: i */
    private Context f12121i;

    /* renamed from: j */
    private final Set<String> f12122j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C5809e f12123k;

    /* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter$a */
    class C5805a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4959b f12124a;

        C5805a(C4959b bVar) {
            this.f12124a = bVar;
        }

        public void onClick(View view) {
            boolean e = this.f12124a.mo26050e();
            this.f12124a.mo26051f(!e);
            for (C4958a next : this.f12124a.mo26048c()) {
                next.mo26044c(!e);
                CreateSceneSelectDeviceAdapter createSceneSelectDeviceAdapter = CreateSceneSelectDeviceAdapter.this;
                if (e) {
                    createSceneSelectDeviceAdapter.mo27139C(next);
                } else {
                    createSceneSelectDeviceAdapter.mo27147t(next);
                }
            }
            if (CreateSceneSelectDeviceAdapter.this.f12123k != null) {
                CreateSceneSelectDeviceAdapter.this.f12123k.mo26311F();
            }
            CreateSceneSelectDeviceAdapter.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter$b */
    class C5806b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4958a f12126a;

        /* renamed from: b */
        final /* synthetic */ C4959b f12127b;

        C5806b(C4958a aVar, C4959b bVar) {
            this.f12126a = aVar;
            this.f12127b = bVar;
        }

        public void onClick(View view) {
            boolean b = this.f12126a.mo26043b();
            this.f12126a.mo26044c(!b);
            if (b) {
                CreateSceneSelectDeviceAdapter.this.mo27139C(this.f12126a);
            } else {
                CreateSceneSelectDeviceAdapter.this.mo27147t(this.f12126a);
            }
            List<C4958a> c = this.f12127b.mo26048c();
            int i = 0;
            for (C4958a b2 : c) {
                if (b2.mo26043b()) {
                    i++;
                }
            }
            if (i == c.size()) {
                this.f12127b.mo26051f(true);
            } else {
                this.f12127b.mo26051f(false);
            }
            if (CreateSceneSelectDeviceAdapter.this.f12123k != null) {
                CreateSceneSelectDeviceAdapter.this.f12123k.mo26311F();
            }
            CreateSceneSelectDeviceAdapter.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter$c */
    static class C5807c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12129a;

        /* renamed from: b */
        ImageView f12130b;

        /* renamed from: c */
        CheckBox f12131c;

        /* renamed from: d */
        View f12132d;

        C5807c(View view) {
            super(view);
            this.f12132d = view;
            this.f12129a = (TextView) view.findViewById(2131296596);
            this.f12130b = (ImageView) view.findViewById(2131296583);
            this.f12131c = (CheckBox) view.findViewById(C11745R$id.device_check);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter$d */
    static class C5808d extends BaseExpandableRecyclerViewAdapter.BaseGroupViewHolder {

        /* renamed from: a */
        TextView f12133a;

        /* renamed from: b */
        CheckBox f12134b;

        /* renamed from: c */
        View f12135c;

        C5808d(View view) {
            super(view);
            this.f12135c = view;
            this.f12133a = (TextView) view.findViewById(C11745R$id.room_name);
            this.f12134b = (CheckBox) view.findViewById(C11745R$id.room_check_all);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo27156a(RecyclerView.Adapter adapter, boolean z) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.CreateSceneSelectDeviceAdapter$e */
    public interface C5809e {
        /* renamed from: F */
        void mo26311F();
    }

    public CreateSceneSelectDeviceAdapter(Context context, C5809e eVar) {
        this.f12121i = context;
        this.f12120h = new ArrayList();
        this.f12123k = eVar;
    }

    /* renamed from: A */
    public C5807c mo27145o(ViewGroup viewGroup, int i) {
        return new C5807c(LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.list_item_create_scene_device, viewGroup, false));
    }

    /* renamed from: B */
    public C5808d mo27146p(ViewGroup viewGroup, int i) {
        return new C5808d(LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.list_item_create_scene_device_group, viewGroup, false));
    }

    /* renamed from: C */
    public boolean mo27139C(C4958a aVar) {
        return this.f12122j.remove(aVar.mo26042a().mo23372G());
    }

    /* renamed from: D */
    public void mo27140D(List<C9875a> list) {
        this.f12120h.clear();
        HashSet hashSet = new HashSet();
        C4959b bVar = new C4959b();
        bVar.mo26055h(this.f12121i.getResources().getString(2131755399));
        ArrayList arrayList = new ArrayList();
        for (C4200i next : C4257w.m11947l0().mo23688t0()) {
            if (!(next instanceof C6039j) && !(next instanceof C7130o0) && !(next instanceof C6418d1) && !(next instanceof C6033g)) {
                C4958a aVar = new C4958a();
                aVar.mo26045d(next);
                aVar.mo26044c(false);
                arrayList.add(aVar);
            }
        }
        bVar.mo26052g(arrayList);
        bVar.mo26051f(false);
        this.f12120h.add(bVar);
        hashSet.add(bVar);
        if (list != null) {
            for (C9875a next2 : list) {
                C4959b bVar2 = new C4959b();
                bVar2.mo26055h(next2.mo31954o());
                ArrayList arrayList2 = new ArrayList();
                for (C4200i next3 : C4257w.m11947l0().mo23681p0(next2.mo31953n())) {
                    if (!(next3 instanceof C6039j) && !(next3 instanceof C7130o0) && !(next3 instanceof C6418d1) && !(next3 instanceof C6033g)) {
                        C4958a aVar2 = new C4958a();
                        aVar2.mo26045d(next3);
                        aVar2.mo26044c(false);
                        arrayList2.add(aVar2);
                    }
                }
                bVar2.mo26052g(arrayList2);
                bVar2.mo26051f(false);
                this.f12120h.add(bVar2);
                hashSet.add(bVar2);
            }
        }
        mo32683q(hashSet);
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public int mo27141f() {
        List<C4959b> list = this.f12120h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: t */
    public boolean mo27147t(C4958a aVar) {
        return this.f12122j.add(aVar.mo26042a().mo23372G());
    }

    /* renamed from: u */
    public void mo27148u() {
        this.f12122j.clear();
    }

    /* renamed from: v */
    public Set<String> mo27149v() {
        return this.f12122j;
    }

    /* renamed from: w */
    public C4959b mo27142h(int i) {
        List<C4959b> list = this.f12120h;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    /* renamed from: x */
    public List<C4959b> mo27151x() {
        return this.f12120h;
    }

    /* renamed from: y */
    public void mo27143k(C5807c cVar, C4959b bVar, C4958a aVar) {
        if (aVar != null) {
            cVar.f12129a.setText(aVar.mo26042a().mo23397U());
            cVar.f12130b.setImageResource(aVar.mo26042a().mo23303F());
            cVar.f12131c.setChecked(aVar.mo26043b());
            cVar.f12132d.setOnClickListener(new C5806b(aVar, bVar));
        }
    }

    /* renamed from: z */
    public void mo27144m(C5808d dVar, C4959b bVar, boolean z) {
        if (bVar != null) {
            dVar.f12133a.setText(bVar.mo26049d());
            dVar.f12134b.setChecked(bVar.mo26050e());
            dVar.f12135c.setOnClickListener(new C5805a(bVar));
        }
    }
}
